package com.imooc.bootdemo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Phone {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 操作系统版本
     */
    private String osVersion;
}
