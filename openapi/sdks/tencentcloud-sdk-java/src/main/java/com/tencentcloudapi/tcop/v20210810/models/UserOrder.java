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

public class UserOrder extends AbstractModel{

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 课程ID
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 课程包ID
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * 课程名称
    */
    @SerializedName("CourseName")
    @Expose
    private String CourseName;

    /**
    * 班级ID
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 课程价格 ,单位为分
    */
    @SerializedName("CoursePrice")
    @Expose
    private Long CoursePrice;

    /**
    * 用户openID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 创建订单的 Unix 时间戳， 单位为秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 订单状态， 1为待付款，2为支付成功，3为发货成功，4为发货失败，5为交易成功，6为交易待确认，7为交易待审核，8为退款中，9为退款确认，10为退款成功，11为退款拒绝，300为机构退款
    */
    @SerializedName("OrderState")
    @Expose
    private Long OrderState;

    /**
    * 实付金额 ,单位为分
    */
    @SerializedName("PayPrice")
    @Expose
    private Long PayPrice;

    /**
    * 支付时间 , unix时间戳，单位为秒
    */
    @SerializedName("PayTime")
    @Expose
    private Long PayTime;

    /**
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 课程ID 
     * @return CourseId 课程ID
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程ID
     * @param CourseId 课程ID
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 课程包ID 
     * @return PackageId 课程包ID
     */
    public Long getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 课程包ID
     * @param PackageId 课程包ID
     */
    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 课程名称 
     * @return CourseName 课程名称
     */
    public String getCourseName() {
        return this.CourseName;
    }

    /**
     * Set 课程名称
     * @param CourseName 课程名称
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     * Get 班级ID 
     * @return TermId 班级ID
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级ID
     * @param TermId 班级ID
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 课程价格 ,单位为分 
     * @return CoursePrice 课程价格 ,单位为分
     */
    public Long getCoursePrice() {
        return this.CoursePrice;
    }

    /**
     * Set 课程价格 ,单位为分
     * @param CoursePrice 课程价格 ,单位为分
     */
    public void setCoursePrice(Long CoursePrice) {
        this.CoursePrice = CoursePrice;
    }

    /**
     * Get 用户openID 
     * @return OpenId 用户openID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户openID
     * @param OpenId 用户openID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 创建订单的 Unix 时间戳， 单位为秒 
     * @return CreateTime 创建订单的 Unix 时间戳， 单位为秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建订单的 Unix 时间戳， 单位为秒
     * @param CreateTime 创建订单的 Unix 时间戳， 单位为秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 订单状态， 1为待付款，2为支付成功，3为发货成功，4为发货失败，5为交易成功，6为交易待确认，7为交易待审核，8为退款中，9为退款确认，10为退款成功，11为退款拒绝，300为机构退款 
     * @return OrderState 订单状态， 1为待付款，2为支付成功，3为发货成功，4为发货失败，5为交易成功，6为交易待确认，7为交易待审核，8为退款中，9为退款确认，10为退款成功，11为退款拒绝，300为机构退款
     */
    public Long getOrderState() {
        return this.OrderState;
    }

    /**
     * Set 订单状态， 1为待付款，2为支付成功，3为发货成功，4为发货失败，5为交易成功，6为交易待确认，7为交易待审核，8为退款中，9为退款确认，10为退款成功，11为退款拒绝，300为机构退款
     * @param OrderState 订单状态， 1为待付款，2为支付成功，3为发货成功，4为发货失败，5为交易成功，6为交易待确认，7为交易待审核，8为退款中，9为退款确认，10为退款成功，11为退款拒绝，300为机构退款
     */
    public void setOrderState(Long OrderState) {
        this.OrderState = OrderState;
    }

    /**
     * Get 实付金额 ,单位为分 
     * @return PayPrice 实付金额 ,单位为分
     */
    public Long getPayPrice() {
        return this.PayPrice;
    }

    /**
     * Set 实付金额 ,单位为分
     * @param PayPrice 实付金额 ,单位为分
     */
    public void setPayPrice(Long PayPrice) {
        this.PayPrice = PayPrice;
    }

    /**
     * Get 支付时间 , unix时间戳，单位为秒 
     * @return PayTime 支付时间 , unix时间戳，单位为秒
     */
    public Long getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 支付时间 , unix时间戳，单位为秒
     * @param PayTime 支付时间 , unix时间戳，单位为秒
     */
    public void setPayTime(Long PayTime) {
        this.PayTime = PayTime;
    }

    public UserOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserOrder(UserOrder source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.PackageId != null) {
            this.PackageId = new Long(source.PackageId);
        }
        if (source.CourseName != null) {
            this.CourseName = new String(source.CourseName);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.CoursePrice != null) {
            this.CoursePrice = new Long(source.CoursePrice);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.OrderState != null) {
            this.OrderState = new Long(source.OrderState);
        }
        if (source.PayPrice != null) {
            this.PayPrice = new Long(source.PayPrice);
        }
        if (source.PayTime != null) {
            this.PayTime = new Long(source.PayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "CourseName", this.CourseName);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "CoursePrice", this.CoursePrice);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);
        this.setParamSimple(map, prefix + "PayPrice", this.PayPrice);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);

    }
}

