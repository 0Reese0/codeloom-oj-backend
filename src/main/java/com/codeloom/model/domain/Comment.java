package com.codeloom.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName comment
 */
@TableName(value ="comment")
@Data
public class Comment implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * null表示无引用比赛
     */
    private Long cid;

    /**
     * null表示无引用讨论
     */
    private Integer did;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论者id
     */
    private String fromUid;

    /**
     * 评论者用户名
     */
    private String fromName;

    /**
     * 评论组头像地址
     */
    private String fromAvatar;

    /**
     * 评论者角色
     */
    private String fromRole;

    /**
     * 点赞数量
     */
    private Integer likeNum;

    /**
     * 是否封禁或逻辑删除该评论
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
        Comment other = (Comment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getFromUid() == null ? other.getFromUid() == null : this.getFromUid().equals(other.getFromUid()))
            && (this.getFromName() == null ? other.getFromName() == null : this.getFromName().equals(other.getFromName()))
            && (this.getFromAvatar() == null ? other.getFromAvatar() == null : this.getFromAvatar().equals(other.getFromAvatar()))
            && (this.getFromRole() == null ? other.getFromRole() == null : this.getFromRole().equals(other.getFromRole()))
            && (this.getLikeNum() == null ? other.getLikeNum() == null : this.getLikeNum().equals(other.getLikeNum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getFromUid() == null) ? 0 : getFromUid().hashCode());
        result = prime * result + ((getFromName() == null) ? 0 : getFromName().hashCode());
        result = prime * result + ((getFromAvatar() == null) ? 0 : getFromAvatar().hashCode());
        result = prime * result + ((getFromRole() == null) ? 0 : getFromRole().hashCode());
        result = prime * result + ((getLikeNum() == null) ? 0 : getLikeNum().hashCode());
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
        sb.append(", cid=").append(cid);
        sb.append(", did=").append(did);
        sb.append(", content=").append(content);
        sb.append(", fromUid=").append(fromUid);
        sb.append(", fromName=").append(fromName);
        sb.append(", fromAvatar=").append(fromAvatar);
        sb.append(", fromRole=").append(fromRole);
        sb.append(", likeNum=").append(likeNum);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}