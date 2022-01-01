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
	"encoding/json"
	tcerr "github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/errors"
	tchttp "github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/http"
)

type AuthorizeFastLiveCourseRequest struct {
	*tchttp.BaseRequest

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 课程可学习部门列表，dept_list和user_list至少2选1
	Deptlist []*string `json:"Deptlist,omitempty" name:"Deptlist"`

	// 课程可学习部门列表，dept_list和user_list至少2选1
	Userlist []*string `json:"Userlist,omitempty" name:"Userlist"`
}

func (r *AuthorizeFastLiveCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *AuthorizeFastLiveCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	delete(f, "Deptlist")
	delete(f, "Userlist")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "AuthorizeFastLiveCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type AuthorizeFastLiveCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *AuthorizeFastLiveCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *AuthorizeFastLiveCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type Course struct {

	// 上课老师id（接入方通讯录中的老师id）
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 直播间id
	TermId *string `json:"TermId,omitempty" name:"TermId"`
}

type CreateFastLiveCourseRequest struct {
	*tchttp.BaseRequest

	// 老师id（接入方通讯录中的老师id）
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
	VisibleScope *int64 `json:"VisibleScope,omitempty" name:"VisibleScope"`

	// 课程名
	Name *string `json:"Name,omitempty" name:"Name"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *CreateFastLiveCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *CreateFastLiveCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "VisibleScope")
	delete(f, "Name")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "CreateFastLiveCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type CreateFastLiveCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 直播间id
		// 注意：此字段可能返回 null，表示取不到有效值。
		TermId *string `json:"TermId,omitempty" name:"TermId"`

		// 直播链接
		// 注意：此字段可能返回 null，表示取不到有效值。
		LiveUrl *string `json:"LiveUrl,omitempty" name:"LiveUrl"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *CreateFastLiveCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *CreateFastLiveCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DeleteFastCourseTaskRequest struct {
	*tchttp.BaseRequest

	// 接入方通讯录中的老师id
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DeleteFastCourseTaskRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DeleteFastCourseTaskRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DeleteFastCourseTaskRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DeleteFastCourseTaskResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DeleteFastCourseTaskResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DeleteFastCourseTaskResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastCourseTasksRequest struct {
	*tchttp.BaseRequest

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 分页序号，第一页序号为1
	Page *uint64 `json:"Page,omitempty" name:"Page"`

	// 分页大小，最大分页50
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeFastCourseTasksRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastCourseTasksRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "Page")
	delete(f, "PageSize")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeFastCourseTasksRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastCourseTasksResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号，当为0时表示没有下一页了
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 直播任务列表
		TaskList []*Task `json:"TaskList,omitempty" name:"TaskList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeFastCourseTasksResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastCourseTasksResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastLiveCourseRequest struct {
	*tchttp.BaseRequest

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeFastLiveCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastLiveCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeFastLiveCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastLiveCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 上课老师id（接入方通讯录中的老师id）
		TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

		// 直播间id
		TermId *string `json:"TermId,omitempty" name:"TermId"`

		// 课程学习可见范围属性， 0-公开 1-指定范围
		// 注意：此字段可能返回 null，表示取不到有效值。
		VisibleScope *uint64 `json:"VisibleScope,omitempty" name:"VisibleScope"`

		// 课程名
		// 注意：此字段可能返回 null，表示取不到有效值。
		Name *string `json:"Name,omitempty" name:"Name"`

		// 直播链接
		// 注意：此字段可能返回 null，表示取不到有效值。
		LiveUrl *string `json:"LiveUrl,omitempty" name:"LiveUrl"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeFastLiveCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastLiveCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastLiveCoursesRequest struct {
	*tchttp.BaseRequest

	// 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 分页序号，第一页序号为1
	Page *uint64 `json:"Page,omitempty" name:"Page"`

	// 分页大小，最大分页50
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeFastLiveCoursesRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastLiveCoursesRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "Page")
	delete(f, "PageSize")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeFastLiveCoursesRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastLiveCoursesResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课程id和教师id列表
		CourseList []*Course `json:"CourseList,omitempty" name:"CourseList"`

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeFastLiveCoursesResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastLiveCoursesResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastReplayDownloadsRequest struct {
	*tchttp.BaseRequest

	// 视频id
	VId *string `json:"VId,omitempty" name:"VId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeFastReplayDownloadsRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastReplayDownloadsRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "VId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeFastReplayDownloadsRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastReplayDownloadsResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 无
		DownloadUrl *string `json:"DownloadUrl,omitempty" name:"DownloadUrl"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeFastReplayDownloadsResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastReplayDownloadsResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastReplaysRequest struct {
	*tchttp.BaseRequest

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 分页序号，第一页序号为1
	Page *uint64 `json:"Page,omitempty" name:"Page"`

	// 分页大小，最大分页50
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeFastReplaysRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastReplaysRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "Page")
	delete(f, "PageSize")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeFastReplaysRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeFastReplaysResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 回放列表
		ReplayList []*Replay `json:"ReplayList,omitempty" name:"ReplayList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeFastReplaysResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeFastReplaysResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type ModifyFastLiveCourseRequest struct {
	*tchttp.BaseRequest

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
	VisibleScope *int64 `json:"VisibleScope,omitempty" name:"VisibleScope"`

	// 课程名
	Name *string `json:"Name,omitempty" name:"Name"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *ModifyFastLiveCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyFastLiveCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "VisibleScope")
	delete(f, "Name")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "ModifyFastLiveCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type ModifyFastLiveCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *ModifyFastLiveCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyFastLiveCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type ModifyFastTeacherRequest struct {
	*tchttp.BaseRequest

	// 接入方通讯录中的老师id
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *ModifyFastTeacherRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyFastTeacherRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "ModifyFastTeacherRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type ModifyFastTeacherResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *ModifyFastTeacherResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyFastTeacherResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type Replay struct {

	// 视频名字
	Name *string `json:"Name,omitempty" name:"Name"`

	// 视频id
	VId *string `json:"VId,omitempty" name:"VId"`

	// 回放时长，单位秒
	Timelen *string `json:"Timelen,omitempty" name:"Timelen"`

	// 任务id
	TaskId *string `json:"TaskId,omitempty" name:"TaskId"`
}

type Task struct {

	// 任务授课时长
	// 注意：此字段可能返回 null，表示取不到有效值。
	Duration *string `json:"Duration,omitempty" name:"Duration"`

	// 任务开始时间
	StartTime *string `json:"StartTime,omitempty" name:"StartTime"`

	// 任务名字
	TaskName *string `json:"TaskName,omitempty" name:"TaskName"`

	// 任务id
	TaskId *string `json:"TaskId,omitempty" name:"TaskId"`

	// 任务结束时间
	EndTime *string `json:"EndTime,omitempty" name:"EndTime"`
}
