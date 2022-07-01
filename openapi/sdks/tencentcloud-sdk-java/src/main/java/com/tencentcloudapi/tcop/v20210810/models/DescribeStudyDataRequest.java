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

public class DescribeStudyDataRequest extends AbstractModel{

    /**
    * 千帆租户ID
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
    * 直播间id
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 课程任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

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
     * Get 课程任务id 
     * @return TaskId 课程任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 课程任务id
     * @param TaskId 课程任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
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

    public DescribeStudyDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStudyDataRequest(DescribeStudyDataRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
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
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

