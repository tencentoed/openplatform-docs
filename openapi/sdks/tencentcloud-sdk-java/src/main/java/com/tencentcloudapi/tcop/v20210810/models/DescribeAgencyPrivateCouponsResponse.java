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

public class DescribeAgencyPrivateCouponsResponse extends AbstractModel{

    /**
    * 下一页序号
    */
    @SerializedName("PageNext")
    @Expose
    private Long PageNext;

    /**
    * 优惠券列表
    */
    @SerializedName("CouponList")
    @Expose
    private ShortCouponInfo [] CouponList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下一页序号 
     * @return PageNext 下一页序号
     */
    public Long getPageNext() {
        return this.PageNext;
    }

    /**
     * Set 下一页序号
     * @param PageNext 下一页序号
     */
    public void setPageNext(Long PageNext) {
        this.PageNext = PageNext;
    }

    /**
     * Get 优惠券列表 
     * @return CouponList 优惠券列表
     */
    public ShortCouponInfo [] getCouponList() {
        return this.CouponList;
    }

    /**
     * Set 优惠券列表
     * @param CouponList 优惠券列表
     */
    public void setCouponList(ShortCouponInfo [] CouponList) {
        this.CouponList = CouponList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAgencyPrivateCouponsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgencyPrivateCouponsResponse(DescribeAgencyPrivateCouponsResponse source) {
        if (source.PageNext != null) {
            this.PageNext = new Long(source.PageNext);
        }
        if (source.CouponList != null) {
            this.CouponList = new ShortCouponInfo[source.CouponList.length];
            for (int i = 0; i < source.CouponList.length; i++) {
                this.CouponList[i] = new ShortCouponInfo(source.CouponList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNext", this.PageNext);
        this.setParamArrayObj(map, prefix + "CouponList.", this.CouponList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

