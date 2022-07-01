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

public class DescribeStudyDataResponse extends AbstractModel{

    /**
    * 考勤信息列表
    */
    @SerializedName("StudentList")
    @Expose
    private StudentInfo [] StudentList;

    /**
    * 授课内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 有考勤学生总数
    */
    @SerializedName("StudentCount")
    @Expose
    private Long StudentCount;

    /**
    * 下一页序号，当为0时表示没有下一页了
    */
    @SerializedName("PageNext")
    @Expose
    private Long PageNext;

    /**
    * 考勤任务详情
    */
    @SerializedName("TaskInfo")
    @Expose
    private LiveTaskInfo TaskInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 考勤信息列表 
     * @return StudentList 考勤信息列表
     */
    public StudentInfo [] getStudentList() {
        return this.StudentList;
    }

    /**
     * Set 考勤信息列表
     * @param StudentList 考勤信息列表
     */
    public void setStudentList(StudentInfo [] StudentList) {
        this.StudentList = StudentList;
    }

    /**
     * Get 授课内容 
     * @return Content 授课内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 授课内容
     * @param Content 授课内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 有考勤学生总数 
     * @return StudentCount 有考勤学生总数
     */
    public Long getStudentCount() {
        return this.StudentCount;
    }

    /**
     * Set 有考勤学生总数
     * @param StudentCount 有考勤学生总数
     */
    public void setStudentCount(Long StudentCount) {
        this.StudentCount = StudentCount;
    }

    /**
     * Get 下一页序号，当为0时表示没有下一页了 
     * @return PageNext 下一页序号，当为0时表示没有下一页了
     */
    public Long getPageNext() {
        return this.PageNext;
    }

    /**
     * Set 下一页序号，当为0时表示没有下一页了
     * @param PageNext 下一页序号，当为0时表示没有下一页了
     */
    public void setPageNext(Long PageNext) {
        this.PageNext = PageNext;
    }

    /**
     * Get 考勤任务详情 
     * @return TaskInfo 考勤任务详情
     */
    public LiveTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 考勤任务详情
     * @param TaskInfo 考勤任务详情
     */
    public void setTaskInfo(LiveTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
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

    public DescribeStudyDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStudyDataResponse(DescribeStudyDataResponse source) {
        if (source.StudentList != null) {
            this.StudentList = new StudentInfo[source.StudentList.length];
            for (int i = 0; i < source.StudentList.length; i++) {
                this.StudentList[i] = new StudentInfo(source.StudentList[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.StudentCount != null) {
            this.StudentCount = new Long(source.StudentCount);
        }
        if (source.PageNext != null) {
            this.PageNext = new Long(source.PageNext);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new LiveTaskInfo(source.TaskInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StudentList.", this.StudentList);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "StudentCount", this.StudentCount);
        this.setParamSimple(map, prefix + "PageNext", this.PageNext);
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

