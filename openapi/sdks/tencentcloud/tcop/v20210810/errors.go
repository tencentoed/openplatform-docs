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

const (
	// 此产品的特有错误码

	// CAM签名/鉴权错误。
	AUTHFAILURE = "AuthFailure"

	// 课程不属于该App合作方。
	AUTHFAILURE_NOTEQUALSCOURSEAPPID = "AuthFailure.NotEqualsCourseAppid"

	// 操作失败。
	FAILEDOPERATION = "FailedOperation"

	// 课程参数错误。
	FAILEDOPERATION_CLICKEXPCOURSENOTICEPARAMERR = "FailedOperation.ClickExpCourseNoticeParamErr"

	// 请求现网课程不存在。
	FAILEDOPERATION_COURSENOTEXIST = "FailedOperation.CourseNotExist"

	// 解除授课内容失败。
	FAILEDOPERATION_DELETECOURSECONTENTTASKERR = "FailedOperation.DeleteCourseContentTaskErr"

	// 解除关联课失败。
	FAILEDOPERATION_DELETECOURSETERMERR = "FailedOperation.DeleteCourseTermErr"

	// DLS注册异常。
	FAILEDOPERATION_DLSHASREGISTERERROR = "FailedOperation.DlsHasRegisterError"

	// 鉴权失败，权限数据。
	FAILEDOPERATION_ECGETCOURSEAUTH = "FailedOperation.EcGetCourseAuth"

	// 鉴权失败，未找到用户开放账号信息。
	FAILEDOPERATION_ECGETIDSUIDBYACCOUNT = "FailedOperation.EcGetIdsUidByAccount"

	// 无法获取当前termId课程信息。
	FAILEDOPERATION_ECGETTEACHEREXPERIENCE = "FailedOperation.EcGetTeacherExperience"

	// 鉴权失败，未找到用户所在部门相关信息。
	FAILEDOPERATION_ECGETUSERDEPTTRACES = "FailedOperation.EcGetUserDeptTraces"

	// 课程为公开，无法通过组织部门设置权限。
	FAILEDOPERATION_ECVISIBLESCOPEISPUBLIC = "FailedOperation.EcVisibleScopeIsPublic"

	// 用户信息获取失败(rpc)。
	FAILEDOPERATION_ERRBATCHGETUSERINFO = "FailedOperation.ErrBatchGetUserInfo"

	// 发布课程失败(rpc)。
	FAILEDOPERATION_ERRBINDEXPERIENCECOURSEMULTI = "FailedOperation.ErrBindExperienceCourseMulti"

	// 获取回放下载地址失败(rpc)。
	FAILEDOPERATION_ERRCMDGETOPENAPIVIDEODOWNLOADURL = "FailedOperation.ErrCmdGetOpenApiVideoDownloadUrl"

	// 远程访问请求参数异常。
	FAILEDOPERATION_ERRCODEECRPCCLIENTDOREQERR = "FailedOperation.ErrCodeECRpcClientDoReqErr"

	// 远程访问失败。
	FAILEDOPERATION_ERRCODEECRPCCLIENTINITERR = "FailedOperation.ErrCodeECRpcClientInitErr"

	// 获取课程详情失败(rpc)。
	FAILEDOPERATION_ERRGETEXPERIENCECOURSEINFO = "FailedOperation.ErrGetExperienceCourseInfo"

	// 获取课程列表失败(rpc)。
	FAILEDOPERATION_ERRGETEXPERIENCECOURSELIST = "FailedOperation.ErrGetExperienceCourseList"

	// 修改课程失败(rpc)。
	FAILEDOPERATION_ERRMODEXPERIENCECOURSEMULTI = "FailedOperation.ErrModExperienceCourseMulti"

	// 资料读失败(rpc)。
	FAILEDOPERATION_ERRRPCGETINFOBYID = "FailedOperation.ErrRpcGetInfoById"

	// 保存课程权限失败(rpc)。
	FAILEDOPERATION_ERRSAVECOURSEAUTH = "FailedOperation.ErrSaveCourseAuth"

	// 第三方用户注册失败(rpc)。
	FAILEDOPERATION_ERRSIMPLEREGISTERUSER = "FailedOperation.ErrSimpleRegisterUser"

	// 查询授课内容失败。
	FAILEDOPERATION_GETCOURSECONTENTTASKERR = "FailedOperation.GetCourseContentTaskErr"

	// 获取根部门数据失败。
	FAILEDOPERATION_HTTPGETROOTDEPT = "FailedOperation.HttpGetRootDept"

	// 获取子部门数据失败。
	FAILEDOPERATION_HTTPGETSUBDEPT = "FailedOperation.HttpGetSubDept"

	// 搜索部门数据失败。
	FAILEDOPERATION_HTTPSEARCHDEPT = "FailedOperation.HttpSearchDept"

	// 搜索用户数据失败。
	FAILEDOPERATION_HTTPSEARCHUSERS = "FailedOperation.HttpSearchUsers"

	// 输入参数错误，请检测请求参数信息。
	FAILEDOPERATION_INPUTPARAMS = "FailedOperation.InputParams"

	// 写入授课内容失败。
	FAILEDOPERATION_INSERTCOURSECONTENTTASKERR = "FailedOperation.InsertCourseContentTaskErr"

	// 课程不存在。
	FAILEDOPERATION_INVALIDCOURSE = "FailedOperation.InvalidCourse"

	// 用户id不存在或未授权课堂。
	FAILEDOPERATION_INVALIDUSERID = "FailedOperation.InvalidUserId"

	// 绑定课程失败。
	FAILEDOPERATION_LOGICBINDEXPTERMFAIL = "FailedOperation.LogicBindExpTermFail"

	// 删除回放任务失败。
	FAILEDOPERATION_LOGICDELRECORDFILEERR = "FailedOperation.LogicDelRecordFileErr"

	// 获取绑定课失败。
	FAILEDOPERATION_LOGICGETEXPTERMFAIL = "FailedOperation.LogicGetExpTermFail"

	// 获取注册信息失败。
	FAILEDOPERATION_LOGICGETREGISTERINFOFAIL = "FailedOperation.LogicGetRegisterInfoFail"

	// 查询老师失败。
	FAILEDOPERATION_LOGICGETTEACHERFAIL = "FailedOperation.LogicGetTeacherFail"

	// 老师是其它机构的老师。
	FAILEDOPERATION_LOGICISTEACHER = "FailedOperation.LogicIsTeacher"

	// 直播课并行上课过多。
	FAILEDOPERATION_LOGICMAXLIVECOURSETOOMORE = "FailedOperation.LogicMaxLiveCourseTooMore"

	// 课程资源不足。
	FAILEDOPERATION_LOGICNOMORECOURSE = "FailedOperation.LogicNoMoreCourse"

	// 额外课程不存在。
	FAILEDOPERATION_LOGICNOTEXISTEXPERCOURSE = "FailedOperation.LogicNotExistExperCourse"

	// 没有找到该老师的任务。
	FAILEDOPERATION_LOGICNOTFOUNDTASK = "FailedOperation.LogicNotFoundTask"

	// 查询班级信息失败。
	FAILEDOPERATION_LOGICOPGETTERMINFO = "FailedOperation.LogicOpGetTermInfo"

	// 课程不属于当前账号。
	FAILEDOPERATION_LOGICOPOTHERUSERCOURSE = "FailedOperation.LogicOpOtherUserCourse"

	// 获取老师班级列表失败。
	FAILEDOPERATION_LOGICQUERYMUTILTERMERR = "FailedOperation.LogicQueryMutilTermErr"

	// 老师注册失败。
	FAILEDOPERATION_LOGICREGISTERINFOFAIL = "FailedOperation.LogicRegisterInfoFail"

	// 课程不存在。
	FAILEDOPERATION_LOGICTERMNOTEXIST = "FailedOperation.LogicTermNotExist"

	// 非手机注册用户。
	FAILEDOPERATION_LOGICUIDTYPEINVALID = "FailedOperation.LogicUidTypeInvalid"

	// 更新课程信息失败。
	FAILEDOPERATION_LOGICUPDATECOURSEFAIL = "FailedOperation.LogicUpdateCourseFail"

	// 更新课程名失败。
	FAILEDOPERATION_LOGICUPDATEEXPTERMFAIL = "FailedOperation.LogicUpdateExpTermFail"

	// 更新注册信息失败。
	FAILEDOPERATION_LOGICUPDATEREGISTERINFOFAIL = "FailedOperation.LogicUpdateRegisterInfoFail"

	// 更新任务信息失败。
	FAILEDOPERATION_LOGICUPDATETASKFAIL = "FailedOperation.LogicUpdateTaskFail"

	// 更新老师信息失败。
	FAILEDOPERATION_LOGICUPDATETEACHERFAIL = "FailedOperation.LogicUpdateTeacherFail"

	// 更新班级信息失败。
	FAILEDOPERATION_LOGICUPDATETERMFAIL = "FailedOperation.LogicUpdateTermFail"

	// 新老师角色失败。
	FAILEDOPERATION_LOGICUPDATEUSERFAIL = "FailedOperation.LogicUpdateUserFail"

	// 开课数目超过限制。
	FAILEDOPERATION_LOGICUSERBINDTOOMORETERM = "FailedOperation.LogicUserBindTooMoreTerm"

	// 请求现网课程信息错误。
	FAILEDOPERATION_MYSQLERROR = "FailedOperation.MysqlError"

	// 通讯录初始化失败。
	FAILEDOPERATION_NEWIDAASFAIL = "FailedOperation.NewIDaaSFail"

	// 未查询到该数据。
	FAILEDOPERATION_QUERYNOTFOUNDERROR = "FailedOperation.QueryNotFoundError"

	// 渠道数据查询参数错误。
	FAILEDOPERATION_QUERYPARAMERROR = "FailedOperation.QueryParamError"

	// 数据库服务失败。
	FAILEDOPERATION_TIMERNEWMYSQLERROR = "FailedOperation.TimerNewMysqlError"

	// 参数异常。
	FAILEDOPERATION_TIMERPARAMERROR = "FailedOperation.TimerParamError"

	// 参数类型异常。
	FAILEDOPERATION_TIMERPARAMTYPEERROR = "FailedOperation.TimerParamTypeError"

	// 绑定异常。
	FAILEDOPERATION_TIMERUNBINDERROR = "FailedOperation.TimerUnbindError"

	// 更新授课内容失败。
	FAILEDOPERATION_UPDATECOURSECONTENTTASKERR = "FailedOperation.UpdateCourseContentTaskErr"

	// 切换老师失败。
	FAILEDOPERATION_UPDATECOURSECONTENTTASKTEACHERERR = "FailedOperation.UpdateCourseContentTaskTeacherErr"

	// 内部错误。
	INTERNALERROR = "InternalError"

	// 参数错误。
	INVALIDPARAMETER = "InvalidParameter"

	// 请求参数错误，用户UID不能为空。
	INVALIDPARAMETER_ERRINPUTTINYPARAM = "InvalidParameter.ErrInputTinyParam"

	// 参数取值错误。
	INVALIDPARAMETERVALUE = "InvalidParameterValue"

	// 超过配额限制。
	LIMITEXCEEDED = "LimitExceeded"

	// 缺少参数错误。
	MISSINGPARAMETER = "MissingParameter"

	// 操作被拒绝。
	OPERATIONDENIED = "OperationDenied"

	// 修改课程老师失败(rpc)。
	OPERATIONDENIED_ERRMODEXPERIENCECOURSETEACHER = "OperationDenied.ErrModExperienceCourseTeacher"

	// 请求的次数超过了频率限制。
	REQUESTLIMITEXCEEDED = "RequestLimitExceeded"

	// 资源不足。
	RESOURCEINSUFFICIENT = "ResourceInsufficient"

	// 资源不存在。
	RESOURCENOTFOUND = "ResourceNotFound"

	// 课程不存在。
	RESOURCENOTFOUND_LOGICTERMNOTEXIST = "ResourceNotFound.LogicTermNotExist"

	// 开放平台用户注册失败。
	UNAUTHORIZEDOPERATION_ACCOUNTCREATEERROR = "UnauthorizedOperation.AccountCreateError"

	// 操作不支持。
	UNSUPPORTEDOPERATION = "UnsupportedOperation"
)
