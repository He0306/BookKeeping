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
 * 账本表
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tb_book")
@ApiModel(value = "Book对象", description = "账本表")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("系统id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("账本名称")
    private String bookName;

    @ApiModelProperty("账本图片")
    private String bookAvatar;

    @ApiModelProperty("成员加入账本是否需要审核（0-不需要 1-需要管理员审核）")
    private Integer userAudit;

    @ApiModelProperty("是否允许对外搜索私密账本（0-私密不允许，1-公开允许）")
    private Integer showSearch;

    @ApiModelProperty("0-删除，1-正常，2-禁用")
    private String status;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("创建人")
    private Long createBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("更新人")
    private Long updateBy;


}
