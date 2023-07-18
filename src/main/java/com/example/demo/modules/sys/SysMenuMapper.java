package com.example.demo.modules.sys;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.sys.entity.SysMenu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author muzi
 * @since 2022-08-20
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 查询用户的所有菜单ID
     */
    List<Long> queryAllMenuId(@Param("pc") boolean pc, @Param("parentId") Long parentId);

    List<SysMenu> queryListParentId(@Param("pc") boolean pc, @Param("parentId") Long parentId);

}
