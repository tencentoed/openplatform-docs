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

public class LiveTaskInfo extends AbstractModel{

    /**
    * 回放观看人数
    */
    @SerializedName("PlayBackNum")
    @Expose
    private Long PlayBackNum;

    /**
    * 直播时间
    */
    @SerializedName("LiveTime")
    @Expose
    private Long LiveTime;

    /**
    * 直播时长分钟数
    */
    @SerializedName("LiveDuration")
    @Expose
    private Long LiveDuration;

    /**
    * 直播观看人数
    */
    @SerializedName("LiveStudentNum")
    @Expose
    private Long LiveStudentNum;

    /**
     * Get 回放观看人数 
     * @return PlayBackNum 回放观看人数
     */
    public Long getPlayBackNum() {
        return this.PlayBackNum;
    }

    /**
     * Set 回放观看人数
     * @param PlayBackNum 回放观看人数
     */
    public void setPlayBackNum(Long PlayBackNum) {
        this.PlayBackNum = PlayBackNum;
    }

    /**
     * Get 直播时间 
     * @return LiveTime 直播时间
     */
    public Long getLiveTime() {
        return this.LiveTime;
    }

    /**
     * Set 直播时间
     * @param LiveTime 直播时间
     */
    public void setLiveTime(Long LiveTime) {
        this.LiveTime = LiveTime;
    }

    /**
     * Get 直播时长分钟数 
     * @return LiveDuration 直播时长分钟数
     */
    public Long getLiveDuration() {
        return this.LiveDuration;
    }

    /**
     * Set 直播时长分钟数
     * @param LiveDuration 直播时长分钟数
     */
    public void setLiveDuration(Long LiveDuration) {
        this.LiveDuration = LiveDuration;
    }

    /**
     * Get 直播观看人数 
     * @return LiveStudentNum 直播观看人数
     */
    public Long getLiveStudentNum() {
        return this.LiveStudentNum;
    }

    /**
     * Set 直播观看人数
     * @param LiveStudentNum 直播观看人数
     */
    public void setLiveStudentNum(Long LiveStudentNum) {
        this.LiveStudentNum = LiveStudentNum;
    }

    public LiveTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveTaskInfo(LiveTaskInfo source) {
        if (source.PlayBackNum != null) {
            this.PlayBackNum = new Long(source.PlayBackNum);
        }
        if (source.LiveTime != null) {
            this.LiveTime = new Long(source.LiveTime);
        }
        if (source.LiveDuration != null) {
            this.LiveDuration = new Long(source.LiveDuration);
        }
        if (source.LiveStudentNum != null) {
            this.LiveStudentNum = new Long(source.LiveStudentNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayBackNum", this.PlayBackNum);
        this.setParamSimple(map, prefix + "LiveTime", this.LiveTime);
        this.setParamSimple(map, prefix + "LiveDuration", this.LiveDuration);
        this.setParamSimple(map, prefix + "LiveStudentNum", this.LiveStudentNum);

    }
}

