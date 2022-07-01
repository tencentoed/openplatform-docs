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
    "context"
    "errors"
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
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) AuthorizeFastLiveCourse(request *AuthorizeFastLiveCourseRequest) (response *AuthorizeFastLiveCourseResponse, err error) {
    return c.AuthorizeFastLiveCourseWithContext(context.Background(), request)
}

// AuthorizeFastLiveCourse
// 该API用于设置直播课可学习组织架构范围
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) AuthorizeFastLiveCourseWithContext(ctx context.Context, request *AuthorizeFastLiveCourseRequest) (response *AuthorizeFastLiveCourseResponse, err error) {
    if request == nil {
        request = NewAuthorizeFastLiveCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("AuthorizeFastLiveCourse require credential")
    }

    request.SetContext(ctx)
    
    response = NewAuthorizeFastLiveCourseResponse()
    err = c.Send(request, response)
    return
}

func NewCreateCdKeyUserExchangeRequest() (request *CreateCdKeyUserExchangeRequest) {
    request = &CreateCdKeyUserExchangeRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "CreateCdKeyUserExchange")
    
    
    return
}

func NewCreateCdKeyUserExchangeResponse() (response *CreateCdKeyUserExchangeResponse) {
    response = &CreateCdKeyUserExchangeResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// CreateCdKeyUserExchange
// 课程兑换码核销
//
// 可能返回的错误码:
//  FAILEDOPERATION_CDKEYALREADYUSED = "FailedOperation.CdKeyAlreadyUsed"
//  FAILEDOPERATION_CDKEYCHANGEFAILED = "FailedOperation.CdKeyChangeFailed"
//  FAILEDOPERATION_CDKEYEXPIREDINVALID = "FailedOperation.CdKeyExpiredInvalid"
//  FAILEDOPERATION_CDKEYNOTFOUND = "FailedOperation.CdKeyNotFound"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
func (c *Client) CreateCdKeyUserExchange(request *CreateCdKeyUserExchangeRequest) (response *CreateCdKeyUserExchangeResponse, err error) {
    return c.CreateCdKeyUserExchangeWithContext(context.Background(), request)
}

// CreateCdKeyUserExchange
// 课程兑换码核销
//
// 可能返回的错误码:
//  FAILEDOPERATION_CDKEYALREADYUSED = "FailedOperation.CdKeyAlreadyUsed"
//  FAILEDOPERATION_CDKEYCHANGEFAILED = "FailedOperation.CdKeyChangeFailed"
//  FAILEDOPERATION_CDKEYEXPIREDINVALID = "FailedOperation.CdKeyExpiredInvalid"
//  FAILEDOPERATION_CDKEYNOTFOUND = "FailedOperation.CdKeyNotFound"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
func (c *Client) CreateCdKeyUserExchangeWithContext(ctx context.Context, request *CreateCdKeyUserExchangeRequest) (response *CreateCdKeyUserExchangeResponse, err error) {
    if request == nil {
        request = NewCreateCdKeyUserExchangeRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("CreateCdKeyUserExchange require credential")
    }

    request.SetContext(ctx)
    
    response = NewCreateCdKeyUserExchangeResponse()
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
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  LIMITEXCEEDED = "LimitExceeded"
//  OPERATIONDENIED = "OperationDenied"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) CreateFastLiveCourse(request *CreateFastLiveCourseRequest) (response *CreateFastLiveCourseResponse, err error) {
    return c.CreateFastLiveCourseWithContext(context.Background(), request)
}

// CreateFastLiveCourse
// 为特定老师发布一门直播课
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  LIMITEXCEEDED = "LimitExceeded"
//  OPERATIONDENIED = "OperationDenied"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) CreateFastLiveCourseWithContext(ctx context.Context, request *CreateFastLiveCourseRequest) (response *CreateFastLiveCourseResponse, err error) {
    if request == nil {
        request = NewCreateFastLiveCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("CreateFastLiveCourse require credential")
    }

    request.SetContext(ctx)
    
    response = NewCreateFastLiveCourseResponse()
    err = c.Send(request, response)
    return
}

func NewCreateLiveCourseRequest() (request *CreateLiveCourseRequest) {
    request = &CreateLiveCourseRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "CreateLiveCourse")
    
    
    return
}

func NewCreateLiveCourseResponse() (response *CreateLiveCourseResponse) {
    response = &CreateLiveCourseResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// CreateLiveCourse
// 为特定老师发布一门直播课
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_CLICKEXPCOURSENOTICEPARAMERR = "FailedOperation.ClickExpCourseNoticeParamErr"
//  FAILEDOPERATION_DELETECOURSECONTENTTASKERR = "FailedOperation.DeleteCourseContentTaskErr"
//  FAILEDOPERATION_DELETECOURSETERMERR = "FailedOperation.DeleteCourseTermErr"
//  FAILEDOPERATION_DLSHASREGISTERERROR = "FailedOperation.DlsHasRegisterError"
//  FAILEDOPERATION_ECGETCOURSEAUTH = "FailedOperation.EcGetCourseAuth"
//  FAILEDOPERATION_ECGETIDSUIDBYACCOUNT = "FailedOperation.EcGetIdsUidByAccount"
//  FAILEDOPERATION_ECGETTEACHEREXPERIENCE = "FailedOperation.EcGetTeacherExperience"
//  FAILEDOPERATION_ECGETUSERDEPTTRACES = "FailedOperation.EcGetUserDeptTraces"
//  FAILEDOPERATION_ECVISIBLESCOPEISPUBLIC = "FailedOperation.EcVisibleScopeIsPublic"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRCODEECRPCCLIENTDOREQERR = "FailedOperation.ErrCodeECRpcClientDoReqErr"
//  FAILEDOPERATION_ERRCODEECRPCCLIENTINITERR = "FailedOperation.ErrCodeECRpcClientInitErr"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_GETCOURSECONTENTTASKERR = "FailedOperation.GetCourseContentTaskErr"
//  FAILEDOPERATION_INSERTCOURSECONTENTTASKERR = "FailedOperation.InsertCourseContentTaskErr"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICDELRECORDFILEERR = "FailedOperation.LogicDelRecordFileErr"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICMAXLIVECOURSETOOMORE = "FailedOperation.LogicMaxLiveCourseTooMore"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICNOTFOUNDTASK = "FailedOperation.LogicNotFoundTask"
//  FAILEDOPERATION_LOGICOPGETTERMINFO = "FailedOperation.LogicOpGetTermInfo"
//  FAILEDOPERATION_LOGICOPOTHERUSERCOURSE = "FailedOperation.LogicOpOtherUserCourse"
//  FAILEDOPERATION_LOGICQUERYMUTILTERMERR = "FailedOperation.LogicQueryMutilTermErr"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_LOGICUIDTYPEINVALID = "FailedOperation.LogicUidTypeInvalid"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATEREGISTERINFOFAIL = "FailedOperation.LogicUpdateRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  FAILEDOPERATION_LOGICUSERBINDTOOMORETERM = "FailedOperation.LogicUserBindTooMoreTerm"
//  FAILEDOPERATION_TIMERNEWMYSQLERROR = "FailedOperation.TimerNewMysqlError"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  FAILEDOPERATION_TIMERPARAMTYPEERROR = "FailedOperation.TimerParamTypeError"
//  FAILEDOPERATION_TIMERUNBINDERROR = "FailedOperation.TimerUnbindError"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKERR = "FailedOperation.UpdateCourseContentTaskErr"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKTEACHERERR = "FailedOperation.UpdateCourseContentTaskTeacherErr"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  LIMITEXCEEDED = "LimitExceeded"
//  OPERATIONDENIED = "OperationDenied"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) CreateLiveCourse(request *CreateLiveCourseRequest) (response *CreateLiveCourseResponse, err error) {
    return c.CreateLiveCourseWithContext(context.Background(), request)
}

// CreateLiveCourse
// 为特定老师发布一门直播课
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_CLICKEXPCOURSENOTICEPARAMERR = "FailedOperation.ClickExpCourseNoticeParamErr"
//  FAILEDOPERATION_DELETECOURSECONTENTTASKERR = "FailedOperation.DeleteCourseContentTaskErr"
//  FAILEDOPERATION_DELETECOURSETERMERR = "FailedOperation.DeleteCourseTermErr"
//  FAILEDOPERATION_DLSHASREGISTERERROR = "FailedOperation.DlsHasRegisterError"
//  FAILEDOPERATION_ECGETCOURSEAUTH = "FailedOperation.EcGetCourseAuth"
//  FAILEDOPERATION_ECGETIDSUIDBYACCOUNT = "FailedOperation.EcGetIdsUidByAccount"
//  FAILEDOPERATION_ECGETTEACHEREXPERIENCE = "FailedOperation.EcGetTeacherExperience"
//  FAILEDOPERATION_ECGETUSERDEPTTRACES = "FailedOperation.EcGetUserDeptTraces"
//  FAILEDOPERATION_ECVISIBLESCOPEISPUBLIC = "FailedOperation.EcVisibleScopeIsPublic"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRCODEECRPCCLIENTDOREQERR = "FailedOperation.ErrCodeECRpcClientDoReqErr"
//  FAILEDOPERATION_ERRCODEECRPCCLIENTINITERR = "FailedOperation.ErrCodeECRpcClientInitErr"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_GETCOURSECONTENTTASKERR = "FailedOperation.GetCourseContentTaskErr"
//  FAILEDOPERATION_INSERTCOURSECONTENTTASKERR = "FailedOperation.InsertCourseContentTaskErr"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICDELRECORDFILEERR = "FailedOperation.LogicDelRecordFileErr"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICMAXLIVECOURSETOOMORE = "FailedOperation.LogicMaxLiveCourseTooMore"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICNOTFOUNDTASK = "FailedOperation.LogicNotFoundTask"
//  FAILEDOPERATION_LOGICOPGETTERMINFO = "FailedOperation.LogicOpGetTermInfo"
//  FAILEDOPERATION_LOGICOPOTHERUSERCOURSE = "FailedOperation.LogicOpOtherUserCourse"
//  FAILEDOPERATION_LOGICQUERYMUTILTERMERR = "FailedOperation.LogicQueryMutilTermErr"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_LOGICUIDTYPEINVALID = "FailedOperation.LogicUidTypeInvalid"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATEREGISTERINFOFAIL = "FailedOperation.LogicUpdateRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  FAILEDOPERATION_LOGICUSERBINDTOOMORETERM = "FailedOperation.LogicUserBindTooMoreTerm"
//  FAILEDOPERATION_TIMERNEWMYSQLERROR = "FailedOperation.TimerNewMysqlError"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  FAILEDOPERATION_TIMERPARAMTYPEERROR = "FailedOperation.TimerParamTypeError"
//  FAILEDOPERATION_TIMERUNBINDERROR = "FailedOperation.TimerUnbindError"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKERR = "FailedOperation.UpdateCourseContentTaskErr"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKTEACHERERR = "FailedOperation.UpdateCourseContentTaskTeacherErr"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  LIMITEXCEEDED = "LimitExceeded"
//  OPERATIONDENIED = "OperationDenied"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) CreateLiveCourseWithContext(ctx context.Context, request *CreateLiveCourseRequest) (response *CreateLiveCourseResponse, err error) {
    if request == nil {
        request = NewCreateLiveCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("CreateLiveCourse require credential")
    }

    request.SetContext(ctx)
    
    response = NewCreateLiveCourseResponse()
    err = c.Send(request, response)
    return
}

func NewDeleteChannelUserOrderRequest() (request *DeleteChannelUserOrderRequest) {
    request = &DeleteChannelUserOrderRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DeleteChannelUserOrder")
    
    
    return
}

func NewDeleteChannelUserOrderResponse() (response *DeleteChannelUserOrderResponse) {
    response = &DeleteChannelUserOrderResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DeleteChannelUserOrder
// 删除新闻渠道单个用户订单
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ORDERNOTALLOWTODEL = "FailedOperation.OrderNotAllowToDel"
func (c *Client) DeleteChannelUserOrder(request *DeleteChannelUserOrderRequest) (response *DeleteChannelUserOrderResponse, err error) {
    return c.DeleteChannelUserOrderWithContext(context.Background(), request)
}

// DeleteChannelUserOrder
// 删除新闻渠道单个用户订单
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ORDERNOTALLOWTODEL = "FailedOperation.OrderNotAllowToDel"
func (c *Client) DeleteChannelUserOrderWithContext(ctx context.Context, request *DeleteChannelUserOrderRequest) (response *DeleteChannelUserOrderResponse, err error) {
    if request == nil {
        request = NewDeleteChannelUserOrderRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DeleteChannelUserOrder require credential")
    }

    request.SetContext(ctx)
    
    response = NewDeleteChannelUserOrderResponse()
    err = c.Send(request, response)
    return
}

func NewDeleteCourseRequest() (request *DeleteCourseRequest) {
    request = &DeleteCourseRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DeleteCourse")
    
    
    return
}

func NewDeleteCourseResponse() (response *DeleteCourseResponse) {
    response = &DeleteCourseResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DeleteCourse
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
func (c *Client) DeleteCourse(request *DeleteCourseRequest) (response *DeleteCourseResponse, err error) {
    return c.DeleteCourseWithContext(context.Background(), request)
}

// DeleteCourse
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
func (c *Client) DeleteCourseWithContext(ctx context.Context, request *DeleteCourseRequest) (response *DeleteCourseResponse, err error) {
    if request == nil {
        request = NewDeleteCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DeleteCourse require credential")
    }

    request.SetContext(ctx)
    
    response = NewDeleteCourseResponse()
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
    return c.DeleteFastCourseTaskWithContext(context.Background(), request)
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
func (c *Client) DeleteFastCourseTaskWithContext(ctx context.Context, request *DeleteFastCourseTaskRequest) (response *DeleteFastCourseTaskResponse, err error) {
    if request == nil {
        request = NewDeleteFastCourseTaskRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DeleteFastCourseTask require credential")
    }

    request.SetContext(ctx)
    
    response = NewDeleteFastCourseTaskResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyCouponsRequest() (request *DescribeAgencyCouponsRequest) {
    request = &DescribeAgencyCouponsRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyCoupons")
    
    
    return
}

func NewDescribeAgencyCouponsResponse() (response *DescribeAgencyCouponsResponse) {
    response = &DescribeAgencyCouponsResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyCoupons
// 用于获取机构优惠券
//
// 可能返回的错误码:
//  INVALIDPARAMETER = "InvalidParameter"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCoupons(request *DescribeAgencyCouponsRequest) (response *DescribeAgencyCouponsResponse, err error) {
    return c.DescribeAgencyCouponsWithContext(context.Background(), request)
}

// DescribeAgencyCoupons
// 用于获取机构优惠券
//
// 可能返回的错误码:
//  INVALIDPARAMETER = "InvalidParameter"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCouponsWithContext(ctx context.Context, request *DescribeAgencyCouponsRequest) (response *DescribeAgencyCouponsResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyCouponsRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyCoupons require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyCouponsResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyCourseRequest() (request *DescribeAgencyCourseRequest) {
    request = &DescribeAgencyCourseRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyCourse")
    
    
    return
}

func NewDescribeAgencyCourseResponse() (response *DescribeAgencyCourseResponse) {
    response = &DescribeAgencyCourseResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyCourse
// 该API用于查询机构课程信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCourse(request *DescribeAgencyCourseRequest) (response *DescribeAgencyCourseResponse, err error) {
    return c.DescribeAgencyCourseWithContext(context.Background(), request)
}

// DescribeAgencyCourse
// 该API用于查询机构课程信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCourseWithContext(ctx context.Context, request *DescribeAgencyCourseRequest) (response *DescribeAgencyCourseResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyCourse require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyCourseResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyCourseInfosRequest() (request *DescribeAgencyCourseInfosRequest) {
    request = &DescribeAgencyCourseInfosRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyCourseInfos")
    
    
    return
}

func NewDescribeAgencyCourseInfosResponse() (response *DescribeAgencyCourseInfosResponse) {
    response = &DescribeAgencyCourseInfosResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyCourseInfos
// 该API用于查询机构所有课程和系列课信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_LOGICOPGETTERMINFO = "FailedOperation.LogicOpGetTermInfo"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCourseInfos(request *DescribeAgencyCourseInfosRequest) (response *DescribeAgencyCourseInfosResponse, err error) {
    return c.DescribeAgencyCourseInfosWithContext(context.Background(), request)
}

// DescribeAgencyCourseInfos
// 该API用于查询机构所有课程和系列课信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_LOGICOPGETTERMINFO = "FailedOperation.LogicOpGetTermInfo"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCourseInfosWithContext(ctx context.Context, request *DescribeAgencyCourseInfosRequest) (response *DescribeAgencyCourseInfosResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyCourseInfosRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyCourseInfos require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyCourseInfosResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyCoursePkgRequest() (request *DescribeAgencyCoursePkgRequest) {
    request = &DescribeAgencyCoursePkgRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyCoursePkg")
    
    
    return
}

func NewDescribeAgencyCoursePkgResponse() (response *DescribeAgencyCoursePkgResponse) {
    response = &DescribeAgencyCoursePkgResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyCoursePkg
// 该API用于查询机构课程包信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_INVALIDUSERID = "FailedOperation.InvalidUserId"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCoursePkg(request *DescribeAgencyCoursePkgRequest) (response *DescribeAgencyCoursePkgResponse, err error) {
    return c.DescribeAgencyCoursePkgWithContext(context.Background(), request)
}

// DescribeAgencyCoursePkg
// 该API用于查询机构课程包信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_INVALIDUSERID = "FailedOperation.InvalidUserId"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCoursePkgWithContext(ctx context.Context, request *DescribeAgencyCoursePkgRequest) (response *DescribeAgencyCoursePkgResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyCoursePkgRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyCoursePkg require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyCoursePkgResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyCoursesRequest() (request *DescribeAgencyCoursesRequest) {
    request = &DescribeAgencyCoursesRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyCourses")
    
    
    return
}

func NewDescribeAgencyCoursesResponse() (response *DescribeAgencyCoursesResponse) {
    response = &DescribeAgencyCoursesResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyCourses
// 该API用于查询机构课程基础信息
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_INVALIDCOURSE = "FailedOperation.InvalidCourse"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCourses(request *DescribeAgencyCoursesRequest) (response *DescribeAgencyCoursesResponse, err error) {
    return c.DescribeAgencyCoursesWithContext(context.Background(), request)
}

// DescribeAgencyCourses
// 该API用于查询机构课程基础信息
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_INVALIDCOURSE = "FailedOperation.InvalidCourse"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyCoursesWithContext(ctx context.Context, request *DescribeAgencyCoursesRequest) (response *DescribeAgencyCoursesResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyCoursesRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyCourses require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyCoursesResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyPrivateCouponsRequest() (request *DescribeAgencyPrivateCouponsRequest) {
    request = &DescribeAgencyPrivateCouponsRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyPrivateCoupons")
    
    
    return
}

func NewDescribeAgencyPrivateCouponsResponse() (response *DescribeAgencyPrivateCouponsResponse) {
    response = &DescribeAgencyPrivateCouponsResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyPrivateCoupons
// 用于获取机构批量私密优惠券链接
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INVALIDPARAMETER = "InvalidParameter"
func (c *Client) DescribeAgencyPrivateCoupons(request *DescribeAgencyPrivateCouponsRequest) (response *DescribeAgencyPrivateCouponsResponse, err error) {
    return c.DescribeAgencyPrivateCouponsWithContext(context.Background(), request)
}

// DescribeAgencyPrivateCoupons
// 用于获取机构批量私密优惠券链接
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INVALIDPARAMETER = "InvalidParameter"
func (c *Client) DescribeAgencyPrivateCouponsWithContext(ctx context.Context, request *DescribeAgencyPrivateCouponsRequest) (response *DescribeAgencyPrivateCouponsResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyPrivateCouponsRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyPrivateCoupons require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyPrivateCouponsResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyTermsRequest() (request *DescribeAgencyTermsRequest) {
    request = &DescribeAgencyTermsRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyTerms")
    
    
    return
}

func NewDescribeAgencyTermsResponse() (response *DescribeAgencyTermsResponse) {
    response = &DescribeAgencyTermsResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyTerms
// 该API用于查询机构班级基础信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyTerms(request *DescribeAgencyTermsRequest) (response *DescribeAgencyTermsResponse, err error) {
    return c.DescribeAgencyTermsWithContext(context.Background(), request)
}

// DescribeAgencyTerms
// 该API用于查询机构班级基础信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyTermsWithContext(ctx context.Context, request *DescribeAgencyTermsRequest) (response *DescribeAgencyTermsResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyTermsRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyTerms require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyTermsResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyUserApplyCoursesRequest() (request *DescribeAgencyUserApplyCoursesRequest) {
    request = &DescribeAgencyUserApplyCoursesRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyUserApplyCourses")
    
    
    return
}

func NewDescribeAgencyUserApplyCoursesResponse() (response *DescribeAgencyUserApplyCoursesResponse) {
    response = &DescribeAgencyUserApplyCoursesResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyUserApplyCourses
// 该API用于查询机构学员的报名关系
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserApplyCourses(request *DescribeAgencyUserApplyCoursesRequest) (response *DescribeAgencyUserApplyCoursesResponse, err error) {
    return c.DescribeAgencyUserApplyCoursesWithContext(context.Background(), request)
}

// DescribeAgencyUserApplyCourses
// 该API用于查询机构学员的报名关系
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserApplyCoursesWithContext(ctx context.Context, request *DescribeAgencyUserApplyCoursesRequest) (response *DescribeAgencyUserApplyCoursesResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyUserApplyCoursesRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyUserApplyCourses require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyUserApplyCoursesResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyUserAttendanceRequest() (request *DescribeAgencyUserAttendanceRequest) {
    request = &DescribeAgencyUserAttendanceRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyUserAttendance")
    
    
    return
}

func NewDescribeAgencyUserAttendanceResponse() (response *DescribeAgencyUserAttendanceResponse) {
    response = &DescribeAgencyUserAttendanceResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyUserAttendance
// 该API用于查询机构学员考勤数据
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserAttendance(request *DescribeAgencyUserAttendanceRequest) (response *DescribeAgencyUserAttendanceResponse, err error) {
    return c.DescribeAgencyUserAttendanceWithContext(context.Background(), request)
}

// DescribeAgencyUserAttendance
// 该API用于查询机构学员考勤数据
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserAttendanceWithContext(ctx context.Context, request *DescribeAgencyUserAttendanceRequest) (response *DescribeAgencyUserAttendanceResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyUserAttendanceRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyUserAttendance require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyUserAttendanceResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyUserOrdersRequest() (request *DescribeAgencyUserOrdersRequest) {
    request = &DescribeAgencyUserOrdersRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyUserOrders")
    
    
    return
}

func NewDescribeAgencyUserOrdersResponse() (response *DescribeAgencyUserOrdersResponse) {
    response = &DescribeAgencyUserOrdersResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyUserOrders
// 获取机构学员的订单列表
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INVALIDPARAMETER = "InvalidParameter"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserOrders(request *DescribeAgencyUserOrdersRequest) (response *DescribeAgencyUserOrdersResponse, err error) {
    return c.DescribeAgencyUserOrdersWithContext(context.Background(), request)
}

// DescribeAgencyUserOrders
// 获取机构学员的订单列表
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INVALIDPARAMETER = "InvalidParameter"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserOrdersWithContext(ctx context.Context, request *DescribeAgencyUserOrdersRequest) (response *DescribeAgencyUserOrdersResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyUserOrdersRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyUserOrders require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyUserOrdersResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyUserStudyProgressesRequest() (request *DescribeAgencyUserStudyProgressesRequest) {
    request = &DescribeAgencyUserStudyProgressesRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyUserStudyProgresses")
    
    
    return
}

func NewDescribeAgencyUserStudyProgressesResponse() (response *DescribeAgencyUserStudyProgressesResponse) {
    response = &DescribeAgencyUserStudyProgressesResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyUserStudyProgresses
// 该API用于查询机构学员学习进度
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserStudyProgresses(request *DescribeAgencyUserStudyProgressesRequest) (response *DescribeAgencyUserStudyProgressesResponse, err error) {
    return c.DescribeAgencyUserStudyProgressesWithContext(context.Background(), request)
}

// DescribeAgencyUserStudyProgresses
// 该API用于查询机构学员学习进度
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUserStudyProgressesWithContext(ctx context.Context, request *DescribeAgencyUserStudyProgressesRequest) (response *DescribeAgencyUserStudyProgressesResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyUserStudyProgressesRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyUserStudyProgresses require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyUserStudyProgressesResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeAgencyUsersRequest() (request *DescribeAgencyUsersRequest) {
    request = &DescribeAgencyUsersRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeAgencyUsers")
    
    
    return
}

func NewDescribeAgencyUsersResponse() (response *DescribeAgencyUsersResponse) {
    response = &DescribeAgencyUsersResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeAgencyUsers
// 该API批量获取多个指定学员的基本信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUsers(request *DescribeAgencyUsersRequest) (response *DescribeAgencyUsersResponse, err error) {
    return c.DescribeAgencyUsersWithContext(context.Background(), request)
}

// DescribeAgencyUsers
// 该API批量获取多个指定学员的基本信息
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  UNAUTHORIZEDOPERATION_APPIDNOTMATCHCORPID = "UnauthorizedOperation.AppIdNotMatchCorpid"
func (c *Client) DescribeAgencyUsersWithContext(ctx context.Context, request *DescribeAgencyUsersRequest) (response *DescribeAgencyUsersResponse, err error) {
    if request == nil {
        request = NewDescribeAgencyUsersRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeAgencyUsers require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeAgencyUsersResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeChannelClassInfosRequest() (request *DescribeChannelClassInfosRequest) {
    request = &DescribeChannelClassInfosRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeChannelClassInfos")
    
    
    return
}

func NewDescribeChannelClassInfosResponse() (response *DescribeChannelClassInfosResponse) {
    response = &DescribeChannelClassInfosResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeChannelClassInfos
// 合作方用来同步直播课程的直播状态
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
//  FAILEDOPERATION_MYSQLERROR = "FailedOperation.MysqlError"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  REQUESTLIMITEXCEEDED = "RequestLimitExceeded"
func (c *Client) DescribeChannelClassInfos(request *DescribeChannelClassInfosRequest) (response *DescribeChannelClassInfosResponse, err error) {
    return c.DescribeChannelClassInfosWithContext(context.Background(), request)
}

// DescribeChannelClassInfos
// 合作方用来同步直播课程的直播状态
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
//  FAILEDOPERATION_MYSQLERROR = "FailedOperation.MysqlError"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  REQUESTLIMITEXCEEDED = "RequestLimitExceeded"
func (c *Client) DescribeChannelClassInfosWithContext(ctx context.Context, request *DescribeChannelClassInfosRequest) (response *DescribeChannelClassInfosResponse, err error) {
    if request == nil {
        request = NewDescribeChannelClassInfosRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeChannelClassInfos require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeChannelClassInfosResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeChannelCourseIdsRequest() (request *DescribeChannelCourseIdsRequest) {
    request = &DescribeChannelCourseIdsRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeChannelCourseIds")
    
    
    return
}

func NewDescribeChannelCourseIdsResponse() (response *DescribeChannelCourseIdsResponse) {
    response = &DescribeChannelCourseIdsResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeChannelCourseIds
// 为合作方提供需要的课程id列表
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
func (c *Client) DescribeChannelCourseIds(request *DescribeChannelCourseIdsRequest) (response *DescribeChannelCourseIdsResponse, err error) {
    return c.DescribeChannelCourseIdsWithContext(context.Background(), request)
}

// DescribeChannelCourseIds
// 为合作方提供需要的课程id列表
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
func (c *Client) DescribeChannelCourseIdsWithContext(ctx context.Context, request *DescribeChannelCourseIdsRequest) (response *DescribeChannelCourseIdsResponse, err error) {
    if request == nil {
        request = NewDescribeChannelCourseIdsRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeChannelCourseIds require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeChannelCourseIdsResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeChannelPoolCoursesRequest() (request *DescribeChannelPoolCoursesRequest) {
    request = &DescribeChannelPoolCoursesRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeChannelPoolCourses")
    
    
    return
}

func NewDescribeChannelPoolCoursesResponse() (response *DescribeChannelPoolCoursesResponse) {
    response = &DescribeChannelPoolCoursesResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeChannelPoolCourses
// 根据课程id获取课程下详细数据
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_CLICKEXPCOURSENOTICEPARAMERR = "FailedOperation.ClickExpCourseNoticeParamErr"
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
//  INTERNALERROR = "InternalError"
func (c *Client) DescribeChannelPoolCourses(request *DescribeChannelPoolCoursesRequest) (response *DescribeChannelPoolCoursesResponse, err error) {
    return c.DescribeChannelPoolCoursesWithContext(context.Background(), request)
}

// DescribeChannelPoolCourses
// 根据课程id获取课程下详细数据
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_CLICKEXPCOURSENOTICEPARAMERR = "FailedOperation.ClickExpCourseNoticeParamErr"
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
//  INTERNALERROR = "InternalError"
func (c *Client) DescribeChannelPoolCoursesWithContext(ctx context.Context, request *DescribeChannelPoolCoursesRequest) (response *DescribeChannelPoolCoursesResponse, err error) {
    if request == nil {
        request = NewDescribeChannelPoolCoursesRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeChannelPoolCourses require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeChannelPoolCoursesResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeChannelUserOrderInfoRequest() (request *DescribeChannelUserOrderInfoRequest) {
    request = &DescribeChannelUserOrderInfoRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeChannelUserOrderInfo")
    
    
    return
}

func NewDescribeChannelUserOrderInfoResponse() (response *DescribeChannelUserOrderInfoResponse) {
    response = &DescribeChannelUserOrderInfoResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeChannelUserOrderInfo
// 查询新闻渠道单个用户订单详情
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
func (c *Client) DescribeChannelUserOrderInfo(request *DescribeChannelUserOrderInfoRequest) (response *DescribeChannelUserOrderInfoResponse, err error) {
    return c.DescribeChannelUserOrderInfoWithContext(context.Background(), request)
}

// DescribeChannelUserOrderInfo
// 查询新闻渠道单个用户订单详情
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
func (c *Client) DescribeChannelUserOrderInfoWithContext(ctx context.Context, request *DescribeChannelUserOrderInfoRequest) (response *DescribeChannelUserOrderInfoResponse, err error) {
    if request == nil {
        request = NewDescribeChannelUserOrderInfoRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeChannelUserOrderInfo require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeChannelUserOrderInfoResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeChannelUserOrdersRequest() (request *DescribeChannelUserOrdersRequest) {
    request = &DescribeChannelUserOrdersRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeChannelUserOrders")
    
    
    return
}

func NewDescribeChannelUserOrdersResponse() (response *DescribeChannelUserOrdersResponse) {
    response = &DescribeChannelUserOrdersResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeChannelUserOrders
// 查询新闻渠道单个用户订单
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  FAILEDOPERATION_LOGICTHIRDUSERNOTFOUND = "FailedOperation.LogicThirdUserNotFound"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeChannelUserOrders(request *DescribeChannelUserOrdersRequest) (response *DescribeChannelUserOrdersResponse, err error) {
    return c.DescribeChannelUserOrdersWithContext(context.Background(), request)
}

// DescribeChannelUserOrders
// 查询新闻渠道单个用户订单
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  FAILEDOPERATION_LOGICTHIRDUSERNOTFOUND = "FailedOperation.LogicThirdUserNotFound"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeChannelUserOrdersWithContext(ctx context.Context, request *DescribeChannelUserOrdersRequest) (response *DescribeChannelUserOrdersResponse, err error) {
    if request == nil {
        request = NewDescribeChannelUserOrdersRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeChannelUserOrders require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeChannelUserOrdersResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeChatRequest() (request *DescribeChatRequest) {
    request = &DescribeChatRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeChat")
    
    
    return
}

func NewDescribeChatResponse() (response *DescribeChatResponse) {
    response = &DescribeChatResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeChat
// 获取直播课下的聊天信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeChat(request *DescribeChatRequest) (response *DescribeChatResponse, err error) {
    return c.DescribeChatWithContext(context.Background(), request)
}

// DescribeChat
// 获取直播课下的聊天信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeChatWithContext(ctx context.Context, request *DescribeChatRequest) (response *DescribeChatResponse, err error) {
    if request == nil {
        request = NewDescribeChatRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeChat require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeChatResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeCourseInfoRequest() (request *DescribeCourseInfoRequest) {
    request = &DescribeCourseInfoRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeCourseInfo")
    
    
    return
}

func NewDescribeCourseInfoResponse() (response *DescribeCourseInfoResponse) {
    response = &DescribeCourseInfoResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeCourseInfo
// 渠道物料-课程信息，支持批量查询
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeCourseInfo(request *DescribeCourseInfoRequest) (response *DescribeCourseInfoResponse, err error) {
    return c.DescribeCourseInfoWithContext(context.Background(), request)
}

// DescribeCourseInfo
// 渠道物料-课程信息，支持批量查询
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeCourseInfoWithContext(ctx context.Context, request *DescribeCourseInfoRequest) (response *DescribeCourseInfoResponse, err error) {
    if request == nil {
        request = NewDescribeCourseInfoRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeCourseInfo require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeCourseInfoResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeCourseListRequest() (request *DescribeCourseListRequest) {
    request = &DescribeCourseListRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeCourseList")
    
    
    return
}

func NewDescribeCourseListResponse() (response *DescribeCourseListResponse) {
    response = &DescribeCourseListResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeCourseList
// 供渠道查看课程列表
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeCourseList(request *DescribeCourseListRequest) (response *DescribeCourseListResponse, err error) {
    return c.DescribeCourseListWithContext(context.Background(), request)
}

// DescribeCourseList
// 供渠道查看课程列表
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeCourseListWithContext(ctx context.Context, request *DescribeCourseListRequest) (response *DescribeCourseListResponse, err error) {
    if request == nil {
        request = NewDescribeCourseListRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeCourseList require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeCourseListResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeCoursePkgRequest() (request *DescribeCoursePkgRequest) {
    request = &DescribeCoursePkgRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeCoursePkg")
    
    
    return
}

func NewDescribeCoursePkgResponse() (response *DescribeCoursePkgResponse) {
    response = &DescribeCoursePkgResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeCoursePkg
// 渠道物料-系列课信息，支持批量查询
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeCoursePkg(request *DescribeCoursePkgRequest) (response *DescribeCoursePkgResponse, err error) {
    return c.DescribeCoursePkgWithContext(context.Background(), request)
}

// DescribeCoursePkg
// 渠道物料-系列课信息，支持批量查询
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeCoursePkgWithContext(ctx context.Context, request *DescribeCoursePkgRequest) (response *DescribeCoursePkgResponse, err error) {
    if request == nil {
        request = NewDescribeCoursePkgRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeCoursePkg require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeCoursePkgResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeCourseTasksRequest() (request *DescribeCourseTasksRequest) {
    request = &DescribeCourseTasksRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeCourseTasks")
    
    
    return
}

func NewDescribeCourseTasksResponse() (response *DescribeCourseTasksResponse) {
    response = &DescribeCourseTasksResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeCourseTasks
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
func (c *Client) DescribeCourseTasks(request *DescribeCourseTasksRequest) (response *DescribeCourseTasksResponse, err error) {
    return c.DescribeCourseTasksWithContext(context.Background(), request)
}

// DescribeCourseTasks
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
func (c *Client) DescribeCourseTasksWithContext(ctx context.Context, request *DescribeCourseTasksRequest) (response *DescribeCourseTasksResponse, err error) {
    if request == nil {
        request = NewDescribeCourseTasksRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeCourseTasks require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeCourseTasksResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeDeptRootRequest() (request *DescribeDeptRootRequest) {
    request = &DescribeDeptRootRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeDeptRoot")
    
    
    return
}

func NewDescribeDeptRootResponse() (response *DescribeDeptRootResponse) {
    response = &DescribeDeptRootResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeDeptRoot
// 获取接入方通讯录中的根部门信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPGETROOTDEPT = "FailedOperation.HttpGetRootDept"
//  FAILEDOPERATION_INPUTPARAMS = "FailedOperation.InputParams"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) DescribeDeptRoot(request *DescribeDeptRootRequest) (response *DescribeDeptRootResponse, err error) {
    return c.DescribeDeptRootWithContext(context.Background(), request)
}

// DescribeDeptRoot
// 获取接入方通讯录中的根部门信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPGETROOTDEPT = "FailedOperation.HttpGetRootDept"
//  FAILEDOPERATION_INPUTPARAMS = "FailedOperation.InputParams"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) DescribeDeptRootWithContext(ctx context.Context, request *DescribeDeptRootRequest) (response *DescribeDeptRootResponse, err error) {
    if request == nil {
        request = NewDescribeDeptRootRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeDeptRoot require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeDeptRootResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeDeptSubRequest() (request *DescribeDeptSubRequest) {
    request = &DescribeDeptSubRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeDeptSub")
    
    
    return
}

func NewDescribeDeptSubResponse() (response *DescribeDeptSubResponse) {
    response = &DescribeDeptSubResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeDeptSub
// 获取接入方通讯录中的子部门信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPGETSUBDEPT = "FailedOperation.HttpGetSubDept"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) DescribeDeptSub(request *DescribeDeptSubRequest) (response *DescribeDeptSubResponse, err error) {
    return c.DescribeDeptSubWithContext(context.Background(), request)
}

// DescribeDeptSub
// 获取接入方通讯录中的子部门信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPGETSUBDEPT = "FailedOperation.HttpGetSubDept"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) DescribeDeptSubWithContext(ctx context.Context, request *DescribeDeptSubRequest) (response *DescribeDeptSubResponse, err error) {
    if request == nil {
        request = NewDescribeDeptSubRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeDeptSub require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeDeptSubResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeDeptUserRequest() (request *DescribeDeptUserRequest) {
    request = &DescribeDeptUserRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeDeptUser")
    
    
    return
}

func NewDescribeDeptUserResponse() (response *DescribeDeptUserResponse) {
    response = &DescribeDeptUserResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeDeptUser
// 获取接入方通讯录中的部门用户信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPGETROOTDEPT = "FailedOperation.HttpGetRootDept"
//  FAILEDOPERATION_INPUTPARAMS = "FailedOperation.InputParams"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) DescribeDeptUser(request *DescribeDeptUserRequest) (response *DescribeDeptUserResponse, err error) {
    return c.DescribeDeptUserWithContext(context.Background(), request)
}

// DescribeDeptUser
// 获取接入方通讯录中的部门用户信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPGETROOTDEPT = "FailedOperation.HttpGetRootDept"
//  FAILEDOPERATION_INPUTPARAMS = "FailedOperation.InputParams"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) DescribeDeptUserWithContext(ctx context.Context, request *DescribeDeptUserRequest) (response *DescribeDeptUserResponse, err error) {
    if request == nil {
        request = NewDescribeDeptUserRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeDeptUser require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeDeptUserResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeExamAnswerRequest() (request *DescribeExamAnswerRequest) {
    request = &DescribeExamAnswerRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeExamAnswer")
    
    
    return
}

func NewDescribeExamAnswerResponse() (response *DescribeExamAnswerResponse) {
    response = &DescribeExamAnswerResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeExamAnswer
// 获取直播课题目的答题信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeExamAnswer(request *DescribeExamAnswerRequest) (response *DescribeExamAnswerResponse, err error) {
    return c.DescribeExamAnswerWithContext(context.Background(), request)
}

// DescribeExamAnswer
// 获取直播课题目的答题信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeExamAnswerWithContext(ctx context.Context, request *DescribeExamAnswerRequest) (response *DescribeExamAnswerResponse, err error) {
    if request == nil {
        request = NewDescribeExamAnswerRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeExamAnswer require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeExamAnswerResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeExamQuestionRequest() (request *DescribeExamQuestionRequest) {
    request = &DescribeExamQuestionRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeExamQuestion")
    
    
    return
}

func NewDescribeExamQuestionResponse() (response *DescribeExamQuestionResponse) {
    response = &DescribeExamQuestionResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeExamQuestion
// 获取直播课题目信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeExamQuestion(request *DescribeExamQuestionRequest) (response *DescribeExamQuestionResponse, err error) {
    return c.DescribeExamQuestionWithContext(context.Background(), request)
}

// DescribeExamQuestion
// 获取直播课题目信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeExamQuestionWithContext(ctx context.Context, request *DescribeExamQuestionRequest) (response *DescribeExamQuestionResponse, err error) {
    if request == nil {
        request = NewDescribeExamQuestionRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeExamQuestion require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeExamQuestionResponse()
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
    return c.DescribeFastCourseTasksWithContext(context.Background(), request)
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
func (c *Client) DescribeFastCourseTasksWithContext(ctx context.Context, request *DescribeFastCourseTasksRequest) (response *DescribeFastCourseTasksResponse, err error) {
    if request == nil {
        request = NewDescribeFastCourseTasksRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeFastCourseTasks require credential")
    }

    request.SetContext(ctx)
    
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
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastLiveCourse(request *DescribeFastLiveCourseRequest) (response *DescribeFastLiveCourseResponse, err error) {
    return c.DescribeFastLiveCourseWithContext(context.Background(), request)
}

// DescribeFastLiveCourse
// 该API获取指定直播课信息详情
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastLiveCourseWithContext(ctx context.Context, request *DescribeFastLiveCourseRequest) (response *DescribeFastLiveCourseResponse, err error) {
    if request == nil {
        request = NewDescribeFastLiveCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeFastLiveCourse require credential")
    }

    request.SetContext(ctx)
    
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
    return c.DescribeFastLiveCoursesWithContext(context.Background(), request)
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
func (c *Client) DescribeFastLiveCoursesWithContext(ctx context.Context, request *DescribeFastLiveCoursesRequest) (response *DescribeFastLiveCoursesResponse, err error) {
    if request == nil {
        request = NewDescribeFastLiveCoursesRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeFastLiveCourses require credential")
    }

    request.SetContext(ctx)
    
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
// 废弃该API获取直播课回放下载地址
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastReplayDownloads(request *DescribeFastReplayDownloadsRequest) (response *DescribeFastReplayDownloadsResponse, err error) {
    return c.DescribeFastReplayDownloadsWithContext(context.Background(), request)
}

// DescribeFastReplayDownloads
// 废弃该API获取直播课回放下载地址
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeFastReplayDownloadsWithContext(ctx context.Context, request *DescribeFastReplayDownloadsRequest) (response *DescribeFastReplayDownloadsResponse, err error) {
    if request == nil {
        request = NewDescribeFastReplayDownloadsRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeFastReplayDownloads require credential")
    }

    request.SetContext(ctx)
    
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
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETER_ERRINPUTTINYPARAM = "InvalidParameter.ErrInputTinyParam"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  OPERATIONDENIED_ERRMODEXPERIENCECOURSETEACHER = "OperationDenied.ErrModExperienceCourseTeacher"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) DescribeFastReplays(request *DescribeFastReplaysRequest) (response *DescribeFastReplaysResponse, err error) {
    return c.DescribeFastReplaysWithContext(context.Background(), request)
}

// DescribeFastReplays
// 该API获取一门直播课的回放列表
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETER_ERRINPUTTINYPARAM = "InvalidParameter.ErrInputTinyParam"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  OPERATIONDENIED_ERRMODEXPERIENCECOURSETEACHER = "OperationDenied.ErrModExperienceCourseTeacher"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) DescribeFastReplaysWithContext(ctx context.Context, request *DescribeFastReplaysRequest) (response *DescribeFastReplaysResponse, err error) {
    if request == nil {
        request = NewDescribeFastReplaysRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeFastReplays require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeFastReplaysResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeLiveCourseRequest() (request *DescribeLiveCourseRequest) {
    request = &DescribeLiveCourseRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeLiveCourse")
    
    
    return
}

func NewDescribeLiveCourseResponse() (response *DescribeLiveCourseResponse) {
    response = &DescribeLiveCourseResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeLiveCourse
// 该API获取指定直播课信息详情
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeLiveCourse(request *DescribeLiveCourseRequest) (response *DescribeLiveCourseResponse, err error) {
    return c.DescribeLiveCourseWithContext(context.Background(), request)
}

// DescribeLiveCourse
// 该API获取指定直播课信息详情
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeLiveCourseWithContext(ctx context.Context, request *DescribeLiveCourseRequest) (response *DescribeLiveCourseResponse, err error) {
    if request == nil {
        request = NewDescribeLiveCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeLiveCourse require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeLiveCourseResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeLiveCoursesRequest() (request *DescribeLiveCoursesRequest) {
    request = &DescribeLiveCoursesRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeLiveCourses")
    
    
    return
}

func NewDescribeLiveCoursesResponse() (response *DescribeLiveCoursesResponse) {
    response = &DescribeLiveCoursesResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeLiveCourses
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
func (c *Client) DescribeLiveCourses(request *DescribeLiveCoursesRequest) (response *DescribeLiveCoursesResponse, err error) {
    return c.DescribeLiveCoursesWithContext(context.Background(), request)
}

// DescribeLiveCourses
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
func (c *Client) DescribeLiveCoursesWithContext(ctx context.Context, request *DescribeLiveCoursesRequest) (response *DescribeLiveCoursesResponse, err error) {
    if request == nil {
        request = NewDescribeLiveCoursesRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeLiveCourses require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeLiveCoursesResponse()
    err = c.Send(request, response)
    return
}

func NewDescribePlanProcessRequest() (request *DescribePlanProcessRequest) {
    request = &DescribePlanProcessRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribePlanProcess")
    
    
    return
}

func NewDescribePlanProcessResponse() (response *DescribePlanProcessResponse) {
    response = &DescribePlanProcessResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribePlanProcess
// 课程学习进度
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
func (c *Client) DescribePlanProcess(request *DescribePlanProcessRequest) (response *DescribePlanProcessResponse, err error) {
    return c.DescribePlanProcessWithContext(context.Background(), request)
}

// DescribePlanProcess
// 课程学习进度
//
// 可能返回的错误码:
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
func (c *Client) DescribePlanProcessWithContext(ctx context.Context, request *DescribePlanProcessRequest) (response *DescribePlanProcessResponse, err error) {
    if request == nil {
        request = NewDescribePlanProcessRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribePlanProcess require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribePlanProcessResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeReplayDownloadsRequest() (request *DescribeReplayDownloadsRequest) {
    request = &DescribeReplayDownloadsRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeReplayDownloads")
    
    
    return
}

func NewDescribeReplayDownloadsResponse() (response *DescribeReplayDownloadsResponse) {
    response = &DescribeReplayDownloadsResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeReplayDownloads
// 该API获取直播课回放下载地址
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_GETCOURSECONTENTTASKERR = "FailedOperation.GetCourseContentTaskErr"
//  FAILEDOPERATION_INSERTCOURSECONTENTTASKERR = "FailedOperation.InsertCourseContentTaskErr"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICDELRECORDFILEERR = "FailedOperation.LogicDelRecordFileErr"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICMAXLIVECOURSETOOMORE = "FailedOperation.LogicMaxLiveCourseTooMore"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICNOTFOUNDTASK = "FailedOperation.LogicNotFoundTask"
//  FAILEDOPERATION_LOGICOPGETTERMINFO = "FailedOperation.LogicOpGetTermInfo"
//  FAILEDOPERATION_LOGICOPOTHERUSERCOURSE = "FailedOperation.LogicOpOtherUserCourse"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_LOGICUIDTYPEINVALID = "FailedOperation.LogicUidTypeInvalid"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATEREGISTERINFOFAIL = "FailedOperation.LogicUpdateRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  FAILEDOPERATION_LOGICUSERBINDTOOMORETERM = "FailedOperation.LogicUserBindTooMoreTerm"
//  FAILEDOPERATION_TIMERNEWMYSQLERROR = "FailedOperation.TimerNewMysqlError"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  FAILEDOPERATION_TIMERPARAMTYPEERROR = "FailedOperation.TimerParamTypeError"
//  FAILEDOPERATION_TIMERUNBINDERROR = "FailedOperation.TimerUnbindError"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKERR = "FailedOperation.UpdateCourseContentTaskErr"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKTEACHERERR = "FailedOperation.UpdateCourseContentTaskTeacherErr"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeReplayDownloads(request *DescribeReplayDownloadsRequest) (response *DescribeReplayDownloadsResponse, err error) {
    return c.DescribeReplayDownloadsWithContext(context.Background(), request)
}

// DescribeReplayDownloads
// 该API获取直播课回放下载地址
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_GETCOURSECONTENTTASKERR = "FailedOperation.GetCourseContentTaskErr"
//  FAILEDOPERATION_INSERTCOURSECONTENTTASKERR = "FailedOperation.InsertCourseContentTaskErr"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICDELRECORDFILEERR = "FailedOperation.LogicDelRecordFileErr"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICMAXLIVECOURSETOOMORE = "FailedOperation.LogicMaxLiveCourseTooMore"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICNOTFOUNDTASK = "FailedOperation.LogicNotFoundTask"
//  FAILEDOPERATION_LOGICOPGETTERMINFO = "FailedOperation.LogicOpGetTermInfo"
//  FAILEDOPERATION_LOGICOPOTHERUSERCOURSE = "FailedOperation.LogicOpOtherUserCourse"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"
//  FAILEDOPERATION_LOGICUIDTYPEINVALID = "FailedOperation.LogicUidTypeInvalid"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATEREGISTERINFOFAIL = "FailedOperation.LogicUpdateRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  FAILEDOPERATION_LOGICUSERBINDTOOMORETERM = "FailedOperation.LogicUserBindTooMoreTerm"
//  FAILEDOPERATION_TIMERNEWMYSQLERROR = "FailedOperation.TimerNewMysqlError"
//  FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"
//  FAILEDOPERATION_TIMERPARAMTYPEERROR = "FailedOperation.TimerParamTypeError"
//  FAILEDOPERATION_TIMERUNBINDERROR = "FailedOperation.TimerUnbindError"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKERR = "FailedOperation.UpdateCourseContentTaskErr"
//  FAILEDOPERATION_UPDATECOURSECONTENTTASKTEACHERERR = "FailedOperation.UpdateCourseContentTaskTeacherErr"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) DescribeReplayDownloadsWithContext(ctx context.Context, request *DescribeReplayDownloadsRequest) (response *DescribeReplayDownloadsResponse, err error) {
    if request == nil {
        request = NewDescribeReplayDownloadsRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeReplayDownloads require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeReplayDownloadsResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeReplaysRequest() (request *DescribeReplaysRequest) {
    request = &DescribeReplaysRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeReplays")
    
    
    return
}

func NewDescribeReplaysResponse() (response *DescribeReplaysResponse) {
    response = &DescribeReplaysResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeReplays
// 该API获取一门直播课的回放列表
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETER_ERRINPUTTINYPARAM = "InvalidParameter.ErrInputTinyParam"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  OPERATIONDENIED_ERRMODEXPERIENCECOURSETEACHER = "OperationDenied.ErrModExperienceCourseTeacher"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) DescribeReplays(request *DescribeReplaysRequest) (response *DescribeReplaysResponse, err error) {
    return c.DescribeReplaysWithContext(context.Background(), request)
}

// DescribeReplays
// 该API获取一门直播课的回放列表
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"
//  FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"
//  FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"
//  FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"
//  FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"
//  FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"
//  FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"
//  FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"
//  FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"
//  FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"
//  FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"
//  FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"
//  FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"
//  FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETER_ERRINPUTTINYPARAM = "InvalidParameter.ErrInputTinyParam"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  OPERATIONDENIED_ERRMODEXPERIENCECOURSETEACHER = "OperationDenied.ErrModExperienceCourseTeacher"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
func (c *Client) DescribeReplaysWithContext(ctx context.Context, request *DescribeReplaysRequest) (response *DescribeReplaysResponse, err error) {
    if request == nil {
        request = NewDescribeReplaysRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeReplays require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeReplaysResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeStudyDataRequest() (request *DescribeStudyDataRequest) {
    request = &DescribeStudyDataRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeStudyData")
    
    
    return
}

func NewDescribeStudyDataResponse() (response *DescribeStudyDataResponse) {
    response = &DescribeStudyDataResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeStudyData
// 获取直播课任务考勤详情
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeStudyData(request *DescribeStudyDataRequest) (response *DescribeStudyDataResponse, err error) {
    return c.DescribeStudyDataWithContext(context.Background(), request)
}

// DescribeStudyData
// 获取直播课任务考勤详情
//
// 可能返回的错误码:
//  FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"
func (c *Client) DescribeStudyDataWithContext(ctx context.Context, request *DescribeStudyDataRequest) (response *DescribeStudyDataResponse, err error) {
    if request == nil {
        request = NewDescribeStudyDataRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeStudyData require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeStudyDataResponse()
    err = c.Send(request, response)
    return
}

func NewDescribeUserFavsRequest() (request *DescribeUserFavsRequest) {
    request = &DescribeUserFavsRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "DescribeUserFavs")
    
    
    return
}

func NewDescribeUserFavsResponse() (response *DescribeUserFavsResponse) {
    response = &DescribeUserFavsResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// DescribeUserFavs
// 【收藏相关API】获取收藏用户
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_LOGICTHIRDUSERNOTFOUND = "FailedOperation.LogicThirdUserNotFound"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeUserFavs(request *DescribeUserFavsRequest) (response *DescribeUserFavsResponse, err error) {
    return c.DescribeUserFavsWithContext(context.Background(), request)
}

// DescribeUserFavs
// 【收藏相关API】获取收藏用户
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_LOGICTHIRDUSERNOTFOUND = "FailedOperation.LogicThirdUserNotFound"
//  FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"
//  FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"
func (c *Client) DescribeUserFavsWithContext(ctx context.Context, request *DescribeUserFavsRequest) (response *DescribeUserFavsResponse, err error) {
    if request == nil {
        request = NewDescribeUserFavsRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("DescribeUserFavs require credential")
    }

    request.SetContext(ctx)
    
    response = NewDescribeUserFavsResponse()
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
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyFastLiveCourse(request *ModifyFastLiveCourseRequest) (response *ModifyFastLiveCourseResponse, err error) {
    return c.ModifyFastLiveCourseWithContext(context.Background(), request)
}

// ModifyFastLiveCourse
// 该API用于修改直播课程名字和课程公开标记
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyFastLiveCourseWithContext(ctx context.Context, request *ModifyFastLiveCourseRequest) (response *ModifyFastLiveCourseResponse, err error) {
    if request == nil {
        request = NewModifyFastLiveCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("ModifyFastLiveCourse require credential")
    }

    request.SetContext(ctx)
    
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
//  LIMITEXCEEDED = "LimitExceeded"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyFastTeacher(request *ModifyFastTeacherRequest) (response *ModifyFastTeacherResponse, err error) {
    return c.ModifyFastTeacherWithContext(context.Background(), request)
}

// ModifyFastTeacher
// 该API用于设置直播课上课老师
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  LIMITEXCEEDED = "LimitExceeded"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyFastTeacherWithContext(ctx context.Context, request *ModifyFastTeacherRequest) (response *ModifyFastTeacherResponse, err error) {
    if request == nil {
        request = NewModifyFastTeacherRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("ModifyFastTeacher require credential")
    }

    request.SetContext(ctx)
    
    response = NewModifyFastTeacherResponse()
    err = c.Send(request, response)
    return
}

func NewModifyLiveCourseRequest() (request *ModifyLiveCourseRequest) {
    request = &ModifyLiveCourseRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "ModifyLiveCourse")
    
    
    return
}

func NewModifyLiveCourseResponse() (response *ModifyLiveCourseResponse) {
    response = &ModifyLiveCourseResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// ModifyLiveCourse
// 该API用于修改直播课程名字和课程公开标记
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_CLICKEXPCOURSENOTICEPARAMERR = "FailedOperation.ClickExpCourseNoticeParamErr"
//  FAILEDOPERATION_DELETECOURSETERMERR = "FailedOperation.DeleteCourseTermErr"
//  FAILEDOPERATION_ECVISIBLESCOPEISPUBLIC = "FailedOperation.EcVisibleScopeIsPublic"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyLiveCourse(request *ModifyLiveCourseRequest) (response *ModifyLiveCourseResponse, err error) {
    return c.ModifyLiveCourseWithContext(context.Background(), request)
}

// ModifyLiveCourse
// 该API用于修改直播课程名字和课程公开标记
//
// 可能返回的错误码:
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_CLICKEXPCOURSENOTICEPARAMERR = "FailedOperation.ClickExpCourseNoticeParamErr"
//  FAILEDOPERATION_DELETECOURSETERMERR = "FailedOperation.DeleteCourseTermErr"
//  FAILEDOPERATION_ECVISIBLESCOPEISPUBLIC = "FailedOperation.EcVisibleScopeIsPublic"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  MISSINGPARAMETER = "MissingParameter"
//  OPERATIONDENIED = "OperationDenied"
//  RESOURCEINSUFFICIENT = "ResourceInsufficient"
func (c *Client) ModifyLiveCourseWithContext(ctx context.Context, request *ModifyLiveCourseRequest) (response *ModifyLiveCourseResponse, err error) {
    if request == nil {
        request = NewModifyLiveCourseRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("ModifyLiveCourse require credential")
    }

    request.SetContext(ctx)
    
    response = NewModifyLiveCourseResponse()
    err = c.Send(request, response)
    return
}

func NewModifyLiveCourseAuthorizeRequest() (request *ModifyLiveCourseAuthorizeRequest) {
    request = &ModifyLiveCourseAuthorizeRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "ModifyLiveCourseAuthorize")
    
    
    return
}

func NewModifyLiveCourseAuthorizeResponse() (response *ModifyLiveCourseAuthorizeResponse) {
    response = &ModifyLiveCourseAuthorizeResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// ModifyLiveCourseAuthorize
// 该API用于设置直播课可学习组织架构范围
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  RESOURCENOTFOUND = "ResourceNotFound"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
//  UNSUPPORTEDOPERATION = "UnsupportedOperation"
func (c *Client) ModifyLiveCourseAuthorize(request *ModifyLiveCourseAuthorizeRequest) (response *ModifyLiveCourseAuthorizeResponse, err error) {
    return c.ModifyLiveCourseAuthorizeWithContext(context.Background(), request)
}

// ModifyLiveCourseAuthorize
// 该API用于设置直播课可学习组织架构范围
//
// 可能返回的错误码:
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
//  FAILEDOPERATION = "FailedOperation"
//  FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"
//  FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"
//  FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"
//  FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"
//  FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"
//  FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"
//  FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"
//  FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"
//  INTERNALERROR = "InternalError"
//  RESOURCENOTFOUND = "ResourceNotFound"
//  RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"
//  UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"
//  UNSUPPORTEDOPERATION = "UnsupportedOperation"
func (c *Client) ModifyLiveCourseAuthorizeWithContext(ctx context.Context, request *ModifyLiveCourseAuthorizeRequest) (response *ModifyLiveCourseAuthorizeResponse, err error) {
    if request == nil {
        request = NewModifyLiveCourseAuthorizeRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("ModifyLiveCourseAuthorize require credential")
    }

    request.SetContext(ctx)
    
    response = NewModifyLiveCourseAuthorizeResponse()
    err = c.Send(request, response)
    return
}

func NewModifyTeacherRequest() (request *ModifyTeacherRequest) {
    request = &ModifyTeacherRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "ModifyTeacher")
    
    
    return
}

func NewModifyTeacherResponse() (response *ModifyTeacherResponse) {
    response = &ModifyTeacherResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// ModifyTeacher
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
func (c *Client) ModifyTeacher(request *ModifyTeacherRequest) (response *ModifyTeacherResponse, err error) {
    return c.ModifyTeacherWithContext(context.Background(), request)
}

// ModifyTeacher
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
func (c *Client) ModifyTeacherWithContext(ctx context.Context, request *ModifyTeacherRequest) (response *ModifyTeacherResponse, err error) {
    if request == nil {
        request = NewModifyTeacherRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("ModifyTeacher require credential")
    }

    request.SetContext(ctx)
    
    response = NewModifyTeacherResponse()
    err = c.Send(request, response)
    return
}

func NewModifyUserFavRequest() (request *ModifyUserFavRequest) {
    request = &ModifyUserFavRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "ModifyUserFav")
    
    
    return
}

func NewModifyUserFavResponse() (response *ModifyUserFavResponse) {
    response = &ModifyUserFavResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// ModifyUserFav
// 用户收藏操作
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
func (c *Client) ModifyUserFav(request *ModifyUserFavRequest) (response *ModifyUserFavResponse, err error) {
    return c.ModifyUserFavWithContext(context.Background(), request)
}

// ModifyUserFav
// 用户收藏操作
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
func (c *Client) ModifyUserFavWithContext(ctx context.Context, request *ModifyUserFavRequest) (response *ModifyUserFavResponse, err error) {
    if request == nil {
        request = NewModifyUserFavRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("ModifyUserFav require credential")
    }

    request.SetContext(ctx)
    
    response = NewModifyUserFavResponse()
    err = c.Send(request, response)
    return
}

func NewModifyUserFavBatchRequest() (request *ModifyUserFavBatchRequest) {
    request = &ModifyUserFavBatchRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "ModifyUserFavBatch")
    
    
    return
}

func NewModifyUserFavBatchResponse() (response *ModifyUserFavBatchResponse) {
    response = &ModifyUserFavBatchResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// ModifyUserFavBatch
// 批量操作用户收藏
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
func (c *Client) ModifyUserFavBatch(request *ModifyUserFavBatchRequest) (response *ModifyUserFavBatchResponse, err error) {
    return c.ModifyUserFavBatchWithContext(context.Background(), request)
}

// ModifyUserFavBatch
// 批量操作用户收藏
//
// 可能返回的错误码:
//  AUTHFAILURE = "AuthFailure"
//  AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"
func (c *Client) ModifyUserFavBatchWithContext(ctx context.Context, request *ModifyUserFavBatchRequest) (response *ModifyUserFavBatchResponse, err error) {
    if request == nil {
        request = NewModifyUserFavBatchRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("ModifyUserFavBatch require credential")
    }

    request.SetContext(ctx)
    
    response = NewModifyUserFavBatchResponse()
    err = c.Send(request, response)
    return
}

func NewSearchDeptRequest() (request *SearchDeptRequest) {
    request = &SearchDeptRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "SearchDept")
    
    
    return
}

func NewSearchDeptResponse() (response *SearchDeptResponse) {
    response = &SearchDeptResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// SearchDept
// 用于在接入方通讯录中检索部门信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPSEARCHDEPT = "FailedOperation.HttpSearchDept"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) SearchDept(request *SearchDeptRequest) (response *SearchDeptResponse, err error) {
    return c.SearchDeptWithContext(context.Background(), request)
}

// SearchDept
// 用于在接入方通讯录中检索部门信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPSEARCHDEPT = "FailedOperation.HttpSearchDept"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) SearchDeptWithContext(ctx context.Context, request *SearchDeptRequest) (response *SearchDeptResponse, err error) {
    if request == nil {
        request = NewSearchDeptRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("SearchDept require credential")
    }

    request.SetContext(ctx)
    
    response = NewSearchDeptResponse()
    err = c.Send(request, response)
    return
}

func NewSearchDeptUserRequest() (request *SearchDeptUserRequest) {
    request = &SearchDeptUserRequest{
        BaseRequest: &tchttp.BaseRequest{},
    }
    request.Init().WithApiInfo("tcop", APIVersion, "SearchDeptUser")
    
    
    return
}

func NewSearchDeptUserResponse() (response *SearchDeptUserResponse) {
    response = &SearchDeptUserResponse{
        BaseResponse: &tchttp.BaseResponse{},
    }
    return
}

// SearchDeptUser
// 用于在接入方通讯录中检索部门用户信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPSEARCHUSERS = "FailedOperation.HttpSearchUsers"
//  FAILEDOPERATION_INPUTPARAMS = "FailedOperation.InputParams"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) SearchDeptUser(request *SearchDeptUserRequest) (response *SearchDeptUserResponse, err error) {
    return c.SearchDeptUserWithContext(context.Background(), request)
}

// SearchDeptUser
// 用于在接入方通讯录中检索部门用户信息
//
// 可能返回的错误码:
//  FAILEDOPERATION_HTTPSEARCHUSERS = "FailedOperation.HttpSearchUsers"
//  FAILEDOPERATION_INPUTPARAMS = "FailedOperation.InputParams"
//  FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"
func (c *Client) SearchDeptUserWithContext(ctx context.Context, request *SearchDeptUserRequest) (response *SearchDeptUserResponse, err error) {
    if request == nil {
        request = NewSearchDeptUserRequest()
    }
    
    if c.GetCredential() == nil {
        return nil, errors.New("SearchDeptUser require credential")
    }

    request.SetContext(ctx)
    
    response = NewSearchDeptUserResponse()
    err = c.Send(request, response)
    return
}
