package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品规格关联价格对象 store_spec_goods_price
 * 
 * @author hupeng
 * @date 2019-08-26
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreSpecGoodsPrice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规格商品id */
    private Long itemId;

    /** 商品id */
    @Excel(name = "商品id")
    private Long goodsId;

    /** 规格键名 */
    @Excel(name = "规格键名")
    private String key;

    /** 规格键名中文 */
    @Excel(name = "规格键名中文")
    private String keyName;

    /** 价格(供货价格) */
    @Excel(name = "价格(供货价格)")
    private Double price;

    /** 零售价格 */
    @Excel(name = "零售价格")
    private Double marketPrice;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long storeCount;

    /** 商品条形码 */
    @Excel(name = "商品条形码")
    private String barCode;

    /** SKU */
    @Excel(name = "SKU")
    private String sku;

    /** 规格商品主图 */
    @Excel(name = "规格商品主图")
    private String specImg;

    /** 活动id */
    @Excel(name = "活动id")
    private Integer promId;

    /** 参加活动类型 */
    @Excel(name = "参加活动类型")
    private Integer promType;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemId", getItemId())
            .append("goodsId", getGoodsId())
            .append("key", getKey())
            .append("keyName", getKeyName())
            .append("price", getPrice())
            .append("marketPrice", getMarketPrice())
            .append("storeCount", getStoreCount())
            .append("barCode", getBarCode())
            .append("sku", getSku())
            .append("specImg", getSpecImg())
            .append("promId", getPromId())
            .append("promType", getPromType())
            .toString();
    }
}
