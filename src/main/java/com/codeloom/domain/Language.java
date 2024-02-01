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
 * @TableName language
 */
@TableName(value ="language")
@Data
public class Language implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 语言类型
     */
    private String contentType;

    /**
     * 语言描述
     */
    private String description;

    /**
     * 语言名字
     */
    private String name;

    /**
     * 编译指令
     */
    private String compileCommand;

    /**
     * 模板
     */
    private String template;

    /**
     * 语言默认代码模板
     */
    private String codeTemplate;

    /**
     * 是否可作为特殊判题的一种语言
     */
    private Integer isSpj;

    /**
     * 该语言属于哪个oj，自身oj用ME
     */
    private String oj;

    /**
     * 语言排序
     */
    private Integer seq;

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
        Language other = (Language) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContentType() == null ? other.getContentType() == null : this.getContentType().equals(other.getContentType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCompileCommand() == null ? other.getCompileCommand() == null : this.getCompileCommand().equals(other.getCompileCommand()))
            && (this.getTemplate() == null ? other.getTemplate() == null : this.getTemplate().equals(other.getTemplate()))
            && (this.getCodeTemplate() == null ? other.getCodeTemplate() == null : this.getCodeTemplate().equals(other.getCodeTemplate()))
            && (this.getIsSpj() == null ? other.getIsSpj() == null : this.getIsSpj().equals(other.getIsSpj()))
            && (this.getOj() == null ? other.getOj() == null : this.getOj().equals(other.getOj()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContentType() == null) ? 0 : getContentType().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCompileCommand() == null) ? 0 : getCompileCommand().hashCode());
        result = prime * result + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        result = prime * result + ((getCodeTemplate() == null) ? 0 : getCodeTemplate().hashCode());
        result = prime * result + ((getIsSpj() == null) ? 0 : getIsSpj().hashCode());
        result = prime * result + ((getOj() == null) ? 0 : getOj().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
        sb.append(", contentType=").append(contentType);
        sb.append(", description=").append(description);
        sb.append(", name=").append(name);
        sb.append(", compileCommand=").append(compileCommand);
        sb.append(", template=").append(template);
        sb.append(", codeTemplate=").append(codeTemplate);
        sb.append(", isSpj=").append(isSpj);
        sb.append(", oj=").append(oj);
        sb.append(", seq=").append(seq);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}