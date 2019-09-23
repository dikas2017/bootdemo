package com.imooc.bootdemo.controller;

import com.imooc.bootdemo.entity.Phone;
import com.imooc.bootdemo.mapper.PhoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    @Autowired
    private PhoneMapper mapper;

    @GetMapping("/getAll")
    public List<Phone> getAll() {
        return mapper.getAllPhone();
    }

    @GetMapping("/findOne")
    public Phone getOne(Integer id) {
        return mapper.findById(id);
    }

    @PostMapping("/addOne")
    public Integer addOne(@RequestBody Phone phone) {
        return mapper.addOne(phone);
    }
}
