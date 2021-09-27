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

import warnings

from tencentcloud.common.abstract_model import AbstractModel


class AnswerInfo(AbstractModel):
    """题目解答

    """

    def __init__(self):
        r"""
        :param HasAnswer: 是否回答 1=已回答 0=未回答
        :type HasAnswer: int
        :param StudentId: 答题人账号
        :type StudentId: str
        :param SubmitAnswerList: 提交的答案，从1开始对应A，可能多个
        :type SubmitAnswerList: list of int non-negative
        :param StudentPicUrl: 学生头像链接
        :type StudentPicUrl: str
        :param StudentName: 答题人姓名
        :type StudentName: str
        """
        self.HasAnswer = None
        self.StudentId = None
        self.SubmitAnswerList = None
        self.StudentPicUrl = None
        self.StudentName = None


    def _deserialize(self, params):
        self.HasAnswer = params.get("HasAnswer")
        self.StudentId = params.get("StudentId")
        self.SubmitAnswerList = params.get("SubmitAnswerList")
        self.StudentPicUrl = params.get("StudentPicUrl")
        self.StudentName = params.get("StudentName")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class AuthorizeFastLiveCourseRequest(AbstractModel):
    """AuthorizeFastLiveCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        :param Deptlist: 课程可学习部门列表，dept_list和user_list至少2选1
        :type Deptlist: list of str
        :param Userlist: 课程可学习部门列表，dept_list和user_list至少2选1
        :type Userlist: list of str
        """
        self.TermId = None
        self.IdaasOrgId = None
        self.Deptlist = None
        self.Userlist = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Deptlist = params.get("Deptlist")
        self.Userlist = params.get("Userlist")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class AuthorizeFastLiveCourseResponse(AbstractModel):
    """AuthorizeFastLiveCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class BatchCourseInfo(AbstractModel):
    """批量接口中的课程信息

    """

    def __init__(self):
        r"""
        :param CourseId: 课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseId: int
        :param CourseName: 课程名
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseName: str
        :param InfoType: 0：课程，1：系列课
注意：此字段可能返回 null，表示取不到有效值。
        :type InfoType: int
        :param Price: 课程价格
注意：此字段可能返回 null，表示取不到有效值。
        :type Price: int
        :param CoverUrl: 课程封面
注意：此字段可能返回 null，表示取不到有效值。
        :type CoverUrl: str
        :param CourseUrl: 课程链接
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseUrl: str
        :param ApplyNum: 报名人数
注意：此字段可能返回 null，表示取不到有效值。
        :type ApplyNum: int
        :param SignStatus: 招生状态，系列课使用该字段，课程使用班级中的招生状态
注意：此字段可能返回 null，表示取不到有效值。
        :type SignStatus: int
        :param TermList: 班级列表
注意：此字段可能返回 null，表示取不到有效值。
        :type TermList: list of Task
        """
        self.CourseId = None
        self.CourseName = None
        self.InfoType = None
        self.Price = None
        self.CoverUrl = None
        self.CourseUrl = None
        self.ApplyNum = None
        self.SignStatus = None
        self.TermList = None


    def _deserialize(self, params):
        self.CourseId = params.get("CourseId")
        self.CourseName = params.get("CourseName")
        self.InfoType = params.get("InfoType")
        self.Price = params.get("Price")
        self.CoverUrl = params.get("CoverUrl")
        self.CourseUrl = params.get("CourseUrl")
        self.ApplyNum = params.get("ApplyNum")
        self.SignStatus = params.get("SignStatus")
        if params.get("TermList") is not None:
            self.TermList = []
            for item in params.get("TermList"):
                obj = Task()
                obj._deserialize(item)
                self.TermList.append(obj)
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ChapterInfo(AbstractModel):
    """课程章节信息

    """

    def __init__(self):
        r"""
        :param SubInfo: 课程包信息
注意：此字段可能返回 null，表示取不到有效值。
        :type SubInfo: list of TaskInfo
        :param Name: 章节名称
注意：此字段可能返回 null，表示取不到有效值。
        :type Name: str
        :param TermId: 课程包id
注意：此字段可能返回 null，表示取不到有效值。
        :type TermId: int
        :param AgencyId: 机构id
注意：此字段可能返回 null，表示取不到有效值。
        :type AgencyId: int
        :param CourseId: 课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseId: int
        """
        self.SubInfo = None
        self.Name = None
        self.TermId = None
        self.AgencyId = None
        self.CourseId = None


    def _deserialize(self, params):
        if params.get("SubInfo") is not None:
            self.SubInfo = []
            for item in params.get("SubInfo"):
                obj = TaskInfo()
                obj._deserialize(item)
                self.SubInfo.append(obj)
        self.Name = params.get("Name")
        self.TermId = params.get("TermId")
        self.AgencyId = params.get("AgencyId")
        self.CourseId = params.get("CourseId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ChatContent(AbstractModel):
    """会话消息

    """

    def __init__(self):
        r"""
        :param ElemType: 元素类型，1-文本，2-表情符号，3-图片，三种消息类型必有其一
        :type ElemType: int
        :param MsgText: 文本消息
注意：此字段可能返回 null，表示取不到有效值。
        :type MsgText: :class:`tencentcloud.tcop.v20210810.models.MsgText`
        :param MsgFace: 表情符号
注意：此字段可能返回 null，表示取不到有效值。
        :type MsgFace: :class:`tencentcloud.tcop.v20210810.models.MsgFace`
        :param MsgNotOnlineImage: 离线图片
        :type MsgNotOnlineImage: :class:`tencentcloud.tcop.v20210810.models.MsgNotOnlineImage`
        """
        self.ElemType = None
        self.MsgText = None
        self.MsgFace = None
        self.MsgNotOnlineImage = None


    def _deserialize(self, params):
        self.ElemType = params.get("ElemType")
        if params.get("MsgText") is not None:
            self.MsgText = MsgText()
            self.MsgText._deserialize(params.get("MsgText"))
        if params.get("MsgFace") is not None:
            self.MsgFace = MsgFace()
            self.MsgFace._deserialize(params.get("MsgFace"))
        if params.get("MsgNotOnlineImage") is not None:
            self.MsgNotOnlineImage = MsgNotOnlineImage()
            self.MsgNotOnlineImage._deserialize(params.get("MsgNotOnlineImage"))
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ClassInfo(AbstractModel):
    """直播课程状态信息

    """

    def __init__(self):
        r"""
        :param TermId: 班级id
注意：此字段可能返回 null，表示取不到有效值。
        :type TermId: int
        :param AttendTime: 用户开始上课时间戳
注意：此字段可能返回 null，表示取不到有效值。
        :type AttendTime: int
        :param LeaveTime: 用户点下课时间戳
注意：此字段可能返回 null，表示取不到有效值。
        :type LeaveTime: int
        :param OfflineStatus: 上下课状态 1-上课 2-下课
注意：此字段可能返回 null，表示取不到有效值。
        :type OfflineStatus: int
        """
        self.TermId = None
        self.AttendTime = None
        self.LeaveTime = None
        self.OfflineStatus = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.AttendTime = params.get("AttendTime")
        self.LeaveTime = params.get("LeaveTime")
        self.OfflineStatus = params.get("OfflineStatus")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CouponInfo(AbstractModel):
    """优惠券信息

    """

    def __init__(self):
        r"""
        :param CouponId: 优惠券id
        :type CouponId: str
        :param Mode: 发行方式,1:私密发行;2:运营活动发行;3:公开发行;4:批量私密
        :type Mode: int
        :param ValidBeginTime: 可使用有效开始时间,单位：秒
        :type ValidBeginTime: int
        :param ValidEndTime: 可使用有效截止时间
        :type ValidEndTime: int
        :param TotalCnt: 优惠券发行总数
        :type TotalCnt: int
        :param UseCnt: 优惠券使用数量
        :type UseCnt: int
        :param RecvCnt: 优惠券领取数量
        :type RecvCnt: int
        :param Status: 优惠券状态0:未发布;1:已发布;2:已过期;3:已删除;4:已下架
        :type Status: int
        :param JumpUrl: 优惠券链接列表
        :type JumpUrl: str
        :param CouponRule: 优惠券使用规则
        :type CouponRule: :class:`tencentcloud.tcop.v20210810.models.CouponRule`
        """
        self.CouponId = None
        self.Mode = None
        self.ValidBeginTime = None
        self.ValidEndTime = None
        self.TotalCnt = None
        self.UseCnt = None
        self.RecvCnt = None
        self.Status = None
        self.JumpUrl = None
        self.CouponRule = None


    def _deserialize(self, params):
        self.CouponId = params.get("CouponId")
        self.Mode = params.get("Mode")
        self.ValidBeginTime = params.get("ValidBeginTime")
        self.ValidEndTime = params.get("ValidEndTime")
        self.TotalCnt = params.get("TotalCnt")
        self.UseCnt = params.get("UseCnt")
        self.RecvCnt = params.get("RecvCnt")
        self.Status = params.get("Status")
        self.JumpUrl = params.get("JumpUrl")
        if params.get("CouponRule") is not None:
            self.CouponRule = CouponRule()
            self.CouponRule._deserialize(params.get("CouponRule"))
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CouponRule(AbstractModel):
    """优惠券使用规则

    """

    def __init__(self):
        r"""
        :param UseRole: 优惠券使用规则 1:全站通用;2:指定课程课程包;3:指定机构;4:指定类目
        :type UseRole: int
        :param Price: 满减券金额 / 一口价金额  ，单位：分
        :type Price: int
        :param Condition: 满多少金额
        :type Condition: int
        :param UseRoleList: 指定课程和课程包列表
        :type UseRoleList: list of ProductInfo
        """
        self.UseRole = None
        self.Price = None
        self.Condition = None
        self.UseRoleList = None


    def _deserialize(self, params):
        self.UseRole = params.get("UseRole")
        self.Price = params.get("Price")
        self.Condition = params.get("Condition")
        if params.get("UseRoleList") is not None:
            self.UseRoleList = []
            for item in params.get("UseRoleList"):
                obj = ProductInfo()
                obj._deserialize(item)
                self.UseRoleList.append(obj)
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class Course(AbstractModel):
    """直播间列表

    """

    def __init__(self):
        r"""
        :param TeacherId: 上课老师id（接入方通讯录中的老师id）
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: str
        """
        self.TeacherId = None
        self.TermId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CourseBasicInfo(AbstractModel):
    """课程基础信息

    """

    def __init__(self):
        r"""
        :param CourseId: 课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseId: int
        :param CourseName: 课程名
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseName: str
        :param CoverUrl: 课程封面
注意：此字段可能返回 null，表示取不到有效值。
        :type CoverUrl: str
        :param Price: 课程价格
注意：此字段可能返回 null，表示取不到有效值。
        :type Price: int
        :param CourseUrl: 课程链接
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseUrl: str
        :param ApplyNum: 课程报名人数
注意：此字段可能返回 null，表示取不到有效值。
        :type ApplyNum: int
        """
        self.CourseId = None
        self.CourseName = None
        self.CoverUrl = None
        self.Price = None
        self.CourseUrl = None
        self.ApplyNum = None


    def _deserialize(self, params):
        self.CourseId = params.get("CourseId")
        self.CourseName = params.get("CourseName")
        self.CoverUrl = params.get("CoverUrl")
        self.Price = params.get("Price")
        self.CourseUrl = params.get("CourseUrl")
        self.ApplyNum = params.get("ApplyNum")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CourseInfo(AbstractModel):
    """课程详情信息

    """

    def __init__(self):
        r"""
        :param CourseId: 课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseId: int
        :param Name: 课程名称
注意：此字段可能返回 null，表示取不到有效值。
        :type Name: str
        :param TeacherList: 讲师ID
注意：此字段可能返回 null，表示取不到有效值。
        :type TeacherList: list of int non-negative
        :param AgencyId: 机构id
注意：此字段可能返回 null，表示取不到有效值。
        :type AgencyId: int
        :param PicUrl: 课程封面
注意：此字段可能返回 null，表示取不到有效值。
        :type PicUrl: str
        :param PayId: 费用类型id  1免费 2付费
注意：此字段可能返回 null，表示取不到有效值。
        :type PayId: int
        :param ListenFlag: 试听标志   付费课  0不可试听，1可试听
注意：此字段可能返回 null，表示取不到有效值。
        :type ListenFlag: int
        :param IndustryFirst: 课程一级类目
注意：此字段可能返回 null，表示取不到有效值。
        :type IndustryFirst: int
        :param IndustrySecond: 课程二级类目
注意：此字段可能返回 null，表示取不到有效值。
        :type IndustrySecond: int
        :param IndustryThird: 课程三级类目
注意：此字段可能返回 null，表示取不到有效值。
        :type IndustryThird: int
        :param BeginTime: 课程开始时间 仅直播
注意：此字段可能返回 null，表示取不到有效值。
        :type BeginTime: int
        :param EndTime: 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
        :type EndTime: int
        :param Price: 课程价格  单位为“分”
注意：此字段可能返回 null，表示取不到有效值。
        :type Price: int
        :param Introduce: 课程简介
注意：此字段可能返回 null，表示取不到有效值。
        :type Introduce: str
        :param IosPrice: IOS课点价格
注意：此字段可能返回 null，表示取不到有效值。
        :type IosPrice: int
        :param TeacherNameList: 讲师名称  c_te_list id 转换为名字
注意：此字段可能返回 null，表示取不到有效值。
        :type TeacherNameList: list of str
        :param AidName: 机构名称
注意：此字段可能返回 null，表示取不到有效值。
        :type AidName: str
        :param Type: 授课方式  0-录播，1-直播 t_online_term    t_bit_flag第14位
注意：此字段可能返回 null，表示取不到有效值。
        :type Type: int
        :param RecentLearnNum: 最近在学人数
注意：此字段可能返回 null，表示取不到有效值。
        :type RecentLearnNum: int
        :param Lesson: 课时
注意：此字段可能返回 null，表示取不到有效值。
        :type Lesson: int
        :param Score: 好评度
注意：此字段可能返回 null，表示取不到有效值。
        :type Score: int
        :param ApplyNum: 报名人数
注意：此字段可能返回 null，表示取不到有效值。
        :type ApplyNum: int
        :param StoreNum: 收藏人数
注意：此字段可能返回 null，表示取不到有效值。
        :type StoreNum: int
        :param ChapterInfo: 课程章节信息
注意：此字段可能返回 null，表示取不到有效值。
        :type ChapterInfo: list of ChapterInfo
        :param IsBeing: 是否处于直播状态 默认0
注意：此字段可能返回 null，表示取不到有效值。
        :type IsBeing: int
        :param SignEndTime: 报名截止时间
注意：此字段可能返回 null，表示取不到有效值。
        :type SignEndTime: int
        :param RecentLiveTermId: 最近直播间id
注意：此字段可能返回 null，表示取不到有效值。
        :type RecentLiveTermId: int
        :param RoomId: 直播间id
注意：此字段可能返回 null，表示取不到有效值。
        :type RoomId: int
        """
        self.CourseId = None
        self.Name = None
        self.TeacherList = None
        self.AgencyId = None
        self.PicUrl = None
        self.PayId = None
        self.ListenFlag = None
        self.IndustryFirst = None
        self.IndustrySecond = None
        self.IndustryThird = None
        self.BeginTime = None
        self.EndTime = None
        self.Price = None
        self.Introduce = None
        self.IosPrice = None
        self.TeacherNameList = None
        self.AidName = None
        self.Type = None
        self.RecentLearnNum = None
        self.Lesson = None
        self.Score = None
        self.ApplyNum = None
        self.StoreNum = None
        self.ChapterInfo = None
        self.IsBeing = None
        self.SignEndTime = None
        self.RecentLiveTermId = None
        self.RoomId = None


    def _deserialize(self, params):
        self.CourseId = params.get("CourseId")
        self.Name = params.get("Name")
        self.TeacherList = params.get("TeacherList")
        self.AgencyId = params.get("AgencyId")
        self.PicUrl = params.get("PicUrl")
        self.PayId = params.get("PayId")
        self.ListenFlag = params.get("ListenFlag")
        self.IndustryFirst = params.get("IndustryFirst")
        self.IndustrySecond = params.get("IndustrySecond")
        self.IndustryThird = params.get("IndustryThird")
        self.BeginTime = params.get("BeginTime")
        self.EndTime = params.get("EndTime")
        self.Price = params.get("Price")
        self.Introduce = params.get("Introduce")
        self.IosPrice = params.get("IosPrice")
        self.TeacherNameList = params.get("TeacherNameList")
        self.AidName = params.get("AidName")
        self.Type = params.get("Type")
        self.RecentLearnNum = params.get("RecentLearnNum")
        self.Lesson = params.get("Lesson")
        self.Score = params.get("Score")
        self.ApplyNum = params.get("ApplyNum")
        self.StoreNum = params.get("StoreNum")
        if params.get("ChapterInfo") is not None:
            self.ChapterInfo = []
            for item in params.get("ChapterInfo"):
                obj = ChapterInfo()
                obj._deserialize(item)
                self.ChapterInfo.append(obj)
        self.IsBeing = params.get("IsBeing")
        self.SignEndTime = params.get("SignEndTime")
        self.RecentLiveTermId = params.get("RecentLiveTermId")
        self.RoomId = params.get("RoomId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CourseItem(AbstractModel):
    """直播间列表

    """

    def __init__(self):
        r"""
        :param TeacherId: 上课老师id（接入方通讯录中的老师id）
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: int
        """
        self.TeacherId = None
        self.TermId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CoursePackageInfo(AbstractModel):
    """课程包详情

    """

    def __init__(self):
        r"""
        :param PackageId: 课程包id
        :type PackageId: int
        :param Name: 课程包名称
        :type Name: str
        :param Price: 课程包价格
        :type Price: int
        :param SignNum: 报名人数
        :type SignNum: int
        :param CoverUrl: 封面图片地址
        :type CoverUrl: str
        :param PackageUrl: 课程包地址
        :type PackageUrl: str
        :param TermList: 班级列表
        :type TermList: list of PackageTerm
        """
        self.PackageId = None
        self.Name = None
        self.Price = None
        self.SignNum = None
        self.CoverUrl = None
        self.PackageUrl = None
        self.TermList = None


    def _deserialize(self, params):
        self.PackageId = params.get("PackageId")
        self.Name = params.get("Name")
        self.Price = params.get("Price")
        self.SignNum = params.get("SignNum")
        self.CoverUrl = params.get("CoverUrl")
        self.PackageUrl = params.get("PackageUrl")
        if params.get("TermList") is not None:
            self.TermList = []
            for item in params.get("TermList"):
                obj = PackageTerm()
                obj._deserialize(item)
                self.TermList.append(obj)
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CreateFastLiveCourseRequest(AbstractModel):
    """CreateFastLiveCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 老师id（接入方通讯录中的老师id）
        :type TeacherId: str
        :param VisibleScope: 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
        :type VisibleScope: int
        :param Name: 课程名
        :type Name: str
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.VisibleScope = None
        self.Name = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.VisibleScope = params.get("VisibleScope")
        self.Name = params.get("Name")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CreateFastLiveCourseResponse(AbstractModel):
    """CreateFastLiveCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
注意：此字段可能返回 null，表示取不到有效值。
        :type TermId: str
        :param LiveUrl: 直播链接
注意：此字段可能返回 null，表示取不到有效值。
        :type LiveUrl: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.TermId = None
        self.LiveUrl = None
        self.RequestId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.LiveUrl = params.get("LiveUrl")
        self.RequestId = params.get("RequestId")


class CreateLiveCourseRequest(AbstractModel):
    """CreateLiveCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 老师id（接入方通讯录中的老师id）
        :type TeacherId: str
        :param VisibleScope: 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
        :type VisibleScope: int
        :param Name: 课程名
        :type Name: str
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.VisibleScope = None
        self.Name = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.VisibleScope = params.get("VisibleScope")
        self.Name = params.get("Name")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class CreateLiveCourseResponse(AbstractModel):
    """CreateLiveCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
注意：此字段可能返回 null，表示取不到有效值。
        :type TermId: int
        :param LiveUrl: 直播链接
注意：此字段可能返回 null，表示取不到有效值。
        :type LiveUrl: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.TermId = None
        self.LiveUrl = None
        self.RequestId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.LiveUrl = params.get("LiveUrl")
        self.RequestId = params.get("RequestId")


class DeleteCourseRequest(AbstractModel):
    """DeleteCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 接入方通讯录中的老师id
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.TermId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DeleteCourseResponse(AbstractModel):
    """DeleteCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class DeleteFastCourseTaskRequest(AbstractModel):
    """DeleteFastCourseTask请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 接入方通讯录中的老师id
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.TermId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DeleteFastCourseTaskResponse(AbstractModel):
    """DeleteFastCourseTask返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class DeptInfo(AbstractModel):
    """部门信息

    """

    def __init__(self):
        r"""
        :param DeptId: 千帆部门ID
        :type DeptId: str
        :param TenantId: 千帆租户ID
        :type TenantId: str
        :param Ancestor: 千帆部门祖先节点
        :type Ancestor: list of str
        :param ParentId: 千帆部门父节点ID
        :type ParentId: str
        :param DeptName: 千帆部门名称
        :type DeptName: str
        """
        self.DeptId = None
        self.TenantId = None
        self.Ancestor = None
        self.ParentId = None
        self.DeptName = None


    def _deserialize(self, params):
        self.DeptId = params.get("DeptId")
        self.TenantId = params.get("TenantId")
        self.Ancestor = params.get("Ancestor")
        self.ParentId = params.get("ParentId")
        self.DeptName = params.get("DeptName")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DeptUserInfo(AbstractModel):
    """千帆通讯录用户

    """

    def __init__(self):
        r"""
        :param Username: 千帆用户名
        :type Username: str
        :param PhoneNum: 千帆用户手机号
        :type PhoneNum: str
        :param IdsUid: 千帆用户UID
        :type IdsUid: str
        :param EmployeeNumber: 千帆用户雇员编号
        :type EmployeeNumber: str
        :param TenantId: 千帆租户ID
        :type TenantId: str
        :param PrimaryMail: 千帆用户邮箱
        :type PrimaryMail: str
        :param DeptId: 千帆用户所属部门ID
        :type DeptId: str
        :param DisplayName: 千帆用户展示名称
        :type DisplayName: str
        :param SourceId: 机构用户ID
        :type SourceId: str
        """
        self.Username = None
        self.PhoneNum = None
        self.IdsUid = None
        self.EmployeeNumber = None
        self.TenantId = None
        self.PrimaryMail = None
        self.DeptId = None
        self.DisplayName = None
        self.SourceId = None


    def _deserialize(self, params):
        self.Username = params.get("Username")
        self.PhoneNum = params.get("PhoneNum")
        self.IdsUid = params.get("IdsUid")
        self.EmployeeNumber = params.get("EmployeeNumber")
        self.TenantId = params.get("TenantId")
        self.PrimaryMail = params.get("PrimaryMail")
        self.DeptId = params.get("DeptId")
        self.DisplayName = params.get("DisplayName")
        self.SourceId = params.get("SourceId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyCouponsRequest(AbstractModel):
    """DescribeAgencyCoupons请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业微信企业id
        :type Corpid: str
        :param PageIndex: 起始页 从0开始
        :type PageIndex: int
        :param PageSize: 页大小 分页限制 最大分页大小为10
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyCouponsResponse(AbstractModel):
    """DescribeAgencyCoupons返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号
        :type PageNext: int
        :param CouponList: 优惠券列表
        :type CouponList: list of CouponInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.CouponList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("CouponList") is not None:
            self.CouponList = []
            for item in params.get("CouponList"):
                obj = CouponInfo()
                obj._deserialize(item)
                self.CouponList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyCourseInfosRequest(AbstractModel):
    """DescribeAgencyCourseInfos请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        :param PageIndex: 分页页码
        :type PageIndex: int
        :param PageSize: 分页每页大小
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyCourseInfosResponse(AbstractModel):
    """DescribeAgencyCourseInfos返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页
        :type PageNext: int
        :param CourseList: 课程列表
        :type CourseList: list of BatchCourseInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.CourseList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("CourseList") is not None:
            self.CourseList = []
            for item in params.get("CourseList"):
                obj = BatchCourseInfo()
                obj._deserialize(item)
                self.CourseList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyCoursePkgRequest(AbstractModel):
    """DescribeAgencyCoursePkg请求参数结构体

    """

    def __init__(self):
        r"""
        :param PackageIdList: 课程包id列表
        :type PackageIdList: list of int
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        """
        self.PackageIdList = None
        self.IdaasOrgId = None
        self.Corpid = None


    def _deserialize(self, params):
        self.PackageIdList = params.get("PackageIdList")
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyCoursePkgResponse(AbstractModel):
    """DescribeAgencyCoursePkg返回参数结构体

    """

    def __init__(self):
        r"""
        :param PackageList: 课程包列表
        :type PackageList: list of CoursePackageInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PackageList = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("PackageList") is not None:
            self.PackageList = []
            for item in params.get("PackageList"):
                obj = CoursePackageInfo()
                obj._deserialize(item)
                self.PackageList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyCourseRequest(AbstractModel):
    """DescribeAgencyCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        :param CourseId: 课程id
        :type CourseId: int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.CourseId = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.CourseId = params.get("CourseId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyCourseResponse(AbstractModel):
    """DescribeAgencyCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param CourseId: 课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseId: int
        :param CourseName: 课程名
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseName: str
        :param CoverUrl: 课程封面
注意：此字段可能返回 null，表示取不到有效值。
        :type CoverUrl: str
        :param Price: 课程价格
注意：此字段可能返回 null，表示取不到有效值。
        :type Price: int
        :param CourseUrl: 课程url
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseUrl: str
        :param TermList: 班级列表
注意：此字段可能返回 null，表示取不到有效值。
        :type TermList: list of SCRMTermInfo
        :param ApplyNum: 课程报名人数
注意：此字段可能返回 null，表示取不到有效值。
        :type ApplyNum: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.CourseId = None
        self.CourseName = None
        self.CoverUrl = None
        self.Price = None
        self.CourseUrl = None
        self.TermList = None
        self.ApplyNum = None
        self.RequestId = None


    def _deserialize(self, params):
        self.CourseId = params.get("CourseId")
        self.CourseName = params.get("CourseName")
        self.CoverUrl = params.get("CoverUrl")
        self.Price = params.get("Price")
        self.CourseUrl = params.get("CourseUrl")
        if params.get("TermList") is not None:
            self.TermList = []
            for item in params.get("TermList"):
                obj = SCRMTermInfo()
                obj._deserialize(item)
                self.TermList.append(obj)
        self.ApplyNum = params.get("ApplyNum")
        self.RequestId = params.get("RequestId")


class DescribeAgencyCoursesRequest(AbstractModel):
    """DescribeAgencyCourses请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        :param CourseIdList: 课程id列表，最多传50个
        :type CourseIdList: list of int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.CourseIdList = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.CourseIdList = params.get("CourseIdList")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyCoursesResponse(AbstractModel):
    """DescribeAgencyCourses返回参数结构体

    """

    def __init__(self):
        r"""
        :param CourseList: 课程列表
        :type CourseList: list of CourseBasicInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.CourseList = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("CourseList") is not None:
            self.CourseList = []
            for item in params.get("CourseList"):
                obj = CourseBasicInfo()
                obj._deserialize(item)
                self.CourseList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyPrivateCouponsRequest(AbstractModel):
    """DescribeAgencyPrivateCoupons请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        :param CouponId: 优惠券id
        :type CouponId: str
        :param Filter: 优惠券状态 0：已领取 2：已使用，10：未领取
        :type Filter: int
        :param PageIndex: 起始页码 从0开始
        :type PageIndex: int
        :param PageSize: 页大小 分页大小 无限制
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.CouponId = None
        self.Filter = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.CouponId = params.get("CouponId")
        self.Filter = params.get("Filter")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyPrivateCouponsResponse(AbstractModel):
    """DescribeAgencyPrivateCoupons返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号
        :type PageNext: int
        :param CouponList: 优惠券列表
        :type CouponList: list of ShortCouponInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.CouponList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("CouponList") is not None:
            self.CouponList = []
            for item in params.get("CouponList"):
                obj = ShortCouponInfo()
                obj._deserialize(item)
                self.CouponList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyTermsRequest(AbstractModel):
    """DescribeAgencyTerms请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        :param TermIdList: 班级id列表
        :type TermIdList: list of int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.TermIdList = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.TermIdList = params.get("TermIdList")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyTermsResponse(AbstractModel):
    """DescribeAgencyTerms返回参数结构体

    """

    def __init__(self):
        r"""
        :param TermList: 班级列表
注意：此字段可能返回 null，表示取不到有效值。
        :type TermList: list of SCRMTermInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.TermList = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("TermList") is not None:
            self.TermList = []
            for item in params.get("TermList"):
                obj = SCRMTermInfo()
                obj._deserialize(item)
                self.TermList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyUserApplyCoursesRequest(AbstractModel):
    """DescribeAgencyUserApplyCourses请求参数结构体

    """

    def __init__(self):
        r"""
        :param OpenId: 用户OpenId
        :type OpenId: str
        :param IdaasOrgId: 千帆租户id
        :type IdaasOrgId: str
        :param Corpid: 企业ID
        :type Corpid: str
        :param PageIndex: 起始页码（从0开始）
        :type PageIndex: int
        :param PageSize: 分页大小
        :type PageSize: int
        """
        self.OpenId = None
        self.IdaasOrgId = None
        self.Corpid = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.OpenId = params.get("OpenId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyUserApplyCoursesResponse(AbstractModel):
    """DescribeAgencyUserApplyCourses返回参数结构体

    """

    def __init__(self):
        r"""
        :param UserApplyList: 学习列表
注意：此字段可能返回 null，表示取不到有效值。
        :type UserApplyList: list of UserApply
        :param PageNext: 下一页序号
注意：此字段可能返回 null，表示取不到有效值。
        :type PageNext: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.UserApplyList = None
        self.PageNext = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("UserApplyList") is not None:
            self.UserApplyList = []
            for item in params.get("UserApplyList"):
                obj = UserApply()
                obj._deserialize(item)
                self.UserApplyList.append(obj)
        self.PageNext = params.get("PageNext")
        self.RequestId = params.get("RequestId")


class DescribeAgencyUserAttendanceRequest(AbstractModel):
    """DescribeAgencyUserAttendance请求参数结构体

    """

    def __init__(self):
        r"""
        :param Corpid: 企业id
        :type Corpid: str
        :param OpenId: 用户OpenId
        :type OpenId: str
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        """
        self.Corpid = None
        self.OpenId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.Corpid = params.get("Corpid")
        self.OpenId = params.get("OpenId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyUserAttendanceResponse(AbstractModel):
    """DescribeAgencyUserAttendance返回参数结构体

    """

    def __init__(self):
        r"""
        :param LatestStudyTs: 最近一次学习时间，时间戳 单位秒
        :type LatestStudyTs: int
        :param LatestStudySpan: 最近一次学习时长，如果任务为习题任务，则学习时长为0，单位秒
        :type LatestStudySpan: int
        :param LatestStudyCourseId: 最近一次学习课程id
        :type LatestStudyCourseId: int
        :param LatestStudyTaskId: 最近一次学习任务id
        :type LatestStudyTaskId: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.LatestStudyTs = None
        self.LatestStudySpan = None
        self.LatestStudyCourseId = None
        self.LatestStudyTaskId = None
        self.RequestId = None


    def _deserialize(self, params):
        self.LatestStudyTs = params.get("LatestStudyTs")
        self.LatestStudySpan = params.get("LatestStudySpan")
        self.LatestStudyCourseId = params.get("LatestStudyCourseId")
        self.LatestStudyTaskId = params.get("LatestStudyTaskId")
        self.RequestId = params.get("RequestId")


class DescribeAgencyUserOrdersRequest(AbstractModel):
    """DescribeAgencyUserOrders请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        :param Openid: 学员openID
        :type Openid: str
        :param PageIndex: 起始页码（从0开始）
        :type PageIndex: int
        :param PageSize: 分页大小
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.Openid = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.Openid = params.get("Openid")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyUserOrdersResponse(AbstractModel):
    """DescribeAgencyUserOrders返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param OrderList: 订单列表
        :type OrderList: list of UserOrder
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.OrderList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("OrderList") is not None:
            self.OrderList = []
            for item in params.get("OrderList"):
                obj = UserOrder()
                obj._deserialize(item)
                self.OrderList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyUserStudyProgressesRequest(AbstractModel):
    """DescribeAgencyUserStudyProgresses请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 租户id
        :type IdaasOrgId: str
        :param Corpid: 企业id
        :type Corpid: str
        :param OpenId: 用户OpenId
        :type OpenId: str
        :param PageIndex: 起始页 从0开始
        :type PageIndex: int
        :param PageSize: 页大小 分页大小 最大为10000
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.OpenId = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.OpenId = params.get("OpenId")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyUserStudyProgressesResponse(AbstractModel):
    """DescribeAgencyUserStudyProgresses返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号
注意：此字段可能返回 null，表示取不到有效值。
        :type PageNext: int
        :param StudyList: 学习列表
注意：此字段可能返回 null，表示取不到有效值。
        :type StudyList: list of StudyInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.StudyList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("StudyList") is not None:
            self.StudyList = []
            for item in params.get("StudyList"):
                obj = StudyInfo()
                obj._deserialize(item)
                self.StudyList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeAgencyUsersRequest(AbstractModel):
    """DescribeAgencyUsers请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Corpid: 企业微信组织ID
        :type Corpid: str
        :param OpenidList: 用户openid列表
        :type OpenidList: list of str
        """
        self.IdaasOrgId = None
        self.Corpid = None
        self.OpenidList = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Corpid = params.get("Corpid")
        self.OpenidList = params.get("OpenidList")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeAgencyUsersResponse(AbstractModel):
    """DescribeAgencyUsers返回参数结构体

    """

    def __init__(self):
        r"""
        :param UserList: 用户信息列表
        :type UserList: list of UserInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.UserList = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("UserList") is not None:
            self.UserList = []
            for item in params.get("UserList"):
                obj = UserInfo()
                obj._deserialize(item)
                self.UserList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeChannelClassInfosRequest(AbstractModel):
    """DescribeChannelClassInfos请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermIds: 批量直播课程TermID
        :type TermIds: list of int non-negative
        """
        self.TermIds = None


    def _deserialize(self, params):
        self.TermIds = params.get("TermIds")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeChannelClassInfosResponse(AbstractModel):
    """DescribeChannelClassInfos返回参数结构体

    """

    def __init__(self):
        r"""
        :param ClassInfos: 批量term的上下课信息
注意：此字段可能返回 null，表示取不到有效值。
        :type ClassInfos: list of ClassInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.ClassInfos = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("ClassInfos") is not None:
            self.ClassInfos = []
            for item in params.get("ClassInfos"):
                obj = ClassInfo()
                obj._deserialize(item)
                self.ClassInfos.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeChannelCourseIdsRequest(AbstractModel):
    """DescribeChannelCourseIds请求参数结构体

    """

    def __init__(self):
        r"""
        :param Offset: 上次更新id
        :type Offset: int
        :param Limit: 批次请求数量
        :type Limit: int
        """
        self.Offset = None
        self.Limit = None


    def _deserialize(self, params):
        self.Offset = params.get("Offset")
        self.Limit = params.get("Limit")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeChannelCourseIdsResponse(AbstractModel):
    """DescribeChannelCourseIds返回参数结构体

    """

    def __init__(self):
        r"""
        :param CourseIds: 课程id列表
        :type CourseIds: list of int non-negative
        :param Total: 总数
        :type Total: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.CourseIds = None
        self.Total = None
        self.RequestId = None


    def _deserialize(self, params):
        self.CourseIds = params.get("CourseIds")
        self.Total = params.get("Total")
        self.RequestId = params.get("RequestId")


class DescribeChannelPoolCoursesRequest(AbstractModel):
    """DescribeChannelPoolCourses请求参数结构体

    """

    def __init__(self):
        r"""
        :param CourseIds: 课程id列表，目前仅支持单个
        :type CourseIds: list of int non-negative
        """
        self.CourseIds = None


    def _deserialize(self, params):
        self.CourseIds = params.get("CourseIds")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeChannelPoolCoursesResponse(AbstractModel):
    """DescribeChannelPoolCourses返回参数结构体

    """

    def __init__(self):
        r"""
        :param CourseList: 课程详情列表
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseList: list of CourseInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.CourseList = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("CourseList") is not None:
            self.CourseList = []
            for item in params.get("CourseList"):
                obj = CourseInfo()
                obj._deserialize(item)
                self.CourseList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeChatRequest(AbstractModel):
    """DescribeChat请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param TermId: 直播间id
        :type TermId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.TermId = None
        self.Page = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.TermId = params.get("TermId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeChatResponse(AbstractModel):
    """DescribeChat返回参数结构体

    """

    def __init__(self):
        r"""
        :param ChatList: 聊天列表
        :type ChatList: list of ChatContent
        :param CourseName: 课堂名称
        :type CourseName: str
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.ChatList = None
        self.CourseName = None
        self.PageNext = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("ChatList") is not None:
            self.ChatList = []
            for item in params.get("ChatList"):
                obj = ChatContent()
                obj._deserialize(item)
                self.ChatList.append(obj)
        self.CourseName = params.get("CourseName")
        self.PageNext = params.get("PageNext")
        self.RequestId = params.get("RequestId")


class DescribeCourseTasksRequest(AbstractModel):
    """DescribeCourseTasks请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.Page = None
        self.PageSize = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeCourseTasksResponse(AbstractModel):
    """DescribeCourseTasks返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号，当为0时表示没有下一页了
注意：此字段可能返回 null，表示取不到有效值。
        :type PageNext: int
        :param TaskList: 直播任务列表
注意：此字段可能返回 null，表示取不到有效值。
        :type TaskList: list of TaskItem
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.TaskList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("TaskList") is not None:
            self.TaskList = []
            for item in params.get("TaskList"):
                obj = TaskItem()
                obj._deserialize(item)
                self.TaskList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeDeptRootRequest(AbstractModel):
    """DescribeDeptRoot请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        """
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeDeptRootResponse(AbstractModel):
    """DescribeDeptRoot返回参数结构体

    """

    def __init__(self):
        r"""
        :param DeptId: 千帆部门ID
        :type DeptId: str
        :param TenantId: 千帆租户ID
        :type TenantId: str
        :param ParentId: 千帆部门ID
        :type ParentId: str
        :param DeptName: 部门名称
        :type DeptName: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.DeptId = None
        self.TenantId = None
        self.ParentId = None
        self.DeptName = None
        self.RequestId = None


    def _deserialize(self, params):
        self.DeptId = params.get("DeptId")
        self.TenantId = params.get("TenantId")
        self.ParentId = params.get("ParentId")
        self.DeptName = params.get("DeptName")
        self.RequestId = params.get("RequestId")


class DescribeDeptSubRequest(AbstractModel):
    """DescribeDeptSub请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param DeptId: 部门ID
        :type DeptId: str
        :param PageIndex: 起始页码
        :type PageIndex: int
        :param PageSize: 分页大小
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.DeptId = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.DeptId = params.get("DeptId")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeDeptSubResponse(AbstractModel):
    """DescribeDeptSub返回参数结构体

    """

    def __init__(self):
        r"""
        :param DeptList: 子部门列表
        :type DeptList: list of DeptInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.DeptList = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("DeptList") is not None:
            self.DeptList = []
            for item in params.get("DeptList"):
                obj = DeptInfo()
                obj._deserialize(item)
                self.DeptList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeDeptUserRequest(AbstractModel):
    """DescribeDeptUser请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param DeptId: 部门ID
        :type DeptId: str
        :param PageIndex: 起始页码
        :type PageIndex: int
        :param PageSize: 分页大小
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.DeptId = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.DeptId = params.get("DeptId")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeDeptUserResponse(AbstractModel):
    """DescribeDeptUser返回参数结构体

    """

    def __init__(self):
        r"""
        :param UserList: 部门用户列表
        :type UserList: list of DeptUserInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.UserList = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("UserList") is not None:
            self.UserList = []
            for item in params.get("UserList"):
                obj = DeptUserInfo()
                obj._deserialize(item)
                self.UserList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeExamAnswerRequest(AbstractModel):
    """DescribeExamAnswer请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param TermId: 直播间id
        :type TermId: int
        :param ExamId: 题目id
        :type ExamId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.TermId = None
        self.ExamId = None
        self.Page = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.TermId = params.get("TermId")
        self.ExamId = params.get("ExamId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeExamAnswerResponse(AbstractModel):
    """DescribeExamAnswer返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param StudentNum: 应答题学生人数
        :type StudentNum: int
        :param AnswerNum: 实际提交答题卡人数
        :type AnswerNum: int
        :param AnswerList: 答题学生信息
        :type AnswerList: list of AnswerInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.StudentNum = None
        self.AnswerNum = None
        self.AnswerList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        self.StudentNum = params.get("StudentNum")
        self.AnswerNum = params.get("AnswerNum")
        if params.get("AnswerList") is not None:
            self.AnswerList = []
            for item in params.get("AnswerList"):
                obj = AnswerInfo()
                obj._deserialize(item)
                self.AnswerList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeExamQuestionRequest(AbstractModel):
    """DescribeExamQuestion请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param TermId: 直播间id
        :type TermId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.TermId = None
        self.Page = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.TermId = params.get("TermId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeExamQuestionResponse(AbstractModel):
    """DescribeExamQuestion返回参数结构体

    """

    def __init__(self):
        r"""
        :param CourseName: 课堂名称
        :type CourseName: str
        :param ExamList: 题目列表
        :type ExamList: list of ExamInfo
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.CourseName = None
        self.ExamList = None
        self.PageNext = None
        self.RequestId = None


    def _deserialize(self, params):
        self.CourseName = params.get("CourseName")
        if params.get("ExamList") is not None:
            self.ExamList = []
            for item in params.get("ExamList"):
                obj = ExamInfo()
                obj._deserialize(item)
                self.ExamList.append(obj)
        self.PageNext = params.get("PageNext")
        self.RequestId = params.get("RequestId")


class DescribeFastCourseTasksRequest(AbstractModel):
    """DescribeFastCourseTasks请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.Page = None
        self.PageSize = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeFastCourseTasksResponse(AbstractModel):
    """DescribeFastCourseTasks返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param TaskList: 直播任务列表
        :type TaskList: list of Task
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.TaskList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("TaskList") is not None:
            self.TaskList = []
            for item in params.get("TaskList"):
                obj = Task()
                obj._deserialize(item)
                self.TaskList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeFastLiveCourseRequest(AbstractModel):
    """DescribeFastLiveCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeFastLiveCourseResponse(AbstractModel):
    """DescribeFastLiveCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 上课老师id（接入方通讯录中的老师id）
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: str
        :param VisibleScope: 课程学习可见范围属性， 0-公开 1-指定范围
注意：此字段可能返回 null，表示取不到有效值。
        :type VisibleScope: int
        :param Name: 课程名
注意：此字段可能返回 null，表示取不到有效值。
        :type Name: str
        :param LiveUrl: 直播链接
注意：此字段可能返回 null，表示取不到有效值。
        :type LiveUrl: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.TeacherId = None
        self.TermId = None
        self.VisibleScope = None
        self.Name = None
        self.LiveUrl = None
        self.RequestId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        self.VisibleScope = params.get("VisibleScope")
        self.Name = params.get("Name")
        self.LiveUrl = params.get("LiveUrl")
        self.RequestId = params.get("RequestId")


class DescribeFastLiveCoursesRequest(AbstractModel):
    """DescribeFastLiveCourses请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程
        :type TeacherId: str
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.Page = None
        self.PageSize = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeFastLiveCoursesResponse(AbstractModel):
    """DescribeFastLiveCourses返回参数结构体

    """

    def __init__(self):
        r"""
        :param CourseList: 课程id和教师id列表
        :type CourseList: list of Course
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.CourseList = None
        self.PageNext = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("CourseList") is not None:
            self.CourseList = []
            for item in params.get("CourseList"):
                obj = Course()
                obj._deserialize(item)
                self.CourseList.append(obj)
        self.PageNext = params.get("PageNext")
        self.RequestId = params.get("RequestId")


class DescribeFastReplayDownloadsRequest(AbstractModel):
    """DescribeFastReplayDownloads请求参数结构体

    """

    def __init__(self):
        r"""
        :param VId: 视频id
        :type VId: str
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.VId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.VId = params.get("VId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeFastReplayDownloadsResponse(AbstractModel):
    """DescribeFastReplayDownloads返回参数结构体

    """

    def __init__(self):
        r"""
        :param DownloadUrl: 无
        :type DownloadUrl: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.DownloadUrl = None
        self.RequestId = None


    def _deserialize(self, params):
        self.DownloadUrl = params.get("DownloadUrl")
        self.RequestId = params.get("RequestId")


class DescribeFastReplaysRequest(AbstractModel):
    """DescribeFastReplays请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.Page = None
        self.PageSize = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeFastReplaysResponse(AbstractModel):
    """DescribeFastReplays返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param ReplayList: 回放列表
        :type ReplayList: list of Replay
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.ReplayList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("ReplayList") is not None:
            self.ReplayList = []
            for item in params.get("ReplayList"):
                obj = Replay()
                obj._deserialize(item)
                self.ReplayList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeLiveCourseRequest(AbstractModel):
    """DescribeLiveCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeLiveCourseResponse(AbstractModel):
    """DescribeLiveCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 上课老师id（接入方通讯录中的老师id）
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: int
        :param VisibleScope: 课程学习可见范围属性， 0-公开 1-指定范围
注意：此字段可能返回 null，表示取不到有效值。
        :type VisibleScope: int
        :param Name: 课程名
注意：此字段可能返回 null，表示取不到有效值。
        :type Name: str
        :param LiveUrl: 直播链接
注意：此字段可能返回 null，表示取不到有效值。
        :type LiveUrl: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.TeacherId = None
        self.TermId = None
        self.VisibleScope = None
        self.Name = None
        self.LiveUrl = None
        self.RequestId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        self.VisibleScope = params.get("VisibleScope")
        self.Name = params.get("Name")
        self.LiveUrl = params.get("LiveUrl")
        self.RequestId = params.get("RequestId")


class DescribeLiveCoursesRequest(AbstractModel):
    """DescribeLiveCourses请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程
        :type TeacherId: str
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.Page = None
        self.PageSize = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeLiveCoursesResponse(AbstractModel):
    """DescribeLiveCourses返回参数结构体

    """

    def __init__(self):
        r"""
        :param CourseList: 课程id和教师id列表
        :type CourseList: list of CourseItem
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.CourseList = None
        self.PageNext = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("CourseList") is not None:
            self.CourseList = []
            for item in params.get("CourseList"):
                obj = CourseItem()
                obj._deserialize(item)
                self.CourseList.append(obj)
        self.PageNext = params.get("PageNext")
        self.RequestId = params.get("RequestId")


class DescribeReplayDownloadsRequest(AbstractModel):
    """DescribeReplayDownloads请求参数结构体

    """

    def __init__(self):
        r"""
        :param VId: 视频id
        :type VId: str
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.VId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.VId = params.get("VId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeReplayDownloadsResponse(AbstractModel):
    """DescribeReplayDownloads返回参数结构体

    """

    def __init__(self):
        r"""
        :param DownloadUrl: 无
        :type DownloadUrl: str
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.DownloadUrl = None
        self.RequestId = None


    def _deserialize(self, params):
        self.DownloadUrl = params.get("DownloadUrl")
        self.RequestId = params.get("RequestId")


class DescribeReplaysRequest(AbstractModel):
    """DescribeReplays请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.Page = None
        self.PageSize = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeReplaysResponse(AbstractModel):
    """DescribeReplays返回参数结构体

    """

    def __init__(self):
        r"""
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param ReplayList: 回放列表
        :type ReplayList: list of ReplayItem
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.PageNext = None
        self.ReplayList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.PageNext = params.get("PageNext")
        if params.get("ReplayList") is not None:
            self.ReplayList = []
            for item in params.get("ReplayList"):
                obj = ReplayItem()
                obj._deserialize(item)
                self.ReplayList.append(obj)
        self.RequestId = params.get("RequestId")


class DescribeStudyDataRequest(AbstractModel):
    """DescribeStudyData请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param TermId: 直播间id
        :type TermId: int
        :param TaskId: 课程任务id
        :type TaskId: int
        :param Page: 分页序号，第一页序号为1
        :type Page: int
        :param PageSize: 分页大小，最大分页50
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.TermId = None
        self.TaskId = None
        self.Page = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.TermId = params.get("TermId")
        self.TaskId = params.get("TaskId")
        self.Page = params.get("Page")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class DescribeStudyDataResponse(AbstractModel):
    """DescribeStudyData返回参数结构体

    """

    def __init__(self):
        r"""
        :param StudentList: 考勤信息列表
        :type StudentList: list of StudentInfo
        :param Content: 授课内容
        :type Content: str
        :param StudentCount: 有考勤学生总数
        :type StudentCount: int
        :param PageNext: 下一页序号，当为0时表示没有下一页了
        :type PageNext: int
        :param TaskInfo: 考勤任务详情
        :type TaskInfo: :class:`tencentcloud.tcop.v20210810.models.LiveTaskInfo`
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.StudentList = None
        self.Content = None
        self.StudentCount = None
        self.PageNext = None
        self.TaskInfo = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("StudentList") is not None:
            self.StudentList = []
            for item in params.get("StudentList"):
                obj = StudentInfo()
                obj._deserialize(item)
                self.StudentList.append(obj)
        self.Content = params.get("Content")
        self.StudentCount = params.get("StudentCount")
        self.PageNext = params.get("PageNext")
        if params.get("TaskInfo") is not None:
            self.TaskInfo = LiveTaskInfo()
            self.TaskInfo._deserialize(params.get("TaskInfo"))
        self.RequestId = params.get("RequestId")


class ExamInfo(AbstractModel):
    """题目

    """

    def __init__(self):
        r"""
        :param OptionsCount: 设置的选项个数
        :type OptionsCount: int
        :param ExamId: 题目唯一id
        :type ExamId: int
        :param ExamType: 答题类型 1-单选 2-多选
        :type ExamType: int
        :param ExamTime: 发起答题时间
        :type ExamTime: int
        """
        self.OptionsCount = None
        self.ExamId = None
        self.ExamType = None
        self.ExamTime = None


    def _deserialize(self, params):
        self.OptionsCount = params.get("OptionsCount")
        self.ExamId = params.get("ExamId")
        self.ExamType = params.get("ExamType")
        self.ExamTime = params.get("ExamTime")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class LiveTaskInfo(AbstractModel):
    """任务信息

    """

    def __init__(self):
        r"""
        :param PlayBackNum: 回放观看人数
        :type PlayBackNum: int
        :param LiveTime: 直播时间
        :type LiveTime: int
        :param LiveDuration: 直播时长分钟数
        :type LiveDuration: int
        :param LiveStudentNum: 直播观看人数
        :type LiveStudentNum: int
        """
        self.PlayBackNum = None
        self.LiveTime = None
        self.LiveDuration = None
        self.LiveStudentNum = None


    def _deserialize(self, params):
        self.PlayBackNum = params.get("PlayBackNum")
        self.LiveTime = params.get("LiveTime")
        self.LiveDuration = params.get("LiveDuration")
        self.LiveStudentNum = params.get("LiveStudentNum")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ModifyFastLiveCourseRequest(AbstractModel):
    """ModifyFastLiveCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param VisibleScope: 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
        :type VisibleScope: int
        :param Name: 课程名
        :type Name: str
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.VisibleScope = None
        self.Name = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.VisibleScope = params.get("VisibleScope")
        self.Name = params.get("Name")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ModifyFastLiveCourseResponse(AbstractModel):
    """ModifyFastLiveCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class ModifyFastTeacherRequest(AbstractModel):
    """ModifyFastTeacher请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 接入方通讯录中的老师id
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.TermId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ModifyFastTeacherResponse(AbstractModel):
    """ModifyFastTeacher返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class ModifyLiveCourseAuthorizeRequest(AbstractModel):
    """ModifyLiveCourseAuthorize请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        :param DeptList: 课程可学习部门列表，dept_list和user_list至少2选1
        :type DeptList: list of str
        :param UserList: 课程可学习部门列表，dept_list和user_list至少2选1
        :type UserList: list of str
        """
        self.TermId = None
        self.IdaasOrgId = None
        self.DeptList = None
        self.UserList = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.DeptList = params.get("DeptList")
        self.UserList = params.get("UserList")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ModifyLiveCourseAuthorizeResponse(AbstractModel):
    """ModifyLiveCourseAuthorize返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class ModifyLiveCourseRequest(AbstractModel):
    """ModifyLiveCourse请求参数结构体

    """

    def __init__(self):
        r"""
        :param TermId: 直播间id
        :type TermId: int
        :param VisibleScope: 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
        :type VisibleScope: int
        :param Name: 课程名
        :type Name: str
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TermId = None
        self.VisibleScope = None
        self.Name = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.VisibleScope = params.get("VisibleScope")
        self.Name = params.get("Name")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ModifyLiveCourseResponse(AbstractModel):
    """ModifyLiveCourse返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class ModifyTeacherRequest(AbstractModel):
    """ModifyTeacher请求参数结构体

    """

    def __init__(self):
        r"""
        :param TeacherId: 接入方通讯录中的老师id
        :type TeacherId: str
        :param TermId: 直播间id
        :type TermId: int
        :param IdaasOrgId: 开放平台分配给第三方的千帆id
        :type IdaasOrgId: str
        """
        self.TeacherId = None
        self.TermId = None
        self.IdaasOrgId = None


    def _deserialize(self, params):
        self.TeacherId = params.get("TeacherId")
        self.TermId = params.get("TermId")
        self.IdaasOrgId = params.get("IdaasOrgId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ModifyTeacherResponse(AbstractModel):
    """ModifyTeacher返回参数结构体

    """

    def __init__(self):
        r"""
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.RequestId = None


    def _deserialize(self, params):
        self.RequestId = params.get("RequestId")


class MsgFace(AbstractModel):
    """表情符号

    """

    def __init__(self):
        r"""
        :param Index: 表情符号索引
        :type Index: int
        """
        self.Index = None


    def _deserialize(self, params):
        self.Index = params.get("Index")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class MsgNotOnlineImage(AbstractModel):
    """图片消息

    """

    def __init__(self):
        r"""
        :param PicUrl: 图片链接
        :type PicUrl: str
        """
        self.PicUrl = None


    def _deserialize(self, params):
        self.PicUrl = params.get("PicUrl")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class MsgText(AbstractModel):
    """文本消息内容

    """

    def __init__(self):
        r"""
        :param Str: 文本消息内容
        :type Str: str
        """
        self.Str = None


    def _deserialize(self, params):
        self.Str = params.get("Str")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class PackageTerm(AbstractModel):
    """课程包内具体班级详情

    """

    def __init__(self):
        r"""
        :param CourseId: 课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseId: int
        :param TermId: 班级id
注意：此字段可能返回 null，表示取不到有效值。
        :type TermId: int
        :param TermUrl: 班级url地址
注意：此字段可能返回 null，表示取不到有效值。
        :type TermUrl: str
        """
        self.CourseId = None
        self.TermId = None
        self.TermUrl = None


    def _deserialize(self, params):
        self.CourseId = params.get("CourseId")
        self.TermId = params.get("TermId")
        self.TermUrl = params.get("TermUrl")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ProductID(AbstractModel):
    """产品id

    """

    def __init__(self):
        r"""
        :param Fid: 课程或者课程包id
        :type Fid: str
        :param Type: 类型 course:课程 pkg:课程包
        :type Type: str
        """
        self.Fid = None
        self.Type = None


    def _deserialize(self, params):
        self.Fid = params.get("Fid")
        self.Type = params.get("Type")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ProductInfo(AbstractModel):
    """产品信息

    """

    def __init__(self):
        r"""
        :param Pid: 课程或者课程包id
        :type Pid: :class:`tencentcloud.tcop.v20210810.models.ProductID`
        """
        self.Pid = None


    def _deserialize(self, params):
        if params.get("Pid") is not None:
            self.Pid = ProductID()
            self.Pid._deserialize(params.get("Pid"))
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class Replay(AbstractModel):
    """直播回放

    """

    def __init__(self):
        r"""
        :param Name: 视频名字
        :type Name: str
        :param VId: 视频id
        :type VId: str
        :param Timelen: 回放时长，单位秒
        :type Timelen: str
        :param TaskId: 任务id
        :type TaskId: str
        """
        self.Name = None
        self.VId = None
        self.Timelen = None
        self.TaskId = None


    def _deserialize(self, params):
        self.Name = params.get("Name")
        self.VId = params.get("VId")
        self.Timelen = params.get("Timelen")
        self.TaskId = params.get("TaskId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class ReplayItem(AbstractModel):
    """直播回放

    """

    def __init__(self):
        r"""
        :param Name: 视频名字
        :type Name: str
        :param VId: 视频id
        :type VId: str
        :param TimeLen: 回放时长，单位秒
        :type TimeLen: int
        :param TaskId: 任务id
        :type TaskId: int
        """
        self.Name = None
        self.VId = None
        self.TimeLen = None
        self.TaskId = None


    def _deserialize(self, params):
        self.Name = params.get("Name")
        self.VId = params.get("VId")
        self.TimeLen = params.get("TimeLen")
        self.TaskId = params.get("TaskId")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class SCRMSubCourseInfo(AbstractModel):
    """子课程信息

    """

    def __init__(self):
        r"""
        :param TaskList: 子课程直播任务列表
注意：此字段可能返回 null，表示取不到有效值。
        :type TaskList: list of SCRMTaskInfo
        :param SubCourseId: 子课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type SubCourseId: int
        :param SubCourseName: 子课程名称
注意：此字段可能返回 null，表示取不到有效值。
        :type SubCourseName: str
        """
        self.TaskList = None
        self.SubCourseId = None
        self.SubCourseName = None


    def _deserialize(self, params):
        if params.get("TaskList") is not None:
            self.TaskList = []
            for item in params.get("TaskList"):
                obj = SCRMTaskInfo()
                obj._deserialize(item)
                self.TaskList.append(obj)
        self.SubCourseId = params.get("SubCourseId")
        self.SubCourseName = params.get("SubCourseName")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class SCRMTaskInfo(AbstractModel):
    """直播任务

    """

    def __init__(self):
        r"""
        :param TaskId: 直播任务id
注意：此字段可能返回 null，表示取不到有效值。
        :type TaskId: str
        :param TaskName: 直播名称
注意：此字段可能返回 null，表示取不到有效值。
        :type TaskName: str
        :param ExprFlag: 是否结束
注意：此字段可能返回 null，表示取不到有效值。
        :type ExprFlag: int
        :param TaskType: 直播任务类型
注意：此字段可能返回 null，表示取不到有效值。
        :type TaskType: int
        :param TaskUrl: 直播课程地址
注意：此字段可能返回 null，表示取不到有效值。
        :type TaskUrl: str
        :param Name: 任务名
注意：此字段可能返回 null，表示取不到有效值。
        :type Name: str
        :param StudySpan: 任务学习时常，系统任务无学习时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
        :type StudySpan: int
        :param StudyProgress: 任务学习进度
注意：此字段可能返回 null，表示取不到有效值。
        :type StudyProgress: int
        :param StudyTs: 任务学习时间 时间戳 单位秒
注意：此字段可能返回 null，表示取不到有效值。
        :type StudyTs: int
        """
        self.TaskId = None
        self.TaskName = None
        self.ExprFlag = None
        self.TaskType = None
        self.TaskUrl = None
        self.Name = None
        self.StudySpan = None
        self.StudyProgress = None
        self.StudyTs = None


    def _deserialize(self, params):
        self.TaskId = params.get("TaskId")
        self.TaskName = params.get("TaskName")
        self.ExprFlag = params.get("ExprFlag")
        self.TaskType = params.get("TaskType")
        self.TaskUrl = params.get("TaskUrl")
        self.Name = params.get("Name")
        self.StudySpan = params.get("StudySpan")
        self.StudyProgress = params.get("StudyProgress")
        self.StudyTs = params.get("StudyTs")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class SCRMTermInfo(AbstractModel):
    """课程班级信息

    """

    def __init__(self):
        r"""
        :param TermId: 班级id
注意：此字段可能返回 null，表示取不到有效值。
        :type TermId: int
        :param TermName: 班级名
注意：此字段可能返回 null，表示取不到有效值。
        :type TermName: str
        :param TermUrl: 班级链接
注意：此字段可能返回 null，表示取不到有效值。
        :type TermUrl: str
        :param SignStatus: 招生状态，1：招生中，2：招生结束
注意：此字段可能返回 null，表示取不到有效值。
        :type SignStatus: int
        :param CourseId: 课程id
注意：此字段可能返回 null，表示取不到有效值。
        :type CourseId: int
        :param SignMax: 报名名额限制，0代表无限制
注意：此字段可能返回 null，表示取不到有效值。
        :type SignMax: int
        :param ApplyNum: 班级报名人数
注意：此字段可能返回 null，表示取不到有效值。
        :type ApplyNum: int
        :param SubCourseList: 课程小节
注意：此字段可能返回 null，表示取不到有效值。
        :type SubCourseList: list of SCRMSubCourseInfo
        """
        self.TermId = None
        self.TermName = None
        self.TermUrl = None
        self.SignStatus = None
        self.CourseId = None
        self.SignMax = None
        self.ApplyNum = None
        self.SubCourseList = None


    def _deserialize(self, params):
        self.TermId = params.get("TermId")
        self.TermName = params.get("TermName")
        self.TermUrl = params.get("TermUrl")
        self.SignStatus = params.get("SignStatus")
        self.CourseId = params.get("CourseId")
        self.SignMax = params.get("SignMax")
        self.ApplyNum = params.get("ApplyNum")
        if params.get("SubCourseList") is not None:
            self.SubCourseList = []
            for item in params.get("SubCourseList"):
                obj = SCRMSubCourseInfo()
                obj._deserialize(item)
                self.SubCourseList.append(obj)
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class SearchDeptRequest(AbstractModel):
    """SearchDept请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Keywords: 搜索关键字
        :type Keywords: str
        :param PageIndex: 起始页码
        :type PageIndex: int
        :param PageSize: 分页大小
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.Keywords = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Keywords = params.get("Keywords")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class SearchDeptResponse(AbstractModel):
    """SearchDept返回参数结构体

    """

    def __init__(self):
        r"""
        :param DeptList: 子部门列表
        :type DeptList: list of DeptInfo
        :param Total: 本次结果总数
        :type Total: int
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.DeptList = None
        self.Total = None
        self.RequestId = None


    def _deserialize(self, params):
        if params.get("DeptList") is not None:
            self.DeptList = []
            for item in params.get("DeptList"):
                obj = DeptInfo()
                obj._deserialize(item)
                self.DeptList.append(obj)
        self.Total = params.get("Total")
        self.RequestId = params.get("RequestId")


class SearchDeptUserRequest(AbstractModel):
    """SearchDeptUser请求参数结构体

    """

    def __init__(self):
        r"""
        :param IdaasOrgId: 千帆租户ID
        :type IdaasOrgId: str
        :param Keywords: 搜索关键字
        :type Keywords: str
        :param PageIndex: 起始页码
        :type PageIndex: int
        :param PageSize: 分页大小
        :type PageSize: int
        """
        self.IdaasOrgId = None
        self.Keywords = None
        self.PageIndex = None
        self.PageSize = None


    def _deserialize(self, params):
        self.IdaasOrgId = params.get("IdaasOrgId")
        self.Keywords = params.get("Keywords")
        self.PageIndex = params.get("PageIndex")
        self.PageSize = params.get("PageSize")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class SearchDeptUserResponse(AbstractModel):
    """SearchDeptUser返回参数结构体

    """

    def __init__(self):
        r"""
        :param Total: 本次结果总数
        :type Total: int
        :param UserList: 部门用户列表
        :type UserList: list of DeptUserInfo
        :param RequestId: 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
        :type RequestId: str
        """
        self.Total = None
        self.UserList = None
        self.RequestId = None


    def _deserialize(self, params):
        self.Total = params.get("Total")
        if params.get("UserList") is not None:
            self.UserList = []
            for item in params.get("UserList"):
                obj = DeptUserInfo()
                obj._deserialize(item)
                self.UserList.append(obj)
        self.RequestId = params.get("RequestId")


class ShortCouponInfo(AbstractModel):
    """优惠券简略信息

    """

    def __init__(self):
        r"""
        :param CouponId: 优惠券id
        :type CouponId: str
        :param JumpUrl: 优惠券链接
        :type JumpUrl: str
        """
        self.CouponId = None
        self.JumpUrl = None


    def _deserialize(self, params):
        self.CouponId = params.get("CouponId")
        self.JumpUrl = params.get("JumpUrl")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class StudentInfo(AbstractModel):
    """直播间学生

    """

    def __init__(self):
        r"""
        :param WatchLive: 观看直播时长分钟数，如1309
        :type WatchLive: int
        :param TeacherName: 授课老师
        :type TeacherName: str
        :param StudentId: 学生id
        :type StudentId: str
        :param WatchLiveDuration: 观看回放时长分钟数
        :type WatchLiveDuration: int
        :param IsWatchPlayback: 是否观看回放,1=是，0=否
        :type IsWatchPlayback: int
        :param IsWatchLive: 是否观看直播,1=是，0=否
        :type IsWatchLive: int
        :param StudentName: 学生姓名
        :type StudentName: str
        :param StudentPhone: 学生手机号
        :type StudentPhone: str
        :param StudentPic: 学生头像
        :type StudentPic: str
        :param StudentIndex: 学生序号
        :type StudentIndex: int
        :param EnterLiveTime: 进入直播时间
        :type EnterLiveTime: int
        """
        self.WatchLive = None
        self.TeacherName = None
        self.StudentId = None
        self.WatchLiveDuration = None
        self.IsWatchPlayback = None
        self.IsWatchLive = None
        self.StudentName = None
        self.StudentPhone = None
        self.StudentPic = None
        self.StudentIndex = None
        self.EnterLiveTime = None


    def _deserialize(self, params):
        self.WatchLive = params.get("WatchLive")
        self.TeacherName = params.get("TeacherName")
        self.StudentId = params.get("StudentId")
        self.WatchLiveDuration = params.get("WatchLiveDuration")
        self.IsWatchPlayback = params.get("IsWatchPlayback")
        self.IsWatchLive = params.get("IsWatchLive")
        self.StudentName = params.get("StudentName")
        self.StudentPhone = params.get("StudentPhone")
        self.StudentPic = params.get("StudentPic")
        self.StudentIndex = params.get("StudentIndex")
        self.EnterLiveTime = params.get("EnterLiveTime")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class StudyInfo(AbstractModel):
    """学习任务

    """

    def __init__(self):
        r"""
        :param CourseId: 课程id
        :type CourseId: int
        :param TermId: 班级id
        :type TermId: int
        :param TermStudyProgress: 班级学习进度
        :type TermStudyProgress: int
        :param TotalTaskNumber: 总任务数
        :type TotalTaskNumber: int
        :param StudyTaskNumber: 已学习任务数
        :type StudyTaskNumber: int
        :param SubCourseList: 节列表
        :type SubCourseList: list of SCRMSubCourseInfo
        """
        self.CourseId = None
        self.TermId = None
        self.TermStudyProgress = None
        self.TotalTaskNumber = None
        self.StudyTaskNumber = None
        self.SubCourseList = None


    def _deserialize(self, params):
        self.CourseId = params.get("CourseId")
        self.TermId = params.get("TermId")
        self.TermStudyProgress = params.get("TermStudyProgress")
        self.TotalTaskNumber = params.get("TotalTaskNumber")
        self.StudyTaskNumber = params.get("StudyTaskNumber")
        if params.get("SubCourseList") is not None:
            self.SubCourseList = []
            for item in params.get("SubCourseList"):
                obj = SCRMSubCourseInfo()
                obj._deserialize(item)
                self.SubCourseList.append(obj)
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class Task(AbstractModel):
    """直播课任务

    """

    def __init__(self):
        r"""
        :param Duration: 任务授课时长
注意：此字段可能返回 null，表示取不到有效值。
        :type Duration: str
        :param StartTime: 任务开始时间
        :type StartTime: str
        :param TaskName: 任务名字
        :type TaskName: str
        :param TaskId: 任务id
        :type TaskId: str
        :param EndTime: 任务结束时间
        :type EndTime: str
        """
        self.Duration = None
        self.StartTime = None
        self.TaskName = None
        self.TaskId = None
        self.EndTime = None


    def _deserialize(self, params):
        self.Duration = params.get("Duration")
        self.StartTime = params.get("StartTime")
        self.TaskName = params.get("TaskName")
        self.TaskId = params.get("TaskId")
        self.EndTime = params.get("EndTime")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class TaskInfo(AbstractModel):
    """课程章节具体每一讲信息

    """

    def __init__(self):
        r"""
        :param Name: 每讲名称
注意：此字段可能返回 null，表示取不到有效值。
        :type Name: str
        :param Status: 讲课状态  1待直播  2直播中 3录播
注意：此字段可能返回 null，表示取不到有效值。
        :type Status: int
        :param BeginTime: 开始时间
注意：此字段可能返回 null，表示取不到有效值。
        :type BeginTime: int
        :param EndTime: 直播结束时间
注意：此字段可能返回 null，表示取不到有效值。
        :type EndTime: int
        :param TaskId: 任务id
注意：此字段可能返回 null，表示取不到有效值。
        :type TaskId: str
        :param StudySpan: 任务学习时常，系统任务无学习时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
        :type StudySpan: int
        :param StudyProgress: 任务学习进度
注意：此字段可能返回 null，表示取不到有效值。
        :type StudyProgress: int
        :param StudyTs: 任务学习时间 时间戳 单位秒
注意：此字段可能返回 null，表示取不到有效值。
        :type StudyTs: int
        """
        self.Name = None
        self.Status = None
        self.BeginTime = None
        self.EndTime = None
        self.TaskId = None
        self.StudySpan = None
        self.StudyProgress = None
        self.StudyTs = None


    def _deserialize(self, params):
        self.Name = params.get("Name")
        self.Status = params.get("Status")
        self.BeginTime = params.get("BeginTime")
        self.EndTime = params.get("EndTime")
        self.TaskId = params.get("TaskId")
        self.StudySpan = params.get("StudySpan")
        self.StudyProgress = params.get("StudyProgress")
        self.StudyTs = params.get("StudyTs")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class TaskItem(AbstractModel):
    """直播课任务

    """

    def __init__(self):
        r"""
        :param Duration: 任务授课时长
        :type Duration: int
        :param StartTime: 任务开始时间
        :type StartTime: int
        :param TaskName: 任务名字
        :type TaskName: str
        :param TaskId: 任务id
        :type TaskId: int
        :param EndTime: 任务结束时间
        :type EndTime: int
        """
        self.Duration = None
        self.StartTime = None
        self.TaskName = None
        self.TaskId = None
        self.EndTime = None


    def _deserialize(self, params):
        self.Duration = params.get("Duration")
        self.StartTime = params.get("StartTime")
        self.TaskName = params.get("TaskName")
        self.TaskId = params.get("TaskId")
        self.EndTime = params.get("EndTime")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class UserApply(AbstractModel):
    """机构学员报名关系

    """

    def __init__(self):
        r"""
        :param CourseId: 课程id
        :type CourseId: int
        :param TermId: 班级id
        :type TermId: int
        :param ApplyTs: 报名时间
        :type ApplyTs: int
        :param OrderId: 订单id
        :type OrderId: str
        :param TermUrl: 期次url
        :type TermUrl: str
        """
        self.CourseId = None
        self.TermId = None
        self.ApplyTs = None
        self.OrderId = None
        self.TermUrl = None


    def _deserialize(self, params):
        self.CourseId = params.get("CourseId")
        self.TermId = params.get("TermId")
        self.ApplyTs = params.get("ApplyTs")
        self.OrderId = params.get("OrderId")
        self.TermUrl = params.get("TermUrl")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class UserInfo(AbstractModel):
    """用户信息

    """

    def __init__(self):
        r"""
        :param Openid: 开放平台id
        :type Openid: str
        :param Nickname: 昵称
        :type Nickname: str
        :param ErrCode: 错误码
        :type ErrCode: int
        :param ErrMsg: 错误信息
        :type ErrMsg: str
        """
        self.Openid = None
        self.Nickname = None
        self.ErrCode = None
        self.ErrMsg = None


    def _deserialize(self, params):
        self.Openid = params.get("Openid")
        self.Nickname = params.get("Nickname")
        self.ErrCode = params.get("ErrCode")
        self.ErrMsg = params.get("ErrMsg")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        


class UserOrder(AbstractModel):
    """用户订单信息

    """

    def __init__(self):
        r"""
        :param OrderId: 订单号
        :type OrderId: str
        :param CourseId: 课程ID
        :type CourseId: int
        :param PackageId: 课程包ID
        :type PackageId: int
        :param CourseName: 课程名称
        :type CourseName: str
        :param TermId: 班级ID
        :type TermId: int
        :param CoursePrice: 课程价格 ,单位为分
        :type CoursePrice: int
        :param OpenId: 用户openID
        :type OpenId: str
        :param CreateTime: 创建订单的 Unix 时间戳， 单位为秒
        :type CreateTime: int
        :param OrderState: 订单状态， 1为待付款，2为支付成功，3为发货成功，4为发货失败，5为交易成功，6为交易待确认，7为交易待审核，8为退款中，9为退款确认，10为退款成功，11为退款拒绝，300为机构退款
        :type OrderState: int
        :param PayPrice: 实付金额 ,单位为分
        :type PayPrice: int
        :param PayTime: 支付时间 , unix时间戳，单位为秒
        :type PayTime: int
        """
        self.OrderId = None
        self.CourseId = None
        self.PackageId = None
        self.CourseName = None
        self.TermId = None
        self.CoursePrice = None
        self.OpenId = None
        self.CreateTime = None
        self.OrderState = None
        self.PayPrice = None
        self.PayTime = None


    def _deserialize(self, params):
        self.OrderId = params.get("OrderId")
        self.CourseId = params.get("CourseId")
        self.PackageId = params.get("PackageId")
        self.CourseName = params.get("CourseName")
        self.TermId = params.get("TermId")
        self.CoursePrice = params.get("CoursePrice")
        self.OpenId = params.get("OpenId")
        self.CreateTime = params.get("CreateTime")
        self.OrderState = params.get("OrderState")
        self.PayPrice = params.get("PayPrice")
        self.PayTime = params.get("PayTime")
        memeber_set = set(params.keys())
        for name, value in vars(self).items():
            if name in memeber_set:
                memeber_set.remove(name)
        if len(memeber_set) > 0:
            warnings.warn("%s fileds are useless." % ",".join(memeber_set))
        