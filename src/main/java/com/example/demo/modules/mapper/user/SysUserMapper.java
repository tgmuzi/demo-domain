package com.example.demo.modules.mapper.user;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.entity.user.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser queryByUserId(String userName);
    /**
     * 修改密码
     */
    int updatePassword(Map<String, Object> map);
}