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

public class ShortCouponInfo extends AbstractModel{

    /**
    * 优惠券id
    */
    @SerializedName("CouponId")
    @Expose
    private String CouponId;

    /**
    * 优惠券链接
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

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
     * Get 优惠券链接 
     * @return JumpUrl 优惠券链接
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 优惠券链接
     * @param JumpUrl 优惠券链接
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public ShortCouponInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShortCouponInfo(ShortCouponInfo source) {
        if (source.CouponId != null) {
            this.CouponId = new String(source.CouponId);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CouponId", this.CouponId);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

