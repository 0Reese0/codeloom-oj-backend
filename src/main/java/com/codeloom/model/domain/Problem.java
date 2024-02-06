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
 * @TableName problem
 */
@TableName(value ="problem")
@Data
public class Problem implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 问题的自定义ID 例如（HOJ-1000）
     */
    private String problemId;

    /**
     * 题目
     */
    private String title;

    /**
     * 作者
     */
    private String author;

    /**
     * 0为ACM,1为OI
     */
    private Integer type;

    /**
     * 单位ms
     */
    private Integer timeLimit;

    /**
     * 单位kb
     */
    private Integer memoryLimit;

    /**
     * 单位mb
     */
    private Integer stackLimit;

    /**
     * 描述
     */
    private String description;

    /**
     * 输入描述
     */
    private String input;

    /**
     * 输出描述
     */
    private String output;

    /**
     * 题面样例
     */
    private String examples;

    /**
     * 是否为vj判题
     */
    private Integer isRemote;

    /**
     * 题目来源
     */
    private String source;

    /**
     * 题目难度,0简单，1中等，2困难
     */
    private Integer difficulty;

    /**
     * 备注,提醒
     */
    private String hint;

    /**
     * 默认为1公开，2为私有，3为比赛题目
     */
    private Integer auth;

    /**
     * 当该题目为io题目时的分数
     */
    private Integer ioScore;

    /**
     * 该题目对应的相关提交代码，用户是否可用分享
     */
    private Integer codeShare;

    /**
     * 题目评测模式,default、spj、interactive
     */
    private String judgeMode;

    /**
     * 题目样例评测模式,default,subtask_lowest,subtask_average
     */
    private String judgeCaseMode;

    /**
     * 题目评测时用户程序的额外文件 json key:name value:content
     */
    private String userExtraFile;

    /**
     * 题目评测时交互或特殊程序的额外文件 json key:name value:content
     */
    private String judgeExtraFile;

    /**
     * 特判程序或交互程序代码
     */
    private String spjCode;

    /**
     * 特判程序或交互程序代码的语言
     */
    private String spjLanguage;

    /**
     * 是否默认去除用户代码的文末空格
     */
    private Integer isRemoveEndBlank;

    /**
     * 是否默认开启该题目的测试样例结果查看
     */
    private Integer openCaseResult;

    /**
     * 题目测试数据是否是上传文件的
     */
    private Integer isUploadCase;

    /**
     * 题目测试数据的版本号
     */
    private String caseVersion;

    /**
     * 修改题目的管理员用户名
     */
    private String modifiedUser;

    /**
     * 
     */
    private Integer isGroup;

    /**
     * 
     */
    private Long gid;

    /**
     * 申请公开的进度：null为未申请，1为申请中，2为申请通过，3为申请拒绝
     */
    private Integer applyPublicProgress;

    /**
     * 是否是file io自定义输入输出文件模式
     */
    private Integer isFileIo;

    /**
     * 题目指定的file io输入文件的名称
     */
    private String ioReadFileName;

    /**
     * 题目指定的file io输出文件的名称
     */
    private String ioWriteFileName;

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
        Problem other = (Problem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProblemId() == null ? other.getProblemId() == null : this.getProblemId().equals(other.getProblemId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTimeLimit() == null ? other.getTimeLimit() == null : this.getTimeLimit().equals(other.getTimeLimit()))
            && (this.getMemoryLimit() == null ? other.getMemoryLimit() == null : this.getMemoryLimit().equals(other.getMemoryLimit()))
            && (this.getStackLimit() == null ? other.getStackLimit() == null : this.getStackLimit().equals(other.getStackLimit()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getInput() == null ? other.getInput() == null : this.getInput().equals(other.getInput()))
            && (this.getOutput() == null ? other.getOutput() == null : this.getOutput().equals(other.getOutput()))
            && (this.getExamples() == null ? other.getExamples() == null : this.getExamples().equals(other.getExamples()))
            && (this.getIsRemote() == null ? other.getIsRemote() == null : this.getIsRemote().equals(other.getIsRemote()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getHint() == null ? other.getHint() == null : this.getHint().equals(other.getHint()))
            && (this.getAuth() == null ? other.getAuth() == null : this.getAuth().equals(other.getAuth()))
            && (this.getIoScore() == null ? other.getIoScore() == null : this.getIoScore().equals(other.getIoScore()))
            && (this.getCodeShare() == null ? other.getCodeShare() == null : this.getCodeShare().equals(other.getCodeShare()))
            && (this.getJudgeMode() == null ? other.getJudgeMode() == null : this.getJudgeMode().equals(other.getJudgeMode()))
            && (this.getJudgeCaseMode() == null ? other.getJudgeCaseMode() == null : this.getJudgeCaseMode().equals(other.getJudgeCaseMode()))
            && (this.getUserExtraFile() == null ? other.getUserExtraFile() == null : this.getUserExtraFile().equals(other.getUserExtraFile()))
            && (this.getJudgeExtraFile() == null ? other.getJudgeExtraFile() == null : this.getJudgeExtraFile().equals(other.getJudgeExtraFile()))
            && (this.getSpjCode() == null ? other.getSpjCode() == null : this.getSpjCode().equals(other.getSpjCode()))
            && (this.getSpjLanguage() == null ? other.getSpjLanguage() == null : this.getSpjLanguage().equals(other.getSpjLanguage()))
            && (this.getIsRemoveEndBlank() == null ? other.getIsRemoveEndBlank() == null : this.getIsRemoveEndBlank().equals(other.getIsRemoveEndBlank()))
            && (this.getOpenCaseResult() == null ? other.getOpenCaseResult() == null : this.getOpenCaseResult().equals(other.getOpenCaseResult()))
            && (this.getIsUploadCase() == null ? other.getIsUploadCase() == null : this.getIsUploadCase().equals(other.getIsUploadCase()))
            && (this.getCaseVersion() == null ? other.getCaseVersion() == null : this.getCaseVersion().equals(other.getCaseVersion()))
            && (this.getModifiedUser() == null ? other.getModifiedUser() == null : this.getModifiedUser().equals(other.getModifiedUser()))
            && (this.getIsGroup() == null ? other.getIsGroup() == null : this.getIsGroup().equals(other.getIsGroup()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getApplyPublicProgress() == null ? other.getApplyPublicProgress() == null : this.getApplyPublicProgress().equals(other.getApplyPublicProgress()))
            && (this.getIsFileIo() == null ? other.getIsFileIo() == null : this.getIsFileIo().equals(other.getIsFileIo()))
            && (this.getIoReadFileName() == null ? other.getIoReadFileName() == null : this.getIoReadFileName().equals(other.getIoReadFileName()))
            && (this.getIoWriteFileName() == null ? other.getIoWriteFileName() == null : this.getIoWriteFileName().equals(other.getIoWriteFileName()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTimeLimit() == null) ? 0 : getTimeLimit().hashCode());
        result = prime * result + ((getMemoryLimit() == null) ? 0 : getMemoryLimit().hashCode());
        result = prime * result + ((getStackLimit() == null) ? 0 : getStackLimit().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getInput() == null) ? 0 : getInput().hashCode());
        result = prime * result + ((getOutput() == null) ? 0 : getOutput().hashCode());
        result = prime * result + ((getExamples() == null) ? 0 : getExamples().hashCode());
        result = prime * result + ((getIsRemote() == null) ? 0 : getIsRemote().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getHint() == null) ? 0 : getHint().hashCode());
        result = prime * result + ((getAuth() == null) ? 0 : getAuth().hashCode());
        result = prime * result + ((getIoScore() == null) ? 0 : getIoScore().hashCode());
        result = prime * result + ((getCodeShare() == null) ? 0 : getCodeShare().hashCode());
        result = prime * result + ((getJudgeMode() == null) ? 0 : getJudgeMode().hashCode());
        result = prime * result + ((getJudgeCaseMode() == null) ? 0 : getJudgeCaseMode().hashCode());
        result = prime * result + ((getUserExtraFile() == null) ? 0 : getUserExtraFile().hashCode());
        result = prime * result + ((getJudgeExtraFile() == null) ? 0 : getJudgeExtraFile().hashCode());
        result = prime * result + ((getSpjCode() == null) ? 0 : getSpjCode().hashCode());
        result = prime * result + ((getSpjLanguage() == null) ? 0 : getSpjLanguage().hashCode());
        result = prime * result + ((getIsRemoveEndBlank() == null) ? 0 : getIsRemoveEndBlank().hashCode());
        result = prime * result + ((getOpenCaseResult() == null) ? 0 : getOpenCaseResult().hashCode());
        result = prime * result + ((getIsUploadCase() == null) ? 0 : getIsUploadCase().hashCode());
        result = prime * result + ((getCaseVersion() == null) ? 0 : getCaseVersion().hashCode());
        result = prime * result + ((getModifiedUser() == null) ? 0 : getModifiedUser().hashCode());
        result = prime * result + ((getIsGroup() == null) ? 0 : getIsGroup().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getApplyPublicProgress() == null) ? 0 : getApplyPublicProgress().hashCode());
        result = prime * result + ((getIsFileIo() == null) ? 0 : getIsFileIo().hashCode());
        result = prime * result + ((getIoReadFileName() == null) ? 0 : getIoReadFileName().hashCode());
        result = prime * result + ((getIoWriteFileName() == null) ? 0 : getIoWriteFileName().hashCode());
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
        sb.append(", problemId=").append(problemId);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", type=").append(type);
        sb.append(", timeLimit=").append(timeLimit);
        sb.append(", memoryLimit=").append(memoryLimit);
        sb.append(", stackLimit=").append(stackLimit);
        sb.append(", description=").append(description);
        sb.append(", input=").append(input);
        sb.append(", output=").append(output);
        sb.append(", examples=").append(examples);
        sb.append(", isRemote=").append(isRemote);
        sb.append(", source=").append(source);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", hint=").append(hint);
        sb.append(", auth=").append(auth);
        sb.append(", ioScore=").append(ioScore);
        sb.append(", codeShare=").append(codeShare);
        sb.append(", judgeMode=").append(judgeMode);
        sb.append(", judgeCaseMode=").append(judgeCaseMode);
        sb.append(", userExtraFile=").append(userExtraFile);
        sb.append(", judgeExtraFile=").append(judgeExtraFile);
        sb.append(", spjCode=").append(spjCode);
        sb.append(", spjLanguage=").append(spjLanguage);
        sb.append(", isRemoveEndBlank=").append(isRemoveEndBlank);
        sb.append(", openCaseResult=").append(openCaseResult);
        sb.append(", isUploadCase=").append(isUploadCase);
        sb.append(", caseVersion=").append(caseVersion);
        sb.append(", modifiedUser=").append(modifiedUser);
        sb.append(", isGroup=").append(isGroup);
        sb.append(", gid=").append(gid);
        sb.append(", applyPublicProgress=").append(applyPublicProgress);
        sb.append(", isFileIo=").append(isFileIo);
        sb.append(", ioReadFileName=").append(ioReadFileName);
        sb.append(", ioWriteFileName=").append(ioWriteFileName);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}