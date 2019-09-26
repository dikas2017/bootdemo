package com.imooc.bootdemo.controller;

import com.imooc.bootdemo.entity.Phone;
import com.imooc.bootdemo.service.IPhoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/phone")
@Api(value = "手机信息接口")
public class PhoneController {

    @Resource
    private IPhoneService phoneService;

    @GetMapping("/getAll")
    @ApiOperation("查询所有手机信息")
    public List<Phone> getAll() {
        return phoneService.list();
    }
}
