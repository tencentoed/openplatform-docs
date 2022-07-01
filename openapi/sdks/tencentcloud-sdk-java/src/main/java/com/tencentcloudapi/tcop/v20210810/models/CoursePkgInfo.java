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

public class CoursePkgInfo extends AbstractModel{

    /**
    * 系列课ID
    */
    @SerializedName("CoursePkgId")
    @Expose
    private Long CoursePkgId;

    /**
    * 系列课名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 系列课封面
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 系列课简介
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 课程列表
    */
    @SerializedName("CourseList")
    @Expose
    private PkgCourse [] CourseList;

    /**
    * 课程包价格，单位：分
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 系列课多图详情
    */
    @SerializedName("PictureList")
    @Expose
    private String [] PictureList;

    /**
    * 机构名称
    */
    @SerializedName("AgencyName")
    @Expose
    private String AgencyName;

    /**
     * Get 系列课ID 
     * @return CoursePkgId 系列课ID
     */
    public Long getCoursePkgId() {
        return this.CoursePkgId;
    }

    /**
     * Set 系列课ID
     * @param CoursePkgId 系列课ID
     */
    public void setCoursePkgId(Long CoursePkgId) {
        this.CoursePkgId = CoursePkgId;
    }

    /**
     * Get 系列课名称 
     * @return Name 系列课名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 系列课名称
     * @param Name 系列课名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 系列课封面 
     * @return CoverUrl 系列课封面
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 系列课封面
     * @param CoverUrl 系列课封面
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 系列课简介 
     * @return Summary 系列课简介
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 系列课简介
     * @param Summary 系列课简介
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 课程列表 
     * @return CourseList 课程列表
     */
    public PkgCourse [] getCourseList() {
        return this.CourseList;
    }

    /**
     * Set 课程列表
     * @param CourseList 课程列表
     */
    public void setCourseList(PkgCourse [] CourseList) {
        this.CourseList = CourseList;
    }

    /**
     * Get 课程包价格，单位：分 
     * @return Price 课程包价格，单位：分
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 课程包价格，单位：分
     * @param Price 课程包价格，单位：分
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 系列课多图详情 
     * @return PictureList 系列课多图详情
     */
    public String [] getPictureList() {
        return this.PictureList;
    }

    /**
     * Set 系列课多图详情
     * @param PictureList 系列课多图详情
     */
    public void setPictureList(String [] PictureList) {
        this.PictureList = PictureList;
    }

    /**
     * Get 机构名称 
     * @return AgencyName 机构名称
     */
    public String getAgencyName() {
        return this.AgencyName;
    }

    /**
     * Set 机构名称
     * @param AgencyName 机构名称
     */
    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }

    public CoursePkgInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoursePkgInfo(CoursePkgInfo source) {
        if (source.CoursePkgId != null) {
            this.CoursePkgId = new Long(source.CoursePkgId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.CourseList != null) {
            this.CourseList = new PkgCourse[source.CourseList.length];
            for (int i = 0; i < source.CourseList.length; i++) {
                this.CourseList[i] = new PkgCourse(source.CourseList[i]);
            }
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.PictureList != null) {
            this.PictureList = new String[source.PictureList.length];
            for (int i = 0; i < source.PictureList.length; i++) {
                this.PictureList[i] = new String(source.PictureList[i]);
            }
        }
        if (source.AgencyName != null) {
            this.AgencyName = new String(source.AgencyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoursePkgId", this.CoursePkgId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamArrayObj(map, prefix + "CourseList.", this.CourseList);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamArraySimple(map, prefix + "PictureList.", this.PictureList);
        this.setParamSimple(map, prefix + "AgencyName", this.AgencyName);

    }
}

