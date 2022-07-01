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

public class CreateCdKeyUserExchangeRequest extends AbstractModel{

    /**
    * 第三方平台用户ID
    */
    @SerializedName("ThirdUid")
    @Expose
    private String ThirdUid;

    /**
    * 兑换码
    */
    @SerializedName("CdKey")
    @Expose
    private String CdKey;

    /**
     * Get 第三方平台用户ID 
     * @return ThirdUid 第三方平台用户ID
     */
    public String getThirdUid() {
        return this.ThirdUid;
    }

    /**
     * Set 第三方平台用户ID
     * @param ThirdUid 第三方平台用户ID
     */
    public void setThirdUid(String ThirdUid) {
        this.ThirdUid = ThirdUid;
    }

    /**
     * Get 兑换码 
     * @return CdKey 兑换码
     */
    public String getCdKey() {
        return this.CdKey;
    }

    /**
     * Set 兑换码
     * @param CdKey 兑换码
     */
    public void setCdKey(String CdKey) {
        this.CdKey = CdKey;
    }

    public CreateCdKeyUserExchangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCdKeyUserExchangeRequest(CreateCdKeyUserExchangeRequest source) {
        if (source.ThirdUid != null) {
            this.ThirdUid = new String(source.ThirdUid);
        }
        if (source.CdKey != null) {
            this.CdKey = new String(source.CdKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThirdUid", this.ThirdUid);
        this.setParamSimple(map, prefix + "CdKey", this.CdKey);

    }
}

