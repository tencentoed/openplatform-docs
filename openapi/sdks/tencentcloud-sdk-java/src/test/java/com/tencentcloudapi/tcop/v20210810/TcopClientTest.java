package com.tencentcloudapi.tcop.v20210810;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.profile.Language;
import com.tencentcloudapi.common.profile.Region;
import com.tencentcloudapi.tcop.v20210810.models.DescribeCourseListRequest;
import com.tencentcloudapi.tcop.v20210810.models.DescribeCourseListResponse;
import org.junit.Test;

public class TcopClientTest {

    @Test
    public void testDescribeCourseList() {
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
