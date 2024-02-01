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
 * @TableName reply
 */
@TableName(value ="reply")
@Data
public class Reply implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 被回复的评论id
     */
    private Integer commentId;

    /**
     * 发起回复的用户id
     */
    private String fromUid;

    /**
     * 发起回复的用户名
     */
    private String fromName;

    /**
     * 发起回复的用户头像地址
     */
    private String fromAvatar;

    /**
     * 发起回复的用户角色
     */
    private String fromRole;

    /**
     * 被回复的用户id
     */
    private String toUid;

    /**
     * 被回复的用户名
     */
    private String toName;

    /**
     * 被回复的用户头像地址
     */
    private String toAvatar;

    /**
     * 回复的内容
     */
    private String content;

    /**
     * 是否封禁或逻辑删除该回复
     */
    private Integer status;

    /**
     * 
     */
    private Date gmtCreate;

    /**
     * 
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
        Reply other = (Reply) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getFromUid() == null ? other.getFromUid() == null : this.getFromUid().equals(other.getFromUid()))
            && (this.getFromName() == null ? other.getFromName() == null : this.getFromName().equals(other.getFromName()))
            && (this.getFromAvatar() == null ? other.getFromAvatar() == null : this.getFromAvatar().equals(other.getFromAvatar()))
            && (this.getFromRole() == null ? other.getFromRole() == null : this.getFromRole().equals(other.getFromRole()))
            && (this.getToUid() == null ? other.getToUid() == null : this.getToUid().equals(other.getToUid()))
            && (this.getToName() == null ? other.getToName() == null : this.getToName().equals(other.getToName()))
            && (this.getToAvatar() == null ? other.getToAvatar() == null : this.getToAvatar().equals(other.getToAvatar()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getFromUid() == null) ? 0 : getFromUid().hashCode());
        result = prime * result + ((getFromName() == null) ? 0 : getFromName().hashCode());
        result = prime * result + ((getFromAvatar() == null) ? 0 : getFromAvatar().hashCode());
        result = prime * result + ((getFromRole() == null) ? 0 : getFromRole().hashCode());
        result = prime * result + ((getToUid() == null) ? 0 : getToUid().hashCode());
        result = prime * result + ((getToName() == null) ? 0 : getToName().hashCode());
        result = prime * result + ((getToAvatar() == null) ? 0 : getToAvatar().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", commentId=").append(commentId);
        sb.append(", fromUid=").append(fromUid);
        sb.append(", fromName=").append(fromName);
        sb.append(", fromAvatar=").append(fromAvatar);
        sb.append(", fromRole=").append(fromRole);
        sb.append(", toUid=").append(toUid);
        sb.append(", toName=").append(toName);
        sb.append(", toAvatar=").append(toAvatar);
        sb.append(", content=").append(content);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}