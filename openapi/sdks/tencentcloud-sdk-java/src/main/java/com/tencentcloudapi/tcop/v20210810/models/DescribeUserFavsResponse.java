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

public class DescribeUserFavsResponse extends AbstractModel{

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 机构课程信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyCourseInfos")
    @Expose
    private AgencyCourseInfo [] AgencyCourseInfos;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPage 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPage 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 机构课程信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyCourseInfos 机构课程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgencyCourseInfo [] getAgencyCourseInfos() {
        return this.AgencyCourseInfos;
    }

    /**
     * Set 机构课程信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyCourseInfos 机构课程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyCourseInfos(AgencyCourseInfo [] AgencyCourseInfos) {
        this.AgencyCourseInfos = AgencyCourseInfos;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeUserFavsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserFavsResponse(DescribeUserFavsResponse source) {
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.AgencyCourseInfos != null) {
            this.AgencyCourseInfos = new AgencyCourseInfo[source.AgencyCourseInfos.length];
            for (int i = 0; i < source.AgencyCourseInfos.length; i++) {
                this.AgencyCourseInfos[i] = new AgencyCourseInfo(source.AgencyCourseInfos[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "AgencyCourseInfos.", this.AgencyCourseInfos);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

