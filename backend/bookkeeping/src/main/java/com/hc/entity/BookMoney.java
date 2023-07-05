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
 * 账本记账金额表
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tb_book_money")
@ApiModel(value = "BookMoney对象", description = "账本记账金额表")
public class BookMoney implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("系统id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("账本id")
    private Long bookId;

    @ApiModelProperty("分类外键id")
    private Long categoryId;

    @ApiModelProperty("分类名")
    private String categoryName;

    @ApiModelProperty("分类图标url  或者 捐款人头像")
    private String avatarUrl;

    @ApiModelProperty("捐款人book_money表user_name")
    private String userName;

    @ApiModelProperty("捐款人book_money表id")
    private Integer userId;

    @ApiModelProperty("0-删除，1-正常")
    private String status;

    @ApiModelProperty("金额")
    private Long money;

    @ApiModelProperty("记账时间")
    private Date bookTime;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("1-支出，0-收入")
    private Integer type;

    @ApiModelProperty("创建人")
    private Long createBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新人")
    private Long updateBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("富文本详情")
    private String detailDesc;

    @ApiModelProperty("是否显示详情 0-否 1-是")
    private String detailDescFlag;


}
