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

public class ModifyUserFavBatchResponse extends AbstractModel{

    /**
    * 操作成功的收藏id
    */
    @SerializedName("SuccessIds")
    @Expose
    private Long [] SuccessIds;

    /**
    * 操作失败的收藏id
    */
    @SerializedName("FailIds")
    @Expose
    private Long [] FailIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作成功的收藏id 
     * @return SuccessIds 操作成功的收藏id
     */
    public Long [] getSuccessIds() {
        return this.SuccessIds;
    }

    /**
     * Set 操作成功的收藏id
     * @param SuccessIds 操作成功的收藏id
     */
    public void setSuccessIds(Long [] SuccessIds) {
        this.SuccessIds = SuccessIds;
    }

    /**
     * Get 操作失败的收藏id 
     * @return FailIds 操作失败的收藏id
     */
    public Long [] getFailIds() {
        return this.FailIds;
    }

    /**
     * Set 操作失败的收藏id
     * @param FailIds 操作失败的收藏id
     */
    public void setFailIds(Long [] FailIds) {
        this.FailIds = FailIds;
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

    public ModifyUserFavBatchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserFavBatchResponse(ModifyUserFavBatchResponse source) {
        if (source.SuccessIds != null) {
            this.SuccessIds = new Long[source.SuccessIds.length];
            for (int i = 0; i < source.SuccessIds.length; i++) {
                this.SuccessIds[i] = new Long(source.SuccessIds[i]);
            }
        }
        if (source.FailIds != null) {
            this.FailIds = new Long[source.FailIds.length];
            for (int i = 0; i < source.FailIds.length; i++) {
                this.FailIds[i] = new Long(source.FailIds[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessIds.", this.SuccessIds);
        this.setParamArraySimple(map, prefix + "FailIds.", this.FailIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

