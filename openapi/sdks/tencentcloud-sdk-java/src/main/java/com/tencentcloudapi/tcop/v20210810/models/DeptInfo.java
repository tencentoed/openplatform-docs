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

public class DeptInfo extends AbstractModel{

    /**
    * 千帆部门ID
    */
    @SerializedName("DeptId")
    @Expose
    private String DeptId;

    /**
    * 千帆租户ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 千帆部门祖先节点
    */
    @SerializedName("Ancestor")
    @Expose
    private String [] Ancestor;

    /**
    * 千帆部门父节点ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 千帆部门名称
    */
    @SerializedName("DeptName")
    @Expose
    private String DeptName;

    /**
     * Get 千帆部门ID 
     * @return DeptId 千帆部门ID
     */
    public String getDeptId() {
        return this.DeptId;
    }

    /**
     * Set 千帆部门ID
     * @param DeptId 千帆部门ID
     */
    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    /**
     * Get 千帆租户ID 
     * @return TenantId 千帆租户ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 千帆租户ID
     * @param TenantId 千帆租户ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 千帆部门祖先节点 
     * @return Ancestor 千帆部门祖先节点
     */
    public String [] getAncestor() {
        return this.Ancestor;
    }

    /**
     * Set 千帆部门祖先节点
     * @param Ancestor 千帆部门祖先节点
     */
    public void setAncestor(String [] Ancestor) {
        this.Ancestor = Ancestor;
    }

    /**
     * Get 千帆部门父节点ID 
     * @return ParentId 千帆部门父节点ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 千帆部门父节点ID
     * @param ParentId 千帆部门父节点ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 千帆部门名称 
     * @return DeptName 千帆部门名称
     */
    public String getDeptName() {
        return this.DeptName;
    }

    /**
     * Set 千帆部门名称
     * @param DeptName 千帆部门名称
     */
    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public DeptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeptInfo(DeptInfo source) {
        if (source.DeptId != null) {
            this.DeptId = new String(source.DeptId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.Ancestor != null) {
            this.Ancestor = new String[source.Ancestor.length];
            for (int i = 0; i < source.Ancestor.length; i++) {
                this.Ancestor[i] = new String(source.Ancestor[i]);
            }
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.DeptName != null) {
            this.DeptName = new String(source.DeptName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeptId", this.DeptId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamArraySimple(map, prefix + "Ancestor.", this.Ancestor);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "DeptName", this.DeptName);

    }
}

