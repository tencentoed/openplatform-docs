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

public class DescribeAgencyCoursePkgRequest extends AbstractModel{

    /**
    * 课程包id列表
    */
    @SerializedName("PackageIdList")
    @Expose
    private Long [] PackageIdList;

    /**
    * 千帆租户ID
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
    * 企业id
    */
    @SerializedName("Corpid")
    @Expose
    private String Corpid;

    /**
     * Get 课程包id列表 
     * @return PackageIdList 课程包id列表
     */
    public Long [] getPackageIdList() {
        return this.PackageIdList;
    }

    /**
     * Set 课程包id列表
     * @param PackageIdList 课程包id列表
     */
    public void setPackageIdList(Long [] PackageIdList) {
        this.PackageIdList = PackageIdList;
    }

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
     * Get 企业id 
     * @return Corpid 企业id
     */
    public String getCorpid() {
        return this.Corpid;
    }

    /**
     * Set 企业id
     * @param Corpid 企业id
     */
    public void setCorpid(String Corpid) {
        this.Corpid = Corpid;
    }

    public DescribeAgencyCoursePkgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyCoursePkgRequest(DescribeAgencyCoursePkgRequest source) {
        if (source.PackageIdList != null) {
            this.PackageIdList = new Long[source.PackageIdList.length];
            for (int i = 0; i < source.PackageIdList.length; i++) {
                this.PackageIdList[i] = new Long(source.PackageIdList[i]);
            }
        }
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.Corpid != null) {
            this.Corpid = new String(source.Corpid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PackageIdList.", this.PackageIdList);
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamSimple(map, prefix + "Corpid", this.Corpid);

    }
}

