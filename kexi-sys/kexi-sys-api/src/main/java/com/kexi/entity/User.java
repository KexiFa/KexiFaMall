package com.kexi.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -40356785423868312L;

    /**
     * 主键
     */
    @TableId()
    @ApiModelProperty(hidden = true)
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 昵称
     */
    @ApiModelProperty(hidden = true)
    private String nickName;
    /**
     * 密码
     */
    private String password;
    /**
     * 账号状态（0正常 1停用）
     */
    @ApiModelProperty(hidden = true)
    private String status;
    /**
     * 邮箱
     */
    @ApiModelProperty(hidden = true)
    private String email;
    /**
     * 手机号
     */
    @ApiModelProperty(hidden = true)
    private Long phoneNumber;
    /**
     * 用户性别（0男，1女，2未知）
     */
    @ApiModelProperty(hidden = true)
    private String sex;
    /**
     * 头像
     */
    @ApiModelProperty(hidden = true)
    private String avatar;
    /**
     * 用户类型（0管理员，1普通用户）
     */
    @ApiModelProperty(hidden = true)
    private String userType;
    /**
     * 创建人的用户id
     */
    @ApiModelProperty(hidden = true)
    private Long createBy;
    /**
     * 创建时间
     */
    @ApiModelProperty(hidden = true)
    private Date createTime;
    /**
     * 更新人
     */
    @ApiModelProperty(hidden = true)
    private Long updateBy;
    /**
     * 更新时间
     */
    @ApiModelProperty(hidden = true)
    private Date updateTime;
    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    @ApiModelProperty(hidden = true)
    private Integer delFlag;
}
