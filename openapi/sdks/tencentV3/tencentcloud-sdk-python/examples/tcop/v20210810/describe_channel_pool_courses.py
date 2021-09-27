#coding=utf-8
import sys
import logging
from tencentcloud.common import credential
from tencentcloud.common.exception.tencent_cloud_sdk_exception import TencentCloudSDKException
from tencentcloud.common.profile.client_profile import ClientProfile
from tencentcloud.common.profile.http_profile import HttpProfile
from tencentcloud.tcop.v20210810 import tcop_client, models


import api
import action
import apimod
import json
def execute(context):
    try:

        cred = credential.Credential("XXXXX", "XXXXX")

        httpProfile = HttpProfile()

        httpProfile.protocol = "https"  # 在外网互通的网络环境下支持http协议(默认是https协议),建议使用https协议
        httpProfile.keepAlive = True  # 状态保持，默认是False
        httpProfile.reqMethod = "POST"  # get请求(默认为post请求)
        httpProfile.reqTimeout = 30    # 请求超时时间，单位为秒(默认60秒)

        httpProfile.endpoint = "tcop.tencentcloudapi.com"  # 指定接入地域域名(默认就近接入)

        clientProfile = ClientProfile()
        clientProfile.signMethod = "TC3-HMAC-SHA256"  # 指定签名算法
        clientProfile.language = "en-US"  # 指定展示英文（默认为中文）
        clientProfile.httpProfile = httpProfile

        client = tcop_client.TcopClient(cred, "ap-guangzhou", clientProfile)

        ################################################### 4 pass
        print("根据课程id获取课程下详细数据")
        req = models.DescribeChannelPoolCoursesRequest()

        req.CourseIds = [111347]

        resp = client.DescribeChannelPoolCourses(req)

        resp_str = resp.to_json_string(indent=2)
        print(resp_str)
        resp_json = json.loads(resp_str)
        # print(resp_json['CourseList'])

        action.assertEquals(context,"简单判断返回码为0",len(resp_json) > 0,True)


    except TencentCloudSDKException as err:
        print(err)

