package com.ruoyi.web.controller.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 报表
 * @author: jinhaibin
 * @create: 2019/09/22 20:52
 **/
@Controller
@RequestMapping("/demo/report")
public class DemoReportController
{
    private String prefix = "demo/report";

    /**
     * 百度ECharts
     */
    @GetMapping("/echarts")
    public String echarts()
    {
        return prefix + "/echarts";
    }

    /**
     * 图表插件
     */
    @GetMapping("/peity")
    public String peity()
    {
        return prefix + "/peity";
    }

    /**
     * 线状图插件
     */
    @GetMapping("/sparkline")
    public String sparkline()
    {
        return prefix + "/sparkline";
    }

    /**
     * 图表组合
     */
    @GetMapping("/metrics")
    public String metrics()
    {
        return prefix + "/metrics";
    }
}
