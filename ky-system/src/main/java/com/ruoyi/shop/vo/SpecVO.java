package com.ruoyi.shop.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName SpecVO
 * @Author hupeng <610796224@qq.com>
 * @Date 2019/8/27
 **/
@Data
@NoArgsConstructor
public class SpecVO {

    private String goodsId;

    private List<String> list;

    @Override
    public String toString() {
        return "SpecVO{" +
                "goodsId='" + goodsId + '\'' +
                ", list=" + list +
                '}';
    }
}
