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

public class DescribeCourseInfoRequest extends AbstractModel{

    /**
    * 课程ID列表，单次上限：10
    */
    @SerializedName("CourseIds")
    @Expose
    private Long [] CourseIds;

    /**
     * Get 课程ID列表，单次上限：10 
     * @return CourseIds 课程ID列表，单次上限：10
     */
    public Long [] getCourseIds() {
        return this.CourseIds;
    }

    /**
     * Set 课程ID列表，单次上限：10
     * @param CourseIds 课程ID列表，单次上限：10
     */
    public void setCourseIds(Long [] CourseIds) {
        this.CourseIds = CourseIds;
    }

    public DescribeCourseInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCourseInfoRequest(DescribeCourseInfoRequest source) {
        if (source.CourseIds != null) {
            this.CourseIds = new Long[source.CourseIds.length];
            for (int i = 0; i < source.CourseIds.length; i++) {
                this.CourseIds[i] = new Long(source.CourseIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CourseIds.", this.CourseIds);

    }
}

