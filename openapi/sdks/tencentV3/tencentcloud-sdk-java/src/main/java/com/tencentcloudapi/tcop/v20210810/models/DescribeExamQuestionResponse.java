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

public class DescribeExamQuestionResponse extends AbstractModel{

    /**
    * 课堂名称
    */
    @SerializedName("CourseName")
    @Expose
    private String CourseName;

    /**
    * 题目列表
    */
    @SerializedName("ExamList")
    @Expose
    private ExamInfo [] ExamList;

    /**
    * 下一页序号，当为0时表示没有下一页了
    */
    @SerializedName("PageNext")
    @Expose
    private Long PageNext;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 课堂名称 
     * @return CourseName 课堂名称
     */
    public String getCourseName() {
        return this.CourseName;
    }

    /**
     * Set 课堂名称
     * @param CourseName 课堂名称
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     * Get 题目列表 
     * @return ExamList 题目列表
     */
    public ExamInfo [] getExamList() {
        return this.ExamList;
    }

    /**
     * Set 题目列表
     * @param ExamList 题目列表
     */
    public void setExamList(ExamInfo [] ExamList) {
        this.ExamList = ExamList;
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

    public DescribeExamQuestionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExamQuestionResponse(DescribeExamQuestionResponse source) {
        if (source.CourseName != null) {
            this.CourseName = new String(source.CourseName);
        }
        if (source.ExamList != null) {
            this.ExamList = new ExamInfo[source.ExamList.length];
            for (int i = 0; i < source.ExamList.length; i++) {
                this.ExamList[i] = new ExamInfo(source.ExamList[i]);
            }
        }
        if (source.PageNext != null) {
            this.PageNext = new Long(source.PageNext);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseName", this.CourseName);
        this.setParamArrayObj(map, prefix + "ExamList.", this.ExamList);
        this.setParamSimple(map, prefix + "PageNext", this.PageNext);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

