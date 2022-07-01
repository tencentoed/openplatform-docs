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

public class ReplayItem extends AbstractModel{

    /**
    * 视频名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 视频id
    */
    @SerializedName("VId")
    @Expose
    private String VId;

    /**
    * 回放时长，单位秒
    */
    @SerializedName("TimeLen")
    @Expose
    private Long TimeLen;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 视频名字 
     * @return Name 视频名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 视频名字
     * @param Name 视频名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 视频id 
     * @return VId 视频id
     */
    public String getVId() {
        return this.VId;
    }

    /**
     * Set 视频id
     * @param VId 视频id
     */
    public void setVId(String VId) {
        this.VId = VId;
    }

    /**
     * Get 回放时长，单位秒 
     * @return TimeLen 回放时长，单位秒
     */
    public Long getTimeLen() {
        return this.TimeLen;
    }

    /**
     * Set 回放时长，单位秒
     * @param TimeLen 回放时长，单位秒
     */
    public void setTimeLen(Long TimeLen) {
        this.TimeLen = TimeLen;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public ReplayItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplayItem(ReplayItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VId != null) {
            this.VId = new String(source.VId);
        }
        if (source.TimeLen != null) {
            this.TimeLen = new Long(source.TimeLen);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VId", this.VId);
        this.setParamSimple(map, prefix + "TimeLen", this.TimeLen);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

