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

public class AgencyCourseInfo extends AbstractModel{

    /**
    * 机构ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyId")
    @Expose
    private Long AgencyId;

    /**
    * 机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyName")
    @Expose
    private String AgencyName;

    /**
    * 机构封面url,没有http开头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyCoverUrl")
    @Expose
    private String AgencyCoverUrl;

    /**
    * 机构域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyDomain")
    @Expose
    private String AgencyDomain;

    /**
    * 课程ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 课程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseName")
    @Expose
    private String CourseName;

    /**
    * 课程封面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseCoverUrl")
    @Expose
    private String CourseCoverUrl;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseBeginTime")
    @Expose
    private Long CourseBeginTime;

    /**
    * 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseEndTime")
    @Expose
    private Long CourseEndTime;

    /**
    * 课程IOS平台价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseIosPrice")
    @Expose
    private Long CourseIosPrice;

    /**
    * 课程价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoursePrice")
    @Expose
    private Long CoursePrice;

    /**
    * 类型 0:课程 1:课程包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseType")
    @Expose
    private Long CourseType;

    /**
    * 课程收费类型1：免费 2：付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoursePayType")
    @Expose
    private Long CoursePayType;

    /**
    * 收藏时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FavTime")
    @Expose
    private Long FavTime;

    /**
     * Get 机构ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyId 机构ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAgencyId() {
        return this.AgencyId;
    }

    /**
     * Set 机构ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyId 机构ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyId(Long AgencyId) {
        this.AgencyId = AgencyId;
    }

    /**
     * Get 机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgencyName() {
        return this.AgencyName;
    }

    /**
     * Set 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }

    /**
     * Get 机构封面url,没有http开头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyCoverUrl 机构封面url,没有http开头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgencyCoverUrl() {
        return this.AgencyCoverUrl;
    }

    /**
     * Set 机构封面url,没有http开头
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyCoverUrl 机构封面url,没有http开头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyCoverUrl(String AgencyCoverUrl) {
        this.AgencyCoverUrl = AgencyCoverUrl;
    }

    /**
     * Get 机构域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyDomain 机构域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgencyDomain() {
        return this.AgencyDomain;
    }

    /**
     * Set 机构域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyDomain 机构域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyDomain(String AgencyDomain) {
        this.AgencyDomain = AgencyDomain;
    }

    /**
     * Get 课程ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseId 课程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseId 课程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 课程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseName 课程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCourseName() {
        return this.CourseName;
    }

    /**
     * Set 课程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseName 课程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     * Get 课程封面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseCoverUrl 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCourseCoverUrl() {
        return this.CourseCoverUrl;
    }

    /**
     * Set 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseCoverUrl 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseCoverUrl(String CourseCoverUrl) {
        this.CourseCoverUrl = CourseCoverUrl;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseBeginTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCourseBeginTime() {
        return this.CourseBeginTime;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseBeginTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseBeginTime(Long CourseBeginTime) {
        this.CourseBeginTime = CourseBeginTime;
    }

    /**
     * Get 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseEndTime 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCourseEndTime() {
        return this.CourseEndTime;
    }

    /**
     * Set 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseEndTime 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseEndTime(Long CourseEndTime) {
        this.CourseEndTime = CourseEndTime;
    }

    /**
     * Get 课程IOS平台价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseIosPrice 课程IOS平台价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCourseIosPrice() {
        return this.CourseIosPrice;
    }

    /**
     * Set 课程IOS平台价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseIosPrice 课程IOS平台价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseIosPrice(Long CourseIosPrice) {
        this.CourseIosPrice = CourseIosPrice;
    }

    /**
     * Get 课程价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoursePrice 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoursePrice() {
        return this.CoursePrice;
    }

    /**
     * Set 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoursePrice 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoursePrice(Long CoursePrice) {
        this.CoursePrice = CoursePrice;
    }

    /**
     * Get 类型 0:课程 1:课程包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseType 类型 0:课程 1:课程包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCourseType() {
        return this.CourseType;
    }

    /**
     * Set 类型 0:课程 1:课程包
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseType 类型 0:课程 1:课程包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseType(Long CourseType) {
        this.CourseType = CourseType;
    }

    /**
     * Get 课程收费类型1：免费 2：付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoursePayType 课程收费类型1：免费 2：付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoursePayType() {
        return this.CoursePayType;
    }

    /**
     * Set 课程收费类型1：免费 2：付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoursePayType 课程收费类型1：免费 2：付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoursePayType(Long CoursePayType) {
        this.CoursePayType = CoursePayType;
    }

    /**
     * Get 收藏时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FavTime 收藏时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFavTime() {
        return this.FavTime;
    }

    /**
     * Set 收藏时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FavTime 收藏时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFavTime(Long FavTime) {
        this.FavTime = FavTime;
    }

    public AgencyCourseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgencyCourseInfo(AgencyCourseInfo source) {
        if (source.AgencyId != null) {
            this.AgencyId = new Long(source.AgencyId);
        }
        if (source.AgencyName != null) {
            this.AgencyName = new String(source.AgencyName);
        }
        if (source.AgencyCoverUrl != null) {
            this.AgencyCoverUrl = new String(source.AgencyCoverUrl);
        }
        if (source.AgencyDomain != null) {
            this.AgencyDomain = new String(source.AgencyDomain);
        }
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.CourseName != null) {
            this.CourseName = new String(source.CourseName);
        }
        if (source.CourseCoverUrl != null) {
            this.CourseCoverUrl = new String(source.CourseCoverUrl);
        }
        if (source.CourseBeginTime != null) {
            this.CourseBeginTime = new Long(source.CourseBeginTime);
        }
        if (source.CourseEndTime != null) {
            this.CourseEndTime = new Long(source.CourseEndTime);
        }
        if (source.CourseIosPrice != null) {
            this.CourseIosPrice = new Long(source.CourseIosPrice);
        }
        if (source.CoursePrice != null) {
            this.CoursePrice = new Long(source.CoursePrice);
        }
        if (source.CourseType != null) {
            this.CourseType = new Long(source.CourseType);
        }
        if (source.CoursePayType != null) {
            this.CoursePayType = new Long(source.CoursePayType);
        }
        if (source.FavTime != null) {
            this.FavTime = new Long(source.FavTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgencyId", this.AgencyId);
        this.setParamSimple(map, prefix + "AgencyName", this.AgencyName);
        this.setParamSimple(map, prefix + "AgencyCoverUrl", this.AgencyCoverUrl);
        this.setParamSimple(map, prefix + "AgencyDomain", this.AgencyDomain);
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "CourseName", this.CourseName);
        this.setParamSimple(map, prefix + "CourseCoverUrl", this.CourseCoverUrl);
        this.setParamSimple(map, prefix + "CourseBeginTime", this.CourseBeginTime);
        this.setParamSimple(map, prefix + "CourseEndTime", this.CourseEndTime);
        this.setParamSimple(map, prefix + "CourseIosPrice", this.CourseIosPrice);
        this.setParamSimple(map, prefix + "CoursePrice", this.CoursePrice);
        this.setParamSimple(map, prefix + "CourseType", this.CourseType);
        this.setParamSimple(map, prefix + "CoursePayType", this.CoursePayType);
        this.setParamSimple(map, prefix + "FavTime", this.FavTime);

    }
}

