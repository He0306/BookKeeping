package com.hc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 账本用户表
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tb_book_user")
@ApiModel(value = "BookUser对象", description = "账本用户表")
public class BookUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("系统id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("账本外键")
    private Long bookId;

    @ApiModelProperty("用户外键")
    private Long userId;

    @ApiModelProperty("头像地址")
    private String avatarUrl;

    @ApiModelProperty("否是默认账本(0-否，1是）")
    private Long defaultBook;

    @ApiModelProperty("0-无，1-同意，2-拒绝")
    private String auditStatus;

    @ApiModelProperty("0-删除，1-正常，2-禁用")
    private String status;

    @ApiModelProperty("真实姓名")
    private String userName;

    @ApiModelProperty("用户别名")
    private String reallyName;

    @ApiModelProperty("创建人")
    private Long createBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新人")
    private Long updateBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("是否管理员权限（0-否成员，1管理员  2群主创建人）")
    private Long auth;

    @ApiModelProperty("加入账本描述备注")
    private String remark;


}
