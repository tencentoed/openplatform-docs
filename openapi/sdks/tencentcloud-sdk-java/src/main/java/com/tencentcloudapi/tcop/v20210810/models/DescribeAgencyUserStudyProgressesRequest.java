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

public class DescribeAgencyUserStudyProgressesRequest extends AbstractModel{

    /**
    * 租户id
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
    * 用户OpenId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 起始页 从0开始
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页大小 分页大小 最大为10000
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 租户id 
     * @return IdaasOrgId 租户id
     */
    public String getIdaasOrgId() {
        return this.IdaasOrgId;
    }

    /**
     * Set 租户id
     * @param IdaasOrgId 租户id
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

    /**
     * Get 用户OpenId 
     * @return OpenId 用户OpenId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户OpenId
     * @param OpenId 用户OpenId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 起始页 从0开始 
     * @return PageIndex 起始页 从0开始
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 起始页 从0开始
     * @param PageIndex 起始页 从0开始
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页大小 分页大小 最大为10000 
     * @return PageSize 页大小 分页大小 最大为10000
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小 分页大小 最大为10000
     * @param PageSize 页大小 分页大小 最大为10000
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAgencyUserStudyProgressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyUserStudyProgressesRequest(DescribeAgencyUserStudyProgressesRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.Corpid != null) {
            this.Corpid = new String(source.Corpid);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamSimple(map, prefix + "Corpid", this.Corpid);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

