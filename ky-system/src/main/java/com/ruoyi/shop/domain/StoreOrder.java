package com.ruoyi.shop.domain;

import com.ruoyi.common.enums.OrderStatus;
import com.ruoyi.common.utils.OrderUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;
import java.util.List;

/**
 * 订单主对象 store_order
 * 
 * @author hupeng
 * @date 2019-08-29
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Integer orderId;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderSn;

    /** 用户id */
    @Excel(name = "用户id")
    private Integer userId;

    /** 订单状态 0-未确认 1-已确认(已收货） 2-已评价 */
    @Excel(name = "订单状态 0-未确认 1-已确认(已收货） 2-已评价")
    private Integer orderStatus;

    /** 发货状态 0-未发货 1-已发货 2-退货中 3-退货完成 */
    @Excel(name = "发货状态 0-未发货 1-已发货 2-退货中 3-退货完成")
    private Integer shippingStatus;

    /** 支付状态 0-未支付 1-已支付 */
    @Excel(name = "支付状态 0-未支付 1-已支付")
    private Integer payStatus;

    /** 收货人 */
    @Excel(name = "收货人")
    private String consignee;

    /** 国家 */
    @Excel(name = "国家")
    private Long country;

    /** 省份 */
    @Excel(name = "省份")
    private Long province;

    /** 城市 */
    @Excel(name = "城市")
    private Long city;

    /** 县区 */
    @Excel(name = "县区")
    private Long district;

    /** 乡镇 */
    @Excel(name = "乡镇")
    private Long twon;

    /** 地区地址 */
    @Excel(name = "地区地址")
    private String cityInfo;

    /** 地址详细地址 */
    @Excel(name = "地址详细地址")
    private String address;

    /** 邮政编码 */
    private String zipcode;

    /** 手机 */
    @Excel(name = "手机")
    private String mobile;

    /** 邮件 */
    private String email;

    /** 收货方式 1-物流 2-快递 3-自取 */
    private Integer receiveType;

    /** 物流code 单号 */
    private String shippingCode;

    /** 物流名称 */
    private String shippingName;

    /** 支付code */
    private String payCode;

    /** 支付方式1-微信2-余额3-转账 */
    @Excel(name = "支付方式1-微信2-余额3-转账")
    private Integer payMethod;

    /** 支付方式为转账的转账id */
    private Integer rechargeId;

    /** 支付方式名称 */
    private String payName;

    /** 发票抬头 */
    private String invoiceTitle;

    /** 纳税人识别号 */
    private String taxpayer;

    /** 商品总价 */
    @Excel(name = "商品总价")
    private Double goodsPrice;

    /** 邮费 */
    private Double shippingPrice;

    /** 使用余额 */
    private Double userMoney;

    /** 优惠券抵扣 */
    @Excel(name = "优惠券抵扣")
    private Double couponPrice;

    /** 使用积分 */
    private Integer integral;

    /** 使用积分抵多少钱 */
    private Double integralMoney;

    /** 应付款金额 */
    @Excel(name = "应付款金额")
    private Double orderAmount;

    /** 订单总价 */
    @Excel(name = "订单总价")
    private Double totalAmount;

    /** 下单时间 */
    @Excel(name = "下单时间")
    private Date addTime;

    /** 最后新发货时间 */
    @Excel(name = "最后新发货时间")
    private Long shippingTime;

    /** 收货确认时间 */
    @Excel(name = "收货确认时间")
    private Integer confirmTime;

    /** 支付时间 */
    @Excel(name = "支付时间")
    private Integer payTime;

    /** 第三方平台交易流水号 */
    private String transactionId;

    /** 活动ID */
    private Long promId;

    /** 订单类型：0普通订单4预售订单5虚拟订单6拼团订单 */
    private Integer promType;

    /** 活动id */
    private Integer orderPromId;

    /** 活动优惠金额 */
    private Double orderPromAmount;

    /** 价格调整 */
    private Double discount;

    /** 用户备注 */
    private String userNote;

    /** 管理员备注 */
    private String adminNote;

    /** 父单单号 */
    private String parentSn;

    /** 是否已分成0未分成1已分成 */
    private Integer isDistribut;

    /** 订金 */
    private Double paidMoney;

    /** 删除|取消时间 */
    private Long deletedTime;

    /** 用户假删除标识,1:删除,0未删除 */
    private Integer deleted;

    /** 管理后台修改变动的价格 */
    @Excel(name = "管理后台修改变动的价格")
    private String editMoney;

    private String orderStatusStr;

    private StoreMember storeMember;

    private List<StoreOrderGoods> storeOrderGoods;

    public String getOrderStatusStr() {

        if(payStatus != null || shippingStatus != null || orderStatus != null || deleted != null){
            int status = OrderUtils.orderStatus(payStatus,shippingStatus,orderStatus,deleted);
            return OrderStatus.getValue(status).getDesc();
        }
        return "==";
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("orderSn", getOrderSn())
            .append("userId", getUserId())
            .append("orderStatus", getOrderStatus())
            .append("shippingStatus", getShippingStatus())
            .append("payStatus", getPayStatus())
            .append("consignee", getConsignee())
            .append("country", getCountry())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .append("twon", getTwon())
            .append("cityInfo", getCityInfo())
            .append("address", getAddress())
            .append("zipcode", getZipcode())
            .append("mobile", getMobile())
            .append("email", getEmail())
            .append("receiveType", getReceiveType())
            .append("shippingCode", getShippingCode())
            .append("shippingName", getShippingName())
            .append("payCode", getPayCode())
            .append("payMethod", getPayMethod())
            .append("rechargeId", getRechargeId())
            .append("payName", getPayName())
            .append("invoiceTitle", getInvoiceTitle())
            .append("taxpayer", getTaxpayer())
            .append("goodsPrice", getGoodsPrice())
            .append("shippingPrice", getShippingPrice())
            .append("userMoney", getUserMoney())
            .append("couponPrice", getCouponPrice())
            .append("integral", getIntegral())
            .append("integralMoney", getIntegralMoney())
            .append("orderAmount", getOrderAmount())
            .append("totalAmount", getTotalAmount())
            .append("addTime", getAddTime())
            .append("shippingTime", getShippingTime())
            .append("confirmTime", getConfirmTime())
            .append("payTime", getPayTime())
            .append("transactionId", getTransactionId())
            .append("promId", getPromId())
            .append("promType", getPromType())
            .append("orderPromId", getOrderPromId())
            .append("orderPromAmount", getOrderPromAmount())
            .append("discount", getDiscount())
            .append("userNote", getUserNote())
            .append("adminNote", getAdminNote())
            .append("parentSn", getParentSn())
            .append("isDistribut", getIsDistribut())
            .append("paidMoney", getPaidMoney())
            .append("deletedTime", getDeletedTime())
            .append("deleted", getDeleted())
            .append("editMoney", getEditMoney())
            .toString();
    }
}
