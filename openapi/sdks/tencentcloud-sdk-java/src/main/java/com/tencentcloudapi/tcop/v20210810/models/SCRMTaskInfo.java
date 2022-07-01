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

public class SCRMTaskInfo extends AbstractModel{

    /**
    * 直播任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 直播名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 是否结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExprFlag")
    @Expose
    private Long ExprFlag;

    /**
    * 直播任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 直播课程地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskUrl")
    @Expose
    private String TaskUrl;

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务学习时常，系统任务无学习时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StudySpan")
    @Expose
    private Long StudySpan;

    /**
    * 任务学习进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StudyProgress")
    @Expose
    private Long StudyProgress;

    /**
    * 任务学习时间 时间戳 单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StudyTs")
    @Expose
    private Long StudyTs;

    /**
     * Get 直播任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 直播任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 直播任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 直播任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 直播名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 直播名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 直播名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 直播名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 是否结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExprFlag 是否结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExprFlag() {
        return this.ExprFlag;
    }

    /**
     * Set 是否结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExprFlag 是否结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExprFlag(Long ExprFlag) {
        this.ExprFlag = ExprFlag;
    }

    /**
     * Get 直播任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 直播任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 直播任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 直播任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 直播课程地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskUrl 直播课程地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskUrl() {
        return this.TaskUrl;
    }

    /**
     * Set 直播课程地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskUrl 直播课程地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskUrl(String TaskUrl) {
        this.TaskUrl = TaskUrl;
    }

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务学习时常，系统任务无学习时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StudySpan 任务学习时常，系统任务无学习时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStudySpan() {
        return this.StudySpan;
    }

    /**
     * Set 任务学习时常，系统任务无学习时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param StudySpan 任务学习时常，系统任务无学习时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStudySpan(Long StudySpan) {
        this.StudySpan = StudySpan;
    }

    /**
     * Get 任务学习进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StudyProgress 任务学习进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStudyProgress() {
        return this.StudyProgress;
    }

    /**
     * Set 任务学习进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param StudyProgress 任务学习进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStudyProgress(Long StudyProgress) {
        this.StudyProgress = StudyProgress;
    }

    /**
     * Get 任务学习时间 时间戳 单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StudyTs 任务学习时间 时间戳 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStudyTs() {
        return this.StudyTs;
    }

    /**
     * Set 任务学习时间 时间戳 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param StudyTs 任务学习时间 时间戳 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStudyTs(Long StudyTs) {
        this.StudyTs = StudyTs;
    }

    public SCRMTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCRMTaskInfo(SCRMTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ExprFlag != null) {
            this.ExprFlag = new Long(source.ExprFlag);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TaskUrl != null) {
            this.TaskUrl = new String(source.TaskUrl);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StudySpan != null) {
            this.StudySpan = new Long(source.StudySpan);
        }
        if (source.StudyProgress != null) {
            this.StudyProgress = new Long(source.StudyProgress);
        }
        if (source.StudyTs != null) {
            this.StudyTs = new Long(source.StudyTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ExprFlag", this.ExprFlag);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskUrl", this.TaskUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StudySpan", this.StudySpan);
        this.setParamSimple(map, prefix + "StudyProgress", this.StudyProgress);
        this.setParamSimple(map, prefix + "StudyTs", this.StudyTs);

    }
}

