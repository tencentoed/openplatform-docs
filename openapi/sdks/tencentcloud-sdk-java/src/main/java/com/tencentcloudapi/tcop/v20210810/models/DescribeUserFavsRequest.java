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

public class DescribeUserFavsRequest extends AbstractModel{

    /**
    * 千帆租户ID
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
    * 三方平台id这里默认新闻渠道下新闻用户id
    */
    @SerializedName("ThirdUid")
    @Expose
    private String ThirdUid;

    /**
    * 起始页，从1开始
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页条数
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
     * Get 三方平台id这里默认新闻渠道下新闻用户id 
     * @return ThirdUid 三方平台id这里默认新闻渠道下新闻用户id
     */
    public String getThirdUid() {
        return this.ThirdUid;
    }

    /**
     * Set 三方平台id这里默认新闻渠道下新闻用户id
     * @param ThirdUid 三方平台id这里默认新闻渠道下新闻用户id
     */
    public void setThirdUid(String ThirdUid) {
        this.ThirdUid = ThirdUid;
    }

    /**
     * Get 起始页，从1开始 
     * @return Page 起始页，从1开始
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 起始页，从1开始
     * @param Page 起始页，从1开始
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页条数 
     * @return PageSize 每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
     * @param PageSize 每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeUserFavsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserFavsRequest(DescribeUserFavsRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.ThirdUid != null) {
            this.ThirdUid = new String(source.ThirdUid);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
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
        this.setParamSimple(map, prefix + "ThirdUid", this.ThirdUid);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

