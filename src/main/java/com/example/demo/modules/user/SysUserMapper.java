package com.example.demo.modules.user;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.user.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser queryByUserId(String userName);
}