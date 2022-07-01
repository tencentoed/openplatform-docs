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

public class DescribeAgencyPrivateCouponsRequest extends AbstractModel{

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
    * 优惠券id
    */
    @SerializedName("CouponId")
    @Expose
    private String CouponId;

    /**
    * 优惠券状态 0：已领取 2：已使用，10：未领取
    */
    @SerializedName("Filter")
    @Expose
    private Long Filter;

    /**
    * 起始页码 从0开始
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页大小 分页大小 无限制
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
     * Get 优惠券id 
     * @return CouponId 优惠券id
     */
    public String getCouponId() {
        return this.CouponId;
    }

    /**
     * Set 优惠券id
     * @param CouponId 优惠券id
     */
    public void setCouponId(String CouponId) {
        this.CouponId = CouponId;
    }

    /**
     * Get 优惠券状态 0：已领取 2：已使用，10：未领取 
     * @return Filter 优惠券状态 0：已领取 2：已使用，10：未领取
     */
    public Long getFilter() {
        return this.Filter;
    }

    /**
     * Set 优惠券状态 0：已领取 2：已使用，10：未领取
     * @param Filter 优惠券状态 0：已领取 2：已使用，10：未领取
     */
    public void setFilter(Long Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 起始页码 从0开始 
     * @return PageIndex 起始页码 从0开始
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 起始页码 从0开始
     * @param PageIndex 起始页码 从0开始
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页大小 分页大小 无限制 
     * @return PageSize 页大小 分页大小 无限制
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小 分页大小 无限制
     * @param PageSize 页大小 分页大小 无限制
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAgencyPrivateCouponsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyPrivateCouponsRequest(DescribeAgencyPrivateCouponsRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.Corpid != null) {
            this.Corpid = new String(source.Corpid);
        }
        if (source.CouponId != null) {
            this.CouponId = new String(source.CouponId);
        }
        if (source.Filter != null) {
            this.Filter = new Long(source.Filter);
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
        this.setParamSimple(map, prefix + "CouponId", this.CouponId);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

