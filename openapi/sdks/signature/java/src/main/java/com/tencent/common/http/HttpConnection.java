package com.tencent.common.http;

import com.squareup.okhttp.*;
import com.tencent.common.exception.BaseException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HttpConnection {

  private final OkHttpClient client;

  public HttpConnection(Integer connTimeout, Integer readTimeout, Integer writeTimeout) {
    this.client = new OkHttpClient();
    this.client.setConnectTimeout(connTimeout, TimeUnit.SECONDS);
    this.client.setReadTimeout(readTimeout, TimeUnit.SECONDS);
    this.client.setWriteTimeout(writeTimeout, TimeUnit.SECONDS);
  }

  public Response doRequest(Request request) throws BaseException {
    Response response;
    try {
      response = this.client.newCall(request).execute();
    } catch (IOException e) {
      throw new BaseException(e.getClass().getName() + "-" + e.getMessage());
    }
    return response;
  }

  public Response getRequest(String url, Headers headers) throws BaseException {
    Request request;
    try {
      request = new Request.Builder().url(url).headers(headers).get().build();
    } catch (IllegalArgumentException e) {
      throw new BaseException(e.getClass().getName() + "-" + e.getMessage());
    }

    return this.doRequest(request);
  }

  public Response postRequest(String url, byte[] body, Headers headers) throws BaseException {
    MediaType contentType = MediaType.parse(headers.get("Content-Type"));
    Request request;
    try {
      request =
          new Request.Builder()
              .url(url)
              .post(RequestBody.create(contentType, body))
              .headers(headers)
              .build();
    } catch (IllegalArgumentException e) {
      throw new BaseException(e.getClass().getName() + "-" + e.getMessage());
    }
    return this.doRequest(request);
  }
}
