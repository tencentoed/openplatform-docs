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

public class DescribePlanProcessResponse extends AbstractModel{

    /**
    * 课程ID
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 课程名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 班级列表
    */
    @SerializedName("TermList")
    @Expose
    private TermProcess [] TermList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 课程ID 
     * @return CourseId 课程ID
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程ID
     * @param CourseId 课程ID
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 课程名称 
     * @return Name 课程名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 课程名称
     * @param Name 课程名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 班级列表 
     * @return TermList 班级列表
     */
    public TermProcess [] getTermList() {
        return this.TermList;
    }

    /**
     * Set 班级列表
     * @param TermList 班级列表
     */
    public void setTermList(TermProcess [] TermList) {
        this.TermList = TermList;
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

    public DescribePlanProcessResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlanProcessResponse(DescribePlanProcessResponse source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TermList != null) {
            this.TermList = new TermProcess[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new TermProcess(source.TermList[i]);
            }
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

