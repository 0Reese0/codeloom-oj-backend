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
 * @TableName judge_case
 */
@TableName(value ="judge_case")
@Data
public class JudgeCase implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 提交判题id
     */
private Long submitId;

    /**
     * 用户id
     */
private String uid;

    /**
     * 题目id
     */
private Long pid;

    /**
     * 测试样例id
     */
    private Long caseId;

    /**
     * 具体看结果码
     */
    private Integer status;

    /**
     * 测试该样例所用时间ms
     */
    private Integer time;

    /**
     * 测试该样例所用空间KB
     */
    private Integer memory;

    /**
     * IO得分
     */
    private Integer score;

    /**
     * subtask分组的组号
     */
    private Integer groupNum;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * default,subtask_lowest,subtask_average
     */
    private String mode;

    /**
     * 样例输入，比赛不可看
     */
    private String inputData;

    /**
     * 样例输出，比赛不可看
     */
    private String outputData;

    /**
     * 用户样例输出，比赛不可看
     */
    private String userOutput;

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
        JudgeCase other = (JudgeCase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSubmitId() == null ? other.getSubmitId() == null : this.getSubmitId().equals(other.getSubmitId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getCaseId() == null ? other.getCaseId() == null : this.getCaseId().equals(other.getCaseId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getMemory() == null ? other.getMemory() == null : this.getMemory().equals(other.getMemory()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getGroupNum() == null ? other.getGroupNum() == null : this.getGroupNum().equals(other.getGroupNum()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getMode() == null ? other.getMode() == null : this.getMode().equals(other.getMode()))
            && (this.getInputData() == null ? other.getInputData() == null : this.getInputData().equals(other.getInputData()))
            && (this.getOutputData() == null ? other.getOutputData() == null : this.getOutputData().equals(other.getOutputData()))
            && (this.getUserOutput() == null ? other.getUserOutput() == null : this.getUserOutput().equals(other.getUserOutput()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSubmitId() == null) ? 0 : getSubmitId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getMemory() == null) ? 0 : getMemory().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getGroupNum() == null) ? 0 : getGroupNum().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getMode() == null) ? 0 : getMode().hashCode());
        result = prime * result + ((getInputData() == null) ? 0 : getInputData().hashCode());
        result = prime * result + ((getOutputData() == null) ? 0 : getOutputData().hashCode());
        result = prime * result + ((getUserOutput() == null) ? 0 : getUserOutput().hashCode());
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
        sb.append(", uid=").append(uid);
        sb.append(", pid=").append(pid);
        sb.append(", caseId=").append(caseId);
        sb.append(", status=").append(status);
        sb.append(", time=").append(time);
        sb.append(", memory=").append(memory);
        sb.append(", score=").append(score);
        sb.append(", groupNum=").append(groupNum);
        sb.append(", seq=").append(seq);
        sb.append(", mode=").append(mode);
        sb.append(", inputData=").append(inputData);
        sb.append(", outputData=").append(outputData);
        sb.append(", userOutput=").append(userOutput);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}