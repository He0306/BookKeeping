package com.hc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: 何超
 * @date: 2023-07-03 10:20
 * @description:
 */
@Data
@TableName("tb_user")
@Accessors(chain = true)
@ApiModel(value = "User对象", description = "用户表（微信）表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("系统id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户在当前小程序的唯一标识")
    private String openid;

    @ApiModelProperty("用户微信昵称")
    private String nickName;


    @ApiModelProperty("性别，0-未知、1-男性、2-女性")
    private Integer gender;

    @ApiModelProperty("手机")
    private String tel;

    @ApiModelProperty("默认账本")
    private String defaultBook;

    @ApiModelProperty("头像地址")
    private String avatarUrl;

    @ApiModelProperty("登录IP地址")
    private String ipAddress;

    @ApiModelProperty("登录地址")
    private String ipSource;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}
