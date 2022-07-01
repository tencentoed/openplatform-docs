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

public class DescribeChannelUserOrdersRequest extends AbstractModel{

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
    * 起始页码（从0开始）
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 订单类型 1是免费订单2是付费订单
    */
    @SerializedName("CoursePayId")
    @Expose
    private Long CoursePayId;

    /**
    * 用户选择的标签页 0全部 1待付款 2退款中 3待评价 4重学/赠送
    */
    @SerializedName("OrderState")
    @Expose
    private Long OrderState;

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
     * Get 起始页码（从0开始） 
     * @return PageIndex 起始页码（从0开始）
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 起始页码（从0开始）
     * @param PageIndex 起始页码（从0开始）
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 订单类型 1是免费订单2是付费订单 
     * @return CoursePayId 订单类型 1是免费订单2是付费订单
     */
    public Long getCoursePayId() {
        return this.CoursePayId;
    }

    /**
     * Set 订单类型 1是免费订单2是付费订单
     * @param CoursePayId 订单类型 1是免费订单2是付费订单
     */
    public void setCoursePayId(Long CoursePayId) {
        this.CoursePayId = CoursePayId;
    }

    /**
     * Get 用户选择的标签页 0全部 1待付款 2退款中 3待评价 4重学/赠送 
     * @return OrderState 用户选择的标签页 0全部 1待付款 2退款中 3待评价 4重学/赠送
     */
    public Long getOrderState() {
        return this.OrderState;
    }

    /**
     * Set 用户选择的标签页 0全部 1待付款 2退款中 3待评价 4重学/赠送
     * @param OrderState 用户选择的标签页 0全部 1待付款 2退款中 3待评价 4重学/赠送
     */
    public void setOrderState(Long OrderState) {
        this.OrderState = OrderState;
    }

    public DescribeChannelUserOrdersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChannelUserOrdersRequest(DescribeChannelUserOrdersRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.ThirdUid != null) {
            this.ThirdUid = new String(source.ThirdUid);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CoursePayId != null) {
            this.CoursePayId = new Long(source.CoursePayId);
        }
        if (source.OrderState != null) {
            this.OrderState = new Long(source.OrderState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamSimple(map, prefix + "ThirdUid", this.ThirdUid);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "CoursePayId", this.CoursePayId);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);

    }
}

