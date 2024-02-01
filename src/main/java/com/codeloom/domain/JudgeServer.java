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
 * @TableName judge_server
 */
@TableName(value ="judge_server")
@Data
public class JudgeServer implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 判题服务名字
     */
    private String name;

    /**
     * 判题机ip
     */
    private String ip;

    /**
     * 判题机端口号
     */
    private Integer port;

    /**
     * ip:port
     */
    private String url;

    /**
     * 判题机所在服务器cpu核心数
     */
    private Integer cpuCore;

    /**
     * 当前判题数
     */
    private Integer taskNumber;

    /**
     * 判题并发最大数
     */
    private Integer maxTaskNumber;

    /**
     * 0可用，1不可用
     */
    private Integer status;

    /**
     * 是否开启远程判题vj
     */
    private Integer isRemote;

    /**
     * 是否可提交CF
     */
    private Integer cfSubmittable;

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
        JudgeServer other = (JudgeServer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getCpuCore() == null ? other.getCpuCore() == null : this.getCpuCore().equals(other.getCpuCore()))
            && (this.getTaskNumber() == null ? other.getTaskNumber() == null : this.getTaskNumber().equals(other.getTaskNumber()))
            && (this.getMaxTaskNumber() == null ? other.getMaxTaskNumber() == null : this.getMaxTaskNumber().equals(other.getMaxTaskNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsRemote() == null ? other.getIsRemote() == null : this.getIsRemote().equals(other.getIsRemote()))
            && (this.getCfSubmittable() == null ? other.getCfSubmittable() == null : this.getCfSubmittable().equals(other.getCfSubmittable()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getCpuCore() == null) ? 0 : getCpuCore().hashCode());
        result = prime * result + ((getTaskNumber() == null) ? 0 : getTaskNumber().hashCode());
        result = prime * result + ((getMaxTaskNumber() == null) ? 0 : getMaxTaskNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsRemote() == null) ? 0 : getIsRemote().hashCode());
        result = prime * result + ((getCfSubmittable() == null) ? 0 : getCfSubmittable().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", url=").append(url);
        sb.append(", cpuCore=").append(cpuCore);
        sb.append(", taskNumber=").append(taskNumber);
        sb.append(", maxTaskNumber=").append(maxTaskNumber);
        sb.append(", status=").append(status);
        sb.append(", isRemote=").append(isRemote);
        sb.append(", cfSubmittable=").append(cfSubmittable);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}