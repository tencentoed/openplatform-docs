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

public class ModifyFastLiveCourseRequest extends AbstractModel{

    /**
    * 直播间id
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
    */
    @SerializedName("VisibleScope")
    @Expose
    private Long VisibleScope;

    /**
    * 课程名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 开放平台分配给第三方的千帆id
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

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
     * Get 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内 
     * @return VisibleScope 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
     */
    public Long getVisibleScope() {
        return this.VisibleScope;
    }

    /**
     * Set 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
     * @param VisibleScope 课程学习可见范围属性，0：公开 1：班级内	2：组织内 3：授权列表内
     */
    public void setVisibleScope(Long VisibleScope) {
        this.VisibleScope = VisibleScope;
    }

    /**
     * Get 课程名 
     * @return Name 课程名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 课程名
     * @param Name 课程名
     */
    public void setName(String Name) {
        this.Name = Name;
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

    public ModifyFastLiveCourseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFastLiveCourseRequest(ModifyFastLiveCourseRequest source) {
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.VisibleScope != null) {
            this.VisibleScope = new Long(source.VisibleScope);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "VisibleScope", this.VisibleScope);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);

    }
}

