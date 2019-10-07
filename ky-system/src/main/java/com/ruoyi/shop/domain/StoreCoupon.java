package com.ruoyi.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 优惠券主对象 store_coupon
 * 
 * @author hupeng
 * @date 2019-08-29
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreCoupon extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    private Integer id;

    /** 优惠券名字 */
    @Excel(name = "优惠券名字")
    private String name;

    /** 发放类型 0下单赠送1 指定发放 2 免费领取 3线下发放 */
    private Integer type;

    /** 优惠券金额 */
    @Excel(name = "优惠券金额")
    private Double money;

    /** 使用条件，满多少金额 */
    @Excel(name = "使用条件，满多少金额")
    private Double condition;

    /** 发放数量 */
    @Excel(name = "发放数量")
    private Long createnum;

    /** 已领取数量 */
    @Excel(name = "已领取数量")
    private Long sendNum;

    /** 已使用数量 */
    private Long useNum;

    /** 发放开始时间 */
    private Long sendStartTime;

    /** 发放结束时间 */
    private Long sendEndTime;

    /** 使用开始时间 */
    @Excel(name = "使用开始时间")
    private Date useStartTime;

    /** 使用结束时间 */
    @Excel(name = "使用结束时间")
    private Date useEndTime;

    /** 添加时间 */
    private Long addTime;

    /** 状态：1有效,2无效 */
    private Integer status;

    /** 使用范围：0全店通用1指定商品可用2指定分类商品可用 */
    private Integer useType;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("money", getMoney())
            .append("condition", getCondition())
            .append("createnum", getCreatenum())
            .append("sendNum", getSendNum())
            .append("useNum", getUseNum())
            .append("sendStartTime", getSendStartTime())
            .append("sendEndTime", getSendEndTime())
            .append("useStartTime", getUseStartTime())
            .append("useEndTime", getUseEndTime())
            .append("addTime", getAddTime())
            .append("status", getStatus())
            .append("useType", getUseType())
            .toString();
    }
}
