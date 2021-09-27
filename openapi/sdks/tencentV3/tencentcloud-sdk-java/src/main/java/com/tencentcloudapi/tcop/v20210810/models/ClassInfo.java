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

public class ClassInfo extends AbstractModel{

    /**
    * 班级id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 用户开始上课时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttendTime")
    @Expose
    private Long AttendTime;

    /**
    * 用户点下课时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeaveTime")
    @Expose
    private Long LeaveTime;

    /**
    * 上下课状态 1-上课 2-下课
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineStatus")
    @Expose
    private Long OfflineStatus;

    /**
     * Get 班级id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermId 班级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermId 班级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 用户开始上课时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttendTime 用户开始上课时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttendTime() {
        return this.AttendTime;
    }

    /**
     * Set 用户开始上课时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttendTime 用户开始上课时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttendTime(Long AttendTime) {
        this.AttendTime = AttendTime;
    }

    /**
     * Get 用户点下课时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeaveTime 用户点下课时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLeaveTime() {
        return this.LeaveTime;
    }

    /**
     * Set 用户点下课时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeaveTime 用户点下课时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeaveTime(Long LeaveTime) {
        this.LeaveTime = LeaveTime;
    }

    /**
     * Get 上下课状态 1-上课 2-下课
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineStatus 上下课状态 1-上课 2-下课
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOfflineStatus() {
        return this.OfflineStatus;
    }

    /**
     * Set 上下课状态 1-上课 2-下课
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineStatus 上下课状态 1-上课 2-下课
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineStatus(Long OfflineStatus) {
        this.OfflineStatus = OfflineStatus;
    }

    public ClassInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassInfo(ClassInfo source) {
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.AttendTime != null) {
            this.AttendTime = new Long(source.AttendTime);
        }
        if (source.LeaveTime != null) {
            this.LeaveTime = new Long(source.LeaveTime);
        }
        if (source.OfflineStatus != null) {
            this.OfflineStatus = new Long(source.OfflineStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "AttendTime", this.AttendTime);
        this.setParamSimple(map, prefix + "LeaveTime", this.LeaveTime);
        this.setParamSimple(map, prefix + "OfflineStatus", this.OfflineStatus);

    }
}

