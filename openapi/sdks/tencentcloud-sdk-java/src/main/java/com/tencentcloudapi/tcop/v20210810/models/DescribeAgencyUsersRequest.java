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

public class DescribeAgencyUsersRequest extends AbstractModel{

    /**
    * 千帆租户ID
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
    * 企业微信组织ID
    */
    @SerializedName("Corpid")
    @Expose
    private String Corpid;

    /**
    * 用户openid列表
    */
    @SerializedName("OpenidList")
    @Expose
    private String [] OpenidList;

    /**
     * Get 千帆租户ID 
     * @return IdaasOrgId 千帆租户ID
     */
    public String getIdaasOrgId() {
        return this.IdaasOrgId;
    }

    /**
     * Set 千帆租户ID
     * @param IdaasOrgId 千帆租户ID
     */
    public void setIdaasOrgId(String IdaasOrgId) {
        this.IdaasOrgId = IdaasOrgId;
    }

    /**
     * Get 企业微信组织ID 
     * @return Corpid 企业微信组织ID
     */
    public String getCorpid() {
        return this.Corpid;
    }

    /**
     * Set 企业微信组织ID
     * @param Corpid 企业微信组织ID
     */
    public void setCorpid(String Corpid) {
        this.Corpid = Corpid;
    }

    /**
     * Get 用户openid列表 
     * @return OpenidList 用户openid列表
     */
    public String [] getOpenidList() {
        return this.OpenidList;
    }

    /**
     * Set 用户openid列表
     * @param OpenidList 用户openid列表
     */
    public void setOpenidList(String [] OpenidList) {
        this.OpenidList = OpenidList;
    }

    public DescribeAgencyUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyUsersRequest(DescribeAgencyUsersRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.Corpid != null) {
            this.Corpid = new String(source.Corpid);
        }
        if (source.OpenidList != null) {
            this.OpenidList = new String[source.OpenidList.length];
            for (int i = 0; i < source.OpenidList.length; i++) {
                this.OpenidList[i] = new String(source.OpenidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamSimple(map, prefix + "Corpid", this.Corpid);
        this.setParamArraySimple(map, prefix + "OpenidList.", this.OpenidList);

    }
}

