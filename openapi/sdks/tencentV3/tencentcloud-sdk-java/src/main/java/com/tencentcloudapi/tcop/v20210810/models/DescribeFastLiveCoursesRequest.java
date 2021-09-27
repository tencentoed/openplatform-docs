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

public class DescribeFastLiveCoursesRequest extends AbstractModel{

    /**
    * 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 分页序号，第一页序号为1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 分页大小，最大分页50
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 开放平台分配给第三方的千帆id
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
     * Get 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程 
     * @return TeacherId 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程
     * @param TeacherId 接入方通讯录中的老师id，不存在则返回appid作用域下所有课程
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 分页序号，第一页序号为1 
     * @return Page 分页序号，第一页序号为1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页序号，第一页序号为1
     * @param Page 分页序号，第一页序号为1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 分页大小，最大分页50 
     * @return PageSize 分页大小，最大分页50
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，最大分页50
     * @param PageSize 分页大小，最大分页50
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    public DescribeFastLiveCoursesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFastLiveCoursesRequest(DescribeFastLiveCoursesRequest source) {
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);

    }
}

