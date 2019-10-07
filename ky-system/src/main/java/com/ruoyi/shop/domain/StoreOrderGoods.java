package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单商品与订单主关联对象 store_order_goods
 * 
 * @author hupeng
 * @date 2019-08-29
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreOrderGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id自增 */
    private Integer recId;

    /** 订单id */
    @Excel(name = "订单id")
    private Integer orderId;

    /** 商品id */
    @Excel(name = "商品id")
    private Integer goodsId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 商品货号 */
    @Excel(name = "商品货号")
    private String goodsSn;

    /** 购买数量 */
    @Excel(name = "购买数量")
    private Integer goodsNum;

    /** 市场价 */
    @Excel(name = "市场价")
    private Double marketPrice;

    /** 本店价(供货价) */
    @Excel(name = "本店价(供货价)")
    private Double goodsPrice;

    /** 商品成本价 */
    @Excel(name = "商品成本价")
    private Double costPrice;

    /** 会员折扣价 */
    @Excel(name = "会员折扣价")
    private Double memberGoodsPrice;

    /** 购买商品赠送积分 */
    @Excel(name = "购买商品赠送积分")
    private Integer giveIntegral;

    /** 商品规格key */
    @Excel(name = "商品规格key")
    private String specKey;

    /** 规格对应的中文名字 */
    @Excel(name = "规格对应的中文名字")
    private String specKeyName;

    /** 条码 */
    @Excel(name = "条码")
    private String barCode;

    /** 是否评价 */
    @Excel(name = "是否评价")
    private Integer isComment;

    /** 0 普通订单,1 限时抢购, 2 团购 , 3 促销优惠,4预售 */
    @Excel(name = "0 普通订单,1 限时抢购, 2 团购 , 3 促销优惠,4预售")
    private Integer promType;

    /** 活动id */
    @Excel(name = "活动id")
    private Long promId;

    /** 0未发货，1已发货，2已换货，3已退货 */
    @Excel(name = "0未发货，1已发货，2已换货，3已退货")
    private Integer isSend;

    /** 发货单ID */
    @Excel(name = "发货单ID")
    private Long deliveryId;

    /** sku */
    @Excel(name = "sku")
    private String sku;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recId", getRecId())
            .append("orderId", getOrderId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("goodsSn", getGoodsSn())
            .append("goodsNum", getGoodsNum())
            .append("marketPrice", getMarketPrice())
            .append("goodsPrice", getGoodsPrice())
            .append("costPrice", getCostPrice())
            .append("memberGoodsPrice", getMemberGoodsPrice())
            .append("giveIntegral", getGiveIntegral())
            .append("specKey", getSpecKey())
            .append("specKeyName", getSpecKeyName())
            .append("barCode", getBarCode())
            .append("isComment", getIsComment())
            .append("promType", getPromType())
            .append("promId", getPromId())
            .append("isSend", getIsSend())
            .append("deliveryId", getDeliveryId())
            .append("sku", getSku())
            .toString();
    }
}
