package com.kexi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kexi.entity.RoleMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
public interface IRoleMenuService extends IService<RoleMenu> {
    List<RoleMenu> getMenuByRoleId(long roleId);
}
