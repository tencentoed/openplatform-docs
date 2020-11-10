package com.tencent.example;

import com.squareup.okhttp.Response;
import com.tencent.common.Client;
import com.tencent.common.Credential;
import com.tencent.common.HttpProfile;
import com.tencent.common.exception.BaseException;

import java.io.IOException;

/**
 * 接口签名示例：获取直播课列表
 */
public class Main {

    /**
     * 启动入口
     */
    public static void main(String[] args) throws BaseException, IOException {
        // 1.实例化一个认证对象
        Credential credential = new Credential("APPID", "APP SECRET");
        // 2.实例化http选项
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setProtocol("https");
        httpProfile.setEndpoint("ke.qq.com");
        httpProfile.setHttpMethod("GET");
        httpProfile.setPath("/cgi-proxy/open/v1/course/list");
        httpProfile.setQueryString("page=1&size=10&teacher_id=10001");
        // 对于GET请求，RequestPayload固定为空字符串。
        // 对于POST请求，RequestPayload为application/json请求体按照key的字典顺序来排序（升序）。
        httpProfile.setRequestPayload("");

        // 3.实例化一个client对象
        Client client = new Client(credential, httpProfile);
        // 4.通过client对象调用doRequest方法发起请求
        Response response = client.doRequest();
        // 5.输出json格式的字符串回包
        System.out.println(response.body().string());
    }
}
