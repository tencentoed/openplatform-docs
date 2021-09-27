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

public class DescribeFastLiveCourseResponse extends AbstractModel{

    /**
    * 上课老师id（接入方通讯录中的老师id）
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 直播间id
    */
    @SerializedName("TermId")
    @Expose
    private String TermId;

    /**
    * 课程学习可见范围属性， 0-公开 1-指定范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VisibleScope")
    @Expose
    private Long VisibleScope;

    /**
    * 课程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 直播链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveUrl")
    @Expose
    private String LiveUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上课老师id（接入方通讯录中的老师id） 
     * @return TeacherId 上课老师id（接入方通讯录中的老师id）
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 上课老师id（接入方通讯录中的老师id）
     * @param TeacherId 上课老师id（接入方通讯录中的老师id）
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 直播间id 
     * @return TermId 直播间id
     */
    public String getTermId() {
        return this.TermId;
    }

    /**
     * Set 直播间id
     * @param TermId 直播间id
     */
    public void setTermId(String TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 课程学习可见范围属性， 0-公开 1-指定范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VisibleScope 课程学习可见范围属性， 0-公开 1-指定范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVisibleScope() {
        return this.VisibleScope;
    }

    /**
     * Set 课程学习可见范围属性， 0-公开 1-指定范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param VisibleScope 课程学习可见范围属性， 0-公开 1-指定范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVisibleScope(Long VisibleScope) {
        this.VisibleScope = VisibleScope;
    }

    /**
     * Get 课程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 课程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 课程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 课程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 直播链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveUrl 直播链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveUrl() {
        return this.LiveUrl;
    }

    /**
     * Set 直播链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveUrl 直播链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveUrl(String LiveUrl) {
        this.LiveUrl = LiveUrl;
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

    public DescribeFastLiveCourseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFastLiveCourseResponse(DescribeFastLiveCourseResponse source) {
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.TermId != null) {
            this.TermId = new String(source.TermId);
        }
        if (source.VisibleScope != null) {
            this.VisibleScope = new Long(source.VisibleScope);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LiveUrl != null) {
            this.LiveUrl = new String(source.LiveUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "VisibleScope", this.VisibleScope);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LiveUrl", this.LiveUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

