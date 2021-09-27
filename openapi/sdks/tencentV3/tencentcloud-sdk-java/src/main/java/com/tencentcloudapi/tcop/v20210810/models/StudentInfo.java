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

public class StudentInfo extends AbstractModel{

    /**
    * 观看直播时长分钟数，如1309
    */
    @SerializedName("WatchLive")
    @Expose
    private Long WatchLive;

    /**
    * 授课老师
    */
    @SerializedName("TeacherName")
    @Expose
    private String TeacherName;

    /**
    * 学生id
    */
    @SerializedName("StudentId")
    @Expose
    private String StudentId;

    /**
    * 观看回放时长分钟数
    */
    @SerializedName("WatchLiveDuration")
    @Expose
    private Long WatchLiveDuration;

    /**
    * 是否观看回放,1=是，0=否
    */
    @SerializedName("IsWatchPlayback")
    @Expose
    private Long IsWatchPlayback;

    /**
    * 是否观看直播,1=是，0=否
    */
    @SerializedName("IsWatchLive")
    @Expose
    private Long IsWatchLive;

    /**
    * 学生姓名
    */
    @SerializedName("StudentName")
    @Expose
    private String StudentName;

    /**
    * 学生手机号
    */
    @SerializedName("StudentPhone")
    @Expose
    private String StudentPhone;

    /**
    * 学生头像
    */
    @SerializedName("StudentPic")
    @Expose
    private String StudentPic;

    /**
    * 学生序号
    */
    @SerializedName("StudentIndex")
    @Expose
    private Long StudentIndex;

    /**
    * 进入直播时间
    */
    @SerializedName("EnterLiveTime")
    @Expose
    private Long EnterLiveTime;

    /**
     * Get 观看直播时长分钟数，如1309 
     * @return WatchLive 观看直播时长分钟数，如1309
     */
    public Long getWatchLive() {
        return this.WatchLive;
    }

    /**
     * Set 观看直播时长分钟数，如1309
     * @param WatchLive 观看直播时长分钟数，如1309
     */
    public void setWatchLive(Long WatchLive) {
        this.WatchLive = WatchLive;
    }

    /**
     * Get 授课老师 
     * @return TeacherName 授课老师
     */
    public String getTeacherName() {
        return this.TeacherName;
    }

    /**
     * Set 授课老师
     * @param TeacherName 授课老师
     */
    public void setTeacherName(String TeacherName) {
        this.TeacherName = TeacherName;
    }

    /**
     * Get 学生id 
     * @return StudentId 学生id
     */
    public String getStudentId() {
        return this.StudentId;
    }

    /**
     * Set 学生id
     * @param StudentId 学生id
     */
    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    /**
     * Get 观看回放时长分钟数 
     * @return WatchLiveDuration 观看回放时长分钟数
     */
    public Long getWatchLiveDuration() {
        return this.WatchLiveDuration;
    }

    /**
     * Set 观看回放时长分钟数
     * @param WatchLiveDuration 观看回放时长分钟数
     */
    public void setWatchLiveDuration(Long WatchLiveDuration) {
        this.WatchLiveDuration = WatchLiveDuration;
    }

    /**
     * Get 是否观看回放,1=是，0=否 
     * @return IsWatchPlayback 是否观看回放,1=是，0=否
     */
    public Long getIsWatchPlayback() {
        return this.IsWatchPlayback;
    }

    /**
     * Set 是否观看回放,1=是，0=否
     * @param IsWatchPlayback 是否观看回放,1=是，0=否
     */
    public void setIsWatchPlayback(Long IsWatchPlayback) {
        this.IsWatchPlayback = IsWatchPlayback;
    }

    /**
     * Get 是否观看直播,1=是，0=否 
     * @return IsWatchLive 是否观看直播,1=是，0=否
     */
    public Long getIsWatchLive() {
        return this.IsWatchLive;
    }

    /**
     * Set 是否观看直播,1=是，0=否
     * @param IsWatchLive 是否观看直播,1=是，0=否
     */
    public void setIsWatchLive(Long IsWatchLive) {
        this.IsWatchLive = IsWatchLive;
    }

    /**
     * Get 学生姓名 
     * @return StudentName 学生姓名
     */
    public String getStudentName() {
        return this.StudentName;
    }

    /**
     * Set 学生姓名
     * @param StudentName 学生姓名
     */
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    /**
     * Get 学生手机号 
     * @return StudentPhone 学生手机号
     */
    public String getStudentPhone() {
        return this.StudentPhone;
    }

    /**
     * Set 学生手机号
     * @param StudentPhone 学生手机号
     */
    public void setStudentPhone(String StudentPhone) {
        this.StudentPhone = StudentPhone;
    }

    /**
     * Get 学生头像 
     * @return StudentPic 学生头像
     */
    public String getStudentPic() {
        return this.StudentPic;
    }

    /**
     * Set 学生头像
     * @param StudentPic 学生头像
     */
    public void setStudentPic(String StudentPic) {
        this.StudentPic = StudentPic;
    }

    /**
     * Get 学生序号 
     * @return StudentIndex 学生序号
     */
    public Long getStudentIndex() {
        return this.StudentIndex;
    }

    /**
     * Set 学生序号
     * @param StudentIndex 学生序号
     */
    public void setStudentIndex(Long StudentIndex) {
        this.StudentIndex = StudentIndex;
    }

    /**
     * Get 进入直播时间 
     * @return EnterLiveTime 进入直播时间
     */
    public Long getEnterLiveTime() {
        return this.EnterLiveTime;
    }

    /**
     * Set 进入直播时间
     * @param EnterLiveTime 进入直播时间
     */
    public void setEnterLiveTime(Long EnterLiveTime) {
        this.EnterLiveTime = EnterLiveTime;
    }

    public StudentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StudentInfo(StudentInfo source) {
        if (source.WatchLive != null) {
            this.WatchLive = new Long(source.WatchLive);
        }
        if (source.TeacherName != null) {
            this.TeacherName = new String(source.TeacherName);
        }
        if (source.StudentId != null) {
            this.StudentId = new String(source.StudentId);
        }
        if (source.WatchLiveDuration != null) {
            this.WatchLiveDuration = new Long(source.WatchLiveDuration);
        }
        if (source.IsWatchPlayback != null) {
            this.IsWatchPlayback = new Long(source.IsWatchPlayback);
        }
        if (source.IsWatchLive != null) {
            this.IsWatchLive = new Long(source.IsWatchLive);
        }
        if (source.StudentName != null) {
            this.StudentName = new String(source.StudentName);
        }
        if (source.StudentPhone != null) {
            this.StudentPhone = new String(source.StudentPhone);
        }
        if (source.StudentPic != null) {
            this.StudentPic = new String(source.StudentPic);
        }
        if (source.StudentIndex != null) {
            this.StudentIndex = new Long(source.StudentIndex);
        }
        if (source.EnterLiveTime != null) {
            this.EnterLiveTime = new Long(source.EnterLiveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatchLive", this.WatchLive);
        this.setParamSimple(map, prefix + "TeacherName", this.TeacherName);
        this.setParamSimple(map, prefix + "StudentId", this.StudentId);
        this.setParamSimple(map, prefix + "WatchLiveDuration", this.WatchLiveDuration);
        this.setParamSimple(map, prefix + "IsWatchPlayback", this.IsWatchPlayback);
        this.setParamSimple(map, prefix + "IsWatchLive", this.IsWatchLive);
        this.setParamSimple(map, prefix + "StudentName", this.StudentName);
        this.setParamSimple(map, prefix + "StudentPhone", this.StudentPhone);
        this.setParamSimple(map, prefix + "StudentPic", this.StudentPic);
        this.setParamSimple(map, prefix + "StudentIndex", this.StudentIndex);
        this.setParamSimple(map, prefix + "EnterLiveTime", this.EnterLiveTime);

    }
}

