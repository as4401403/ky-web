package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品类型(商品模型)对象 store_goods_type
 * 
 * @author hupeng
 * @date 2019-08-24
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreGoodsType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id自增 */
    private Integer id;

    /** 类型名称 */
    @Excel(name = "类型名称")
    private String name;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .toString();
    }
}
