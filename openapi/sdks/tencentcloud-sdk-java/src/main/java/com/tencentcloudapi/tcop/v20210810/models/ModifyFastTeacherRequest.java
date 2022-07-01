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

public class ModifyFastTeacherRequest extends AbstractModel{

    /**
    * 接入方通讯录中的老师id
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 直播间id
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 开放平台分配给第三方的千帆id
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
     * Get 接入方通讯录中的老师id 
     * @return TeacherId 接入方通讯录中的老师id
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 接入方通讯录中的老师id
     * @param TeacherId 接入方通讯录中的老师id
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 直播间id 
     * @return TermId 直播间id
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 直播间id
     * @param TermId 直播间id
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 开放平台分配给第三方的千帆id 
     * @return IdaasOrgId 开放平台分配给第三方的千帆id
     */
    public String getIdaasOrgId() {
        return this.IdaasOrgId;
    }

    /**
     * Set 开放平台分配给第三方的千帆id
     * @param IdaasOrgId 开放平台分配给第三方的千帆id
     */
    public void setIdaasOrgId(String IdaasOrgId) {
        this.IdaasOrgId = IdaasOrgId;
    }

    public ModifyFastTeacherRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFastTeacherRequest(ModifyFastTeacherRequest source) {
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);

    }
}

