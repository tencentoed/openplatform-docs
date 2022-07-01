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

public class StudyInfo extends AbstractModel{

    /**
    * 课程id
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 班级id
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 班级学习进度
    */
    @SerializedName("TermStudyProgress")
    @Expose
    private Long TermStudyProgress;

    /**
    * 总任务数
    */
    @SerializedName("TotalTaskNumber")
    @Expose
    private Long TotalTaskNumber;

    /**
    * 已学习任务数
    */
    @SerializedName("StudyTaskNumber")
    @Expose
    private Long StudyTaskNumber;

    /**
    * 节列表
    */
    @SerializedName("SubCourseList")
    @Expose
    private SCRMSubCourseInfo [] SubCourseList;

    /**
     * Get 课程id 
     * @return CourseId 课程id
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程id
     * @param CourseId 课程id
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 班级id 
     * @return TermId 班级id
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级id
     * @param TermId 班级id
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 班级学习进度 
     * @return TermStudyProgress 班级学习进度
     */
    public Long getTermStudyProgress() {
        return this.TermStudyProgress;
    }

    /**
     * Set 班级学习进度
     * @param TermStudyProgress 班级学习进度
     */
    public void setTermStudyProgress(Long TermStudyProgress) {
        this.TermStudyProgress = TermStudyProgress;
    }

    /**
     * Get 总任务数 
     * @return TotalTaskNumber 总任务数
     */
    public Long getTotalTaskNumber() {
        return this.TotalTaskNumber;
    }

    /**
     * Set 总任务数
     * @param TotalTaskNumber 总任务数
     */
    public void setTotalTaskNumber(Long TotalTaskNumber) {
        this.TotalTaskNumber = TotalTaskNumber;
    }

    /**
     * Get 已学习任务数 
     * @return StudyTaskNumber 已学习任务数
     */
    public Long getStudyTaskNumber() {
        return this.StudyTaskNumber;
    }

    /**
     * Set 已学习任务数
     * @param StudyTaskNumber 已学习任务数
     */
    public void setStudyTaskNumber(Long StudyTaskNumber) {
        this.StudyTaskNumber = StudyTaskNumber;
    }

    /**
     * Get 节列表 
     * @return SubCourseList 节列表
     */
    public SCRMSubCourseInfo [] getSubCourseList() {
        return this.SubCourseList;
    }

    /**
     * Set 节列表
     * @param SubCourseList 节列表
     */
    public void setSubCourseList(SCRMSubCourseInfo [] SubCourseList) {
        this.SubCourseList = SubCourseList;
    }

    public StudyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StudyInfo(StudyInfo source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.TermStudyProgress != null) {
            this.TermStudyProgress = new Long(source.TermStudyProgress);
        }
        if (source.TotalTaskNumber != null) {
            this.TotalTaskNumber = new Long(source.TotalTaskNumber);
        }
        if (source.StudyTaskNumber != null) {
            this.StudyTaskNumber = new Long(source.StudyTaskNumber);
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
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "TermStudyProgress", this.TermStudyProgress);
        this.setParamSimple(map, prefix + "TotalTaskNumber", this.TotalTaskNumber);
        this.setParamSimple(map, prefix + "StudyTaskNumber", this.StudyTaskNumber);
        this.setParamArrayObj(map, prefix + "SubCourseList.", this.SubCourseList);

    }
}

