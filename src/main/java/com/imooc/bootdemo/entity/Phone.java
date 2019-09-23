package com.imooc.bootdemo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Phone {

    private Integer id;
    private String brand;
    private String model;
    private String os;
    private String osVersion;
}
