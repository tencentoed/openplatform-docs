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

public class BasicCourse extends AbstractModel{

    /**
    * 课程ID
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 课程ID类型：1-课程ID 2-课程包ID
    */
    @SerializedName("CourseIdType")
    @Expose
    private Long CourseIdType;

    /**
    * 课程名称
    */
    @SerializedName("CourseName")
    @Expose
    private String CourseName;

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
     * Get 课程ID类型：1-课程ID 2-课程包ID 
     * @return CourseIdType 课程ID类型：1-课程ID 2-课程包ID
     */
    public Long getCourseIdType() {
        return this.CourseIdType;
    }

    /**
     * Set 课程ID类型：1-课程ID 2-课程包ID
     * @param CourseIdType 课程ID类型：1-课程ID 2-课程包ID
     */
    public void setCourseIdType(Long CourseIdType) {
        this.CourseIdType = CourseIdType;
    }

    /**
     * Get 课程名称 
     * @return CourseName 课程名称
     */
    public String getCourseName() {
        return this.CourseName;
    }

    /**
     * Set 课程名称
     * @param CourseName 课程名称
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public BasicCourse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BasicCourse(BasicCourse source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.CourseIdType != null) {
            this.CourseIdType = new Long(source.CourseIdType);
        }
        if (source.CourseName != null) {
            this.CourseName = new String(source.CourseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "CourseIdType", this.CourseIdType);
        this.setParamSimple(map, prefix + "CourseName", this.CourseName);

    }
}

