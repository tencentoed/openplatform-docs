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

public class MsgNotOnlineImage extends AbstractModel{

    /**
    * 图片链接
    */
    @SerializedName("PicUrl")
    @Expose
    private String PicUrl;

    /**
     * Get 图片链接 
     * @return PicUrl 图片链接
     */
    public String getPicUrl() {
        return this.PicUrl;
    }

    /**
     * Set 图片链接
     * @param PicUrl 图片链接
     */
    public void setPicUrl(String PicUrl) {
        this.PicUrl = PicUrl;
    }

    public MsgNotOnlineImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgNotOnlineImage(MsgNotOnlineImage source) {
        if (source.PicUrl != null) {
            this.PicUrl = new String(source.PicUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PicUrl", this.PicUrl);

    }
}

