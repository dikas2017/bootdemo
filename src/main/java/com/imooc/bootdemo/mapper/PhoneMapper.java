package com.imooc.bootdemo.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.imooc.bootdemo.entity.Phone;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneMapper extends BaseMapper<Phone> {

}
