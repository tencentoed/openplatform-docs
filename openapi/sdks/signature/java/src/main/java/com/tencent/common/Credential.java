package com.tencent.common;

public class Credential {

  private String appId;

  private String appSecret;

  public Credential(String appId, String appSecret) {
    this.appId = appId;
    this.appSecret = appSecret;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  @Override
  public String toString() {
    return "Credential{"
            + "appId='" + appId + '\''
            + ", appSecret='" + appSecret + '\''
            + '}';
  }
}
