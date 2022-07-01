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

public class SCRMTermInfo extends AbstractModel{

    /**
    * 班级id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 班级名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermName")
    @Expose
    private String TermName;

    /**
    * 班级链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermUrl")
    @Expose
    private String TermUrl;

    /**
    * 招生状态，1：招生中，2：招生结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignStatus")
    @Expose
    private Long SignStatus;

    /**
    * 课程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 报名名额限制，0代表无限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignMax")
    @Expose
    private Long SignMax;

    /**
    * 班级报名人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyNum")
    @Expose
    private Long ApplyNum;

    /**
    * 课程小节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubCourseList")
    @Expose
    private SCRMSubCourseInfo [] SubCourseList;

    /**
     * Get 班级id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermId 班级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermId 班级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 班级名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermName 班级名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTermName() {
        return this.TermName;
    }

    /**
     * Set 班级名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermName 班级名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermName(String TermName) {
        this.TermName = TermName;
    }

    /**
     * Get 班级链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermUrl 班级链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTermUrl() {
        return this.TermUrl;
    }

    /**
     * Set 班级链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermUrl 班级链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermUrl(String TermUrl) {
        this.TermUrl = TermUrl;
    }

    /**
     * Get 招生状态，1：招生中，2：招生结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignStatus 招生状态，1：招生中，2：招生结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSignStatus() {
        return this.SignStatus;
    }

    /**
     * Set 招生状态，1：招生中，2：招生结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignStatus 招生状态，1：招生中，2：招生结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignStatus(Long SignStatus) {
        this.SignStatus = SignStatus;
    }

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
     * Get 报名名额限制，0代表无限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignMax 报名名额限制，0代表无限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSignMax() {
        return this.SignMax;
    }

    /**
     * Set 报名名额限制，0代表无限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignMax 报名名额限制，0代表无限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignMax(Long SignMax) {
        this.SignMax = SignMax;
    }

    /**
     * Get 班级报名人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyNum 班级报名人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplyNum() {
        return this.ApplyNum;
    }

    /**
     * Set 班级报名人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyNum 班级报名人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyNum(Long ApplyNum) {
        this.ApplyNum = ApplyNum;
    }

    /**
     * Get 课程小节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubCourseList 课程小节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SCRMSubCourseInfo [] getSubCourseList() {
        return this.SubCourseList;
    }

    /**
     * Set 课程小节
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubCourseList 课程小节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubCourseList(SCRMSubCourseInfo [] SubCourseList) {
        this.SubCourseList = SubCourseList;
    }

    public SCRMTermInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCRMTermInfo(SCRMTermInfo source) {
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.TermName != null) {
            this.TermName = new String(source.TermName);
        }
        if (source.TermUrl != null) {
            this.TermUrl = new String(source.TermUrl);
        }
        if (source.SignStatus != null) {
            this.SignStatus = new Long(source.SignStatus);
        }
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.SignMax != null) {
            this.SignMax = new Long(source.SignMax);
        }
        if (source.ApplyNum != null) {
            this.ApplyNum = new Long(source.ApplyNum);
        }
        if (source.SubCourseList != null) {
            this.SubCourseList = new SCRMSubCourseInfo[source.SubCourseList.length];
            for (int i = 0; i < source.SubCourseList.length; i++) {
                this.SubCourseList[i] = new SCRMSubCourseInfo(source.SubCourseList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "TermName", this.TermName);
        this.setParamSimple(map, prefix + "TermUrl", this.TermUrl);
        this.setParamSimple(map, prefix + "SignStatus", this.SignStatus);
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "SignMax", this.SignMax);
        this.setParamSimple(map, prefix + "ApplyNum", this.ApplyNum);
        this.setParamArrayObj(map, prefix + "SubCourseList.", this.SubCourseList);

    }
}

