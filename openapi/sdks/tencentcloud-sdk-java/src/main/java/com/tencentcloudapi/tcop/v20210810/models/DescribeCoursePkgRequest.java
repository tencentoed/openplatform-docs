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

public class DescribeCoursePkgRequest extends AbstractModel{

    /**
    * 系列课ID列表，单次上限：10
    */
    @SerializedName("PkgIds")
    @Expose
    private Long [] PkgIds;

    /**
     * Get 系列课ID列表，单次上限：10 
     * @return PkgIds 系列课ID列表，单次上限：10
     */
    public Long [] getPkgIds() {
        return this.PkgIds;
    }

    /**
     * Set 系列课ID列表，单次上限：10
     * @param PkgIds 系列课ID列表，单次上限：10
     */
    public void setPkgIds(Long [] PkgIds) {
        this.PkgIds = PkgIds;
    }

    public DescribeCoursePkgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCoursePkgRequest(DescribeCoursePkgRequest source) {
        if (source.PkgIds != null) {
            this.PkgIds = new Long[source.PkgIds.length];
            for (int i = 0; i < source.PkgIds.length; i++) {
                this.PkgIds[i] = new Long(source.PkgIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PkgIds.", this.PkgIds);

    }
}

