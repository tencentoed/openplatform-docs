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

public class ProductID extends AbstractModel{

    /**
    * 课程或者课程包id
    */
    @SerializedName("Fid")
    @Expose
    private String Fid;

    /**
    * 类型 course:课程 pkg:课程包
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 课程或者课程包id 
     * @return Fid 课程或者课程包id
     */
    public String getFid() {
        return this.Fid;
    }

    /**
     * Set 课程或者课程包id
     * @param Fid 课程或者课程包id
     */
    public void setFid(String Fid) {
        this.Fid = Fid;
    }

    /**
     * Get 类型 course:课程 pkg:课程包 
     * @return Type 类型 course:课程 pkg:课程包
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型 course:课程 pkg:课程包
     * @param Type 类型 course:课程 pkg:课程包
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ProductID() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductID(ProductID source) {
        if (source.Fid != null) {
            this.Fid = new String(source.Fid);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fid", this.Fid);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

