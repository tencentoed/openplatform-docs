package com.tencent.common;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Response;
import com.tencent.common.exception.BaseException;
import com.tencent.common.http.HttpConnection;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Client {

    private final static String Service = "edu";

    private final static String ApiVersion = "v1.0.0";

    private final Credential credential;

    private final HttpProfile httpProfile;

    public Client(Credential credential, HttpProfile httpProfile) {
        this.credential = credential;
        this.httpProfile = httpProfile;
    }

    public Response doRequest() throws BaseException {
        String httpMethod = httpProfile.getHttpMethod();
        String contentType;
        String canonicalQueryString = "";
        if ("GET".equals(httpMethod)) {
            contentType = "application/x-www-form-urlencoded";
            canonicalQueryString = httpProfile.getQueryString();
        } else {
            contentType = "application/json";
        }
        String requestPayload = httpProfile.getRequestPayload();
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + httpProfile.getEndpoint() + "\n";
        String signedHeaders = "content-type;host";
        String hashedRequestPayload = Sign.sha256Hex(requestPayload);

        // 1.canonicalRequest
        String canonicalRequest = String.format("%s\n%s\n%s\n%s\n%s\n%s",
                httpMethod, httpProfile.getPath(), canonicalQueryString, canonicalHeaders, signedHeaders, hashedRequestPayload);

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.parseLong(timestamp + "000")));
        String credentialScope = date + "/" + Service + "/" + "ke1_request";
        String hashedCanonicalRequest = Sign.sha256Hex(canonicalRequest.getBytes(StandardCharsets.UTF_8));

        // 2.stringToSign
        String stringToSign = String.format("%s\n%s\n%s\n%s", "KE1-HMAC-SHA256", timestamp, credentialScope, hashedCanonicalRequest);

        byte[] secretDate = Sign.hmac256(("KE1" + credential.getAppSecret()).getBytes(StandardCharsets.UTF_8), date);
        byte[] secretService = Sign.hmac256(secretDate, Service);
        byte[] secretSigning = Sign.hmac256(secretService, "ke1_request");

        // 3.计算签名
        String signature =
                DatatypeConverter.printHexBinary(Sign.hmac256(secretSigning, stringToSign)).toLowerCase();

        // 4.拼装 authorization
        String authorization = String.format("KE1-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s", credential.getAppId(), credentialScope, signedHeaders, signature);

        String url = httpProfile.getProtocol() + "://" + httpProfile.getEndpoint() + httpProfile.getPath();
        HttpConnection conn = new HttpConnection(60, 0, 0);
        Headers.Builder hb = new Headers.Builder();
        hb.add("Host", httpProfile.getEndpoint())
                .add("Content-Type", contentType)
                .add("Authorization", authorization)
                .add("X-KE-Timestamp", timestamp)
                .add("X-KE-Version", ApiVersion)
                .add("Referer", "https://ke.qq.com");

        Headers headers = hb.build();
        if ("GET".equals(httpMethod)) {
            return conn.getRequest(url + "?" + canonicalQueryString, headers);
        } else {
            return conn.postRequest(url, requestPayload.getBytes(StandardCharsets.UTF_8), headers);
        }
    }
}
