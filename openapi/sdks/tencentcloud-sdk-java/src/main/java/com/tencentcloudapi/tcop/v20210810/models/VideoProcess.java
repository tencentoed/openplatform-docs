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

public class VideoProcess extends AbstractModel{

    /**
    * 视频ID
    */
    @SerializedName("ResId")
    @Expose
    private String ResId;

    /**
    * 视频时长, 单位：秒
    */
    @SerializedName("ResIdTimes")
    @Expose
    private Long ResIdTimes;

    /**
    * 观看时长, 单位：秒
    */
    @SerializedName("PlayTs")
    @Expose
    private Long PlayTs;

    /**
    * 最后观看的位置
    */
    @SerializedName("LatestPos")
    @Expose
    private Long LatestPos;

    /**
    * 最后观看时间
    */
    @SerializedName("UpdateTs")
    @Expose
    private Long UpdateTs;

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

    /**
     * Get 视频时长, 单位：秒 
     * @return ResIdTimes 视频时长, 单位：秒
     */
    public Long getResIdTimes() {
        return this.ResIdTimes;
    }

    /**
     * Set 视频时长, 单位：秒
     * @param ResIdTimes 视频时长, 单位：秒
     */
    public void setResIdTimes(Long ResIdTimes) {
        this.ResIdTimes = ResIdTimes;
    }

    /**
     * Get 观看时长, 单位：秒 
     * @return PlayTs 观看时长, 单位：秒
     */
    public Long getPlayTs() {
        return this.PlayTs;
    }

    /**
     * Set 观看时长, 单位：秒
     * @param PlayTs 观看时长, 单位：秒
     */
    public void setPlayTs(Long PlayTs) {
        this.PlayTs = PlayTs;
    }

    /**
     * Get 最后观看的位置 
     * @return LatestPos 最后观看的位置
     */
    public Long getLatestPos() {
        return this.LatestPos;
    }

    /**
     * Set 最后观看的位置
     * @param LatestPos 最后观看的位置
     */
    public void setLatestPos(Long LatestPos) {
        this.LatestPos = LatestPos;
    }

    /**
     * Get 最后观看时间 
     * @return UpdateTs 最后观看时间
     */
    public Long getUpdateTs() {
        return this.UpdateTs;
    }

    /**
     * Set 最后观看时间
     * @param UpdateTs 最后观看时间
     */
    public void setUpdateTs(Long UpdateTs) {
        this.UpdateTs = UpdateTs;
    }

    public VideoProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoProcess(VideoProcess source) {
        if (source.ResId != null) {
            this.ResId = new String(source.ResId);
        }
        if (source.ResIdTimes != null) {
            this.ResIdTimes = new Long(source.ResIdTimes);
        }
        if (source.PlayTs != null) {
            this.PlayTs = new Long(source.PlayTs);
        }
        if (source.LatestPos != null) {
            this.LatestPos = new Long(source.LatestPos);
        }
        if (source.UpdateTs != null) {
            this.UpdateTs = new Long(source.UpdateTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResId", this.ResId);
        this.setParamSimple(map, prefix + "ResIdTimes", this.ResIdTimes);
        this.setParamSimple(map, prefix + "PlayTs", this.PlayTs);
        this.setParamSimple(map, prefix + "LatestPos", this.LatestPos);
        this.setParamSimple(map, prefix + "UpdateTs", this.UpdateTs);

    }
}

