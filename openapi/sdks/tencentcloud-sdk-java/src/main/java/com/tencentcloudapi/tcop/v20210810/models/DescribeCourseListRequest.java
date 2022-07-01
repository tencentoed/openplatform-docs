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

public class DescribeCourseListRequest extends AbstractModel{

    /**
    * 课程类型：1-课程ID 2-课程包ID（可选）
    */
    @SerializedName("CourseType")
    @Expose
    private Long CourseType;

    /**
    * 分页序号，第一页序号为1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 分页大小，最大分页 50
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 课程类型：1-课程ID 2-课程包ID（可选） 
     * @return CourseType 课程类型：1-课程ID 2-课程包ID（可选）
     */
    public Long getCourseType() {
        return this.CourseType;
    }

    /**
     * Set 课程类型：1-课程ID 2-课程包ID（可选）
     * @param CourseType 课程类型：1-课程ID 2-课程包ID（可选）
     */
    public void setCourseType(Long CourseType) {
        this.CourseType = CourseType;
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
     * Get 分页大小，最大分页 50 
     * @return PageSize 分页大小，最大分页 50
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，最大分页 50
     * @param PageSize 分页大小，最大分页 50
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeCourseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCourseListRequest(DescribeCourseListRequest source) {
        if (source.CourseType != null) {
            this.CourseType = new Long(source.CourseType);
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
        this.setParamSimple(map, prefix + "CourseType", this.CourseType);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

