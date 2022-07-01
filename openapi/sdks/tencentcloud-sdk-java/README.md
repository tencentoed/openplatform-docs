# 简介

欢迎使用腾讯课堂开发者工具套件（SDK）3.0，SDK3.0 是云 API3.0 平台的配套工具。
为方便 JAVA 开发者调试和接入腾讯云产品 API，这里向您介绍适用于 Java 的腾讯课堂开发工具包，并提供首次使用开发工具包的简单示例。让您快速获取腾讯云 Java SDK 并开始调用。

# 依赖环境

1. 依赖环境：JDK 7 版本及以上。
2. 从 腾讯云控制台 开通相应产品。
3. 获取 SecretID、SecretKey 以及调用地址（endpoint），endpoint 一般形式为\*.tencentcloudapi.com，如 TCOP 的调用地址为 tcop.tencentcloudapi.com，具体参考各产品说明。

# 获取安装

安装 Java SDK 前,先获取安全凭证。在第一次使用云API之前，用户首先需要在腾讯云控制台上申请安全凭证，安全凭证包括 SecretID 和 SecretKey，SecretID 是用于标识 API 调用者的身份，SecretKey 是用于加密签名字符串和服务器端验证签名字符串的密钥 SecretKey 必须严格保管，避免泄露。您也可以前往[从零开始使用腾讯云 Java SDK ](https://cloud.tencent.com/developer/article/1839228)界面查看更为基础和详细的 Java SDK 的安装和使用说明。

## 通过源码包安装

1. 前往 [Github 仓库](https://github.com/tencentoed/openplatform-docs/tree/main/openapi/sdks/tencentcloud-sdk-java) 下载源码压缩包；
2. 解压源码包到您项目合适的位置；
3. 引用方法可参考示例。

# 示例

以查询实例接口 DescribeCourseListResponse 为例：

```java
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.profile.Language;
import com.tencentcloudapi.common.profile.Region;
import com.tencentcloudapi.tcop.v20210810.models.DescribeCourseListRequest;
import com.tencentcloudapi.tcop.v20210810.models.DescribeCourseListResponse;

public class DescribeInstances {
    public static void main(String[] args) {
        try {
            // 1.实例化一个认证对象，入参需要传入腾讯云账户密钥对secretId，secretKey。
            Credential cred = new Credential("xxx", "xxx");

            // 2.实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST");
            httpProfile.setConnTimeout(30);
            httpProfile.setWriteTimeout(30);
            httpProfile.setReadTimeout(30);
            httpProfile.setEndpoint("tcop.tencentcloudapi.com");

            // 3.实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod("TC3-HMAC-SHA256");
            clientProfile.setHttpProfile(httpProfile);
            clientProfile.setDebug(true);
            clientProfile.setLanguage(Language.EN_US);

            // 4.实例化要请求产品(以tcop为例)的client对象,clientProfile是可选的
            TcopClient client = new TcopClient(cred, Region.Guangzhou.getValue(), clientProfile);

            // 5.实例化一个tcop实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeCourseListRequest req = new DescribeCourseListRequest();
            req.setCourseType(1L);
            req.setPage(1L);
            req.setPageSize(1L);

            // 6.通过client对象调用DescribeInstances方法发起请求。注意请求方法名与请求对象是对应的
            DescribeCourseListResponse resp = client.DescribeCourseList(req);

            // 输出json格式的字符串回包
            System.out.println(DescribeCourseListResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
```

# 相关配置

## 代理

从3.0.96版本开始，可以单独设置 HTTP 代理：

```
HttpProfile httpProfile = new HttpProfile();
httpProfile.setProxyHost("代理ip或者域名");
httpProfile.setProxyPort(代理端口);
httpProfile.setProxyUsername("代理用户名");
httpProfile.setProxyPassword("代理密码");
```
