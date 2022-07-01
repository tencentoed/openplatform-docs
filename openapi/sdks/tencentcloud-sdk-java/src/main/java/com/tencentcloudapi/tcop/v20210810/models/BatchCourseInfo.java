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

public class BatchCourseInfo extends AbstractModel{

    /**
    * 课程id
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
    * 0：课程，1：系列课
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InfoType")
    @Expose
    private Long InfoType;

    /**
    * 课程价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 课程封面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 课程链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseUrl")
    @Expose
    private String CourseUrl;

    /**
    * 报名人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyNum")
    @Expose
    private Long ApplyNum;

    /**
    * 招生状态，系列课使用该字段，课程使用班级中的招生状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignStatus")
    @Expose
    private Long SignStatus;

    /**
    * 班级列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermList")
    @Expose
    private Task [] TermList;

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
     * Get 0：课程，1：系列课
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InfoType 0：课程，1：系列课
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 0：课程，1：系列课
注意：此字段可能返回 null，表示取不到有效值。
     * @param InfoType 0：课程，1：系列课
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfoType(Long InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 课程价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Price 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Price 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 课程封面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverUrl 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverUrl 课程封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 课程链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseUrl 课程链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCourseUrl() {
        return this.CourseUrl;
    }

    /**
     * Set 课程链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseUrl 课程链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseUrl(String CourseUrl) {
        this.CourseUrl = CourseUrl;
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
     * Get 招生状态，系列课使用该字段，课程使用班级中的招生状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignStatus 招生状态，系列课使用该字段，课程使用班级中的招生状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSignStatus() {
        return this.SignStatus;
    }

    /**
     * Set 招生状态，系列课使用该字段，课程使用班级中的招生状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignStatus 招生状态，系列课使用该字段，课程使用班级中的招生状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignStatus(Long SignStatus) {
        this.SignStatus = SignStatus;
    }

    /**
     * Get 班级列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermList 班级列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Task [] getTermList() {
        return this.TermList;
    }

    /**
     * Set 班级列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermList 班级列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermList(Task [] TermList) {
        this.TermList = TermList;
    }

    public BatchCourseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCourseInfo(BatchCourseInfo source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.CourseName != null) {
            this.CourseName = new String(source.CourseName);
        }
        if (source.InfoType != null) {
            this.InfoType = new Long(source.InfoType);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.CourseUrl != null) {
            this.CourseUrl = new String(source.CourseUrl);
        }
        if (source.ApplyNum != null) {
            this.ApplyNum = new Long(source.ApplyNum);
        }
        if (source.SignStatus != null) {
            this.SignStatus = new Long(source.SignStatus);
        }
        if (source.TermList != null) {
            this.TermList = new Task[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new Task(source.TermList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "CourseName", this.CourseName);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "CourseUrl", this.CourseUrl);
        this.setParamSimple(map, prefix + "ApplyNum", this.ApplyNum);
        this.setParamSimple(map, prefix + "SignStatus", this.SignStatus);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);

    }
}

