package com.yishenheng.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 客户详情表
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_customer_info")
@ApiModel(value="CustomerInfo对象", description="客户详情表")
public class CustomerInfo extends Model<CustomerInfo> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    @ApiModelProperty(value = "客户名称")
    private String name;

    @ApiModelProperty(value = "客户分组的id")
    private String groupId;

    @ApiModelProperty(value = "客户经理")
    private String director;

    @ApiModelProperty(value = "客户等级，级别越高字母越大 A-B-C-D")
    private String level;

    @ApiModelProperty(value = "客户类型：1=潜在客户、2=事实客户")
    private String type;

    @ApiModelProperty(value = "注册时间")
    @TableField("regTime")
    private String regTime;

    @ApiModelProperty(value = "资产")
    private String assets;

    @ApiModelProperty(value = "公司法人")
    private String legalPerson;

    @ApiModelProperty(value = "办公地点")
    private String officeLocation;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
