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

public class DeptUserInfo extends AbstractModel{

    /**
    * 千帆用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 千帆用户手机号
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 千帆用户UID
    */
    @SerializedName("IdsUid")
    @Expose
    private String IdsUid;

    /**
    * 千帆用户雇员编号
    */
    @SerializedName("EmployeeNumber")
    @Expose
    private String EmployeeNumber;

    /**
    * 千帆租户ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 千帆用户邮箱
    */
    @SerializedName("PrimaryMail")
    @Expose
    private String PrimaryMail;

    /**
    * 千帆用户所属部门ID
    */
    @SerializedName("DeptId")
    @Expose
    private String DeptId;

    /**
    * 千帆用户展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 机构用户ID
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
     * Get 千帆用户名 
     * @return Username 千帆用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 千帆用户名
     * @param Username 千帆用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 千帆用户手机号 
     * @return PhoneNum 千帆用户手机号
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 千帆用户手机号
     * @param PhoneNum 千帆用户手机号
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 千帆用户UID 
     * @return IdsUid 千帆用户UID
     */
    public String getIdsUid() {
        return this.IdsUid;
    }

    /**
     * Set 千帆用户UID
     * @param IdsUid 千帆用户UID
     */
    public void setIdsUid(String IdsUid) {
        this.IdsUid = IdsUid;
    }

    /**
     * Get 千帆用户雇员编号 
     * @return EmployeeNumber 千帆用户雇员编号
     */
    public String getEmployeeNumber() {
        return this.EmployeeNumber;
    }

    /**
     * Set 千帆用户雇员编号
     * @param EmployeeNumber 千帆用户雇员编号
     */
    public void setEmployeeNumber(String EmployeeNumber) {
        this.EmployeeNumber = EmployeeNumber;
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
     * Get 千帆用户邮箱 
     * @return PrimaryMail 千帆用户邮箱
     */
    public String getPrimaryMail() {
        return this.PrimaryMail;
    }

    /**
     * Set 千帆用户邮箱
     * @param PrimaryMail 千帆用户邮箱
     */
    public void setPrimaryMail(String PrimaryMail) {
        this.PrimaryMail = PrimaryMail;
    }

    /**
     * Get 千帆用户所属部门ID 
     * @return DeptId 千帆用户所属部门ID
     */
    public String getDeptId() {
        return this.DeptId;
    }

    /**
     * Set 千帆用户所属部门ID
     * @param DeptId 千帆用户所属部门ID
     */
    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    /**
     * Get 千帆用户展示名称 
     * @return DisplayName 千帆用户展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 千帆用户展示名称
     * @param DisplayName 千帆用户展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 机构用户ID 
     * @return SourceId 机构用户ID
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 机构用户ID
     * @param SourceId 机构用户ID
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    public DeptUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeptUserInfo(DeptUserInfo source) {
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.IdsUid != null) {
            this.IdsUid = new String(source.IdsUid);
        }
        if (source.EmployeeNumber != null) {
            this.EmployeeNumber = new String(source.EmployeeNumber);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.PrimaryMail != null) {
            this.PrimaryMail = new String(source.PrimaryMail);
        }
        if (source.DeptId != null) {
            this.DeptId = new String(source.DeptId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "IdsUid", this.IdsUid);
        this.setParamSimple(map, prefix + "EmployeeNumber", this.EmployeeNumber);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "PrimaryMail", this.PrimaryMail);
        this.setParamSimple(map, prefix + "DeptId", this.DeptId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);

    }
}

