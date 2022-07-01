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

public class PkgCourse extends AbstractModel{

    /**
    * 课程ID
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 班级ID
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

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
     * Get 班级ID 
     * @return TermId 班级ID
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级ID
     * @param TermId 班级ID
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    public PkgCourse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PkgCourse(PkgCourse source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);

    }
}

