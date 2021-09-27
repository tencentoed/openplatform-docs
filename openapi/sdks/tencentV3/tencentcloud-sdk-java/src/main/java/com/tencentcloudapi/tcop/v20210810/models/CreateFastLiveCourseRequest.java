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

public class CreateFastLiveCourseRequest extends AbstractModel{

    /**
    * 老师id（接入方通讯录中的老师id）
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

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
     * Get 老师id（接入方通讯录中的老师id） 
     * @return TeacherId 老师id（接入方通讯录中的老师id）
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 老师id（接入方通讯录中的老师id）
     * @param TeacherId 老师id（接入方通讯录中的老师id）
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
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

    public CreateFastLiveCourseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFastLiveCourseRequest(CreateFastLiveCourseRequest source) {
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
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
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "VisibleScope", this.VisibleScope);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);

    }
}

