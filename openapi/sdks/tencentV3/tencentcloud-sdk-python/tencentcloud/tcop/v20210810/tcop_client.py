# -*- coding: utf8 -*-
# Copyright (c) 2017-2021 THL A29 Limited, a Tencent company. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import json

from tencentcloud.common.exception.tencent_cloud_sdk_exception import TencentCloudSDKException
from tencentcloud.common.abstract_client import AbstractClient
from tencentcloud.tcop.v20210810 import models


class TcopClient(AbstractClient):
    _apiVersion = '2021-08-10'
    _endpoint = 'tcop.tencentcloudapi.com'
    _service = 'tcop'


    def AuthorizeFastLiveCourse(self, request):
        """该API用于设置直播课可学习组织架构范围

        :param request: Request instance for AuthorizeFastLiveCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.AuthorizeFastLiveCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.AuthorizeFastLiveCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("AuthorizeFastLiveCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.AuthorizeFastLiveCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def CreateFastLiveCourse(self, request):
        """为特定老师发布一门直播课

        :param request: Request instance for CreateFastLiveCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.CreateFastLiveCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.CreateFastLiveCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("CreateFastLiveCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.CreateFastLiveCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def CreateLiveCourse(self, request):
        """为特定老师发布一门直播课

        :param request: Request instance for CreateLiveCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.CreateLiveCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.CreateLiveCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("CreateLiveCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.CreateLiveCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DeleteCourse(self, request):
        """该API用于删除一门直播课

        :param request: Request instance for DeleteCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DeleteCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DeleteCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DeleteCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DeleteCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DeleteFastCourseTask(self, request):
        """该API用于删除一门直播课

        :param request: Request instance for DeleteFastCourseTask.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DeleteFastCourseTaskRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DeleteFastCourseTaskResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DeleteFastCourseTask", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DeleteFastCourseTaskResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyCoupons(self, request):
        """用于获取机构优惠券

        :param request: Request instance for DescribeAgencyCoupons.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCouponsRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCouponsResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyCoupons", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyCouponsResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyCourse(self, request):
        """该API用于查询机构课程信息

        :param request: Request instance for DescribeAgencyCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyCourseInfos(self, request):
        """该API用于查询机构所有课程和系列课信息

        :param request: Request instance for DescribeAgencyCourseInfos.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCourseInfosRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCourseInfosResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyCourseInfos", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyCourseInfosResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyCoursePkg(self, request):
        """该API用于查询机构课程包信息

        :param request: Request instance for DescribeAgencyCoursePkg.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCoursePkgRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCoursePkgResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyCoursePkg", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyCoursePkgResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyCourses(self, request):
        """该API用于查询机构课程基础信息

        :param request: Request instance for DescribeAgencyCourses.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCoursesRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyCoursesResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyCourses", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyCoursesResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyPrivateCoupons(self, request):
        """用于获取机构批量私密优惠券链接

        :param request: Request instance for DescribeAgencyPrivateCoupons.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyPrivateCouponsRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyPrivateCouponsResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyPrivateCoupons", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyPrivateCouponsResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyTerms(self, request):
        """该API用于查询机构班级基础信息

        :param request: Request instance for DescribeAgencyTerms.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyTermsRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyTermsResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyTerms", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyTermsResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyUserApplyCourses(self, request):
        """该API用于查询机构学员的报名关系

        :param request: Request instance for DescribeAgencyUserApplyCourses.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserApplyCoursesRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserApplyCoursesResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyUserApplyCourses", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyUserApplyCoursesResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyUserAttendance(self, request):
        """该API用于查询机构学员考勤数据

        :param request: Request instance for DescribeAgencyUserAttendance.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserAttendanceRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserAttendanceResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyUserAttendance", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyUserAttendanceResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyUserOrders(self, request):
        """获取机构学员的订单列表

        :param request: Request instance for DescribeAgencyUserOrders.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserOrdersRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserOrdersResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyUserOrders", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyUserOrdersResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyUserStudyProgresses(self, request):
        """该API用于查询机构学员学习进度

        :param request: Request instance for DescribeAgencyUserStudyProgresses.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserStudyProgressesRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUserStudyProgressesResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyUserStudyProgresses", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyUserStudyProgressesResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeAgencyUsers(self, request):
        """该API批量获取多个指定学员的基本信息

        :param request: Request instance for DescribeAgencyUsers.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUsersRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeAgencyUsersResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeAgencyUsers", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeAgencyUsersResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeChannelClassInfos(self, request):
        """合作方用来同步直播课程的直播状态

        :param request: Request instance for DescribeChannelClassInfos.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeChannelClassInfosRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeChannelClassInfosResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeChannelClassInfos", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeChannelClassInfosResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeChannelCourseIds(self, request):
        """为合作方提供需要的课程id列表

        :param request: Request instance for DescribeChannelCourseIds.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeChannelCourseIdsRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeChannelCourseIdsResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeChannelCourseIds", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeChannelCourseIdsResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeChannelPoolCourses(self, request):
        """根据课程id获取课程下详细数据

        :param request: Request instance for DescribeChannelPoolCourses.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeChannelPoolCoursesRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeChannelPoolCoursesResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeChannelPoolCourses", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeChannelPoolCoursesResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeChat(self, request):
        """获取直播课下的聊天信息

        :param request: Request instance for DescribeChat.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeChatRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeChatResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeChat", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeChatResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeCourseTasks(self, request):
        """该API获取指定直播课信息详情

        :param request: Request instance for DescribeCourseTasks.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeCourseTasksRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeCourseTasksResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeCourseTasks", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeCourseTasksResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeDeptRoot(self, request):
        """获取接入方通讯录中的根部门信息

        :param request: Request instance for DescribeDeptRoot.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeDeptRootRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeDeptRootResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeDeptRoot", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeDeptRootResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeDeptSub(self, request):
        """获取接入方通讯录中的子部门信息

        :param request: Request instance for DescribeDeptSub.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeDeptSubRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeDeptSubResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeDeptSub", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeDeptSubResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeDeptUser(self, request):
        """获取接入方通讯录中的部门用户信息

        :param request: Request instance for DescribeDeptUser.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeDeptUserRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeDeptUserResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeDeptUser", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeDeptUserResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeExamAnswer(self, request):
        """获取直播课题目的答题信息

        :param request: Request instance for DescribeExamAnswer.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeExamAnswerRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeExamAnswerResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeExamAnswer", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeExamAnswerResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeExamQuestion(self, request):
        """获取直播课题目信息

        :param request: Request instance for DescribeExamQuestion.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeExamQuestionRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeExamQuestionResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeExamQuestion", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeExamQuestionResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeFastCourseTasks(self, request):
        """该API获取指定直播课信息详情

        :param request: Request instance for DescribeFastCourseTasks.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeFastCourseTasksRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeFastCourseTasksResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeFastCourseTasks", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeFastCourseTasksResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeFastLiveCourse(self, request):
        """该API获取指定直播课信息详情

        :param request: Request instance for DescribeFastLiveCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeFastLiveCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeFastLiveCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeFastLiveCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeFastLiveCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeFastLiveCourses(self, request):
        """该API获取appid作用域下所有直播课或某个老师的课程

        :param request: Request instance for DescribeFastLiveCourses.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeFastLiveCoursesRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeFastLiveCoursesResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeFastLiveCourses", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeFastLiveCoursesResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeFastReplayDownloads(self, request):
        """废弃该API获取直播课回放下载地址

        :param request: Request instance for DescribeFastReplayDownloads.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeFastReplayDownloadsRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeFastReplayDownloadsResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeFastReplayDownloads", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeFastReplayDownloadsResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeFastReplays(self, request):
        """该API获取一门直播课的回放列表

        :param request: Request instance for DescribeFastReplays.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeFastReplaysRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeFastReplaysResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeFastReplays", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeFastReplaysResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeLiveCourse(self, request):
        """该API获取指定直播课信息详情

        :param request: Request instance for DescribeLiveCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeLiveCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeLiveCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeLiveCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeLiveCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeLiveCourses(self, request):
        """该API获取appid作用域下所有直播课或某个老师的课程

        :param request: Request instance for DescribeLiveCourses.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeLiveCoursesRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeLiveCoursesResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeLiveCourses", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeLiveCoursesResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeReplayDownloads(self, request):
        """该API获取直播课回放下载地址

        :param request: Request instance for DescribeReplayDownloads.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeReplayDownloadsRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeReplayDownloadsResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeReplayDownloads", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeReplayDownloadsResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeReplays(self, request):
        """该API获取一门直播课的回放列表

        :param request: Request instance for DescribeReplays.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeReplaysRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeReplaysResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeReplays", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeReplaysResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def DescribeStudyData(self, request):
        """获取直播课任务考勤详情

        :param request: Request instance for DescribeStudyData.
        :type request: :class:`tencentcloud.tcop.v20210810.models.DescribeStudyDataRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.DescribeStudyDataResponse`

        """
        try:
            params = request._serialize()
            body = self.call("DescribeStudyData", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.DescribeStudyDataResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def ModifyFastLiveCourse(self, request):
        """该API用于修改直播课程名字和课程公开标记

        :param request: Request instance for ModifyFastLiveCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.ModifyFastLiveCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.ModifyFastLiveCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("ModifyFastLiveCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.ModifyFastLiveCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def ModifyFastTeacher(self, request):
        """该API用于设置直播课上课老师

        :param request: Request instance for ModifyFastTeacher.
        :type request: :class:`tencentcloud.tcop.v20210810.models.ModifyFastTeacherRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.ModifyFastTeacherResponse`

        """
        try:
            params = request._serialize()
            body = self.call("ModifyFastTeacher", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.ModifyFastTeacherResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def ModifyLiveCourse(self, request):
        """该API用于修改直播课程名字和课程公开标记

        :param request: Request instance for ModifyLiveCourse.
        :type request: :class:`tencentcloud.tcop.v20210810.models.ModifyLiveCourseRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.ModifyLiveCourseResponse`

        """
        try:
            params = request._serialize()
            body = self.call("ModifyLiveCourse", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.ModifyLiveCourseResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def ModifyLiveCourseAuthorize(self, request):
        """该API用于设置直播课可学习组织架构范围

        :param request: Request instance for ModifyLiveCourseAuthorize.
        :type request: :class:`tencentcloud.tcop.v20210810.models.ModifyLiveCourseAuthorizeRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.ModifyLiveCourseAuthorizeResponse`

        """
        try:
            params = request._serialize()
            body = self.call("ModifyLiveCourseAuthorize", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.ModifyLiveCourseAuthorizeResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def ModifyTeacher(self, request):
        """该API用于设置直播课上课老师

        :param request: Request instance for ModifyTeacher.
        :type request: :class:`tencentcloud.tcop.v20210810.models.ModifyTeacherRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.ModifyTeacherResponse`

        """
        try:
            params = request._serialize()
            body = self.call("ModifyTeacher", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.ModifyTeacherResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def SearchDept(self, request):
        """用于在接入方通讯录中检索部门信息

        :param request: Request instance for SearchDept.
        :type request: :class:`tencentcloud.tcop.v20210810.models.SearchDeptRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.SearchDeptResponse`

        """
        try:
            params = request._serialize()
            body = self.call("SearchDept", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.SearchDeptResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)


    def SearchDeptUser(self, request):
        """用于在接入方通讯录中检索部门用户信息

        :param request: Request instance for SearchDeptUser.
        :type request: :class:`tencentcloud.tcop.v20210810.models.SearchDeptUserRequest`
        :rtype: :class:`tencentcloud.tcop.v20210810.models.SearchDeptUserResponse`

        """
        try:
            params = request._serialize()
            body = self.call("SearchDeptUser", params)
            response = json.loads(body)
            if "Error" not in response["Response"]:
                model = models.SearchDeptUserResponse()
                model._deserialize(response["Response"])
                return model
            else:
                code = response["Response"]["Error"]["Code"]
                message = response["Response"]["Error"]["Message"]
                reqid = response["Response"]["RequestId"]
                raise TencentCloudSDKException(code, message, reqid)
        except Exception as e:
            if isinstance(e, TencentCloudSDKException):
                raise
            else:
                raise TencentCloudSDKException(e.message, e.message)