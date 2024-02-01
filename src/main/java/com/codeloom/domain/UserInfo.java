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
 * @TableName user_info
 */
@TableName(value ="user_info")
@Data
public class UserInfo implements Serializable {
    /**
     * 
     */

    private String uuid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 学校
     */
    private String school;

    /**
     * 专业
     */
    private String course;

    /**
     * 学号
     */
    private String number;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 性别
     */
    private String gender;

    /**
     * github地址
     */
    private String github;

    /**
     * 博客地址
     */
    private String blog;

    /**
     * cf的username
     */
    private String cfUsername;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 头衔、称号
     */
    private String titleName;

    /**
     * 头衔、称号的颜色
     */
    private String titleColor;

    /**
     * 0可用，1不可用
     */
    private Integer status;

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
        UserInfo other = (UserInfo) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getCourse() == null ? other.getCourse() == null : this.getCourse().equals(other.getCourse()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getGithub() == null ? other.getGithub() == null : this.getGithub().equals(other.getGithub()))
            && (this.getBlog() == null ? other.getBlog() == null : this.getBlog().equals(other.getBlog()))
            && (this.getCfUsername() == null ? other.getCfUsername() == null : this.getCfUsername().equals(other.getCfUsername()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getTitleName() == null ? other.getTitleName() == null : this.getTitleName().equals(other.getTitleName()))
            && (this.getTitleColor() == null ? other.getTitleColor() == null : this.getTitleColor().equals(other.getTitleColor()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getCourse() == null) ? 0 : getCourse().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getGithub() == null) ? 0 : getGithub().hashCode());
        result = prime * result + ((getBlog() == null) ? 0 : getBlog().hashCode());
        result = prime * result + ((getCfUsername() == null) ? 0 : getCfUsername().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getTitleName() == null) ? 0 : getTitleName().hashCode());
        result = prime * result + ((getTitleColor() == null) ? 0 : getTitleColor().hashCode());
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
        sb.append(", uuid=").append(uuid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", school=").append(school);
        sb.append(", course=").append(course);
        sb.append(", number=").append(number);
        sb.append(", realname=").append(realname);
        sb.append(", gender=").append(gender);
        sb.append(", github=").append(github);
        sb.append(", blog=").append(blog);
        sb.append(", cfUsername=").append(cfUsername);
        sb.append(", email=").append(email);
        sb.append(", avatar=").append(avatar);
        sb.append(", signature=").append(signature);
        sb.append(", titleName=").append(titleName);
        sb.append(", titleColor=").append(titleColor);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}