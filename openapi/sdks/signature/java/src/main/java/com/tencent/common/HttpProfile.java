package com.tencent.common;

public class HttpProfile {

    private String httpMethod;

    private String protocol;

    private String endpoint;

    private String path;

    private String queryString;

    private String requestPayload;

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getRequestPayload() {
        return requestPayload;
    }

    public void setRequestPayload(String requestPayload) {
        this.requestPayload = requestPayload;
    }

    @Override
    public String toString() {
        return "Request{" +
                "httpMethod='" + httpMethod + '\'' +
                ", protocol='" + protocol + '\'' +
                ", endpoint='" + endpoint + '\'' +
                ", path='" + path + '\'' +
                ", queryString='" + queryString + '\'' +
                ", requestPayload='" + requestPayload + '\'' +
                '}';
    }
}
