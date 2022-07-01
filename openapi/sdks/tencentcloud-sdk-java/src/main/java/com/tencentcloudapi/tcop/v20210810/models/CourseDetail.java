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

public class CourseDetail extends AbstractModel{

    /**
    * 课程ID
    */
    @SerializedName("CourseId")
    @Expose
    private Long CourseId;

    /**
    * 课程名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 课程封面图
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 课程班级列表
    */
    @SerializedName("TermList")
    @Expose
    private CourseTerm [] TermList;

    /**
    * 课程价格，单位：分
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 课程多图详情
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
     * Get 课程ID 
     * @return CourseId 课程ID
     */
    public Long getCourseId() {
        return this.CourseId;
    }

    /**
     * Set 课程ID
     * @param CourseId 课程ID
     */
    public void setCourseId(Long CourseId) {
        this.CourseId = CourseId;
    }

    /**
     * Get 课程名称 
     * @return Name 课程名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 课程名称
     * @param Name 课程名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 课程封面图 
     * @return CoverUrl 课程封面图
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 课程封面图
     * @param CoverUrl 课程封面图
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 课程班级列表 
     * @return TermList 课程班级列表
     */
    public CourseTerm [] getTermList() {
        return this.TermList;
    }

    /**
     * Set 课程班级列表
     * @param TermList 课程班级列表
     */
    public void setTermList(CourseTerm [] TermList) {
        this.TermList = TermList;
    }

    /**
     * Get 课程价格，单位：分 
     * @return Price 课程价格，单位：分
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 课程价格，单位：分
     * @param Price 课程价格，单位：分
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 课程多图详情 
     * @return PictureList 课程多图详情
     */
    public String [] getPictureList() {
        return this.PictureList;
    }

    /**
     * Set 课程多图详情
     * @param PictureList 课程多图详情
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

    public CourseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CourseDetail(CourseDetail source) {
        if (source.CourseId != null) {
            this.CourseId = new Long(source.CourseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.TermList != null) {
            this.TermList = new CourseTerm[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new CourseTerm(source.TermList[i]);
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
        this.setParamSimple(map, prefix + "CourseId", this.CourseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamArraySimple(map, prefix + "PictureList.", this.PictureList);
        this.setParamSimple(map, prefix + "AgencyName", this.AgencyName);

    }
}

