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

public class TaskProcessExt extends AbstractModel{

    /**
    * 视频播放信息
    */
    @SerializedName("Video")
    @Expose
    private VideoProcess Video;

    /**
     * Get 视频播放信息 
     * @return Video 视频播放信息
     */
    public VideoProcess getVideo() {
        return this.Video;
    }

    /**
     * Set 视频播放信息
     * @param Video 视频播放信息
     */
    public void setVideo(VideoProcess Video) {
        this.Video = Video;
    }

    public TaskProcessExt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskProcessExt(TaskProcessExt source) {
        if (source.Video != null) {
            this.Video = new VideoProcess(source.Video);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Video.", this.Video);

    }
}

