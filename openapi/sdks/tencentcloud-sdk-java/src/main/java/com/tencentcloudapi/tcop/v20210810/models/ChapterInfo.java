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

public class ChapterInfo extends AbstractModel{

    /**
    * 课程包信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubInfo")
    @Expose
    private TaskInfo [] SubInfo;

    /**
    * 章节名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 课程包id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 机构id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyId")
    @Expose
    private Long AgencyId;

    /**
    * 课程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
     * Get 课程包信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubInfo 课程包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskInfo [] getSubInfo() {
        return this.SubInfo;
    }

    /**
     * Set 课程包信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubInfo 课程包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubInfo(TaskInfo [] SubInfo) {
        this.SubInfo = SubInfo;
    }

    /**
     * Get 章节名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 章节名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 章节名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 章节名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 课程包id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermId 课程包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 课程包id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermId 课程包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
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

    public ChapterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChapterInfo(ChapterInfo source) {
        if (source.SubInfo != null) {
            this.SubInfo = new TaskInfo[source.SubInfo.length];
            for (int i = 0; i < source.SubInfo.length; i++) {
                this.SubInfo[i] = new TaskInfo(source.SubInfo[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.AgencyId != null) {
            this.AgencyId = new Long(source.AgencyId);
        }
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubInfo.", this.SubInfo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "AgencyId", this.AgencyId);
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);

    }
}

