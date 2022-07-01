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

public class ModifyLiveCourseAuthorizeRequest extends AbstractModel{

    /**
    * 开放平台分配给第三方的千帆id
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
    * 直播间id
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 课程可学习部门列表，dept_list和user_list至少2选1
    */
    @SerializedName("DeptList")
    @Expose
    private String [] DeptList;

    /**
    * 课程可学习部门列表，dept_list和user_list至少2选1
    */
    @SerializedName("UserList")
    @Expose
    private String [] UserList;

    /**
     * Get 开放平台分配给第三方的千帆id 
     * @return IdaasOrgId 开放平台分配给第三方的千帆id
     */
    public String getIdaasOrgId() {
        return this.IdaasOrgId;
    }

    /**
     * Set 开放平台分配给第三方的千帆id
     * @param IdaasOrgId 开放平台分配给第三方的千帆id
     */
    public void setIdaasOrgId(String IdaasOrgId) {
        this.IdaasOrgId = IdaasOrgId;
    }

    /**
     * Get 直播间id 
     * @return TermId 直播间id
     */
    public Long getTermId() {
        return this.TermId;
    }

    /**
     * Set 直播间id
     * @param TermId 直播间id
     */
    public void setTermId(Long TermId) {
        this.TermId = TermId;
    }

    /**
     * Get 课程可学习部门列表，dept_list和user_list至少2选1 
     * @return DeptList 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public String [] getDeptList() {
        return this.DeptList;
    }

    /**
     * Set 课程可学习部门列表，dept_list和user_list至少2选1
     * @param DeptList 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public void setDeptList(String [] DeptList) {
        this.DeptList = DeptList;
    }

    /**
     * Get 课程可学习部门列表，dept_list和user_list至少2选1 
     * @return UserList 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public String [] getUserList() {
        return this.UserList;
    }

    /**
     * Set 课程可学习部门列表，dept_list和user_list至少2选1
     * @param UserList 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public void setUserList(String [] UserList) {
        this.UserList = UserList;
    }

    public ModifyLiveCourseAuthorizeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveCourseAuthorizeRequest(ModifyLiveCourseAuthorizeRequest source) {
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.DeptList != null) {
            this.DeptList = new String[source.DeptList.length];
            for (int i = 0; i < source.DeptList.length; i++) {
                this.DeptList[i] = new String(source.DeptList[i]);
            }
        }
        if (source.UserList != null) {
            this.UserList = new String[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new String(source.UserList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamArraySimple(map, prefix + "DeptList.", this.DeptList);
        this.setParamArraySimple(map, prefix + "UserList.", this.UserList);

    }
}

