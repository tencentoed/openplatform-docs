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

public class ExamInfo extends AbstractModel{

    /**
    * 设置的选项个数
    */
    @SerializedName("OptionsCount")
    @Expose
    private Long OptionsCount;

    /**
    * 题目唯一id
    */
    @SerializedName("ExamId")
    @Expose
    private Long ExamId;

    /**
    * 答题类型 1-单选 2-多选
    */
    @SerializedName("ExamType")
    @Expose
    private Long ExamType;

    /**
    * 发起答题时间
    */
    @SerializedName("ExamTime")
    @Expose
    private Long ExamTime;

    /**
     * Get 设置的选项个数 
     * @return OptionsCount 设置的选项个数
     */
    public Long getOptionsCount() {
        return this.OptionsCount;
    }

    /**
     * Set 设置的选项个数
     * @param OptionsCount 设置的选项个数
     */
    public void setOptionsCount(Long OptionsCount) {
        this.OptionsCount = OptionsCount;
    }

    /**
     * Get 题目唯一id 
     * @return ExamId 题目唯一id
     */
    public Long getExamId() {
        return this.ExamId;
    }

    /**
     * Set 题目唯一id
     * @param ExamId 题目唯一id
     */
    public void setExamId(Long ExamId) {
        this.ExamId = ExamId;
    }

    /**
     * Get 答题类型 1-单选 2-多选 
     * @return ExamType 答题类型 1-单选 2-多选
     */
    public Long getExamType() {
        return this.ExamType;
    }

    /**
     * Set 答题类型 1-单选 2-多选
     * @param ExamType 答题类型 1-单选 2-多选
     */
    public void setExamType(Long ExamType) {
        this.ExamType = ExamType;
    }

    /**
     * Get 发起答题时间 
     * @return ExamTime 发起答题时间
     */
    public Long getExamTime() {
        return this.ExamTime;
    }

    /**
     * Set 发起答题时间
     * @param ExamTime 发起答题时间
     */
    public void setExamTime(Long ExamTime) {
        this.ExamTime = ExamTime;
    }

    public ExamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExamInfo(ExamInfo source) {
        if (source.OptionsCount != null) {
            this.OptionsCount = new Long(source.OptionsCount);
        }
        if (source.ExamId != null) {
            this.ExamId = new Long(source.ExamId);
        }
        if (source.ExamType != null) {
            this.ExamType = new Long(source.ExamType);
        }
        if (source.ExamTime != null) {
            this.ExamTime = new Long(source.ExamTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OptionsCount", this.OptionsCount);
        this.setParamSimple(map, prefix + "ExamId", this.ExamId);
        this.setParamSimple(map, prefix + "ExamType", this.ExamType);
        this.setParamSimple(map, prefix + "ExamTime", this.ExamTime);

    }
}

