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

public class VideoExt extends AbstractModel{

    /**
    * 视频时长
    */
    @SerializedName("ResIdTimes")
    @Expose
    private Long ResIdTimes;

    /**
    * 视频ID
    */
    @SerializedName("ResId")
    @Expose
    private String ResId;

    /**
     * Get 视频时长 
     * @return ResIdTimes 视频时长
     */
    public Long getResIdTimes() {
        return this.ResIdTimes;
    }

    /**
     * Set 视频时长
     * @param ResIdTimes 视频时长
     */
    public void setResIdTimes(Long ResIdTimes) {
        this.ResIdTimes = ResIdTimes;
    }

    /**
     * Get 视频ID 
     * @return ResId 视频ID
     */
    public String getResId() {
        return this.ResId;
    }

    /**
     * Set 视频ID
     * @param ResId 视频ID
     */
    public void setResId(String ResId) {
        this.ResId = ResId;
    }

    public VideoExt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoExt(VideoExt source) {
        if (source.ResIdTimes != null) {
            this.ResIdTimes = new Long(source.ResIdTimes);
        }
        if (source.ResId != null) {
            this.ResId = new String(source.ResId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResIdTimes", this.ResIdTimes);
        this.setParamSimple(map, prefix + "ResId", this.ResId);

    }
}

