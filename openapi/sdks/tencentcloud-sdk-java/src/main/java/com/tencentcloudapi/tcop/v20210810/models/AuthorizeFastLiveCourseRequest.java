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

public class AuthorizeFastLiveCourseRequest extends AbstractModel{

    /**
    * 直播间id
    */
    @SerializedName("TermId")
    @Expose
    private Long TermId;

    /**
    * 开放平台分配给第三方的千帆id
    */
    @SerializedName("IdaasOrgId")
    @Expose
    private String IdaasOrgId;

    /**
    * 课程可学习部门列表，dept_list和user_list至少2选1
    */
    @SerializedName("Deptlist")
    @Expose
    private String [] Deptlist;

    /**
    * 课程可学习部门列表，dept_list和user_list至少2选1
    */
    @SerializedName("Userlist")
    @Expose
    private String [] Userlist;

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
     * Get 课程可学习部门列表，dept_list和user_list至少2选1 
     * @return Deptlist 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public String [] getDeptlist() {
        return this.Deptlist;
    }

    /**
     * Set 课程可学习部门列表，dept_list和user_list至少2选1
     * @param Deptlist 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public void setDeptlist(String [] Deptlist) {
        this.Deptlist = Deptlist;
    }

    /**
     * Get 课程可学习部门列表，dept_list和user_list至少2选1 
     * @return Userlist 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public String [] getUserlist() {
        return this.Userlist;
    }

    /**
     * Set 课程可学习部门列表，dept_list和user_list至少2选1
     * @param Userlist 课程可学习部门列表，dept_list和user_list至少2选1
     */
    public void setUserlist(String [] Userlist) {
        this.Userlist = Userlist;
    }

    public AuthorizeFastLiveCourseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizeFastLiveCourseRequest(AuthorizeFastLiveCourseRequest source) {
        if (source.TermId != null) {
            this.TermId = new Long(source.TermId);
        }
        if (source.IdaasOrgId != null) {
            this.IdaasOrgId = new String(source.IdaasOrgId);
        }
        if (source.Deptlist != null) {
            this.Deptlist = new String[source.Deptlist.length];
            for (int i = 0; i < source.Deptlist.length; i++) {
                this.Deptlist[i] = new String(source.Deptlist[i]);
            }
        }
        if (source.Userlist != null) {
            this.Userlist = new String[source.Userlist.length];
            for (int i = 0; i < source.Userlist.length; i++) {
                this.Userlist[i] = new String(source.Userlist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TermId", this.TermId);
        this.setParamSimple(map, prefix + "IdaasOrgId", this.IdaasOrgId);
        this.setParamArraySimple(map, prefix + "Deptlist.", this.Deptlist);
        this.setParamArraySimple(map, prefix + "Userlist.", this.Userlist);

    }
}

