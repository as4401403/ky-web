package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品关联的属性(与商品相关)对象 store_goods_attr
 * 
 * @author hupeng
 * @date 2019-08-26
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreGoodsAttr extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品属性id自增 */
    private Integer goodsAttrId;

    /** 商品id */
    @Excel(name = "商品id")
    private Integer goodsId;

    /** 属性id */
    @Excel(name = "属性id")
    private Integer attrId;

    /** 属性值 */
    @Excel(name = "属性值")
    private String attrValue;

    /** 属性价格 */
    @Excel(name = "属性价格")
    private String attrPrice;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsAttrId", getGoodsAttrId())
            .append("goodsId", getGoodsId())
            .append("attrId", getAttrId())
            .append("attrValue", getAttrValue())
            .append("attrPrice", getAttrPrice())
            .toString();
    }
}
