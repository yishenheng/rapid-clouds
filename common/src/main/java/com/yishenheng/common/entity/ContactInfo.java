package com.yishenheng.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 联系人详情
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_contact_info")
@ApiModel(value="ContactInfo对象", description="联系人详情")
public class ContactInfo extends Model<ContactInfo> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    @ApiModelProperty(value = "联系人姓名")
    private String name;

    @ApiModelProperty(value = "性别:1=男0=女2=其他")
    private String sex;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "职务，如基金经理")
    private String jobTitle;

    @ApiModelProperty(value = "客户id")
    private String customerId;

    @ApiModelProperty(value = "是否在职")
    @TableField("where_Work")
    private String whereWork;

    @ApiModelProperty(value = "是否启用 0=启用 1=不启用")
    private String whereEnable;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
