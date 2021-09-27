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

public class TaskInfo extends AbstractModel{

    /**
    * 每讲名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 讲课状态  1待直播  2直播中 3录播
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 直播结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

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
     * Get 每讲名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 每讲名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 每讲名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 每讲名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 讲课状态  1待直播  2直播中 3录播
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 讲课状态  1待直播  2直播中 3录播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 讲课状态  1待直播  2直播中 3录播
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 讲课状态  1待直播  2直播中 3录播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 直播结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 直播结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 直播结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 直播结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StudySpan", this.StudySpan);
        this.setParamSimple(map, prefix + "StudyProgress", this.StudyProgress);
        this.setParamSimple(map, prefix + "StudyTs", this.StudyTs);

    }
}

