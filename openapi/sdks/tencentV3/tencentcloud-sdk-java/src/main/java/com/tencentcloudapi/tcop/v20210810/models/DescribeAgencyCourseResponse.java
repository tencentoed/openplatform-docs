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

public class DescribeAgencyCourseResponse extends AbstractModel{

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
    * 课程封面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 课程价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 课程url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseUrl")
    @Expose
    private String CourseUrl;

    /**
    * 班级列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermList")
    @Expose
    private SCRMTermInfo [] TermList;

    /**
    * 课程报名人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyNum")
    @Expose
    private Long ApplyNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 课程url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseUrl 课程url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCourseUrl() {
        return this.CourseUrl;
    }

    /**
     * Set 课程url
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseUrl 课程url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseUrl(String CourseUrl) {
        this.CourseUrl = CourseUrl;
    }

    /**
     * Get 班级列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermList 班级列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SCRMTermInfo [] getTermList() {
        return this.TermList;
    }

    /**
     * Set 班级列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermList 班级列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermList(SCRMTermInfo [] TermList) {
        this.TermList = TermList;
    }

    /**
     * Get 课程报名人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyNum 课程报名人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplyNum() {
        return this.ApplyNum;
    }

    /**
     * Set 课程报名人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyNum 课程报名人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyNum(Long ApplyNum) {
        this.ApplyNum = ApplyNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAgencyCourseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyCourseResponse(DescribeAgencyCourseResponse source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.CourseName != null) {
            this.CourseName = new String(source.CourseName);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.CourseUrl != null) {
            this.CourseUrl = new String(source.CourseUrl);
        }
        if (source.TermList != null) {
            this.TermList = new SCRMTermInfo[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new SCRMTermInfo(source.TermList[i]);
            }
        }
        if (source.ApplyNum != null) {
            this.ApplyNum = new Long(source.ApplyNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "CourseName", this.CourseName);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "CourseUrl", this.CourseUrl);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "ApplyNum", this.ApplyNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

