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

public class DescribeExamAnswerResponse extends AbstractModel{

    /**
    * 下一页序号，当为0时表示没有下一页了
    */
    @SerializedName("PageNext")
    @Expose
    private Long PageNext;

    /**
    * 应答题学生人数
    */
    @SerializedName("StudentNum")
    @Expose
    private Long StudentNum;

    /**
    * 实际提交答题卡人数
    */
    @SerializedName("AnswerNum")
    @Expose
    private Long AnswerNum;

    /**
    * 答题学生信息
    */
    @SerializedName("AnswerList")
    @Expose
    private AnswerInfo [] AnswerList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 应答题学生人数 
     * @return StudentNum 应答题学生人数
     */
    public Long getStudentNum() {
        return this.StudentNum;
    }

    /**
     * Set 应答题学生人数
     * @param StudentNum 应答题学生人数
     */
    public void setStudentNum(Long StudentNum) {
        this.StudentNum = StudentNum;
    }

    /**
     * Get 实际提交答题卡人数 
     * @return AnswerNum 实际提交答题卡人数
     */
    public Long getAnswerNum() {
        return this.AnswerNum;
    }

    /**
     * Set 实际提交答题卡人数
     * @param AnswerNum 实际提交答题卡人数
     */
    public void setAnswerNum(Long AnswerNum) {
        this.AnswerNum = AnswerNum;
    }

    /**
     * Get 答题学生信息 
     * @return AnswerList 答题学生信息
     */
    public AnswerInfo [] getAnswerList() {
        return this.AnswerList;
    }

    /**
     * Set 答题学生信息
     * @param AnswerList 答题学生信息
     */
    public void setAnswerList(AnswerInfo [] AnswerList) {
        this.AnswerList = AnswerList;
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

    public DescribeExamAnswerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExamAnswerResponse(DescribeExamAnswerResponse source) {
        if (source.PageNext != null) {
            this.PageNext = new Long(source.PageNext);
        }
        if (source.StudentNum != null) {
            this.StudentNum = new Long(source.StudentNum);
        }
        if (source.AnswerNum != null) {
            this.AnswerNum = new Long(source.AnswerNum);
        }
        if (source.AnswerList != null) {
            this.AnswerList = new AnswerInfo[source.AnswerList.length];
            for (int i = 0; i < source.AnswerList.length; i++) {
                this.AnswerList[i] = new AnswerInfo(source.AnswerList[i]);
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
        this.setParamSimple(map, prefix + "PageNext", this.PageNext);
        this.setParamSimple(map, prefix + "StudentNum", this.StudentNum);
        this.setParamSimple(map, prefix + "AnswerNum", this.AnswerNum);
        this.setParamArrayObj(map, prefix + "AnswerList.", this.AnswerList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

