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

public class ModifyUserFavBatchRequest extends AbstractModel{

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
    * 收藏类型 0:收藏课程 2:收藏课程包
    */
    @SerializedName("FavType")
    @Expose
    private Long FavType;

    /**
    * 收藏ID
    */
    @SerializedName("FavIds")
    @Expose
    private Long [] FavIds;

    /**
    * 收藏动作0 取消收藏 1 收藏
    */
    @SerializedName("FavAction")
    @Expose
    private Long FavAction;

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
     * Get 收藏类型 0:收藏课程 2:收藏课程包 
     * @return FavType 收藏类型 0:收藏课程 2:收藏课程包
     */
    public Long getFavType() {
        return this.FavType;
    }

    /**
     * Set 收藏类型 0:收藏课程 2:收藏课程包
     * @param FavType 收藏类型 0:收藏课程 2:收藏课程包
     */
    public void setFavType(Long FavType) {
        this.FavType = FavType;
    }

    /**
     * Get 收藏ID 
     * @return FavIds 收藏ID
     */
    public Long [] getFavIds() {
        return this.FavIds;
    }

    /**
     * Set 收藏ID
     * @param FavIds 收藏ID
     */
    public void setFavIds(Long [] FavIds) {
        this.FavIds = FavIds;
    }

    /**
     * Get 收藏动作0 取消收藏 1 收藏 
     * @return FavAction 收藏动作0 取消收藏 1 收藏
     */
    public Long getFavAction() {
        return this.FavAction;
    }

    /**
     * Set 收藏动作0 取消收藏 1 收藏
     * @param FavAction 收藏动作0 取消收藏 1 收藏
     */
    public void setFavAction(Long FavAction) {
        this.FavAction = FavAction;
    }

    public ModifyUserFavBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserFavBatchRequest(ModifyUserFavBatchRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.ThirdUid != null) {
            this.ThirdUid = new String(source.ThirdUid);
        }
        if (source.FavType != null) {
            this.FavType = new Long(source.FavType);
        }
        if (source.FavIds != null) {
            this.FavIds = new Long[source.FavIds.length];
            for (int i = 0; i < source.FavIds.length; i++) {
                this.FavIds[i] = new Long(source.FavIds[i]);
            }
        }
        if (source.FavAction != null) {
            this.FavAction = new Long(source.FavAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamSimple(map, prefix + "ThirdUid", this.ThirdUid);
        this.setParamSimple(map, prefix + "FavType", this.FavType);
        this.setParamArraySimple(map, prefix + "FavIds.", this.FavIds);
        this.setParamSimple(map, prefix + "FavAction", this.FavAction);

    }
}

