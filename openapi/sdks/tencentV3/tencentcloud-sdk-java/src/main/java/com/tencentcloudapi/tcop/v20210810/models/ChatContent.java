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

public class ChatContent extends AbstractModel{

    /**
    * 元素类型，1-文本，2-表情符号，3-图片，三种消息类型必有其一
    */
    @SerializedName("ElemType")
    @Expose
    private Long ElemType;

    /**
    * 文本消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgText")
    @Expose
    private MsgText MsgText;

    /**
    * 表情符号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgFace")
    @Expose
    private MsgFace MsgFace;

    /**
    * 离线图片
    */
    @SerializedName("MsgNotOnlineImage")
    @Expose
    private MsgNotOnlineImage MsgNotOnlineImage;

    /**
     * Get 元素类型，1-文本，2-表情符号，3-图片，三种消息类型必有其一 
     * @return ElemType 元素类型，1-文本，2-表情符号，3-图片，三种消息类型必有其一
     */
    public Long getElemType() {
        return this.ElemType;
    }

    /**
     * Set 元素类型，1-文本，2-表情符号，3-图片，三种消息类型必有其一
     * @param ElemType 元素类型，1-文本，2-表情符号，3-图片，三种消息类型必有其一
     */
    public void setElemType(Long ElemType) {
        this.ElemType = ElemType;
    }

    /**
     * Get 文本消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgText 文本消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MsgText getMsgText() {
        return this.MsgText;
    }

    /**
     * Set 文本消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgText 文本消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgText(MsgText MsgText) {
        this.MsgText = MsgText;
    }

    /**
     * Get 表情符号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgFace 表情符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MsgFace getMsgFace() {
        return this.MsgFace;
    }

    /**
     * Set 表情符号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgFace 表情符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgFace(MsgFace MsgFace) {
        this.MsgFace = MsgFace;
    }

    /**
     * Get 离线图片 
     * @return MsgNotOnlineImage 离线图片
     */
    public MsgNotOnlineImage getMsgNotOnlineImage() {
        return this.MsgNotOnlineImage;
    }

    /**
     * Set 离线图片
     * @param MsgNotOnlineImage 离线图片
     */
    public void setMsgNotOnlineImage(MsgNotOnlineImage MsgNotOnlineImage) {
        this.MsgNotOnlineImage = MsgNotOnlineImage;
    }

    public ChatContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatContent(ChatContent source) {
        if (source.ElemType != null) {
            this.ElemType = new Long(source.ElemType);
        }
        if (source.MsgText != null) {
            this.MsgText = new MsgText(source.MsgText);
        }
        if (source.MsgFace != null) {
            this.MsgFace = new MsgFace(source.MsgFace);
        }
        if (source.MsgNotOnlineImage != null) {
            this.MsgNotOnlineImage = new MsgNotOnlineImage(source.MsgNotOnlineImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElemType", this.ElemType);
        this.setParamObj(map, prefix + "MsgText.", this.MsgText);
        this.setParamObj(map, prefix + "MsgFace.", this.MsgFace);
        this.setParamObj(map, prefix + "MsgNotOnlineImage.", this.MsgNotOnlineImage);

    }
}

