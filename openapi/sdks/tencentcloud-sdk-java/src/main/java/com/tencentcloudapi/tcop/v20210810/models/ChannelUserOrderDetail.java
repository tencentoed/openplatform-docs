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

public class ChannelUserOrderDetail extends AbstractModel{

    /**
    * 创建订单的uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 机构id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyId")
    @Expose
    private Long AgencyId;

    /**
    * 课程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 班级id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 课程包id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * 优惠券价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CouPrice")
    @Expose
    private Long CouPrice;

    /**
    * 课程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CourseName")
    @Expose
    private String CourseName;

    /**
    * 课程价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoursePrice")
    @Expose
    private Long CoursePrice;

    /**
    * 红包支付金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Credit")
    @Expose
    private Long Credit;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 订单状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderState")
    @Expose
    private Long OrderState;

    /**
    * 取消原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CancelReason")
    @Expose
    private String CancelReason;

    /**
    * 支付价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayPrice")
    @Expose
    private Long PayPrice;

    /**
    * 平台
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * ios标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ios")
    @Expose
    private Long Ios;

    /**
    * 课程付款类型 1,免费 2，付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoursePayId")
    @Expose
    private Long CoursePayId;

    /**
    * 订单id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 支付时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayTime")
    @Expose
    private Long PayTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillNo")
    @Expose
    private String BillNo;

    /**
    * 机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgencyName")
    @Expose
    private String AgencyName;

    /**
    * 退款时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayBackTime")
    @Expose
    private Long PayBackTime;

    /**
    * 课程封面url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoursePicUrl")
    @Expose
    private String CoursePicUrl;

    /**
    * 课程开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 创建订单的uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 创建订单的uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 创建订单的uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 创建订单的uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 机构id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyId 机构id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAgencyId() {
        return this.AgencyId;
    }

    /**
     * Set 机构id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyId 机构id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyId(Long AgencyId) {
        this.AgencyId = AgencyId;
    }

    /**
     * Get 课程id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseId 课程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseId 课程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 班级id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TermId 班级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TermId 班级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 课程包id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 课程包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 课程包id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 课程包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 优惠券价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CouPrice 优惠券价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCouPrice() {
        return this.CouPrice;
    }

    /**
     * Set 优惠券价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CouPrice 优惠券价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCouPrice(Long CouPrice) {
        this.CouPrice = CouPrice;
    }

    /**
     * Get 课程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CourseName 课程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCourseName() {
        return this.CourseName;
    }

    /**
     * Set 课程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CourseName 课程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     * Get 课程价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoursePrice 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoursePrice() {
        return this.CoursePrice;
    }

    /**
     * Set 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoursePrice 课程价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoursePrice(Long CoursePrice) {
        this.CoursePrice = CoursePrice;
    }

    /**
     * Get 红包支付金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Credit 红包支付金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCredit() {
        return this.Credit;
    }

    /**
     * Set 红包支付金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Credit 红包支付金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCredit(Long Credit) {
        this.Credit = Credit;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 订单状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderState 订单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderState() {
        return this.OrderState;
    }

    /**
     * Set 订单状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderState 订单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderState(Long OrderState) {
        this.OrderState = OrderState;
    }

    /**
     * Get 取消原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CancelReason 取消原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCancelReason() {
        return this.CancelReason;
    }

    /**
     * Set 取消原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param CancelReason 取消原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancelReason(String CancelReason) {
        this.CancelReason = CancelReason;
    }

    /**
     * Get 支付价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayPrice 支付价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayPrice() {
        return this.PayPrice;
    }

    /**
     * Set 支付价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayPrice 支付价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayPrice(Long PayPrice) {
        this.PayPrice = PayPrice;
    }

    /**
     * Get 平台
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Platform 平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台
注意：此字段可能返回 null，表示取不到有效值。
     * @param Platform 平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get ios标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ios ios标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIos() {
        return this.Ios;
    }

    /**
     * Set ios标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ios ios标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIos(Long Ios) {
        this.Ios = Ios;
    }

    /**
     * Get 课程付款类型 1,免费 2，付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoursePayId 课程付款类型 1,免费 2，付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoursePayId() {
        return this.CoursePayId;
    }

    /**
     * Set 课程付款类型 1,免费 2，付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoursePayId 课程付款类型 1,免费 2，付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoursePayId(Long CoursePayId) {
        this.CoursePayId = CoursePayId;
    }

    /**
     * Get 订单id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 支付时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayTime 支付时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 支付时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayTime 支付时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayTime(Long PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillNo 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillNo() {
        return this.BillNo;
    }

    /**
     * Set 订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillNo 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillNo(String BillNo) {
        this.BillNo = BillNo;
    }

    /**
     * Get 机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgencyName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgencyName() {
        return this.AgencyName;
    }

    /**
     * Set 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgencyName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }

    /**
     * Get 退款时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayBackTime 退款时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayBackTime() {
        return this.PayBackTime;
    }

    /**
     * Set 退款时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayBackTime 退款时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayBackTime(Long PayBackTime) {
        this.PayBackTime = PayBackTime;
    }

    /**
     * Get 课程封面url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoursePicUrl 课程封面url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoursePicUrl() {
        return this.CoursePicUrl;
    }

    /**
     * Set 课程封面url
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoursePicUrl 课程封面url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoursePicUrl(String CoursePicUrl) {
        this.CoursePicUrl = CoursePicUrl;
    }

    /**
     * Get 课程开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 课程开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 课程开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 课程开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 课程结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public ChannelUserOrderDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelUserOrderDetail(ChannelUserOrderDetail source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.AgencyId != null) {
            this.AgencyId = new Long(source.AgencyId);
        }
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.PackageId != null) {
            this.PackageId = new Long(source.PackageId);
        }
        if (source.CouPrice != null) {
            this.CouPrice = new Long(source.CouPrice);
        }
        if (source.CourseName != null) {
            this.CourseName = new String(source.CourseName);
        }
        if (source.CoursePrice != null) {
            this.CoursePrice = new Long(source.CoursePrice);
        }
        if (source.Credit != null) {
            this.Credit = new Long(source.Credit);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.OrderState != null) {
            this.OrderState = new Long(source.OrderState);
        }
        if (source.CancelReason != null) {
            this.CancelReason = new String(source.CancelReason);
        }
        if (source.PayPrice != null) {
            this.PayPrice = new Long(source.PayPrice);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.Ios != null) {
            this.Ios = new Long(source.Ios);
        }
        if (source.CoursePayId != null) {
            this.CoursePayId = new Long(source.CoursePayId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.PayTime != null) {
            this.PayTime = new Long(source.PayTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.BillNo != null) {
            this.BillNo = new String(source.BillNo);
        }
        if (source.AgencyName != null) {
            this.AgencyName = new String(source.AgencyName);
        }
        if (source.PayBackTime != null) {
            this.PayBackTime = new Long(source.PayBackTime);
        }
        if (source.CoursePicUrl != null) {
            this.CoursePicUrl = new String(source.CoursePicUrl);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AgencyId", this.AgencyId);
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "CouPrice", this.CouPrice);
        this.setParamSimple(map, prefix + "CourseName", this.CourseName);
        this.setParamSimple(map, prefix + "CoursePrice", this.CoursePrice);
        this.setParamSimple(map, prefix + "Credit", this.Credit);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);
        this.setParamSimple(map, prefix + "CancelReason", this.CancelReason);
        this.setParamSimple(map, prefix + "PayPrice", this.PayPrice);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Ios", this.Ios);
        this.setParamSimple(map, prefix + "CoursePayId", this.CoursePayId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "BillNo", this.BillNo);
        this.setParamSimple(map, prefix + "AgencyName", this.AgencyName);
        this.setParamSimple(map, prefix + "PayBackTime", this.PayBackTime);
        this.setParamSimple(map, prefix + "CoursePicUrl", this.CoursePicUrl);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

