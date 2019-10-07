package com.ruoyi.common.redis;

public interface KeyPrefix {

    public int expireSeconds() ;

    public String getPrefix() ;

}
