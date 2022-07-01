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

public class TermProcess extends AbstractModel{

    /**
    * 班级ID
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 班级名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节列表
    */
    @SerializedName("SubCourseList")
    @Expose
    private SubCourseProcess [] SubCourseList;

    /**
     * Get 班级ID 
     * @return TermId 班级ID
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 班级ID
     * @param TermId 班级ID
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 班级名称 
     * @return Name 班级名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 班级名称
     * @param Name 班级名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节列表 
     * @return SubCourseList 节列表
     */
    public SubCourseProcess [] getSubCourseList() {
        return this.SubCourseList;
    }

    /**
     * Set 节列表
     * @param SubCourseList 节列表
     */
    public void setSubCourseList(SubCourseProcess [] SubCourseList) {
        this.SubCourseList = SubCourseList;
    }

    public TermProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TermProcess(TermProcess source) {
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubCourseList != null) {
            this.SubCourseList = new SubCourseProcess[source.SubCourseList.length];
            for (int i = 0; i < source.SubCourseList.length; i++) {
                this.SubCourseList[i] = new SubCourseProcess(source.SubCourseList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SubCourseList.", this.SubCourseList);

    }
}

