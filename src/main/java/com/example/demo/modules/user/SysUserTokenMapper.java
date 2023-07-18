package com.example.demo.modules.user;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.user.entity.SysUserToken;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 */
@Mapper
public interface SysUserTokenMapper extends BaseMapper<SysUserToken> {

    SysUserToken queryByUserId(Long userId);

    SysUserToken queryByToken(String token);

}