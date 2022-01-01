// Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v20210810

import (
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common"
	tchttp "github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/http"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/profile"
)

const APIVersion = "2021-08-10"

type Client struct {
	common.Client
}

// Deprecated
func NewClientWithSecretId(secretId, secretKey, region string) (client *Client, err error) {
	cpf := profile.NewClientProfile()
	client = &Client{}
	client.Init(region).WithSecretId(secretId, secretKey).WithProfile(cpf)
	return
}

func NewClient(credential common.CredentialIface, region string, clientProfile *profile.ClientProfile) (client *Client, err error) {
	client = &Client{}
	client.Init(region).
		WithCredential(credential).
		WithProfile(clientProfile)
	return
}

func NewAuthorizeFastLiveCourseRequest() (request *AuthorizeFastLiveCourseRequest) {
	request = &AuthorizeFastLiveCourseRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "AuthorizeFastLiveCourse")
	return
}

func NewAuthorizeFastLiveCourseResponse() (response *AuthorizeFastLiveCourseResponse) {
	response = &AuthorizeFastLiveCourseResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// AuthorizeFastLiveCourse
// 该API用于设置直播课可学习组织架构范围
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) AuthorizeFastLiveCourse(request *AuthorizeFastLiveCourseRequest) (response *AuthorizeFastLiveCourseResponse, err error) {
	if request == nil {
		request = NewAuthorizeFastLiveCourseRequest()
	}
	response = NewAuthorizeFastLiveCourseResponse()
	err = c.Send(request, response)
	return
}

func NewCreateFastLiveCourseRequest() (request *CreateFastLiveCourseRequest) {
	request = &CreateFastLiveCourseRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "CreateFastLiveCourse")
	return
}

func NewCreateFastLiveCourseResponse() (response *CreateFastLiveCourseResponse) {
	response = &CreateFastLiveCourseResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// CreateFastLiveCourse
// 为特定老师发布一门直播课
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  LIMITEXCEEDED = "LimitExceeded"
//  OPERATIONDENIED = "OperationDenied"
func (c *Client) CreateFastLiveCourse(request *CreateFastLiveCourseRequest) (response *CreateFastLiveCourseResponse, err error) {
	if request == nil {
		request = NewCreateFastLiveCourseRequest()
	}
	response = NewCreateFastLiveCourseResponse()
	err = c.Send(request, response)
	return
}

func NewDeleteFastCourseTaskRequest() (request *DeleteFastCourseTaskRequest) {
	request = &DeleteFastCourseTaskRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "DeleteFastCourseTask")
	return
}

func NewDeleteFastCourseTaskResponse() (response *DeleteFastCourseTaskResponse) {
	response = &DeleteFastCourseTaskResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// DeleteFastCourseTask
// 该API用于删除一门直播课
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DeleteFastCourseTask(request *DeleteFastCourseTaskRequest) (response *DeleteFastCourseTaskResponse, err error) {
	if request == nil {
		request = NewDeleteFastCourseTaskRequest()
	}
	response = NewDeleteFastCourseTaskResponse()
	err = c.Send(request, response)
	return
}

func NewDescribeFastCourseTasksRequest() (request *DescribeFastCourseTasksRequest) {
	request = &DescribeFastCourseTasksRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "DescribeFastCourseTasks")
	return
}

func NewDescribeFastCourseTasksResponse() (response *DescribeFastCourseTasksResponse) {
	response = &DescribeFastCourseTasksResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// DescribeFastCourseTasks
// 该API获取指定直播课信息详情
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastCourseTasks(request *DescribeFastCourseTasksRequest) (response *DescribeFastCourseTasksResponse, err error) {
	if request == nil {
		request = NewDescribeFastCourseTasksRequest()
	}
	response = NewDescribeFastCourseTasksResponse()
	err = c.Send(request, response)
	return
}

func NewDescribeFastLiveCourseRequest() (request *DescribeFastLiveCourseRequest) {
	request = &DescribeFastLiveCourseRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "DescribeFastLiveCourse")
	return
}

func NewDescribeFastLiveCourseResponse() (response *DescribeFastLiveCourseResponse) {
	response = &DescribeFastLiveCourseResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// DescribeFastLiveCourse
// 该API获取指定直播课信息详情
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastLiveCourse(request *DescribeFastLiveCourseRequest) (response *DescribeFastLiveCourseResponse, err error) {
	if request == nil {
		request = NewDescribeFastLiveCourseRequest()
	}
	response = NewDescribeFastLiveCourseResponse()
	err = c.Send(request, response)
	return
}

func NewDescribeFastLiveCoursesRequest() (request *DescribeFastLiveCoursesRequest) {
	request = &DescribeFastLiveCoursesRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "DescribeFastLiveCourses")
	return
}

func NewDescribeFastLiveCoursesResponse() (response *DescribeFastLiveCoursesResponse) {
	response = &DescribeFastLiveCoursesResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// DescribeFastLiveCourses
// 该API获取appid作用域下所有直播课或某个老师的课程
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastLiveCourses(request *DescribeFastLiveCoursesRequest) (response *DescribeFastLiveCoursesResponse, err error) {
	if request == nil {
		request = NewDescribeFastLiveCoursesRequest()
	}
	response = NewDescribeFastLiveCoursesResponse()
	err = c.Send(request, response)
	return
}

func NewDescribeFastReplayDownloadsRequest() (request *DescribeFastReplayDownloadsRequest) {
	request = &DescribeFastReplayDownloadsRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "DescribeFastReplayDownloads")
	return
}

func NewDescribeFastReplayDownloadsResponse() (response *DescribeFastReplayDownloadsResponse) {
	response = &DescribeFastReplayDownloadsResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// DescribeFastReplayDownloads
// 该API获取直播课回放下载地址
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastReplayDownloads(request *DescribeFastReplayDownloadsRequest) (response *DescribeFastReplayDownloadsResponse, err error) {
	if request == nil {
		request = NewDescribeFastReplayDownloadsRequest()
	}
	response = NewDescribeFastReplayDownloadsResponse()
	err = c.Send(request, response)
	return
}

func NewDescribeFastReplaysRequest() (request *DescribeFastReplaysRequest) {
	request = &DescribeFastReplaysRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "DescribeFastReplays")
	return
}

func NewDescribeFastReplaysResponse() (response *DescribeFastReplaysResponse) {
	response = &DescribeFastReplaysResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// DescribeFastReplays
// 该API获取一门直播课的回放列表
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastReplays(request *DescribeFastReplaysRequest) (response *DescribeFastReplaysResponse, err error) {
	if request == nil {
		request = NewDescribeFastReplaysRequest()
	}
	response = NewDescribeFastReplaysResponse()
	err = c.Send(request, response)
	return
}

func NewModifyFastLiveCourseRequest() (request *ModifyFastLiveCourseRequest) {
	request = &ModifyFastLiveCourseRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "ModifyFastLiveCourse")
	return
}

func NewModifyFastLiveCourseResponse() (response *ModifyFastLiveCourseResponse) {
	response = &ModifyFastLiveCourseResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// ModifyFastLiveCourse
// 该API用于修改直播课程名字和课程公开标记
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyFastLiveCourse(request *ModifyFastLiveCourseRequest) (response *ModifyFastLiveCourseResponse, err error) {
	if request == nil {
		request = NewModifyFastLiveCourseRequest()
	}
	response = NewModifyFastLiveCourseResponse()
	err = c.Send(request, response)
	return
}

func NewModifyFastTeacherRequest() (request *ModifyFastTeacherRequest) {
	request = &ModifyFastTeacherRequest{
		BaseRequest: &tchttp.BaseRequest{},
	}
	request.Init().WithApiInfo("tcop", APIVersion, "ModifyFastTeacher")
	return
}

func NewModifyFastTeacherResponse() (response *ModifyFastTeacherResponse) {
	response = &ModifyFastTeacherResponse{
		BaseResponse: &tchttp.BaseResponse{},
	}
	return
}

// ModifyFastTeacher
// 该API用于设置直播课上课老师
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyFastTeacher(request *ModifyFastTeacherRequest) (response *ModifyFastTeacherResponse, err error) {
	if request == nil {
		request = NewModifyFastTeacherRequest()
	}
	response = NewModifyFastTeacherResponse()
	err = c.Send(request, response)
	return
}
