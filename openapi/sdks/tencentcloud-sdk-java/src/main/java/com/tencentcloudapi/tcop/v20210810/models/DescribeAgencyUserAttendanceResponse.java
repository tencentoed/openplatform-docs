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

public class DescribeAgencyUserAttendanceResponse extends AbstractModel{

    /**
    * 最近一次学习时间，时间戳 单位秒
    */
    @SerializedName("LatestStudyTs")
    @Expose
    private Long LatestStudyTs;

    /**
    * 最近一次学习时长，如果任务为习题任务，则学习时长为0，单位秒
    */
    @SerializedName("LatestStudySpan")
    @Expose
    private Long LatestStudySpan;

    /**
    * 最近一次学习课程id
    */
    @SerializedName("LatestStudyCourseId")
    @Expose
    private Long LatestStudyCourseId;

    /**
    * 最近一次学习任务id
    */
    @SerializedName("LatestStudyTaskId")
    @Expose
    private String LatestStudyTaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 最近一次学习时间，时间戳 单位秒 
     * @return LatestStudyTs 最近一次学习时间，时间戳 单位秒
     */
    public Long getLatestStudyTs() {
        return this.LatestStudyTs;
    }

    /**
     * Set 最近一次学习时间，时间戳 单位秒
     * @param LatestStudyTs 最近一次学习时间，时间戳 单位秒
     */
    public void setLatestStudyTs(Long LatestStudyTs) {
        this.LatestStudyTs = LatestStudyTs;
    }

    /**
     * Get 最近一次学习时长，如果任务为习题任务，则学习时长为0，单位秒 
     * @return LatestStudySpan 最近一次学习时长，如果任务为习题任务，则学习时长为0，单位秒
     */
    public Long getLatestStudySpan() {
        return this.LatestStudySpan;
    }

    /**
     * Set 最近一次学习时长，如果任务为习题任务，则学习时长为0，单位秒
     * @param LatestStudySpan 最近一次学习时长，如果任务为习题任务，则学习时长为0，单位秒
     */
    public void setLatestStudySpan(Long LatestStudySpan) {
        this.LatestStudySpan = LatestStudySpan;
    }

    /**
     * Get 最近一次学习课程id 
     * @return LatestStudyCourseId 最近一次学习课程id
     */
    public Long getLatestStudyCourseId() {
        return this.LatestStudyCourseId;
    }

    /**
     * Set 最近一次学习课程id
     * @param LatestStudyCourseId 最近一次学习课程id
     */
    public void setLatestStudyCourseId(Long LatestStudyCourseId) {
        this.LatestStudyCourseId = LatestStudyCourseId;
    }

    /**
     * Get 最近一次学习任务id 
     * @return LatestStudyTaskId 最近一次学习任务id
     */
    public String getLatestStudyTaskId() {
        return this.LatestStudyTaskId;
    }

    /**
     * Set 最近一次学习任务id
     * @param LatestStudyTaskId 最近一次学习任务id
     */
    public void setLatestStudyTaskId(String LatestStudyTaskId) {
        this.LatestStudyTaskId = LatestStudyTaskId;
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

    public DescribeAgencyUserAttendanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyUserAttendanceResponse(DescribeAgencyUserAttendanceResponse source) {
        if (source.LatestStudyTs != null) {
            this.LatestStudyTs = new Long(source.LatestStudyTs);
        }
        if (source.LatestStudySpan != null) {
            this.LatestStudySpan = new Long(source.LatestStudySpan);
        }
        if (source.LatestStudyCourseId != null) {
            this.LatestStudyCourseId = new Long(source.LatestStudyCourseId);
        }
        if (source.LatestStudyTaskId != null) {
            this.LatestStudyTaskId = new String(source.LatestStudyTaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LatestStudyTs", this.LatestStudyTs);
        this.setParamSimple(map, prefix + "LatestStudySpan", this.LatestStudySpan);
        this.setParamSimple(map, prefix + "LatestStudyCourseId", this.LatestStudyCourseId);
        this.setParamSimple(map, prefix + "LatestStudyTaskId", this.LatestStudyTaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

