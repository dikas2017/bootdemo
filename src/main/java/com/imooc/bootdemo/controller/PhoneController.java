package com.imooc.bootdemo.controller;

import com.imooc.bootdemo.entity.Phone;
import com.imooc.bootdemo.service.IPhoneService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    @Resource
    private IPhoneService phoneService;

    @GetMapping("/getAll")
    public List<Phone> getAll() {
        return phoneService.findAll();
    }
}
