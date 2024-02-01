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
 * @TableName judge
 */
@TableName(value ="judge")
@Data
public class Judge implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long submitId;

    /**
     * 题目id
     */
private Long pid;

    /**
     * 题目展示id
     */
private String displayPid;

    /**
     * 用户id
     */
private String uid;

    /**
     * 比赛id，非比赛题目默认为0
     */
private Long cid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 提交的时间
     */
    private Date submitTime;

    /**
     * 结果码具体参考文档
     */
    private Integer status;

    /**
     * 0为仅自己可见，1为全部人可见。
     */
    private Integer share;

    /**
     * 错误提醒（编译错误，或者vj提醒）
     */
    private String errorMessage;

    /**
     * 运行时间(ms)
     */
    private Integer time;

    /**
     * 运行内存（kb）
     */
    private Integer memory;

    /**
     * IO判题则不为空
     */
    private Integer score;

    /**
     * 代码长度
     */
    private Integer length;

    /**
     * 代码
     */
    private String code;

    /**
     * 代码语言
     */
    private String language;

    /**
     * 团队id，不为团队内提交则为null
     */
    private Long gid;

    /**
     * 比赛中题目排序id，非比赛题目默认为0
     */
    private Long cpid;

    /**
     * 判题机ip
     */
    private String judger;

    /**
     * 提交者所在ip
     */
    private String ip;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * oi排行榜得分
     */
    private Integer oiRankScore;

    /**
     * vjudge判题在其它oj的提交id
     */
    private Long vjudgeSubmitId;

    /**
     * vjudge判题在其它oj的提交用户名
     */
    private String vjudgeUsername;

    /**
     * vjudge判题在其它oj的提交账号密码
     */
    private String vjudgePassword;

    /**
     * 是否为人工评测
     */
    private Integer isManual;

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
        Judge other = (Judge) that;
        return (this.getSubmitId() == null ? other.getSubmitId() == null : this.getSubmitId().equals(other.getSubmitId()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getDisplayPid() == null ? other.getDisplayPid() == null : this.getDisplayPid().equals(other.getDisplayPid()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getShare() == null ? other.getShare() == null : this.getShare().equals(other.getShare()))
            && (this.getErrorMessage() == null ? other.getErrorMessage() == null : this.getErrorMessage().equals(other.getErrorMessage()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getMemory() == null ? other.getMemory() == null : this.getMemory().equals(other.getMemory()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getCpid() == null ? other.getCpid() == null : this.getCpid().equals(other.getCpid()))
            && (this.getJudger() == null ? other.getJudger() == null : this.getJudger().equals(other.getJudger()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getOiRankScore() == null ? other.getOiRankScore() == null : this.getOiRankScore().equals(other.getOiRankScore()))
            && (this.getVjudgeSubmitId() == null ? other.getVjudgeSubmitId() == null : this.getVjudgeSubmitId().equals(other.getVjudgeSubmitId()))
            && (this.getVjudgeUsername() == null ? other.getVjudgeUsername() == null : this.getVjudgeUsername().equals(other.getVjudgeUsername()))
            && (this.getVjudgePassword() == null ? other.getVjudgePassword() == null : this.getVjudgePassword().equals(other.getVjudgePassword()))
            && (this.getIsManual() == null ? other.getIsManual() == null : this.getIsManual().equals(other.getIsManual()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubmitId() == null) ? 0 : getSubmitId().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getDisplayPid() == null) ? 0 : getDisplayPid().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getShare() == null) ? 0 : getShare().hashCode());
        result = prime * result + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getMemory() == null) ? 0 : getMemory().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getCpid() == null) ? 0 : getCpid().hashCode());
        result = prime * result + ((getJudger() == null) ? 0 : getJudger().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getOiRankScore() == null) ? 0 : getOiRankScore().hashCode());
        result = prime * result + ((getVjudgeSubmitId() == null) ? 0 : getVjudgeSubmitId().hashCode());
        result = prime * result + ((getVjudgeUsername() == null) ? 0 : getVjudgeUsername().hashCode());
        result = prime * result + ((getVjudgePassword() == null) ? 0 : getVjudgePassword().hashCode());
        result = prime * result + ((getIsManual() == null) ? 0 : getIsManual().hashCode());
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
        sb.append(", submitId=").append(submitId);
        sb.append(", pid=").append(pid);
        sb.append(", displayPid=").append(displayPid);
        sb.append(", uid=").append(uid);
        sb.append(", cid=").append(cid);
        sb.append(", username=").append(username);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", status=").append(status);
        sb.append(", share=").append(share);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append(", time=").append(time);
        sb.append(", memory=").append(memory);
        sb.append(", score=").append(score);
        sb.append(", length=").append(length);
        sb.append(", code=").append(code);
        sb.append(", language=").append(language);
        sb.append(", gid=").append(gid);
        sb.append(", cpid=").append(cpid);
        sb.append(", judger=").append(judger);
        sb.append(", ip=").append(ip);
        sb.append(", version=").append(version);
        sb.append(", oiRankScore=").append(oiRankScore);
        sb.append(", vjudgeSubmitId=").append(vjudgeSubmitId);
        sb.append(", vjudgeUsername=").append(vjudgeUsername);
        sb.append(", vjudgePassword=").append(vjudgePassword);
        sb.append(", isManual=").append(isManual);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}