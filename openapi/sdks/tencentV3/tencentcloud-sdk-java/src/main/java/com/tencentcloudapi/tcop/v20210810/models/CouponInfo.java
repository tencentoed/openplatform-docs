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

public class CouponInfo extends AbstractModel{

    /**
    * 优惠券id
    */
    @SerializedName("CouponId")
    @Expose
    private String CouponId;

    /**
    * 发行方式,1:私密发行;2:运营活动发行;3:公开发行;4:批量私密
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 可使用有效开始时间,单位：秒
    */
    @SerializedName("ValidBeginTime")
    @Expose
    private Long ValidBeginTime;

    /**
    * 可使用有效截止时间
    */
    @SerializedName("ValidEndTime")
    @Expose
    private Long ValidEndTime;

    /**
    * 优惠券发行总数
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 优惠券使用数量
    */
    @SerializedName("UseCnt")
    @Expose
    private Long UseCnt;

    /**
    * 优惠券领取数量
    */
    @SerializedName("RecvCnt")
    @Expose
    private Long RecvCnt;

    /**
    * 优惠券状态0:未发布;1:已发布;2:已过期;3:已删除;4:已下架
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 优惠券链接列表
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 优惠券使用规则
    */
    @SerializedName("CouponRule")
    @Expose
    private CouponRule CouponRule;

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
     * Get 发行方式,1:私密发行;2:运营活动发行;3:公开发行;4:批量私密 
     * @return Mode 发行方式,1:私密发行;2:运营活动发行;3:公开发行;4:批量私密
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 发行方式,1:私密发行;2:运营活动发行;3:公开发行;4:批量私密
     * @param Mode 发行方式,1:私密发行;2:运营活动发行;3:公开发行;4:批量私密
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 可使用有效开始时间,单位：秒 
     * @return ValidBeginTime 可使用有效开始时间,单位：秒
     */
    public Long getValidBeginTime() {
        return this.ValidBeginTime;
    }

    /**
     * Set 可使用有效开始时间,单位：秒
     * @param ValidBeginTime 可使用有效开始时间,单位：秒
     */
    public void setValidBeginTime(Long ValidBeginTime) {
        this.ValidBeginTime = ValidBeginTime;
    }

    /**
     * Get 可使用有效截止时间 
     * @return ValidEndTime 可使用有效截止时间
     */
    public Long getValidEndTime() {
        return this.ValidEndTime;
    }

    /**
     * Set 可使用有效截止时间
     * @param ValidEndTime 可使用有效截止时间
     */
    public void setValidEndTime(Long ValidEndTime) {
        this.ValidEndTime = ValidEndTime;
    }

    /**
     * Get 优惠券发行总数 
     * @return TotalCnt 优惠券发行总数
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 优惠券发行总数
     * @param TotalCnt 优惠券发行总数
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 优惠券使用数量 
     * @return UseCnt 优惠券使用数量
     */
    public Long getUseCnt() {
        return this.UseCnt;
    }

    /**
     * Set 优惠券使用数量
     * @param UseCnt 优惠券使用数量
     */
    public void setUseCnt(Long UseCnt) {
        this.UseCnt = UseCnt;
    }

    /**
     * Get 优惠券领取数量 
     * @return RecvCnt 优惠券领取数量
     */
    public Long getRecvCnt() {
        return this.RecvCnt;
    }

    /**
     * Set 优惠券领取数量
     * @param RecvCnt 优惠券领取数量
     */
    public void setRecvCnt(Long RecvCnt) {
        this.RecvCnt = RecvCnt;
    }

    /**
     * Get 优惠券状态0:未发布;1:已发布;2:已过期;3:已删除;4:已下架 
     * @return Status 优惠券状态0:未发布;1:已发布;2:已过期;3:已删除;4:已下架
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 优惠券状态0:未发布;1:已发布;2:已过期;3:已删除;4:已下架
     * @param Status 优惠券状态0:未发布;1:已发布;2:已过期;3:已删除;4:已下架
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 优惠券链接列表 
     * @return JumpUrl 优惠券链接列表
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 优惠券链接列表
     * @param JumpUrl 优惠券链接列表
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 优惠券使用规则 
     * @return CouponRule 优惠券使用规则
     */
    public CouponRule getCouponRule() {
        return this.CouponRule;
    }

    /**
     * Set 优惠券使用规则
     * @param CouponRule 优惠券使用规则
     */
    public void setCouponRule(CouponRule CouponRule) {
        this.CouponRule = CouponRule;
    }

    public CouponInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CouponInfo(CouponInfo source) {
        if (source.CouponId != null) {
            this.CouponId = new String(source.CouponId);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.ValidBeginTime != null) {
            this.ValidBeginTime = new Long(source.ValidBeginTime);
        }
        if (source.ValidEndTime != null) {
            this.ValidEndTime = new Long(source.ValidEndTime);
        }
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.UseCnt != null) {
            this.UseCnt = new Long(source.UseCnt);
        }
        if (source.RecvCnt != null) {
            this.RecvCnt = new Long(source.RecvCnt);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.CouponRule != null) {
            this.CouponRule = new CouponRule(source.CouponRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CouponId", this.CouponId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ValidBeginTime", this.ValidBeginTime);
        this.setParamSimple(map, prefix + "ValidEndTime", this.ValidEndTime);
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamSimple(map, prefix + "UseCnt", this.UseCnt);
        this.setParamSimple(map, prefix + "RecvCnt", this.RecvCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "CouponRule.", this.CouponRule);

    }
}

