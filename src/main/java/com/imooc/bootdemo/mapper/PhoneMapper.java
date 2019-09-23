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

    @Select("select * from phone")
    List<Phone> getAllPhone();

    @Select("select * from phone where id=#{id}")
    Phone findById(Integer id);

    @Insert("insert into phone(brand, model, os, osVersion) "
            + "values(#{brand}, #{model}, #{os}, #{osVersion})")
    Integer addOne(Phone phone);

    @Delete("delete from phone where id=#{id}")
    Integer delById(Integer id);

    @Update("update phone set brand=#{brand}, model=#{model}, "
            + "os=#{os}, osVersion=#{osVersion} where id=#{id}")
    int updateById(Phone phone);
}
