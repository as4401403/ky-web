package com.ruoyi.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 优惠券记录对象 store_coupon_list
 * 
 * @author hupeng
 * @date 2019-08-29
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreCouponList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    private Integer id;

    /** 优惠券 对应coupon表id */
    @Excel(name = "优惠券 对应coupon表id")
    private Integer cid;

    /** 发放类型 1 按订单发放 2 注册 3 邀请 4 按用户发放 */
    @Excel(name = "发放类型 1 按订单发放 2 注册 3 邀请 4 按用户发放")
    private Integer type;

    /** 用户id */
    @Excel(name = "用户id")
    private Integer uid;

    /** 订单id */
    @Excel(name = "订单id")
    private Integer orderId;

    /** 优惠券来自订单ID */
    @Excel(name = "优惠券来自订单ID")
    private Long getOrderId;

    /** 使用时间 */
    @Excel(name = "使用时间")
    private Long useTime;

    /** 优惠券兑换码 */
    @Excel(name = "优惠券兑换码")
    private String code;

    /** 发放时间 */
    @Excel(name = "发放时间")
    private Long sendTime;

    /** 0未使用1已使用2已过期 */
    @Excel(name = "0未使用1已使用2已过期")
    private Integer status;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cid", getCid())
            .append("type", getType())
            .append("uid", getUid())
            .append("orderId", getOrderId())
            .append("getOrderId", getGetOrderId())
            .append("useTime", getUseTime())
            .append("code", getCode())
            .append("sendTime", getSendTime())
            .append("status", getStatus())
            .toString();
    }
}
