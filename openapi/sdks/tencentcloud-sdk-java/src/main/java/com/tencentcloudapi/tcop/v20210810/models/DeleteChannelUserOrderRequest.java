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

public class DeleteChannelUserOrderRequest extends AbstractModel{

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
    * 订单id，仅付费订单用
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 机构id 必传
    */
    @SerializedName("AgencyId")
    @Expose
    private Long AgencyId;

    /**
    * 课程id 免费订单用
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

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
     * Get 订单id，仅付费订单用 
     * @return OrderId 订单id，仅付费订单用
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id，仅付费订单用
     * @param OrderId 订单id，仅付费订单用
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 机构id 必传 
     * @return AgencyId 机构id 必传
     */
    public Long getAgencyId() {
        return this.AgencyId;
    }

    /**
     * Set 机构id 必传
     * @param AgencyId 机构id 必传
     */
    public void setAgencyId(Long AgencyId) {
        this.AgencyId = AgencyId;
    }

    /**
     * Get 课程id 免费订单用 
     * @return TermId 课程id 免费订单用
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 课程id 免费订单用
     * @param TermId 课程id 免费订单用
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    public DeleteChannelUserOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteChannelUserOrderRequest(DeleteChannelUserOrderRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.ThirdUid != null) {
            this.ThirdUid = new String(source.ThirdUid);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.AgencyId != null) {
            this.AgencyId = new Long(source.AgencyId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamSimple(map, prefix + "ThirdUid", this.ThirdUid);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "AgencyId", this.AgencyId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);

    }
}

