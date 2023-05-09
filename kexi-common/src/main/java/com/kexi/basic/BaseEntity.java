package com.kexi.basic;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author kexifa
 * @version 1.0
 * @date 2023/5/9 9:06
 */
public class BaseEntity {
    @TableId(
            value = "id",
            type = IdType.AUTO
    )
    @ApiModelProperty(
            value = "主键",
            hidden = true
    )
    private Long id;
    @TableField(
            fill = FieldFill.INSERT
    )
    @ApiModelProperty(
            value = "创建时间",
            hidden = true
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date createTime;
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @ApiModelProperty(
            value = "更新时间",
            hidden = true
    )
    private Date modifiedTime;
    @TableField(
            fill = FieldFill.INSERT
    )
    @TableLogic
    @ApiModelProperty(
            value = "是否删除",
            hidden = true
    )
    private Boolean isDeleted;

    public BaseEntity() {
    }

    public Long getId() {
        return this.id;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }


    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    public void setModifyTime(Date createTime) {
        this.modifiedTime= modifiedTime;
    }
}
