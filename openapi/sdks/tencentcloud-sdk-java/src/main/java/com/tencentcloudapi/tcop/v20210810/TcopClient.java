/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcop.v20210810;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcop.v20210810.models.*;

public class TcopClient extends AbstractClient{
    private static String endpoint = "tcop.tencentcloudapi.com";
    private static String service = "tcop";
    private static String version = "2021-08-10";

    public TcopClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcopClient(Credential credential, String region, ClientProfile profile) {
        super(TcopClient.endpoint, TcopClient.version, credential, region, profile);
    }

    /**
     *该API用于设置直播课可学习组织架构范围
     * @param req AuthorizeFastLiveCourseRequest
     * @return AuthorizeFastLiveCourseResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizeFastLiveCourseResponse AuthorizeFastLiveCourse(AuthorizeFastLiveCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuthorizeFastLiveCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AuthorizeFastLiveCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AuthorizeFastLiveCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *课程兑换码核销
     * @param req CreateCdKeyUserExchangeRequest
     * @return CreateCdKeyUserExchangeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCdKeyUserExchangeResponse CreateCdKeyUserExchange(CreateCdKeyUserExchangeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCdKeyUserExchangeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCdKeyUserExchangeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCdKeyUserExchange");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为特定老师发布一门直播课
     * @param req CreateFastLiveCourseRequest
     * @return CreateFastLiveCourseResponse
     * @throws TencentCloudSDKException
     */
    public CreateFastLiveCourseResponse CreateFastLiveCourse(CreateFastLiveCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFastLiveCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFastLiveCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFastLiveCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为特定老师发布一门直播课
     * @param req CreateLiveCourseRequest
     * @return CreateLiveCourseResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCourseResponse CreateLiveCourse(CreateLiveCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除新闻渠道单个用户订单
     * @param req DeleteChannelUserOrderRequest
     * @return DeleteChannelUserOrderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteChannelUserOrderResponse DeleteChannelUserOrder(DeleteChannelUserOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteChannelUserOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteChannelUserOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteChannelUserOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于删除一门直播课
     * @param req DeleteCourseRequest
     * @return DeleteCourseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCourseResponse DeleteCourse(DeleteCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于删除一门直播课
     * @param req DeleteFastCourseTaskRequest
     * @return DeleteFastCourseTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFastCourseTaskResponse DeleteFastCourseTask(DeleteFastCourseTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFastCourseTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFastCourseTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFastCourseTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取机构优惠券
     * @param req DescribeAgencyCouponsRequest
     * @return DescribeAgencyCouponsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyCouponsResponse DescribeAgencyCoupons(DescribeAgencyCouponsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyCouponsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyCouponsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyCoupons");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构课程信息
     * @param req DescribeAgencyCourseRequest
     * @return DescribeAgencyCourseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyCourseResponse DescribeAgencyCourse(DescribeAgencyCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构所有课程和系列课信息
     * @param req DescribeAgencyCourseInfosRequest
     * @return DescribeAgencyCourseInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyCourseInfosResponse DescribeAgencyCourseInfos(DescribeAgencyCourseInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyCourseInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyCourseInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyCourseInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构课程包信息
     * @param req DescribeAgencyCoursePkgRequest
     * @return DescribeAgencyCoursePkgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyCoursePkgResponse DescribeAgencyCoursePkg(DescribeAgencyCoursePkgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyCoursePkgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyCoursePkgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyCoursePkg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构课程基础信息
     * @param req DescribeAgencyCoursesRequest
     * @return DescribeAgencyCoursesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyCoursesResponse DescribeAgencyCourses(DescribeAgencyCoursesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyCoursesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyCoursesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyCourses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取机构批量私密优惠券链接
     * @param req DescribeAgencyPrivateCouponsRequest
     * @return DescribeAgencyPrivateCouponsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyPrivateCouponsResponse DescribeAgencyPrivateCoupons(DescribeAgencyPrivateCouponsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyPrivateCouponsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyPrivateCouponsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyPrivateCoupons");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构班级基础信息
     * @param req DescribeAgencyTermsRequest
     * @return DescribeAgencyTermsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyTermsResponse DescribeAgencyTerms(DescribeAgencyTermsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyTermsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyTermsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyTerms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构学员的报名关系
     * @param req DescribeAgencyUserApplyCoursesRequest
     * @return DescribeAgencyUserApplyCoursesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyUserApplyCoursesResponse DescribeAgencyUserApplyCourses(DescribeAgencyUserApplyCoursesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyUserApplyCoursesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyUserApplyCoursesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyUserApplyCourses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构学员考勤数据
     * @param req DescribeAgencyUserAttendanceRequest
     * @return DescribeAgencyUserAttendanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyUserAttendanceResponse DescribeAgencyUserAttendance(DescribeAgencyUserAttendanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyUserAttendanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyUserAttendanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyUserAttendance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取机构学员的订单列表
     * @param req DescribeAgencyUserOrdersRequest
     * @return DescribeAgencyUserOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyUserOrdersResponse DescribeAgencyUserOrders(DescribeAgencyUserOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyUserOrdersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyUserOrdersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyUserOrders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于查询机构学员学习进度
     * @param req DescribeAgencyUserStudyProgressesRequest
     * @return DescribeAgencyUserStudyProgressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyUserStudyProgressesResponse DescribeAgencyUserStudyProgresses(DescribeAgencyUserStudyProgressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyUserStudyProgressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyUserStudyProgressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyUserStudyProgresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API批量获取多个指定学员的基本信息
     * @param req DescribeAgencyUsersRequest
     * @return DescribeAgencyUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgencyUsersResponse DescribeAgencyUsers(DescribeAgencyUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgencyUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgencyUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgencyUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合作方用来同步直播课程的直播状态
     * @param req DescribeChannelClassInfosRequest
     * @return DescribeChannelClassInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelClassInfosResponse DescribeChannelClassInfos(DescribeChannelClassInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelClassInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelClassInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelClassInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为合作方提供需要的课程id列表
     * @param req DescribeChannelCourseIdsRequest
     * @return DescribeChannelCourseIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelCourseIdsResponse DescribeChannelCourseIds(DescribeChannelCourseIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelCourseIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelCourseIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelCourseIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据课程id获取课程下详细数据
     * @param req DescribeChannelPoolCoursesRequest
     * @return DescribeChannelPoolCoursesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelPoolCoursesResponse DescribeChannelPoolCourses(DescribeChannelPoolCoursesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelPoolCoursesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelPoolCoursesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelPoolCourses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询新闻渠道单个用户订单详情
     * @param req DescribeChannelUserOrderInfoRequest
     * @return DescribeChannelUserOrderInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelUserOrderInfoResponse DescribeChannelUserOrderInfo(DescribeChannelUserOrderInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelUserOrderInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelUserOrderInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelUserOrderInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询新闻渠道单个用户订单
     * @param req DescribeChannelUserOrdersRequest
     * @return DescribeChannelUserOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelUserOrdersResponse DescribeChannelUserOrders(DescribeChannelUserOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelUserOrdersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelUserOrdersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelUserOrders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播课下的聊天信息
     * @param req DescribeChatRequest
     * @return DescribeChatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChatResponse DescribeChat(DescribeChatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChatResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *渠道物料-课程信息，支持批量查询
     * @param req DescribeCourseInfoRequest
     * @return DescribeCourseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCourseInfoResponse DescribeCourseInfo(DescribeCourseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCourseInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCourseInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCourseInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *供渠道查看课程列表
     * @param req DescribeCourseListRequest
     * @return DescribeCourseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCourseListResponse DescribeCourseList(DescribeCourseListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCourseListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCourseListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCourseList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *渠道物料-系列课信息，支持批量查询
     * @param req DescribeCoursePkgRequest
     * @return DescribeCoursePkgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCoursePkgResponse DescribeCoursePkg(DescribeCoursePkgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCoursePkgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCoursePkgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCoursePkg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取指定直播课信息详情
     * @param req DescribeCourseTasksRequest
     * @return DescribeCourseTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCourseTasksResponse DescribeCourseTasks(DescribeCourseTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCourseTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCourseTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCourseTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取接入方通讯录中的根部门信息
     * @param req DescribeDeptRootRequest
     * @return DescribeDeptRootResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeptRootResponse DescribeDeptRoot(DescribeDeptRootRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeptRootResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeptRootResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeptRoot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取接入方通讯录中的子部门信息
     * @param req DescribeDeptSubRequest
     * @return DescribeDeptSubResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeptSubResponse DescribeDeptSub(DescribeDeptSubRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeptSubResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeptSubResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeptSub");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取接入方通讯录中的部门用户信息
     * @param req DescribeDeptUserRequest
     * @return DescribeDeptUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeptUserResponse DescribeDeptUser(DescribeDeptUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeptUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeptUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeptUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播课题目的答题信息
     * @param req DescribeExamAnswerRequest
     * @return DescribeExamAnswerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExamAnswerResponse DescribeExamAnswer(DescribeExamAnswerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExamAnswerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExamAnswerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExamAnswer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播课题目信息
     * @param req DescribeExamQuestionRequest
     * @return DescribeExamQuestionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExamQuestionResponse DescribeExamQuestion(DescribeExamQuestionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExamQuestionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExamQuestionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExamQuestion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取指定直播课信息详情
     * @param req DescribeFastCourseTasksRequest
     * @return DescribeFastCourseTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastCourseTasksResponse DescribeFastCourseTasks(DescribeFastCourseTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFastCourseTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFastCourseTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFastCourseTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取指定直播课信息详情
     * @param req DescribeFastLiveCourseRequest
     * @return DescribeFastLiveCourseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastLiveCourseResponse DescribeFastLiveCourse(DescribeFastLiveCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFastLiveCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFastLiveCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFastLiveCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取appid作用域下所有直播课或某个老师的课程
     * @param req DescribeFastLiveCoursesRequest
     * @return DescribeFastLiveCoursesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastLiveCoursesResponse DescribeFastLiveCourses(DescribeFastLiveCoursesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFastLiveCoursesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFastLiveCoursesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFastLiveCourses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *废弃该API获取直播课回放下载地址
     * @param req DescribeFastReplayDownloadsRequest
     * @return DescribeFastReplayDownloadsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastReplayDownloadsResponse DescribeFastReplayDownloads(DescribeFastReplayDownloadsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFastReplayDownloadsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFastReplayDownloadsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFastReplayDownloads");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取一门直播课的回放列表
     * @param req DescribeFastReplaysRequest
     * @return DescribeFastReplaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastReplaysResponse DescribeFastReplays(DescribeFastReplaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFastReplaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFastReplaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFastReplays");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取指定直播课信息详情
     * @param req DescribeLiveCourseRequest
     * @return DescribeLiveCourseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCourseResponse DescribeLiveCourse(DescribeLiveCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取appid作用域下所有直播课或某个老师的课程
     * @param req DescribeLiveCoursesRequest
     * @return DescribeLiveCoursesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCoursesResponse DescribeLiveCourses(DescribeLiveCoursesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCoursesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCoursesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveCourses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *课程学习进度
     * @param req DescribePlanProcessRequest
     * @return DescribePlanProcessResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlanProcessResponse DescribePlanProcess(DescribePlanProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlanProcessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlanProcessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlanProcess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取直播课回放下载地址
     * @param req DescribeReplayDownloadsRequest
     * @return DescribeReplayDownloadsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplayDownloadsResponse DescribeReplayDownloads(DescribeReplayDownloadsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplayDownloadsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplayDownloadsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplayDownloads");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API获取一门直播课的回放列表
     * @param req DescribeReplaysRequest
     * @return DescribeReplaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplaysResponse DescribeReplays(DescribeReplaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplays");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播课任务考勤详情
     * @param req DescribeStudyDataRequest
     * @return DescribeStudyDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStudyDataResponse DescribeStudyData(DescribeStudyDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStudyDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStudyDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStudyData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *【收藏相关API】获取收藏用户
     * @param req DescribeUserFavsRequest
     * @return DescribeUserFavsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserFavsResponse DescribeUserFavs(DescribeUserFavsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserFavsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserFavsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserFavs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于修改直播课程名字和课程公开标记
     * @param req ModifyFastLiveCourseRequest
     * @return ModifyFastLiveCourseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFastLiveCourseResponse ModifyFastLiveCourse(ModifyFastLiveCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFastLiveCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFastLiveCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFastLiveCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于设置直播课上课老师
     * @param req ModifyFastTeacherRequest
     * @return ModifyFastTeacherResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFastTeacherResponse ModifyFastTeacher(ModifyFastTeacherRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFastTeacherResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFastTeacherResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFastTeacher");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于修改直播课程名字和课程公开标记
     * @param req ModifyLiveCourseRequest
     * @return ModifyLiveCourseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCourseResponse ModifyLiveCourse(ModifyLiveCourseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveCourseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCourseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveCourse");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于设置直播课可学习组织架构范围
     * @param req ModifyLiveCourseAuthorizeRequest
     * @return ModifyLiveCourseAuthorizeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCourseAuthorizeResponse ModifyLiveCourseAuthorize(ModifyLiveCourseAuthorizeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveCourseAuthorizeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCourseAuthorizeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveCourseAuthorize");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该API用于设置直播课上课老师
     * @param req ModifyTeacherRequest
     * @return ModifyTeacherResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeacherResponse ModifyTeacher(ModifyTeacherRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTeacherResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTeacherResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTeacher");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量操作用户收藏
     * @param req ModifyUserFavBatchRequest
     * @return ModifyUserFavBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserFavBatchResponse ModifyUserFavBatch(ModifyUserFavBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserFavBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserFavBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserFavBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在接入方通讯录中检索部门信息
     * @param req SearchDeptRequest
     * @return SearchDeptResponse
     * @throws TencentCloudSDKException
     */
    public SearchDeptResponse SearchDept(SearchDeptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchDeptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchDeptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchDept");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在接入方通讯录中检索部门用户信息
     * @param req SearchDeptUserRequest
     * @return SearchDeptUserResponse
     * @throws TencentCloudSDKException
     */
    public SearchDeptUserResponse SearchDeptUser(SearchDeptUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchDeptUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchDeptUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchDeptUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
