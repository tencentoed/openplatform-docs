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

public class TaskProcess extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务类型：1-直播 2-录播 3-资料 4-习题/考试
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 任务扩展信息
    */
    @SerializedName("Ext")
    @Expose
    private TaskProcessExt Ext;

    /**
     * Get 任务ID 
     * @return Id 任务ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务ID
     * @param Id 任务ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务类型：1-直播 2-录播 3-资料 4-习题/考试 
     * @return Type 任务类型：1-直播 2-录播 3-资料 4-习题/考试
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务类型：1-直播 2-录播 3-资料 4-习题/考试
     * @param Type 任务类型：1-直播 2-录播 3-资料 4-习题/考试
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 任务扩展信息 
     * @return Ext 任务扩展信息
     */
    public TaskProcessExt getExt() {
        return this.Ext;
    }

    /**
     * Set 任务扩展信息
     * @param Ext 任务扩展信息
     */
    public void setExt(TaskProcessExt Ext) {
        this.Ext = Ext;
    }

    public TaskProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskProcess(TaskProcess source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Ext != null) {
            this.Ext = new TaskProcessExt(source.Ext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Ext.", this.Ext);

    }
}

