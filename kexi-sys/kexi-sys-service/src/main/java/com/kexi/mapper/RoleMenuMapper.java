package com.kexi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kexi.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {
    List<RoleMenu> getMenuByRoleId(long roleId);
}
