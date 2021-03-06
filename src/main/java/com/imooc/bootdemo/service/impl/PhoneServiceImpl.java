package com.imooc.bootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.bootdemo.entity.Phone;
import com.imooc.bootdemo.mapper.PhoneMapper;
import com.imooc.bootdemo.service.IPhoneService;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl extends ServiceImpl<PhoneMapper, Phone> implements IPhoneService {

}
