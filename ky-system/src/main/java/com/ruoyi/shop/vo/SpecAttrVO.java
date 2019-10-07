package com.ruoyi.shop.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SpecVO
 * @Author hupeng <610796224@qq.com>
 * @Date 2019/8/27
 **/
@Data
@NoArgsConstructor
public class SpecAttrVO {
    private String goodsId;

    private Map<String,String> item;
}
