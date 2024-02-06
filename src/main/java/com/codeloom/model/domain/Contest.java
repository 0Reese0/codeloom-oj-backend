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
 * @TableName contest
 */
@TableName(value ="contest")
@Data
public class Contest implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 比赛创建者id
     */

    private String uid;

    /**
     * 比赛创建者的用户名
     */
    private String author;

    /**
     * 比赛标题
     */
    private String title;

    /**
     * 0为acm赛制，1为比分赛制
     */
    private Integer type;

    /**
     * 比赛说明
     */
    private String description;

    /**
     * 比赛来源，原创为0，克隆赛为比赛id
     */
    private Integer source;

    /**
     * 0为公开赛，1为私有赛（访问有密码），2为保护赛（提交有密码）
     */
    private Integer auth;

    /**
     * 比赛密码
     */
    private String pwd;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 比赛时长(s)
     */
    private Long duration;

    /**
     * 是否开启封榜
     */
    private Integer sealRank;

    /**
     * 封榜起始时间，一直到比赛结束，不刷新榜单
     */
    private Date sealRankTime;

    /**
     * 比赛结束是否自动解除封榜,自动转换成真实榜单
     */
    private Integer autoRealRank;

    /**
     * -1为未开始，0为进行中，1为已结束
     */
    private Integer status;

    /**
     * 是否可见
     */
    private Integer visible;

    /**
     * 是否打开打印功能
     */
    private Integer openPrint;

    /**
     * 是否开启账号限制
     */
    private Integer openAccountLimit;

    /**
     * 账号限制规则
     */
    private String accountLimitRule;

    /**
     * 排行榜显示（username、nickname、realname）
     */
    private String rankShowName;

    /**
     * 是否开放比赛榜单
     */
    private Integer openRank;

    /**
     * 打星用户列表
     */
    private String starAccount;

    /**
     * oi排行榜得分方式，Recent、Highest
     */
    private String oiRankScoreType;

    /**
     * 
     */
    private Integer isGroup;

    /**
     * 
     */
    private Long gid;

    /**
     * 奖项类型：0(不设置),1(设置占比),2(设置人数)
     */
    private Integer awardType;

    /**
     * 奖项配置 json
     */
    private String awardConfig;

    /**
     * 是否允许比赛结束后进行提交
     */
    private Integer allowEndSubmit;

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
        Contest other = (Contest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getAuth() == null ? other.getAuth() == null : this.getAuth().equals(other.getAuth()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getSealRank() == null ? other.getSealRank() == null : this.getSealRank().equals(other.getSealRank()))
            && (this.getSealRankTime() == null ? other.getSealRankTime() == null : this.getSealRankTime().equals(other.getSealRankTime()))
            && (this.getAutoRealRank() == null ? other.getAutoRealRank() == null : this.getAutoRealRank().equals(other.getAutoRealRank()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getVisible() == null ? other.getVisible() == null : this.getVisible().equals(other.getVisible()))
            && (this.getOpenPrint() == null ? other.getOpenPrint() == null : this.getOpenPrint().equals(other.getOpenPrint()))
            && (this.getOpenAccountLimit() == null ? other.getOpenAccountLimit() == null : this.getOpenAccountLimit().equals(other.getOpenAccountLimit()))
            && (this.getAccountLimitRule() == null ? other.getAccountLimitRule() == null : this.getAccountLimitRule().equals(other.getAccountLimitRule()))
            && (this.getRankShowName() == null ? other.getRankShowName() == null : this.getRankShowName().equals(other.getRankShowName()))
            && (this.getOpenRank() == null ? other.getOpenRank() == null : this.getOpenRank().equals(other.getOpenRank()))
            && (this.getStarAccount() == null ? other.getStarAccount() == null : this.getStarAccount().equals(other.getStarAccount()))
            && (this.getOiRankScoreType() == null ? other.getOiRankScoreType() == null : this.getOiRankScoreType().equals(other.getOiRankScoreType()))
            && (this.getIsGroup() == null ? other.getIsGroup() == null : this.getIsGroup().equals(other.getIsGroup()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getAwardType() == null ? other.getAwardType() == null : this.getAwardType().equals(other.getAwardType()))
            && (this.getAwardConfig() == null ? other.getAwardConfig() == null : this.getAwardConfig().equals(other.getAwardConfig()))
            && (this.getAllowEndSubmit() == null ? other.getAllowEndSubmit() == null : this.getAllowEndSubmit().equals(other.getAllowEndSubmit()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getAuth() == null) ? 0 : getAuth().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getSealRank() == null) ? 0 : getSealRank().hashCode());
        result = prime * result + ((getSealRankTime() == null) ? 0 : getSealRankTime().hashCode());
        result = prime * result + ((getAutoRealRank() == null) ? 0 : getAutoRealRank().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getVisible() == null) ? 0 : getVisible().hashCode());
        result = prime * result + ((getOpenPrint() == null) ? 0 : getOpenPrint().hashCode());
        result = prime * result + ((getOpenAccountLimit() == null) ? 0 : getOpenAccountLimit().hashCode());
        result = prime * result + ((getAccountLimitRule() == null) ? 0 : getAccountLimitRule().hashCode());
        result = prime * result + ((getRankShowName() == null) ? 0 : getRankShowName().hashCode());
        result = prime * result + ((getOpenRank() == null) ? 0 : getOpenRank().hashCode());
        result = prime * result + ((getStarAccount() == null) ? 0 : getStarAccount().hashCode());
        result = prime * result + ((getOiRankScoreType() == null) ? 0 : getOiRankScoreType().hashCode());
        result = prime * result + ((getIsGroup() == null) ? 0 : getIsGroup().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getAwardType() == null) ? 0 : getAwardType().hashCode());
        result = prime * result + ((getAwardConfig() == null) ? 0 : getAwardConfig().hashCode());
        result = prime * result + ((getAllowEndSubmit() == null) ? 0 : getAllowEndSubmit().hashCode());
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
        sb.append(", uid=").append(uid);
        sb.append(", author=").append(author);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", description=").append(description);
        sb.append(", source=").append(source);
        sb.append(", auth=").append(auth);
        sb.append(", pwd=").append(pwd);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", duration=").append(duration);
        sb.append(", sealRank=").append(sealRank);
        sb.append(", sealRankTime=").append(sealRankTime);
        sb.append(", autoRealRank=").append(autoRealRank);
        sb.append(", status=").append(status);
        sb.append(", visible=").append(visible);
        sb.append(", openPrint=").append(openPrint);
        sb.append(", openAccountLimit=").append(openAccountLimit);
        sb.append(", accountLimitRule=").append(accountLimitRule);
        sb.append(", rankShowName=").append(rankShowName);
        sb.append(", openRank=").append(openRank);
        sb.append(", starAccount=").append(starAccount);
        sb.append(", oiRankScoreType=").append(oiRankScoreType);
        sb.append(", isGroup=").append(isGroup);
        sb.append(", gid=").append(gid);
        sb.append(", awardType=").append(awardType);
        sb.append(", awardConfig=").append(awardConfig);
        sb.append(", allowEndSubmit=").append(allowEndSubmit);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}