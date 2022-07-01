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

public class UserApply extends AbstractModel{

    /**
    * 课程id
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 班级id
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 报名时间
    */
    @SerializedName("ApplyTs")
    @Expose
    private Long ApplyTs;

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 期次url
    */
    @SerializedName("TermUrl")
    @Expose
    private String TermUrl;

    /**
     * Get 课程id 
     * @return CourseId 课程id
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程id
     * @param CourseId 课程id
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 班级id 
     * @return TermId 班级id
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级id
     * @param TermId 班级id
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 报名时间 
     * @return ApplyTs 报名时间
     */
    public Long getApplyTs() {
        return this.ApplyTs;
    }

    /**
     * Set 报名时间
     * @param ApplyTs 报名时间
     */
    public void setApplyTs(Long ApplyTs) {
        this.ApplyTs = ApplyTs;
    }

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 期次url 
     * @return TermUrl 期次url
     */
    public String getTermUrl() {
        return this.TermUrl;
    }

    /**
     * Set 期次url
     * @param TermUrl 期次url
     */
    public void setTermUrl(String TermUrl) {
        this.TermUrl = TermUrl;
    }

    public UserApply() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserApply(UserApply source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.ApplyTs != null) {
            this.ApplyTs = new Long(source.ApplyTs);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.TermUrl != null) {
            this.TermUrl = new String(source.TermUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "ApplyTs", this.ApplyTs);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "TermUrl", this.TermUrl);

    }
}

