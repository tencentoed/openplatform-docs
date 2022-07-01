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

public class DescribeAgencyCourseInfosRequest extends AbstractModel{

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
    * 分页页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 分页每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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

    /**
     * Get 分页页码 
     * @return PageIndex 分页页码
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 分页页码
     * @param PageIndex 分页页码
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 分页每页大小 
     * @return PageSize 分页每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页每页大小
     * @param PageSize 分页每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAgencyCourseInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyCourseInfosRequest(DescribeAgencyCourseInfosRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.Corpid != null) {
            this.Corpid = new String(source.Corpid);
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
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

