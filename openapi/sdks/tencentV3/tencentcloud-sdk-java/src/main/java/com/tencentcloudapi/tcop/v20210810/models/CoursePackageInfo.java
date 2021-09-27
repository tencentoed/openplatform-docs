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

public class CoursePackageInfo extends AbstractModel{

    /**
    * 课程包id
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * 课程包名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 课程包价格
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 报名人数
    */
    @SerializedName("SignNum")
    @Expose
    private Long SignNum;

    /**
    * 封面图片地址
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 课程包地址
    */
    @SerializedName("PackageUrl")
    @Expose
    private String PackageUrl;

    /**
    * 班级列表
    */
    @SerializedName("TermList")
    @Expose
    private PackageTerm [] TermList;

    /**
     * Get 课程包id 
     * @return PackageId 课程包id
     */
    public Long getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 课程包id
     * @param PackageId 课程包id
     */
    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 课程包名称 
     * @return Name 课程包名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 课程包名称
     * @param Name 课程包名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 课程包价格 
     * @return Price 课程包价格
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 课程包价格
     * @param Price 课程包价格
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 报名人数 
     * @return SignNum 报名人数
     */
    public Long getSignNum() {
        return this.SignNum;
    }

    /**
     * Set 报名人数
     * @param SignNum 报名人数
     */
    public void setSignNum(Long SignNum) {
        this.SignNum = SignNum;
    }

    /**
     * Get 封面图片地址 
     * @return CoverUrl 封面图片地址
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 封面图片地址
     * @param CoverUrl 封面图片地址
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 课程包地址 
     * @return PackageUrl 课程包地址
     */
    public String getPackageUrl() {
        return this.PackageUrl;
    }

    /**
     * Set 课程包地址
     * @param PackageUrl 课程包地址
     */
    public void setPackageUrl(String PackageUrl) {
        this.PackageUrl = PackageUrl;
    }

    /**
     * Get 班级列表 
     * @return TermList 班级列表
     */
    public PackageTerm [] getTermList() {
        return this.TermList;
    }

    /**
     * Set 班级列表
     * @param TermList 班级列表
     */
    public void setTermList(PackageTerm [] TermList) {
        this.TermList = TermList;
    }

    public CoursePackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoursePackageInfo(CoursePackageInfo source) {
        if (source.PackageId != null) {
            this.PackageId = new Long(source.PackageId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.SignNum != null) {
            this.SignNum = new Long(source.SignNum);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.PackageUrl != null) {
            this.PackageUrl = new String(source.PackageUrl);
        }
        if (source.TermList != null) {
            this.TermList = new PackageTerm[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new PackageTerm(source.TermList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "SignNum", this.SignNum);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "PackageUrl", this.PackageUrl);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);

    }
}

