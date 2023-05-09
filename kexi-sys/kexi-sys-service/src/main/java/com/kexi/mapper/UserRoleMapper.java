package com.kexi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kexi.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
    UserRole getRoleIdByUserId(long userId);
}
