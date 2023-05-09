package com.kexi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kexi.entity.UserRole;
import com.kexi.mapper.UserRoleMapper;
import com.kexi.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {


    @Override
    public UserRole getRoleIdByUserId(long userId) {
        UserRole userRole = getOne(new LambdaQueryWrapper<UserRole>()
                .eq(UserRole::getUserId, userId));
        return userRole;
    }
}
