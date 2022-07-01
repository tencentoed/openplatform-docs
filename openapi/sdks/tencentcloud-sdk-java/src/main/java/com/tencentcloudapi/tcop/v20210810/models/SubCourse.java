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

public class SubCourse extends AbstractModel{

    /**
    * 节ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务列表
    */
    @SerializedName("TaskList")
    @Expose
    private CourseTask [] TaskList;

    /**
     * Get 节ID 
     * @return Id 节ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 节ID
     * @param Id 节ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 节名称 
     * @return Name 节名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节名称
     * @param Name 节名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务列表 
     * @return TaskList 任务列表
     */
    public CourseTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set 任务列表
     * @param TaskList 任务列表
     */
    public void setTaskList(CourseTask [] TaskList) {
        this.TaskList = TaskList;
    }

    public SubCourse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubCourse(SubCourse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskList != null) {
            this.TaskList = new CourseTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new CourseTask(source.TaskList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);

    }
}

