package com.kexi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kexi.entity.UserRole;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
public interface IUserRoleService extends IService<UserRole> {
    UserRole getRoleIdByUserId(long userId);
}
