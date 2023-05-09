package com.kexi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kexi.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}
