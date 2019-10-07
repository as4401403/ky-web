package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品的属性(独立)对象 store_goods_attribute
 * 
 * @author hupeng
 * @date 2019-08-24
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreGoodsAttribute extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 属性id */
    private Long attrId;

    /** 属性名称 */
    @Excel(name = "属性名称")
    private String attrName;

    /** 属性分类id(商品模型id) */
    @Excel(name = "属性分类id(商品模型id)")
    private Integer typeId;

    private String typeName;

    /** 0不需要检索 1关键字检索 2范围检索 */
    private Integer attrIndex;

    /** 0唯一属性 1单选属性 2复选属性 */
    private Integer attrType;

    /** 0 手工录入 1从列表中选择 2多行文本框 */
    private Integer attrInputType;

    /** 可选值列表 */
    private String attrValues;

    /** 属性排序 */
    private Integer sort;
}
