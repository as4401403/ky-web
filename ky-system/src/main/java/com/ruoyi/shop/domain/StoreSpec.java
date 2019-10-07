package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;

/**
 * 商品规格(独立)对象 store_spec
 * 
 * @author hupeng
 * @date 2019-08-25
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreSpec extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规格表 */
    private Long id;

    /** 规格类型 */
    @Excel(name = "规格类型")
    private Long typeId;

    /** 规格名称 */
    @Excel(name = "规格名称")
    private String name;

    private String specItem;

    /** 排序 */
    private Long sort;

    /** 是否需要检索：1是，0否 */
    private Integer searchIndex;

    private List<StoreSpecItem> storeSpecItems;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typeId", getTypeId())
            .append("name", getName())
            .append("specItem", getSpecItem())
            .append("sort", getSort())
            .append("searchIndex", getSearchIndex())
            .toString();
    }
}
