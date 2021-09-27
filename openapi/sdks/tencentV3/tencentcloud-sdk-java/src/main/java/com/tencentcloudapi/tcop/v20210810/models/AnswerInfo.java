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

public class AnswerInfo extends AbstractModel{

    /**
    * 是否回答 1=已回答 0=未回答
    */
    @SerializedName("HasAnswer")
    @Expose
    private Long HasAnswer;

    /**
    * 答题人账号
    */
    @SerializedName("StudentId")
    @Expose
    private String StudentId;

    /**
    * 提交的答案，从1开始对应A，可能多个
    */
    @SerializedName("SubmitAnswerList")
    @Expose
    private Long [] SubmitAnswerList;

    /**
    * 学生头像链接
    */
    @SerializedName("StudentPicUrl")
    @Expose
    private String StudentPicUrl;

    /**
    * 答题人姓名
    */
    @SerializedName("StudentName")
    @Expose
    private String StudentName;

    /**
     * Get 是否回答 1=已回答 0=未回答 
     * @return HasAnswer 是否回答 1=已回答 0=未回答
     */
    public Long getHasAnswer() {
        return this.HasAnswer;
    }

    /**
     * Set 是否回答 1=已回答 0=未回答
     * @param HasAnswer 是否回答 1=已回答 0=未回答
     */
    public void setHasAnswer(Long HasAnswer) {
        this.HasAnswer = HasAnswer;
    }

    /**
     * Get 答题人账号 
     * @return StudentId 答题人账号
     */
    public String getStudentId() {
        return this.StudentId;
    }

    /**
     * Set 答题人账号
     * @param StudentId 答题人账号
     */
    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    /**
     * Get 提交的答案，从1开始对应A，可能多个 
     * @return SubmitAnswerList 提交的答案，从1开始对应A，可能多个
     */
    public Long [] getSubmitAnswerList() {
        return this.SubmitAnswerList;
    }

    /**
     * Set 提交的答案，从1开始对应A，可能多个
     * @param SubmitAnswerList 提交的答案，从1开始对应A，可能多个
     */
    public void setSubmitAnswerList(Long [] SubmitAnswerList) {
        this.SubmitAnswerList = SubmitAnswerList;
    }

    /**
     * Get 学生头像链接 
     * @return StudentPicUrl 学生头像链接
     */
    public String getStudentPicUrl() {
        return this.StudentPicUrl;
    }

    /**
     * Set 学生头像链接
     * @param StudentPicUrl 学生头像链接
     */
    public void setStudentPicUrl(String StudentPicUrl) {
        this.StudentPicUrl = StudentPicUrl;
    }

    /**
     * Get 答题人姓名 
     * @return StudentName 答题人姓名
     */
    public String getStudentName() {
        return this.StudentName;
    }

    /**
     * Set 答题人姓名
     * @param StudentName 答题人姓名
     */
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public AnswerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnswerInfo(AnswerInfo source) {
        if (source.HasAnswer != null) {
            this.HasAnswer = new Long(source.HasAnswer);
        }
        if (source.StudentId != null) {
            this.StudentId = new String(source.StudentId);
        }
        if (source.SubmitAnswerList != null) {
            this.SubmitAnswerList = new Long[source.SubmitAnswerList.length];
            for (int i = 0; i < source.SubmitAnswerList.length; i++) {
                this.SubmitAnswerList[i] = new Long(source.SubmitAnswerList[i]);
            }
        }
        if (source.StudentPicUrl != null) {
            this.StudentPicUrl = new String(source.StudentPicUrl);
        }
        if (source.StudentName != null) {
            this.StudentName = new String(source.StudentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HasAnswer", this.HasAnswer);
        this.setParamSimple(map, prefix + "StudentId", this.StudentId);
        this.setParamArraySimple(map, prefix + "SubmitAnswerList.", this.SubmitAnswerList);
        this.setParamSimple(map, prefix + "StudentPicUrl", this.StudentPicUrl);
        this.setParamSimple(map, prefix + "StudentName", this.StudentName);

    }
}

