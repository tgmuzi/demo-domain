package com.example.demo.modules.mapper.user;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.entity.user.entity.Customer;
import com.example.demo.utils.Encrypt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

    int addCustomer(@Param("id") Long id, @Param("phone") Encrypt phone, @Param("address") String address);

    List<Customer> findCustomer(Encrypt phone);

}