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

public class PackageTerm extends AbstractModel{

    /**
    * 课程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 班级id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 班级url地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermUrl")
    @Expose
    private String TermUrl;

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
     * Get 班级url地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermUrl 班级url地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTermUrl() {
        return this.TermUrl;
    }

    /**
     * Set 班级url地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermUrl 班级url地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermUrl(String TermUrl) {
        this.TermUrl = TermUrl;
    }

    public PackageTerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageTerm(PackageTerm source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.TermUrl != null) {
            this.TermUrl = new String(source.TermUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "TermUrl", this.TermUrl);

    }
}

