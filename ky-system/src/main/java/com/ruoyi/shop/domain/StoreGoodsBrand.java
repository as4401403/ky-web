package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 产品品牌对象 store_goods_brand
 * 
 * @author hupeng
 * @date 2019-08-23
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreGoodsBrand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 品牌logo */
    private String brandLogo;

    /** 品牌封面 */
    private String brandCover;

    /** 商品品牌名称 */
    @Excel(name = "商品品牌名称")
    private String brandTitle;

    /** 商品品牌描述 */
    private String brandDesc;

    /** 品牌图文信息 */
    private String brandDetail;

    /** 商品分类排序 */
    private Long sort;

    /** 商品状态 */
    @Excel(name = "商品状态")
    private Integer status;

    /** 删除状态(1删除,0未删除) */
    private Integer isDeleted;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createAt;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("brandLogo", getBrandLogo())
            .append("brandCover", getBrandCover())
            .append("brandTitle", getBrandTitle())
            .append("brandDesc", getBrandDesc())
            .append("brandDetail", getBrandDetail())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("isDeleted", getIsDeleted())
            .append("createAt", getCreateAt())
            .toString();
    }
}
