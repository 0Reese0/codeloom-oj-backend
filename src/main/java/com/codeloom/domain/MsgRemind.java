package com.codeloom.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName msg_remind
 */
@TableName(value ="msg_remind")
@Data
public class MsgRemind implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 动作类型，如点赞讨论帖Like_Post、点赞评论Like_Discuss、评论Discuss、回复Reply等
     */
    private String action;

    /**
     * 消息来源id，讨论id或比赛id
     */
    private Integer sourceId;

    /**
     * 事件源类型：'Discussion'、'Contest'等
     */
    private String sourceType;

    /**
     * 事件源的内容，比如回复的内容，评论的帖子标题等等
     */
    private String sourceContent;

    /**
     * 事件引用上一级评论或回复id
     */
    private Integer quoteId;

    /**
     * 事件引用上一级的类型：Comment、Reply
     */
    private String quoteType;

    /**
     * 事件所发生的地点链接 url
     */
    private String url;

    /**
     * 是否已读
     */
    private Integer state;

    /**
     * 操作者的id
     */
    private String senderId;

    /**
     * 接受消息的用户id
     */
    private String recipientId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MsgRemind other = (MsgRemind) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction()))
            && (this.getSourceId() == null ? other.getSourceId() == null : this.getSourceId().equals(other.getSourceId()))
            && (this.getSourceType() == null ? other.getSourceType() == null : this.getSourceType().equals(other.getSourceType()))
            && (this.getSourceContent() == null ? other.getSourceContent() == null : this.getSourceContent().equals(other.getSourceContent()))
            && (this.getQuoteId() == null ? other.getQuoteId() == null : this.getQuoteId().equals(other.getQuoteId()))
            && (this.getQuoteType() == null ? other.getQuoteType() == null : this.getQuoteType().equals(other.getQuoteType()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getSenderId() == null ? other.getSenderId() == null : this.getSenderId().equals(other.getSenderId()))
            && (this.getRecipientId() == null ? other.getRecipientId() == null : this.getRecipientId().equals(other.getRecipientId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAction() == null) ? 0 : getAction().hashCode());
        result = prime * result + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        result = prime * result + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        result = prime * result + ((getSourceContent() == null) ? 0 : getSourceContent().hashCode());
        result = prime * result + ((getQuoteId() == null) ? 0 : getQuoteId().hashCode());
        result = prime * result + ((getQuoteType() == null) ? 0 : getQuoteType().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        result = prime * result + ((getRecipientId() == null) ? 0 : getRecipientId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", action=").append(action);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", sourceContent=").append(sourceContent);
        sb.append(", quoteId=").append(quoteId);
        sb.append(", quoteType=").append(quoteType);
        sb.append(", url=").append(url);
        sb.append(", state=").append(state);
        sb.append(", senderId=").append(senderId);
        sb.append(", recipientId=").append(recipientId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}