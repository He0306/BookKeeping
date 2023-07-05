package com.hc.entity;

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
 * 分类默认库
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tb_category_base")
@ApiModel(value = "CategoryBase对象", description = "分类默认库")
public class CategoryBase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty("分类名称")
    private String name;

    @ApiModelProperty("启用状态（0-禁用 ，1-启用）")
    private String status;

    @ApiModelProperty("高亮图标url")
    private String weightIcon;

    @ApiModelProperty("分类类型（0-收入 1-支出）")
    private String type;

    @ApiModelProperty("分类图标url")
    private String icon;

    @ApiModelProperty("创建人")
    private Long createBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新人")
    private Long updateBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;


}
