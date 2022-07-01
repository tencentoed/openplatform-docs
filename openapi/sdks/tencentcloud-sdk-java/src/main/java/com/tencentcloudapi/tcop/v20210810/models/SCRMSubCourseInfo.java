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

public class SCRMSubCourseInfo extends AbstractModel{

    /**
    * 子课程直播任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskList")
    @Expose
    private SCRMTaskInfo [] TaskList;

    /**
    * 子课程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubCourseId")
    @Expose
    private Long SubCourseId;

    /**
    * 子课程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubCourseName")
    @Expose
    private String SubCourseName;

    /**
     * Get 子课程直播任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskList 子课程直播任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SCRMTaskInfo [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set 子课程直播任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskList 子课程直播任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskList(SCRMTaskInfo [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get 子课程id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubCourseId 子课程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubCourseId() {
        return this.SubCourseId;
    }

    /**
     * Set 子课程id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubCourseId 子课程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubCourseId(Long SubCourseId) {
        this.SubCourseId = SubCourseId;
    }

    /**
     * Get 子课程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubCourseName 子课程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubCourseName() {
        return this.SubCourseName;
    }

    /**
     * Set 子课程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubCourseName 子课程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubCourseName(String SubCourseName) {
        this.SubCourseName = SubCourseName;
    }

    public SCRMSubCourseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCRMSubCourseInfo(SCRMSubCourseInfo source) {
        if (source.TaskList != null) {
            this.TaskList = new SCRMTaskInfo[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new SCRMTaskInfo(source.TaskList[i]);
            }
        }
        if (source.SubCourseId != null) {
            this.SubCourseId = new Long(source.SubCourseId);
        }
        if (source.SubCourseName != null) {
            this.SubCourseName = new String(source.SubCourseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "SubCourseId", this.SubCourseId);
        this.setParamSimple(map, prefix + "SubCourseName", this.SubCourseName);

    }
}

