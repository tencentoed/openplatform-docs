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

type AnswerInfo struct {

	// 是否回答 1=已回答 0=未回答
	HasAnswer *uint64 `json:"HasAnswer,omitempty" name:"HasAnswer"`

	// 答题人账号
	StudentId *string `json:"StudentId,omitempty" name:"StudentId"`

	// 提交的答案，从1开始对应A，可能多个
	SubmitAnswerList []*uint64 `json:"SubmitAnswerList,omitempty" name:"SubmitAnswerList"`

	// 学生头像链接
	StudentPicUrl *string `json:"StudentPicUrl,omitempty" name:"StudentPicUrl"`

	// 答题人姓名
	StudentName *string `json:"StudentName,omitempty" name:"StudentName"`
}

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

type BatchCourseInfo struct {

	// 课程id
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

	// 课程名
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseName *string `json:"CourseName,omitempty" name:"CourseName"`

	// 0：课程，1：系列课
	// 注意：此字段可能返回 null，表示取不到有效值。
	InfoType *int64 `json:"InfoType,omitempty" name:"InfoType"`

	// 课程价格
	// 注意：此字段可能返回 null，表示取不到有效值。
	Price *int64 `json:"Price,omitempty" name:"Price"`

	// 课程封面
	// 注意：此字段可能返回 null，表示取不到有效值。
	CoverUrl *string `json:"CoverUrl,omitempty" name:"CoverUrl"`

	// 课程链接
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseUrl *string `json:"CourseUrl,omitempty" name:"CourseUrl"`

	// 报名人数
	// 注意：此字段可能返回 null，表示取不到有效值。
	ApplyNum *int64 `json:"ApplyNum,omitempty" name:"ApplyNum"`

	// 招生状态，系列课使用该字段，课程使用班级中的招生状态
	// 注意：此字段可能返回 null，表示取不到有效值。
	SignStatus *int64 `json:"SignStatus,omitempty" name:"SignStatus"`

	// 班级列表
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermList []*Task `json:"TermList,omitempty" name:"TermList"`
}

type ChapterInfo struct {

	// 课程包信息
	// 注意：此字段可能返回 null，表示取不到有效值。
	SubInfo []*TaskInfo `json:"SubInfo,omitempty" name:"SubInfo"`

	// 章节名称
	// 注意：此字段可能返回 null，表示取不到有效值。
	Name *string `json:"Name,omitempty" name:"Name"`

	// 课程包id
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 机构id
	// 注意：此字段可能返回 null，表示取不到有效值。
	AgencyId *int64 `json:"AgencyId,omitempty" name:"AgencyId"`

	// 课程id
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`
}

type ChatContent struct {

	// 元素类型，1-文本，2-表情符号，3-图片，三种消息类型必有其一
	ElemType *uint64 `json:"ElemType,omitempty" name:"ElemType"`

	// 文本消息
	// 注意：此字段可能返回 null，表示取不到有效值。
	MsgText *MsgText `json:"MsgText,omitempty" name:"MsgText"`

	// 表情符号
	// 注意：此字段可能返回 null，表示取不到有效值。
	MsgFace *MsgFace `json:"MsgFace,omitempty" name:"MsgFace"`

	// 离线图片
	MsgNotOnlineImage *MsgNotOnlineImage `json:"MsgNotOnlineImage,omitempty" name:"MsgNotOnlineImage"`
}

type ClassInfo struct {

	// 班级id
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 用户开始上课时间戳
	// 注意：此字段可能返回 null，表示取不到有效值。
	AttendTime *uint64 `json:"AttendTime,omitempty" name:"AttendTime"`

	// 用户点下课时间戳
	// 注意：此字段可能返回 null，表示取不到有效值。
	LeaveTime *uint64 `json:"LeaveTime,omitempty" name:"LeaveTime"`

	// 上下课状态 1-上课 2-下课
	// 注意：此字段可能返回 null，表示取不到有效值。
	OfflineStatus *uint64 `json:"OfflineStatus,omitempty" name:"OfflineStatus"`
}

type CouponInfo struct {

	// 优惠券id
	CouponId *string `json:"CouponId,omitempty" name:"CouponId"`

	// 发行方式,1:私密发行;2:运营活动发行;3:公开发行;4:批量私密
	Mode *int64 `json:"Mode,omitempty" name:"Mode"`

	// 可使用有效开始时间,单位：秒
	ValidBeginTime *uint64 `json:"ValidBeginTime,omitempty" name:"ValidBeginTime"`

	// 可使用有效截止时间
	ValidEndTime *uint64 `json:"ValidEndTime,omitempty" name:"ValidEndTime"`

	// 优惠券发行总数
	TotalCnt *int64 `json:"TotalCnt,omitempty" name:"TotalCnt"`

	// 优惠券使用数量
	UseCnt *int64 `json:"UseCnt,omitempty" name:"UseCnt"`

	// 优惠券领取数量
	RecvCnt *int64 `json:"RecvCnt,omitempty" name:"RecvCnt"`

	// 优惠券状态0:未发布;1:已发布;2:已过期;3:已删除;4:已下架
	Status *int64 `json:"Status,omitempty" name:"Status"`

	// 优惠券链接列表
	JumpUrl *string `json:"JumpUrl,omitempty" name:"JumpUrl"`

	// 优惠券使用规则
	CouponRule *CouponRule `json:"CouponRule,omitempty" name:"CouponRule"`
}

type CouponRule struct {

	// 优惠券使用规则 1:全站通用;2:指定课程课程包;3:指定机构;4:指定类目
	UseRole *int64 `json:"UseRole,omitempty" name:"UseRole"`

	// 满减券金额 / 一口价金额  ，单位：分
	Price *int64 `json:"Price,omitempty" name:"Price"`

	// 满多少金额
	Condition *int64 `json:"Condition,omitempty" name:"Condition"`

	// 指定课程和课程包列表
	UseRoleList []*ProductInfo `json:"UseRoleList,omitempty" name:"UseRoleList"`
}

type Course struct {

	// 上课老师id（接入方通讯录中的老师id）
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 直播间id
	TermId *string `json:"TermId,omitempty" name:"TermId"`
}

type CourseBasicInfo struct {

	// 课程id
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

	// 课程名
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseName *string `json:"CourseName,omitempty" name:"CourseName"`

	// 课程封面
	// 注意：此字段可能返回 null，表示取不到有效值。
	CoverUrl *string `json:"CoverUrl,omitempty" name:"CoverUrl"`

	// 课程价格
	// 注意：此字段可能返回 null，表示取不到有效值。
	Price *int64 `json:"Price,omitempty" name:"Price"`

	// 课程链接
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseUrl *string `json:"CourseUrl,omitempty" name:"CourseUrl"`

	// 课程报名人数
	// 注意：此字段可能返回 null，表示取不到有效值。
	ApplyNum *int64 `json:"ApplyNum,omitempty" name:"ApplyNum"`
}

type CourseInfo struct {

	// 课程id
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseId *uint64 `json:"CourseId,omitempty" name:"CourseId"`

	// 课程名称
	// 注意：此字段可能返回 null，表示取不到有效值。
	Name *string `json:"Name,omitempty" name:"Name"`

	// 讲师ID
	// 注意：此字段可能返回 null，表示取不到有效值。
	TeacherList []*uint64 `json:"TeacherList,omitempty" name:"TeacherList"`

	// 机构id
	// 注意：此字段可能返回 null，表示取不到有效值。
	AgencyId *uint64 `json:"AgencyId,omitempty" name:"AgencyId"`

	// 课程封面
	// 注意：此字段可能返回 null，表示取不到有效值。
	PicUrl *string `json:"PicUrl,omitempty" name:"PicUrl"`

	// 费用类型id  1免费 2付费
	// 注意：此字段可能返回 null，表示取不到有效值。
	PayId *int64 `json:"PayId,omitempty" name:"PayId"`

	// 试听标志   付费课  0不可试听，1可试听
	// 注意：此字段可能返回 null，表示取不到有效值。
	ListenFlag *int64 `json:"ListenFlag,omitempty" name:"ListenFlag"`

	// 课程一级类目
	// 注意：此字段可能返回 null，表示取不到有效值。
	IndustryFirst *int64 `json:"IndustryFirst,omitempty" name:"IndustryFirst"`

	// 课程二级类目
	// 注意：此字段可能返回 null，表示取不到有效值。
	IndustrySecond *int64 `json:"IndustrySecond,omitempty" name:"IndustrySecond"`

	// 课程三级类目
	// 注意：此字段可能返回 null，表示取不到有效值。
	IndustryThird *int64 `json:"IndustryThird,omitempty" name:"IndustryThird"`

	// 课程开始时间 仅直播
	// 注意：此字段可能返回 null，表示取不到有效值。
	BeginTime *uint64 `json:"BeginTime,omitempty" name:"BeginTime"`

	// 课程结束时间
	// 注意：此字段可能返回 null，表示取不到有效值。
	EndTime *uint64 `json:"EndTime,omitempty" name:"EndTime"`

	// 课程价格  单位为“分”
	// 注意：此字段可能返回 null，表示取不到有效值。
	Price *int64 `json:"Price,omitempty" name:"Price"`

	// 课程简介
	// 注意：此字段可能返回 null，表示取不到有效值。
	Introduce *string `json:"Introduce,omitempty" name:"Introduce"`

	// IOS课点价格
	// 注意：此字段可能返回 null，表示取不到有效值。
	IosPrice *uint64 `json:"IosPrice,omitempty" name:"IosPrice"`

	// 讲师名称  c_te_list id 转换为名字
	// 注意：此字段可能返回 null，表示取不到有效值。
	TeacherNameList []*string `json:"TeacherNameList,omitempty" name:"TeacherNameList"`

	// 机构名称
	// 注意：此字段可能返回 null，表示取不到有效值。
	AidName *string `json:"AidName,omitempty" name:"AidName"`

	// 授课方式  0-录播，1-直播 t_online_term    t_bit_flag第14位
	// 注意：此字段可能返回 null，表示取不到有效值。
	Type *int64 `json:"Type,omitempty" name:"Type"`

	// 最近在学人数
	// 注意：此字段可能返回 null，表示取不到有效值。
	RecentLearnNum *uint64 `json:"RecentLearnNum,omitempty" name:"RecentLearnNum"`

	// 课时
	// 注意：此字段可能返回 null，表示取不到有效值。
	Lesson *uint64 `json:"Lesson,omitempty" name:"Lesson"`

	// 好评度
	// 注意：此字段可能返回 null，表示取不到有效值。
	Score *int64 `json:"Score,omitempty" name:"Score"`

	// 报名人数
	// 注意：此字段可能返回 null，表示取不到有效值。
	ApplyNum *uint64 `json:"ApplyNum,omitempty" name:"ApplyNum"`

	// 收藏人数
	// 注意：此字段可能返回 null，表示取不到有效值。
	StoreNum *uint64 `json:"StoreNum,omitempty" name:"StoreNum"`

	// 课程章节信息
	// 注意：此字段可能返回 null，表示取不到有效值。
	ChapterInfo []*ChapterInfo `json:"ChapterInfo,omitempty" name:"ChapterInfo"`

	// 是否处于直播状态 默认0
	// 注意：此字段可能返回 null，表示取不到有效值。
	IsBeing *int64 `json:"IsBeing,omitempty" name:"IsBeing"`

	// 报名截止时间
	// 注意：此字段可能返回 null，表示取不到有效值。
	SignEndTime *uint64 `json:"SignEndTime,omitempty" name:"SignEndTime"`

	// 最近直播间id
	// 注意：此字段可能返回 null，表示取不到有效值。
	RecentLiveTermId *uint64 `json:"RecentLiveTermId,omitempty" name:"RecentLiveTermId"`

	// 直播间id
	// 注意：此字段可能返回 null，表示取不到有效值。
	RoomId *uint64 `json:"RoomId,omitempty" name:"RoomId"`
}

type CourseItem struct {

	// 上课老师id（接入方通讯录中的老师id）
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`
}

type CoursePackageInfo struct {

	// 课程包id
	PackageId *int64 `json:"PackageId,omitempty" name:"PackageId"`

	// 课程包名称
	Name *string `json:"Name,omitempty" name:"Name"`

	// 课程包价格
	Price *int64 `json:"Price,omitempty" name:"Price"`

	// 报名人数
	SignNum *int64 `json:"SignNum,omitempty" name:"SignNum"`

	// 封面图片地址
	CoverUrl *string `json:"CoverUrl,omitempty" name:"CoverUrl"`

	// 课程包地址
	PackageUrl *string `json:"PackageUrl,omitempty" name:"PackageUrl"`

	// 班级列表
	TermList []*PackageTerm `json:"TermList,omitempty" name:"TermList"`
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

type CreateLiveCourseRequest struct {
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

func (r *CreateLiveCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *CreateLiveCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "VisibleScope")
	delete(f, "Name")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "CreateLiveCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type CreateLiveCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 直播间id
		// 注意：此字段可能返回 null，表示取不到有效值。
		TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

		// 直播链接
		// 注意：此字段可能返回 null，表示取不到有效值。
		LiveUrl *string `json:"LiveUrl,omitempty" name:"LiveUrl"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *CreateLiveCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *CreateLiveCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DeleteCourseRequest struct {
	*tchttp.BaseRequest

	// 接入方通讯录中的老师id
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DeleteCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DeleteCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DeleteCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DeleteCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DeleteCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DeleteCourseResponse) FromJsonString(s string) error {
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

type DeptInfo struct {

	// 千帆部门ID
	DeptId *string `json:"DeptId,omitempty" name:"DeptId"`

	// 千帆租户ID
	TenantId *string `json:"TenantId,omitempty" name:"TenantId"`

	// 千帆部门祖先节点
	Ancestor []*string `json:"Ancestor,omitempty" name:"Ancestor"`

	// 千帆部门父节点ID
	ParentId *string `json:"ParentId,omitempty" name:"ParentId"`

	// 千帆部门名称
	DeptName *string `json:"DeptName,omitempty" name:"DeptName"`
}

type DeptUserInfo struct {

	// 千帆用户名
	Username *string `json:"Username,omitempty" name:"Username"`

	// 千帆用户手机号
	PhoneNum *string `json:"PhoneNum,omitempty" name:"PhoneNum"`

	// 千帆用户UID
	IdsUid *string `json:"IdsUid,omitempty" name:"IdsUid"`

	// 千帆用户雇员编号
	EmployeeNumber *string `json:"EmployeeNumber,omitempty" name:"EmployeeNumber"`

	// 千帆租户ID
	TenantId *string `json:"TenantId,omitempty" name:"TenantId"`

	// 千帆用户邮箱
	PrimaryMail *string `json:"PrimaryMail,omitempty" name:"PrimaryMail"`

	// 千帆用户所属部门ID
	DeptId *string `json:"DeptId,omitempty" name:"DeptId"`

	// 千帆用户展示名称
	DisplayName *string `json:"DisplayName,omitempty" name:"DisplayName"`

	// 机构用户ID
	SourceId *string `json:"SourceId,omitempty" name:"SourceId"`
}

type DescribeAgencyCouponsRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业微信企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 起始页 从0开始
	PageIndex *int64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 页大小 分页限制 最大分页大小为10
	PageSize *int64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeAgencyCouponsRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCouponsRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyCouponsRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCouponsResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 优惠券列表
		CouponList []*CouponInfo `json:"CouponList,omitempty" name:"CouponList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyCouponsResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCouponsResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCourseInfosRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 分页页码
	PageIndex *int64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 分页每页大小
	PageSize *int64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeAgencyCourseInfosRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCourseInfosRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyCourseInfosRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCourseInfosResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 课程列表
		CourseList []*BatchCourseInfo `json:"CourseList,omitempty" name:"CourseList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyCourseInfosResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCourseInfosResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCoursePkgRequest struct {
	*tchttp.BaseRequest

	// 课程包id列表
	PackageIdList []*int64 `json:"PackageIdList,omitempty" name:"PackageIdList"`

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`
}

func (r *DescribeAgencyCoursePkgRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCoursePkgRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "PackageIdList")
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyCoursePkgRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCoursePkgResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课程包列表
		PackageList []*CoursePackageInfo `json:"PackageList,omitempty" name:"PackageList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyCoursePkgResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCoursePkgResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCourseRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 课程id
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`
}

func (r *DescribeAgencyCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "CourseId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课程id
		// 注意：此字段可能返回 null，表示取不到有效值。
		CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

		// 课程名
		// 注意：此字段可能返回 null，表示取不到有效值。
		CourseName *string `json:"CourseName,omitempty" name:"CourseName"`

		// 课程封面
		// 注意：此字段可能返回 null，表示取不到有效值。
		CoverUrl *string `json:"CoverUrl,omitempty" name:"CoverUrl"`

		// 课程价格
		// 注意：此字段可能返回 null，表示取不到有效值。
		Price *int64 `json:"Price,omitempty" name:"Price"`

		// 课程url
		// 注意：此字段可能返回 null，表示取不到有效值。
		CourseUrl *string `json:"CourseUrl,omitempty" name:"CourseUrl"`

		// 班级列表
		// 注意：此字段可能返回 null，表示取不到有效值。
		TermList []*SCRMTermInfo `json:"TermList,omitempty" name:"TermList"`

		// 课程报名人数
		// 注意：此字段可能返回 null，表示取不到有效值。
		ApplyNum *int64 `json:"ApplyNum,omitempty" name:"ApplyNum"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCoursesRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 课程id列表，最多传50个
	CourseIdList []*int64 `json:"CourseIdList,omitempty" name:"CourseIdList"`
}

func (r *DescribeAgencyCoursesRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCoursesRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "CourseIdList")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyCoursesRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyCoursesResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课程列表
		CourseList []*CourseBasicInfo `json:"CourseList,omitempty" name:"CourseList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyCoursesResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyCoursesResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyPrivateCouponsRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 优惠券id
	CouponId *string `json:"CouponId,omitempty" name:"CouponId"`

	// 优惠券状态 0：已领取 2：已使用，10：未领取
	Filter *int64 `json:"Filter,omitempty" name:"Filter"`

	// 起始页码 从0开始
	PageIndex *int64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 页大小 分页大小 无限制
	PageSize *int64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeAgencyPrivateCouponsRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyPrivateCouponsRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "CouponId")
	delete(f, "Filter")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyPrivateCouponsRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyPrivateCouponsResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 优惠券列表
		CouponList []*ShortCouponInfo `json:"CouponList,omitempty" name:"CouponList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyPrivateCouponsResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyPrivateCouponsResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyTermsRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 班级id列表
	TermIdList []*int64 `json:"TermIdList,omitempty" name:"TermIdList"`
}

func (r *DescribeAgencyTermsRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyTermsRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "TermIdList")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyTermsRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyTermsResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 班级列表
		// 注意：此字段可能返回 null，表示取不到有效值。
		TermList []*SCRMTermInfo `json:"TermList,omitempty" name:"TermList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyTermsResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyTermsResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserApplyCoursesRequest struct {
	*tchttp.BaseRequest

	// 用户OpenId
	OpenId *string `json:"OpenId,omitempty" name:"OpenId"`

	// 千帆租户id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业ID
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 起始页码（从0开始）
	PageIndex *uint64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 分页大小
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeAgencyUserApplyCoursesRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserApplyCoursesRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "OpenId")
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyUserApplyCoursesRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserApplyCoursesResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 学习列表
		// 注意：此字段可能返回 null，表示取不到有效值。
		UserApplyList []*UserApply `json:"UserApplyList,omitempty" name:"UserApplyList"`

		// 下一页序号
		// 注意：此字段可能返回 null，表示取不到有效值。
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyUserApplyCoursesResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserApplyCoursesResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserAttendanceRequest struct {
	*tchttp.BaseRequest

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 用户OpenId
	OpenId *string `json:"OpenId,omitempty" name:"OpenId"`

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeAgencyUserAttendanceRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserAttendanceRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "Corpid")
	delete(f, "OpenId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyUserAttendanceRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserAttendanceResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 最近一次学习时间，时间戳 单位秒
		LatestStudyTs *int64 `json:"LatestStudyTs,omitempty" name:"LatestStudyTs"`

		// 最近一次学习时长，如果任务为习题任务，则学习时长为0，单位秒
		LatestStudySpan *int64 `json:"LatestStudySpan,omitempty" name:"LatestStudySpan"`

		// 最近一次学习课程id
		LatestStudyCourseId *int64 `json:"LatestStudyCourseId,omitempty" name:"LatestStudyCourseId"`

		// 最近一次学习任务id
		LatestStudyTaskId *string `json:"LatestStudyTaskId,omitempty" name:"LatestStudyTaskId"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyUserAttendanceResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserAttendanceResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserOrdersRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 学员openID
	Openid *string `json:"Openid,omitempty" name:"Openid"`

	// 起始页码（从0开始）
	PageIndex *int64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 分页大小
	PageSize *int64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeAgencyUserOrdersRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserOrdersRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "Openid")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyUserOrdersRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserOrdersResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号，当为0时表示没有下一页了
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 订单列表
		OrderList []*UserOrder `json:"OrderList,omitempty" name:"OrderList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyUserOrdersResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserOrdersResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserStudyProgressesRequest struct {
	*tchttp.BaseRequest

	// 租户id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业id
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 用户OpenId
	OpenId *string `json:"OpenId,omitempty" name:"OpenId"`

	// 起始页 从0开始
	PageIndex *int64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 页大小 分页大小 最大为10000
	PageSize *int64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeAgencyUserStudyProgressesRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserStudyProgressesRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "OpenId")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyUserStudyProgressesRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUserStudyProgressesResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号
		// 注意：此字段可能返回 null，表示取不到有效值。
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 学习列表
		// 注意：此字段可能返回 null，表示取不到有效值。
		StudyList []*StudyInfo `json:"StudyList,omitempty" name:"StudyList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyUserStudyProgressesResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUserStudyProgressesResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUsersRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 企业微信组织ID
	Corpid *string `json:"Corpid,omitempty" name:"Corpid"`

	// 用户openid列表
	OpenidList []*string `json:"OpenidList,omitempty" name:"OpenidList"`
}

func (r *DescribeAgencyUsersRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUsersRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Corpid")
	delete(f, "OpenidList")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeAgencyUsersRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeAgencyUsersResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 用户信息列表
		UserList []*UserInfo `json:"UserList,omitempty" name:"UserList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeAgencyUsersResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeAgencyUsersResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChannelClassInfosRequest struct {
	*tchttp.BaseRequest

	// 批量直播课程TermID
	TermIds []*uint64 `json:"TermIds,omitempty" name:"TermIds"`
}

func (r *DescribeChannelClassInfosRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChannelClassInfosRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermIds")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeChannelClassInfosRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChannelClassInfosResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 批量term的上下课信息
		// 注意：此字段可能返回 null，表示取不到有效值。
		ClassInfos []*ClassInfo `json:"ClassInfos,omitempty" name:"ClassInfos"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeChannelClassInfosResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChannelClassInfosResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChannelCourseIdsRequest struct {
	*tchttp.BaseRequest

	// 上次更新id
	Offset *uint64 `json:"Offset,omitempty" name:"Offset"`

	// 批次请求数量
	Limit *uint64 `json:"Limit,omitempty" name:"Limit"`
}

func (r *DescribeChannelCourseIdsRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChannelCourseIdsRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "Offset")
	delete(f, "Limit")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeChannelCourseIdsRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChannelCourseIdsResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课程id列表
		CourseIds []*uint64 `json:"CourseIds,omitempty" name:"CourseIds"`

		// 总数
		Total *uint64 `json:"Total,omitempty" name:"Total"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeChannelCourseIdsResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChannelCourseIdsResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChannelPoolCoursesRequest struct {
	*tchttp.BaseRequest

	// 课程id列表，目前仅支持单个
	CourseIds []*uint64 `json:"CourseIds,omitempty" name:"CourseIds"`
}

func (r *DescribeChannelPoolCoursesRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChannelPoolCoursesRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "CourseIds")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeChannelPoolCoursesRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChannelPoolCoursesResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课程详情列表
		// 注意：此字段可能返回 null，表示取不到有效值。
		CourseList []*CourseInfo `json:"CourseList,omitempty" name:"CourseList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeChannelPoolCoursesResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChannelPoolCoursesResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChatRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 分页序号，第一页序号为1
	Page *uint64 `json:"Page,omitempty" name:"Page"`

	// 分页大小，最大分页50
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeChatRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChatRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "TermId")
	delete(f, "Page")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeChatRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeChatResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 聊天列表
		ChatList []*ChatContent `json:"ChatList,omitempty" name:"ChatList"`

		// 课堂名称
		CourseName *string `json:"CourseName,omitempty" name:"CourseName"`

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeChatResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeChatResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeCourseTasksRequest struct {
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

func (r *DescribeCourseTasksRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeCourseTasksRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "Page")
	delete(f, "PageSize")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeCourseTasksRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeCourseTasksResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号，当为0时表示没有下一页了
		// 注意：此字段可能返回 null，表示取不到有效值。
		PageNext *int64 `json:"PageNext,omitempty" name:"PageNext"`

		// 直播任务列表
		// 注意：此字段可能返回 null，表示取不到有效值。
		TaskList []*TaskItem `json:"TaskList,omitempty" name:"TaskList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeCourseTasksResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeCourseTasksResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeDeptRootRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeDeptRootRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeDeptRootRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeDeptRootRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeDeptRootResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 千帆部门ID
		DeptId *string `json:"DeptId,omitempty" name:"DeptId"`

		// 千帆租户ID
		TenantId *string `json:"TenantId,omitempty" name:"TenantId"`

		// 千帆部门ID
		ParentId *string `json:"ParentId,omitempty" name:"ParentId"`

		// 部门名称
		DeptName *string `json:"DeptName,omitempty" name:"DeptName"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeDeptRootResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeDeptRootResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeDeptSubRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 部门ID
	DeptId *string `json:"DeptId,omitempty" name:"DeptId"`

	// 起始页码
	PageIndex *uint64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 分页大小
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeDeptSubRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeDeptSubRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "DeptId")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeDeptSubRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeDeptSubResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 子部门列表
		DeptList []*DeptInfo `json:"DeptList,omitempty" name:"DeptList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeDeptSubResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeDeptSubResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeDeptUserRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 部门ID
	DeptId *string `json:"DeptId,omitempty" name:"DeptId"`

	// 起始页码
	PageIndex *uint64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 分页大小
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeDeptUserRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeDeptUserRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "DeptId")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeDeptUserRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeDeptUserResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 部门用户列表
		UserList []*DeptUserInfo `json:"UserList,omitempty" name:"UserList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeDeptUserResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeDeptUserResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeExamAnswerRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 题目id
	ExamId *uint64 `json:"ExamId,omitempty" name:"ExamId"`

	// 分页序号，第一页序号为1
	Page *uint64 `json:"Page,omitempty" name:"Page"`

	// 分页大小，最大分页50
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeExamAnswerRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeExamAnswerRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "TermId")
	delete(f, "ExamId")
	delete(f, "Page")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeExamAnswerRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeExamAnswerResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 应答题学生人数
		StudentNum *uint64 `json:"StudentNum,omitempty" name:"StudentNum"`

		// 实际提交答题卡人数
		AnswerNum *uint64 `json:"AnswerNum,omitempty" name:"AnswerNum"`

		// 答题学生信息
		AnswerList []*AnswerInfo `json:"AnswerList,omitempty" name:"AnswerList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeExamAnswerResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeExamAnswerResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeExamQuestionRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 分页序号，第一页序号为1
	Page *uint64 `json:"Page,omitempty" name:"Page"`

	// 分页大小，最大分页50
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeExamQuestionRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeExamQuestionRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "TermId")
	delete(f, "Page")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeExamQuestionRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeExamQuestionResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课堂名称
		CourseName *string `json:"CourseName,omitempty" name:"CourseName"`

		// 题目列表
		ExamList []*ExamInfo `json:"ExamList,omitempty" name:"ExamList"`

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeExamQuestionResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeExamQuestionResponse) FromJsonString(s string) error {
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

type DescribeLiveCourseRequest struct {
	*tchttp.BaseRequest

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeLiveCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeLiveCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeLiveCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeLiveCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 上课老师id（接入方通讯录中的老师id）
		TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

		// 直播间id
		TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

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

func (r *DescribeLiveCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeLiveCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeLiveCoursesRequest struct {
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

func (r *DescribeLiveCoursesRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeLiveCoursesRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "Page")
	delete(f, "PageSize")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeLiveCoursesRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeLiveCoursesResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 课程id和教师id列表
		CourseList []*CourseItem `json:"CourseList,omitempty" name:"CourseList"`

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeLiveCoursesResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeLiveCoursesResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeReplayDownloadsRequest struct {
	*tchttp.BaseRequest

	// 视频id
	VId *string `json:"VId,omitempty" name:"VId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *DescribeReplayDownloadsRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeReplayDownloadsRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "VId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeReplayDownloadsRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeReplayDownloadsResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 无
		DownloadUrl *string `json:"DownloadUrl,omitempty" name:"DownloadUrl"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeReplayDownloadsResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeReplayDownloadsResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeReplaysRequest struct {
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

func (r *DescribeReplaysRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeReplaysRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "Page")
	delete(f, "PageSize")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeReplaysRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeReplaysResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 回放列表
		ReplayList []*ReplayItem `json:"ReplayList,omitempty" name:"ReplayList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeReplaysResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeReplaysResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type DescribeStudyDataRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 课程任务id
	TaskId *uint64 `json:"TaskId,omitempty" name:"TaskId"`

	// 分页序号，第一页序号为1
	Page *uint64 `json:"Page,omitempty" name:"Page"`

	// 分页大小，最大分页50
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *DescribeStudyDataRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeStudyDataRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "TermId")
	delete(f, "TaskId")
	delete(f, "Page")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "DescribeStudyDataRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type DescribeStudyDataResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 考勤信息列表
		StudentList []*StudentInfo `json:"StudentList,omitempty" name:"StudentList"`

		// 授课内容
		Content *string `json:"Content,omitempty" name:"Content"`

		// 有考勤学生总数
		StudentCount *uint64 `json:"StudentCount,omitempty" name:"StudentCount"`

		// 下一页序号，当为0时表示没有下一页了
		PageNext *uint64 `json:"PageNext,omitempty" name:"PageNext"`

		// 考勤任务详情
		TaskInfo *LiveTaskInfo `json:"TaskInfo,omitempty" name:"TaskInfo"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *DescribeStudyDataResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *DescribeStudyDataResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type ExamInfo struct {

	// 设置的选项个数
	OptionsCount *uint64 `json:"OptionsCount,omitempty" name:"OptionsCount"`

	// 题目唯一id
	ExamId *uint64 `json:"ExamId,omitempty" name:"ExamId"`

	// 答题类型 1-单选 2-多选
	ExamType *uint64 `json:"ExamType,omitempty" name:"ExamType"`

	// 发起答题时间
	ExamTime *uint64 `json:"ExamTime,omitempty" name:"ExamTime"`
}

type LiveTaskInfo struct {

	// 回放观看人数
	PlayBackNum *uint64 `json:"PlayBackNum,omitempty" name:"PlayBackNum"`

	// 直播时间
	LiveTime *uint64 `json:"LiveTime,omitempty" name:"LiveTime"`

	// 直播时长分钟数
	LiveDuration *uint64 `json:"LiveDuration,omitempty" name:"LiveDuration"`

	// 直播观看人数
	LiveStudentNum *uint64 `json:"LiveStudentNum,omitempty" name:"LiveStudentNum"`
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

type ModifyLiveCourseAuthorizeRequest struct {
	*tchttp.BaseRequest

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 课程可学习部门列表，dept_list和user_list至少2选1
	DeptList []*string `json:"DeptList,omitempty" name:"DeptList"`

	// 课程可学习部门列表，dept_list和user_list至少2选1
	UserList []*string `json:"UserList,omitempty" name:"UserList"`
}

func (r *ModifyLiveCourseAuthorizeRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyLiveCourseAuthorizeRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	delete(f, "DeptList")
	delete(f, "UserList")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "ModifyLiveCourseAuthorizeRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type ModifyLiveCourseAuthorizeResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *ModifyLiveCourseAuthorizeResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyLiveCourseAuthorizeResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type ModifyLiveCourseRequest struct {
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

func (r *ModifyLiveCourseRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyLiveCourseRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TermId")
	delete(f, "VisibleScope")
	delete(f, "Name")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "ModifyLiveCourseRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type ModifyLiveCourseResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *ModifyLiveCourseResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyLiveCourseResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type ModifyTeacherRequest struct {
	*tchttp.BaseRequest

	// 接入方通讯录中的老师id
	TeacherId *string `json:"TeacherId,omitempty" name:"TeacherId"`

	// 直播间id
	TermId *uint64 `json:"TermId,omitempty" name:"TermId"`

	// 开放平台分配给第三方的千帆id
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`
}

func (r *ModifyTeacherRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyTeacherRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "TeacherId")
	delete(f, "TermId")
	delete(f, "IdaasOrgId")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "ModifyTeacherRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type ModifyTeacherResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *ModifyTeacherResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *ModifyTeacherResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type MsgFace struct {

	// 表情符号索引
	Index *uint64 `json:"Index,omitempty" name:"Index"`
}

type MsgNotOnlineImage struct {

	// 图片链接
	PicUrl *string `json:"PicUrl,omitempty" name:"PicUrl"`
}

type MsgText struct {

	// 文本消息内容
	Str *string `json:"Str,omitempty" name:"Str"`
}

type PackageTerm struct {

	// 课程id
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

	// 班级id
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermId *int64 `json:"TermId,omitempty" name:"TermId"`

	// 班级url地址
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermUrl *string `json:"TermUrl,omitempty" name:"TermUrl"`
}

type ProductID struct {

	// 课程或者课程包id
	Fid *string `json:"Fid,omitempty" name:"Fid"`

	// 类型 course:课程 pkg:课程包
	Type *string `json:"Type,omitempty" name:"Type"`
}

type ProductInfo struct {

	// 课程或者课程包id
	Pid *ProductID `json:"Pid,omitempty" name:"Pid"`
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

type ReplayItem struct {

	// 视频名字
	Name *string `json:"Name,omitempty" name:"Name"`

	// 视频id
	VId *string `json:"VId,omitempty" name:"VId"`

	// 回放时长，单位秒
	TimeLen *uint64 `json:"TimeLen,omitempty" name:"TimeLen"`

	// 任务id
	TaskId *uint64 `json:"TaskId,omitempty" name:"TaskId"`
}

type SCRMSubCourseInfo struct {

	// 子课程直播任务列表
	// 注意：此字段可能返回 null，表示取不到有效值。
	TaskList []*SCRMTaskInfo `json:"TaskList,omitempty" name:"TaskList"`

	// 子课程id
	// 注意：此字段可能返回 null，表示取不到有效值。
	SubCourseId *int64 `json:"SubCourseId,omitempty" name:"SubCourseId"`

	// 子课程名称
	// 注意：此字段可能返回 null，表示取不到有效值。
	SubCourseName *string `json:"SubCourseName,omitempty" name:"SubCourseName"`
}

type SCRMTaskInfo struct {

	// 直播任务id
	// 注意：此字段可能返回 null，表示取不到有效值。
	TaskId *string `json:"TaskId,omitempty" name:"TaskId"`

	// 直播名称
	// 注意：此字段可能返回 null，表示取不到有效值。
	TaskName *string `json:"TaskName,omitempty" name:"TaskName"`

	// 是否结束
	// 注意：此字段可能返回 null，表示取不到有效值。
	ExprFlag *int64 `json:"ExprFlag,omitempty" name:"ExprFlag"`

	// 直播任务类型
	// 注意：此字段可能返回 null，表示取不到有效值。
	TaskType *int64 `json:"TaskType,omitempty" name:"TaskType"`

	// 直播课程地址
	// 注意：此字段可能返回 null，表示取不到有效值。
	TaskUrl *string `json:"TaskUrl,omitempty" name:"TaskUrl"`

	// 任务名
	// 注意：此字段可能返回 null，表示取不到有效值。
	Name *string `json:"Name,omitempty" name:"Name"`

	// 任务学习时常，系统任务无学习时长，单位秒
	// 注意：此字段可能返回 null，表示取不到有效值。
	StudySpan *int64 `json:"StudySpan,omitempty" name:"StudySpan"`

	// 任务学习进度
	// 注意：此字段可能返回 null，表示取不到有效值。
	StudyProgress *int64 `json:"StudyProgress,omitempty" name:"StudyProgress"`

	// 任务学习时间 时间戳 单位秒
	// 注意：此字段可能返回 null，表示取不到有效值。
	StudyTs *int64 `json:"StudyTs,omitempty" name:"StudyTs"`
}

type SCRMTermInfo struct {

	// 班级id
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermId *int64 `json:"TermId,omitempty" name:"TermId"`

	// 班级名
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermName *string `json:"TermName,omitempty" name:"TermName"`

	// 班级链接
	// 注意：此字段可能返回 null，表示取不到有效值。
	TermUrl *string `json:"TermUrl,omitempty" name:"TermUrl"`

	// 招生状态，1：招生中，2：招生结束
	// 注意：此字段可能返回 null，表示取不到有效值。
	SignStatus *int64 `json:"SignStatus,omitempty" name:"SignStatus"`

	// 课程id
	// 注意：此字段可能返回 null，表示取不到有效值。
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

	// 报名名额限制，0代表无限制
	// 注意：此字段可能返回 null，表示取不到有效值。
	SignMax *int64 `json:"SignMax,omitempty" name:"SignMax"`

	// 班级报名人数
	// 注意：此字段可能返回 null，表示取不到有效值。
	ApplyNum *int64 `json:"ApplyNum,omitempty" name:"ApplyNum"`

	// 课程小节
	// 注意：此字段可能返回 null，表示取不到有效值。
	SubCourseList []*SCRMSubCourseInfo `json:"SubCourseList,omitempty" name:"SubCourseList"`
}

type SearchDeptRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 搜索关键字
	Keywords *string `json:"Keywords,omitempty" name:"Keywords"`

	// 起始页码
	PageIndex *uint64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 分页大小
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *SearchDeptRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *SearchDeptRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Keywords")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "SearchDeptRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type SearchDeptResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 子部门列表
		DeptList []*DeptInfo `json:"DeptList,omitempty" name:"DeptList"`

		// 本次结果总数
		Total *uint64 `json:"Total,omitempty" name:"Total"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *SearchDeptResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *SearchDeptResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type SearchDeptUserRequest struct {
	*tchttp.BaseRequest

	// 千帆租户ID
	IdaasOrgId *string `json:"IdaasOrgId,omitempty" name:"IdaasOrgId"`

	// 搜索关键字
	Keywords *string `json:"Keywords,omitempty" name:"Keywords"`

	// 起始页码
	PageIndex *uint64 `json:"PageIndex,omitempty" name:"PageIndex"`

	// 分页大小
	PageSize *uint64 `json:"PageSize,omitempty" name:"PageSize"`
}

func (r *SearchDeptUserRequest) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *SearchDeptUserRequest) FromJsonString(s string) error {
	f := make(map[string]interface{})
	if err := json.Unmarshal([]byte(s), &f); err != nil {
		return err
	}
	delete(f, "IdaasOrgId")
	delete(f, "Keywords")
	delete(f, "PageIndex")
	delete(f, "PageSize")
	if len(f) > 0 {
		return tcerr.NewTencentCloudSDKError("ClientError.BuildRequestError", "SearchDeptUserRequest has unknown keys!", "")
	}
	return json.Unmarshal([]byte(s), &r)
}

type SearchDeptUserResponse struct {
	*tchttp.BaseResponse
	Response *struct {

		// 本次结果总数
		Total *uint64 `json:"Total,omitempty" name:"Total"`

		// 部门用户列表
		UserList []*DeptUserInfo `json:"UserList,omitempty" name:"UserList"`

		// 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
		RequestId *string `json:"RequestId,omitempty" name:"RequestId"`
	} `json:"Response"`
}

func (r *SearchDeptUserResponse) ToJsonString() string {
	b, _ := json.Marshal(r)
	return string(b)
}

// FromJsonString It is highly **NOT** recommended to use this function
// because it has no param check, nor strict type check
func (r *SearchDeptUserResponse) FromJsonString(s string) error {
	return json.Unmarshal([]byte(s), &r)
}

type ShortCouponInfo struct {

	// 优惠券id
	CouponId *string `json:"CouponId,omitempty" name:"CouponId"`

	// 优惠券链接
	JumpUrl *string `json:"JumpUrl,omitempty" name:"JumpUrl"`
}

type StudentInfo struct {

	// 观看直播时长分钟数，如1309
	WatchLive *uint64 `json:"WatchLive,omitempty" name:"WatchLive"`

	// 授课老师
	TeacherName *string `json:"TeacherName,omitempty" name:"TeacherName"`

	// 学生id
	StudentId *string `json:"StudentId,omitempty" name:"StudentId"`

	// 观看回放时长分钟数
	WatchLiveDuration *uint64 `json:"WatchLiveDuration,omitempty" name:"WatchLiveDuration"`

	// 是否观看回放,1=是，0=否
	IsWatchPlayback *uint64 `json:"IsWatchPlayback,omitempty" name:"IsWatchPlayback"`

	// 是否观看直播,1=是，0=否
	IsWatchLive *uint64 `json:"IsWatchLive,omitempty" name:"IsWatchLive"`

	// 学生姓名
	StudentName *string `json:"StudentName,omitempty" name:"StudentName"`

	// 学生手机号
	StudentPhone *string `json:"StudentPhone,omitempty" name:"StudentPhone"`

	// 学生头像
	StudentPic *string `json:"StudentPic,omitempty" name:"StudentPic"`

	// 学生序号
	StudentIndex *uint64 `json:"StudentIndex,omitempty" name:"StudentIndex"`

	// 进入直播时间
	EnterLiveTime *uint64 `json:"EnterLiveTime,omitempty" name:"EnterLiveTime"`
}

type StudyInfo struct {

	// 课程id
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

	// 班级id
	TermId *int64 `json:"TermId,omitempty" name:"TermId"`

	// 班级学习进度
	TermStudyProgress *int64 `json:"TermStudyProgress,omitempty" name:"TermStudyProgress"`

	// 总任务数
	TotalTaskNumber *int64 `json:"TotalTaskNumber,omitempty" name:"TotalTaskNumber"`

	// 已学习任务数
	StudyTaskNumber *int64 `json:"StudyTaskNumber,omitempty" name:"StudyTaskNumber"`

	// 节列表
	SubCourseList []*SCRMSubCourseInfo `json:"SubCourseList,omitempty" name:"SubCourseList"`
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

type TaskInfo struct {

	// 每讲名称
	// 注意：此字段可能返回 null，表示取不到有效值。
	Name *string `json:"Name,omitempty" name:"Name"`

	// 讲课状态  1待直播  2直播中 3录播
	// 注意：此字段可能返回 null，表示取不到有效值。
	Status *int64 `json:"Status,omitempty" name:"Status"`

	// 开始时间
	// 注意：此字段可能返回 null，表示取不到有效值。
	BeginTime *int64 `json:"BeginTime,omitempty" name:"BeginTime"`

	// 直播结束时间
	// 注意：此字段可能返回 null，表示取不到有效值。
	EndTime *int64 `json:"EndTime,omitempty" name:"EndTime"`

	// 任务id
	// 注意：此字段可能返回 null，表示取不到有效值。
	TaskId *string `json:"TaskId,omitempty" name:"TaskId"`

	// 任务学习时常，系统任务无学习时长，单位秒
	// 注意：此字段可能返回 null，表示取不到有效值。
	StudySpan *int64 `json:"StudySpan,omitempty" name:"StudySpan"`

	// 任务学习进度
	// 注意：此字段可能返回 null，表示取不到有效值。
	StudyProgress *int64 `json:"StudyProgress,omitempty" name:"StudyProgress"`

	// 任务学习时间 时间戳 单位秒
	// 注意：此字段可能返回 null，表示取不到有效值。
	StudyTs *int64 `json:"StudyTs,omitempty" name:"StudyTs"`
}

type TaskItem struct {

	// 任务授课时长
	Duration *uint64 `json:"Duration,omitempty" name:"Duration"`

	// 任务开始时间
	StartTime *uint64 `json:"StartTime,omitempty" name:"StartTime"`

	// 任务名字
	TaskName *string `json:"TaskName,omitempty" name:"TaskName"`

	// 任务id
	TaskId *uint64 `json:"TaskId,omitempty" name:"TaskId"`

	// 任务结束时间
	EndTime *uint64 `json:"EndTime,omitempty" name:"EndTime"`
}

type UserApply struct {

	// 课程id
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

	// 班级id
	TermId *int64 `json:"TermId,omitempty" name:"TermId"`

	// 报名时间
	ApplyTs *int64 `json:"ApplyTs,omitempty" name:"ApplyTs"`

	// 订单id
	OrderId *string `json:"OrderId,omitempty" name:"OrderId"`

	// 期次url
	TermUrl *string `json:"TermUrl,omitempty" name:"TermUrl"`
}

type UserInfo struct {

	// 开放平台id
	Openid *string `json:"Openid,omitempty" name:"Openid"`

	// 昵称
	Nickname *string `json:"Nickname,omitempty" name:"Nickname"`

	// 错误码
	ErrCode *int64 `json:"ErrCode,omitempty" name:"ErrCode"`

	// 错误信息
	ErrMsg *string `json:"ErrMsg,omitempty" name:"ErrMsg"`
}

type UserOrder struct {

	// 订单号
	OrderId *string `json:"OrderId,omitempty" name:"OrderId"`

	// 课程ID
	CourseId *int64 `json:"CourseId,omitempty" name:"CourseId"`

	// 课程包ID
	PackageId *int64 `json:"PackageId,omitempty" name:"PackageId"`

	// 课程名称
	CourseName *string `json:"CourseName,omitempty" name:"CourseName"`

	// 班级ID
	TermId *int64 `json:"TermId,omitempty" name:"TermId"`

	// 课程价格 ,单位为分
	CoursePrice *int64 `json:"CoursePrice,omitempty" name:"CoursePrice"`

	// 用户openID
	OpenId *string `json:"OpenId,omitempty" name:"OpenId"`

	// 创建订单的 Unix 时间戳， 单位为秒
	CreateTime *int64 `json:"CreateTime,omitempty" name:"CreateTime"`

	// 订单状态， 1为待付款，2为支付成功，3为发货成功，4为发货失败，5为交易成功，6为交易待确认，7为交易待审核，8为退款中，9为退款确认，10为退款成功，11为退款拒绝，300为机构退款
	OrderState *int64 `json:"OrderState,omitempty" name:"OrderState"`

	// 实付金额 ,单位为分
	PayPrice *int64 `json:"PayPrice,omitempty" name:"PayPrice"`

	// 支付时间 , unix时间戳，单位为秒
	PayTime *int64 `json:"PayTime,omitempty" name:"PayTime"`
}
