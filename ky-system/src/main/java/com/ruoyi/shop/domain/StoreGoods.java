package com.ruoyi.shop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品主对象 store_goods
 * 
 * @author hupeng
 * @date 2019-08-25
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Integer goodsId;

    /** 分类id */
    @Excel(name = "分类id")
    private Long cateId;

    private String brandName;

    //private

    /** 扩展分类id */
    private Long extendCatId;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String goodsSn;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 点击数 */
    private Integer clickCount;

    /** 品牌id */
    @Excel(name = "品牌id")
    private Integer brandId;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Integer storeCount;

    /** 商品评论数 */
    private Integer commentCount;

    /** 商品重量克为单位 */
    private Long weight;

    /** 商品体积。单位立方米 */
    private Double volume;

    /** 市场价(零售价) */
    @Excel(name = "市场价(零售价)")
    private Double marketPrice;

    /** 本店价(供货价) */
    @Excel(name = "本店价(供货价)")
    private Double shopPrice;

    /** 商品成本价 */
    private Double costPrice;

    /** 价格阶梯 */
    private String priceLadder;

    /** 商品关键词 */
    private String keywords;

    /** 商品简单描述 */
    private String goodsRemark;

    /** 商品详细描述 */
    private String goodsContent;

    /** 手机端商品详情 */
    private String mobileContent;

    /** 商品上传原始图(主图) */
    private String goodsLogo;

    /** 是否为虚拟商品 1是，0否 */
    private Integer isVirtual;

    /** 虚拟商品有效期 */
    private Long virtualIndate;

    /** 虚拟商品购买上限 */
    private Integer virtualLimit;

    /** 是否允许过期退款， 1是，0否 */
    private Integer virtualRefund;

    /** 是否上架 0-未上架 1-销售中 */
    @Excel(name = "是否上架 0-未上架 1-销售中")
    private Integer isOnSale;

    /** 是否包邮0否1是 */
    private Integer isFreeShipping;

    /** 商品上架时间 */
    private Integer onTime;

    /** 商品排序 */
    @Excel(name = "商品排序")
    private Integer sort;

    /** 是否推荐0-未推荐 1-已推荐 */
    @Excel(name = "是否推荐0-未推荐 1-已推荐")
    private Integer isRecommend;

    /** 是否新品0-不是 1-是 */
    @Excel(name = "是否新品0-不是 1-是")
    private Integer isNew;

    /** 是否热卖 */
    private Integer isHot;

    /** 最后更新时间 */
    private Integer lastUpdate;

    /** 商品所属类型id，取值表goods_type的id */
    private Integer goodsType;

    /** 商品规格类型，取值表goods_type的id */
    private Integer specType;

    /** 购买商品赠送积分 */
    private Integer giveIntegral;

    /** 积分兑换：0不参与积分兑换，积分和现金的兑换比例见后台配置 */
    private Integer exchangeIntegral;

    /** 供货商ID */
    private Integer suppliersId;

    /** 商品销量 */
    private Long salesSum;

    /** 0默认1抢购2团购3优惠促销4预售5虚拟(5其实没用)6拼团 */
    private Integer promType;

    /** 优惠活动id */
    private Long promId;

    /** 佣金用于分销分成 */
    private Double commission;

    /** SPU */
    private String spu;

    /** SKU */
    private String sku;

    /** 运费模板ID */
    private Long templateId;

    /** 视频 */
    private String goodsVideo;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsId", getGoodsId())
            .append("cateId", getCateId())
            .append("extendCatId", getExtendCatId())
            .append("goodsSn", getGoodsSn())
            .append("goodsName", getGoodsName())
            .append("clickCount", getClickCount())
            .append("brandId", getBrandId())
            .append("storeCount", getStoreCount())
            .append("commentCount", getCommentCount())
            .append("weight", getWeight())
            .append("volume", getVolume())
            .append("marketPrice", getMarketPrice())
            .append("shopPrice", getShopPrice())
            .append("costPrice", getCostPrice())
            .append("priceLadder", getPriceLadder())
            .append("keywords", getKeywords())
            .append("goodsRemark", getGoodsRemark())
            .append("goodsContent", getGoodsContent())
            .append("mobileContent", getMobileContent())
            .append("goodsLogo", getGoodsLogo())
            .append("isVirtual", getIsVirtual())
            .append("virtualIndate", getVirtualIndate())
            .append("virtualLimit", getVirtualLimit())
            .append("virtualRefund", getVirtualRefund())
            .append("isOnSale", getIsOnSale())
            .append("isFreeShipping", getIsFreeShipping())
            .append("onTime", getOnTime())
            .append("sort", getSort())
            .append("isRecommend", getIsRecommend())
            .append("isNew", getIsNew())
            .append("isHot", getIsHot())
            .append("lastUpdate", getLastUpdate())
            .append("goodsType", getGoodsType())
            .append("specType", getSpecType())
            .append("giveIntegral", getGiveIntegral())
            .append("exchangeIntegral", getExchangeIntegral())
            .append("suppliersId", getSuppliersId())
            .append("salesSum", getSalesSum())
            .append("promType", getPromType())
            .append("promId", getPromId())
            .append("commission", getCommission())
            .append("spu", getSpu())
            .append("sku", getSku())
            .append("templateId", getTemplateId())
            .append("goodsVideo", getGoodsVideo())
            .toString();
    }
}
