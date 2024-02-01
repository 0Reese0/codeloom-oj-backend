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
 * @TableName contest_record
 */
@TableName(value ="contest_record")
@Data
public class ContestRecord implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 提交id，用于可重判
     */
private Long submitId;

    /**
     * 比赛id
     */
    private Long cid;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 题目id
     */
    private Long pid;

    /**
     * 比赛中的题目的id
     */
    private Long cpid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 比赛中展示的id
     */
    private String displayId;

    /**
     * 提交结果，0表示未AC通过不罚时，1表示AC通过，-1为未AC通过算罚时
     */
    private Integer status;

    /**
     * 具体提交时间
     */
    private Date submitTime;

    /**
     * 提交时间，为提交时间减去比赛时间
     */
    private Long time;

    /**
     * OI比赛的得分
     */
    private Integer score;

    /**
     * 运行耗时
     */
    private Integer useTime;

    /**
     * 是否为一血AC(废弃)
     */
    private Integer firstBlood;

    /**
     * AC是否已校验
     */
    private Integer checked;

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
        ContestRecord other = (ContestRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSubmitId() == null ? other.getSubmitId() == null : this.getSubmitId().equals(other.getSubmitId()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getCpid() == null ? other.getCpid() == null : this.getCpid().equals(other.getCpid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getDisplayId() == null ? other.getDisplayId() == null : this.getDisplayId().equals(other.getDisplayId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getUseTime() == null ? other.getUseTime() == null : this.getUseTime().equals(other.getUseTime()))
            && (this.getFirstBlood() == null ? other.getFirstBlood() == null : this.getFirstBlood().equals(other.getFirstBlood()))
            && (this.getChecked() == null ? other.getChecked() == null : this.getChecked().equals(other.getChecked()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSubmitId() == null) ? 0 : getSubmitId().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getCpid() == null) ? 0 : getCpid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getDisplayId() == null) ? 0 : getDisplayId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getUseTime() == null) ? 0 : getUseTime().hashCode());
        result = prime * result + ((getFirstBlood() == null) ? 0 : getFirstBlood().hashCode());
        result = prime * result + ((getChecked() == null) ? 0 : getChecked().hashCode());
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
        sb.append(", submitId=").append(submitId);
        sb.append(", cid=").append(cid);
        sb.append(", uid=").append(uid);
        sb.append(", pid=").append(pid);
        sb.append(", cpid=").append(cpid);
        sb.append(", username=").append(username);
        sb.append(", realname=").append(realname);
        sb.append(", displayId=").append(displayId);
        sb.append(", status=").append(status);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", time=").append(time);
        sb.append(", score=").append(score);
        sb.append(", useTime=").append(useTime);
        sb.append(", firstBlood=").append(firstBlood);
        sb.append(", checked=").append(checked);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}