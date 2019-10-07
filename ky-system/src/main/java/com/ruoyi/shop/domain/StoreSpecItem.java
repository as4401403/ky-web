package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 规格项对象 store_spec_item
 * 
 * @author hupeng
 * @date 2019-08-25
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreSpecItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规格项id */
    private Long id;

    /** 规格id */
    @Excel(name = "规格id")
    private Long specId;

    /** 规格项 */
    @Excel(name = "规格项")
    private String item;

    private Boolean selected;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("specId", getSpecId())
            .append("item", getItem())
            .toString();
    }
}
