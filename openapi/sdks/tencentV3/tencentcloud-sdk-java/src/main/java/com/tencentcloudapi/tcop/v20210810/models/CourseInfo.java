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
package com.tencentcloudapi.tcop.v20210810.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CourseInfo extends AbstractModel{

    /**
    * 课程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 课程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 讲师ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TeacherList")
    @Expose
    private Long [] TeacherList;

    /**
    * 机构id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyId")
    @Expose
    private Long AgencyId;

    /**
    * 课程封面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PicUrl")
    @Expose
    private String PicUrl;

    /**
    * 费用类型id  1免费 2付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayId")
    @Expose
    private Long PayId;

    /**
    * 试听标志   付费课  0不可试听，1可试听
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenFlag")
    @Expose
    private Long ListenFlag;

    /**
    * 课程一级类目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndustryFirst")
    @Expose
    private Long IndustryFirst;

    /**
    * 课程二级类目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndustrySecond")
    @Expose
    private Long IndustrySecond;

    /**
    * 课程三级类目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndustryThird")
    @Expose
    private Long IndustryThird;

    /**
    * 课程开始时间 仅直播
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 课程价格  单位为“分”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 课程简介
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Introduce")
    @Expose
    private String Introduce;

    /**
    * IOS课点价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IosPrice")
    @Expose
    private Long IosPrice;

    /**
    * 讲师名称  c_te_list id 转换为名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TeacherNameList")
    @Expose
    private String [] TeacherNameList;

    /**
    * 机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AidName")
    @Expose
    private String AidName;

    /**
    * 授课方式  0-录播，1-直播 t_online_term    t_bit_flag第14位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 最近在学人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecentLearnNum")
    @Expose
    private Long RecentLearnNum;

    /**
    * 课时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lesson")
    @Expose
    private Long Lesson;

    /**
    * 好评度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 报名人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyNum")
    @Expose
    private Long ApplyNum;

    /**
    * 收藏人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoreNum")
    @Expose
    private Long StoreNum;

    /**
    * 课程章节信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChapterInfo")
    @Expose
    private ChapterInfo [] ChapterInfo;

    /**
    * 是否处于直播状态 默认0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBeing")
    @Expose
    private Long IsBeing;

    /**
    * 报名截止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignEndTime")
    @Expose
    private Long SignEndTime;

    /**
    * 最近直播间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecentLiveTermId")
    @Expose
    private Long RecentLiveTermId;

    /**
    * 直播间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
     * Get 课程id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseId 课程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseId 课程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 课程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 课程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 课程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 课程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 讲师ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TeacherList 讲师ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getTeacherList() {
        return this.TeacherList;
    }

    /**
     * Set 讲师ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TeacherList 讲师ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTeacherList(Long [] TeacherList) {
        this.TeacherList = TeacherList;
    }

    /**
     * Get 机构id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyId 机构id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAgencyId() {
        return this.AgencyId;
    }

    /**
     * Set 机构id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyId 机构id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyId(Long AgencyId) {
        this.AgencyId = AgencyId;
    }

    /**
     * Get 课程封面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PicUrl 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPicUrl() {
        return this.PicUrl;
    }

    /**
     * Set 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     * @param PicUrl 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPicUrl(String PicUrl) {
        this.PicUrl = PicUrl;
    }

    /**
     * Get 费用类型id  1免费 2付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayId 费用类型id  1免费 2付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayId() {
        return this.PayId;
    }

    /**
     * Set 费用类型id  1免费 2付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayId 费用类型id  1免费 2付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayId(Long PayId) {
        this.PayId = PayId;
    }

    /**
     * Get 试听标志   付费课  0不可试听，1可试听
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenFlag 试听标志   付费课  0不可试听，1可试听
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getListenFlag() {
        return this.ListenFlag;
    }

    /**
     * Set 试听标志   付费课  0不可试听，1可试听
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenFlag 试听标志   付费课  0不可试听，1可试听
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenFlag(Long ListenFlag) {
        this.ListenFlag = ListenFlag;
    }

    /**
     * Get 课程一级类目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndustryFirst 课程一级类目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndustryFirst() {
        return this.IndustryFirst;
    }

    /**
     * Set 课程一级类目
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndustryFirst 课程一级类目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustryFirst(Long IndustryFirst) {
        this.IndustryFirst = IndustryFirst;
    }

    /**
     * Get 课程二级类目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndustrySecond 课程二级类目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndustrySecond() {
        return this.IndustrySecond;
    }

    /**
     * Set 课程二级类目
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndustrySecond 课程二级类目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustrySecond(Long IndustrySecond) {
        this.IndustrySecond = IndustrySecond;
    }

    /**
     * Get 课程三级类目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndustryThird 课程三级类目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndustryThird() {
        return this.IndustryThird;
    }

    /**
     * Set 课程三级类目
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndustryThird 课程三级类目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustryThird(Long IndustryThird) {
        this.IndustryThird = IndustryThird;
    }

    /**
     * Get 课程开始时间 仅直播
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 课程开始时间 仅直播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 课程开始时间 仅直播
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 课程开始时间 仅直播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 课程价格  单位为“分”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Price 课程价格  单位为“分”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 课程价格  单位为“分”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Price 课程价格  单位为“分”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 课程简介
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Introduce 课程简介
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntroduce() {
        return this.Introduce;
    }

    /**
     * Set 课程简介
注意：此字段可能返回 null，表示取不到有效值。
     * @param Introduce 课程简介
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntroduce(String Introduce) {
        this.Introduce = Introduce;
    }

    /**
     * Get IOS课点价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IosPrice IOS课点价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIosPrice() {
        return this.IosPrice;
    }

    /**
     * Set IOS课点价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param IosPrice IOS课点价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIosPrice(Long IosPrice) {
        this.IosPrice = IosPrice;
    }

    /**
     * Get 讲师名称  c_te_list id 转换为名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TeacherNameList 讲师名称  c_te_list id 转换为名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTeacherNameList() {
        return this.TeacherNameList;
    }

    /**
     * Set 讲师名称  c_te_list id 转换为名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param TeacherNameList 讲师名称  c_te_list id 转换为名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTeacherNameList(String [] TeacherNameList) {
        this.TeacherNameList = TeacherNameList;
    }

    /**
     * Get 机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AidName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAidName() {
        return this.AidName;
    }

    /**
     * Set 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AidName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAidName(String AidName) {
        this.AidName = AidName;
    }

    /**
     * Get 授课方式  0-录播，1-直播 t_online_term    t_bit_flag第14位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 授课方式  0-录播，1-直播 t_online_term    t_bit_flag第14位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 授课方式  0-录播，1-直播 t_online_term    t_bit_flag第14位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 授课方式  0-录播，1-直播 t_online_term    t_bit_flag第14位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 最近在学人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecentLearnNum 最近在学人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecentLearnNum() {
        return this.RecentLearnNum;
    }

    /**
     * Set 最近在学人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecentLearnNum 最近在学人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecentLearnNum(Long RecentLearnNum) {
        this.RecentLearnNum = RecentLearnNum;
    }

    /**
     * Get 课时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lesson 课时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLesson() {
        return this.Lesson;
    }

    /**
     * Set 课时
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lesson 课时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLesson(Long Lesson) {
        this.Lesson = Lesson;
    }

    /**
     * Get 好评度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 好评度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 好评度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 好评度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 报名人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyNum 报名人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplyNum() {
        return this.ApplyNum;
    }

    /**
     * Set 报名人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyNum 报名人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyNum(Long ApplyNum) {
        this.ApplyNum = ApplyNum;
    }

    /**
     * Get 收藏人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoreNum 收藏人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoreNum() {
        return this.StoreNum;
    }

    /**
     * Set 收藏人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoreNum 收藏人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoreNum(Long StoreNum) {
        this.StoreNum = StoreNum;
    }

    /**
     * Get 课程章节信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChapterInfo 课程章节信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChapterInfo [] getChapterInfo() {
        return this.ChapterInfo;
    }

    /**
     * Set 课程章节信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChapterInfo 课程章节信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChapterInfo(ChapterInfo [] ChapterInfo) {
        this.ChapterInfo = ChapterInfo;
    }

    /**
     * Get 是否处于直播状态 默认0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBeing 是否处于直播状态 默认0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsBeing() {
        return this.IsBeing;
    }

    /**
     * Set 是否处于直播状态 默认0
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBeing 是否处于直播状态 默认0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBeing(Long IsBeing) {
        this.IsBeing = IsBeing;
    }

    /**
     * Get 报名截止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignEndTime 报名截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSignEndTime() {
        return this.SignEndTime;
    }

    /**
     * Set 报名截止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignEndTime 报名截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignEndTime(Long SignEndTime) {
        this.SignEndTime = SignEndTime;
    }

    /**
     * Get 最近直播间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecentLiveTermId 最近直播间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecentLiveTermId() {
        return this.RecentLiveTermId;
    }

    /**
     * Set 最近直播间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecentLiveTermId 最近直播间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecentLiveTermId(Long RecentLiveTermId) {
        this.RecentLiveTermId = RecentLiveTermId;
    }

    /**
     * Get 直播间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomId 直播间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 直播间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomId 直播间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    public CourseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CourseInfo(CourseInfo source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TeacherList != null) {
            this.TeacherList = new Long[source.TeacherList.length];
            for (int i = 0; i < source.TeacherList.length; i++) {
                this.TeacherList[i] = new Long(source.TeacherList[i]);
            }
        }
        if (source.AgencyId != null) {
            this.AgencyId = new Long(source.AgencyId);
        }
        if (source.PicUrl != null) {
            this.PicUrl = new String(source.PicUrl);
        }
        if (source.PayId != null) {
            this.PayId = new Long(source.PayId);
        }
        if (source.ListenFlag != null) {
            this.ListenFlag = new Long(source.ListenFlag);
        }
        if (source.IndustryFirst != null) {
            this.IndustryFirst = new Long(source.IndustryFirst);
        }
        if (source.IndustrySecond != null) {
            this.IndustrySecond = new Long(source.IndustrySecond);
        }
        if (source.IndustryThird != null) {
            this.IndustryThird = new Long(source.IndustryThird);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.Introduce != null) {
            this.Introduce = new String(source.Introduce);
        }
        if (source.IosPrice != null) {
            this.IosPrice = new Long(source.IosPrice);
        }
        if (source.TeacherNameList != null) {
            this.TeacherNameList = new String[source.TeacherNameList.length];
            for (int i = 0; i < source.TeacherNameList.length; i++) {
                this.TeacherNameList[i] = new String(source.TeacherNameList[i]);
            }
        }
        if (source.AidName != null) {
            this.AidName = new String(source.AidName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RecentLearnNum != null) {
            this.RecentLearnNum = new Long(source.RecentLearnNum);
        }
        if (source.Lesson != null) {
            this.Lesson = new Long(source.Lesson);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.ApplyNum != null) {
            this.ApplyNum = new Long(source.ApplyNum);
        }
        if (source.StoreNum != null) {
            this.StoreNum = new Long(source.StoreNum);
        }
        if (source.ChapterInfo != null) {
            this.ChapterInfo = new ChapterInfo[source.ChapterInfo.length];
            for (int i = 0; i < source.ChapterInfo.length; i++) {
                this.ChapterInfo[i] = new ChapterInfo(source.ChapterInfo[i]);
            }
        }
        if (source.IsBeing != null) {
            this.IsBeing = new Long(source.IsBeing);
        }
        if (source.SignEndTime != null) {
            this.SignEndTime = new Long(source.SignEndTime);
        }
        if (source.RecentLiveTermId != null) {
            this.RecentLiveTermId = new Long(source.RecentLiveTermId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "TeacherList.", this.TeacherList);
        this.setParamSimple(map, prefix + "AgencyId", this.AgencyId);
        this.setParamSimple(map, prefix + "PicUrl", this.PicUrl);
        this.setParamSimple(map, prefix + "PayId", this.PayId);
        this.setParamSimple(map, prefix + "ListenFlag", this.ListenFlag);
        this.setParamSimple(map, prefix + "IndustryFirst", this.IndustryFirst);
        this.setParamSimple(map, prefix + "IndustrySecond", this.IndustrySecond);
        this.setParamSimple(map, prefix + "IndustryThird", this.IndustryThird);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Introduce", this.Introduce);
        this.setParamSimple(map, prefix + "IosPrice", this.IosPrice);
        this.setParamArraySimple(map, prefix + "TeacherNameList.", this.TeacherNameList);
        this.setParamSimple(map, prefix + "AidName", this.AidName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RecentLearnNum", this.RecentLearnNum);
        this.setParamSimple(map, prefix + "Lesson", this.Lesson);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "ApplyNum", this.ApplyNum);
        this.setParamSimple(map, prefix + "StoreNum", this.StoreNum);
        this.setParamArrayObj(map, prefix + "ChapterInfo.", this.ChapterInfo);
        this.setParamSimple(map, prefix + "IsBeing", this.IsBeing);
        this.setParamSimple(map, prefix + "SignEndTime", this.SignEndTime);
        this.setParamSimple(map, prefix + "RecentLiveTermId", this.RecentLiveTermId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

