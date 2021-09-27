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

public class CouponRule extends AbstractModel{

    /**
    * 优惠券使用规则 1:全站通用;2:指定课程课程包;3:指定机构;4:指定类目
    */
    @SerializedName("UseRole")
    @Expose
    private Long UseRole;

    /**
    * 满减券金额 / 一口价金额  ，单位：分
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 满多少金额
    */
    @SerializedName("Condition")
    @Expose
    private Long Condition;

    /**
    * 指定课程和课程包列表
    */
    @SerializedName("UseRoleList")
    @Expose
    private ProductInfo [] UseRoleList;

    /**
     * Get 优惠券使用规则 1:全站通用;2:指定课程课程包;3:指定机构;4:指定类目 
     * @return UseRole 优惠券使用规则 1:全站通用;2:指定课程课程包;3:指定机构;4:指定类目
     */
    public Long getUseRole() {
        return this.UseRole;
    }

    /**
     * Set 优惠券使用规则 1:全站通用;2:指定课程课程包;3:指定机构;4:指定类目
     * @param UseRole 优惠券使用规则 1:全站通用;2:指定课程课程包;3:指定机构;4:指定类目
     */
    public void setUseRole(Long UseRole) {
        this.UseRole = UseRole;
    }

    /**
     * Get 满减券金额 / 一口价金额  ，单位：分 
     * @return Price 满减券金额 / 一口价金额  ，单位：分
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 满减券金额 / 一口价金额  ，单位：分
     * @param Price 满减券金额 / 一口价金额  ，单位：分
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 满多少金额 
     * @return Condition 满多少金额
     */
    public Long getCondition() {
        return this.Condition;
    }

    /**
     * Set 满多少金额
     * @param Condition 满多少金额
     */
    public void setCondition(Long Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 指定课程和课程包列表 
     * @return UseRoleList 指定课程和课程包列表
     */
    public ProductInfo [] getUseRoleList() {
        return this.UseRoleList;
    }

    /**
     * Set 指定课程和课程包列表
     * @param UseRoleList 指定课程和课程包列表
     */
    public void setUseRoleList(ProductInfo [] UseRoleList) {
        this.UseRoleList = UseRoleList;
    }

    public CouponRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CouponRule(CouponRule source) {
        if (source.UseRole != null) {
            this.UseRole = new Long(source.UseRole);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.Condition != null) {
            this.Condition = new Long(source.Condition);
        }
        if (source.UseRoleList != null) {
            this.UseRoleList = new ProductInfo[source.UseRoleList.length];
            for (int i = 0; i < source.UseRoleList.length; i++) {
                this.UseRoleList[i] = new ProductInfo(source.UseRoleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseRole", this.UseRole);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "UseRoleList.", this.UseRoleList);

    }
}

