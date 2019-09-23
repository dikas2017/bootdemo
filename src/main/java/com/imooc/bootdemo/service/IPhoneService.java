package com.imooc.bootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.bootdemo.entity.Phone;

import java.util.List;

public interface IPhoneService extends IService<Phone> {

    List<Phone> findAll();
}
