package com.kexi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kexi.entity.Menu;
import com.kexi.entity.RoleMenu;
import com.kexi.entity.UserRole;
import com.kexi.mapper.MenuMapper;
import com.kexi.mapper.RoleMenuMapper;
import com.kexi.mapper.UserRoleMapper;
import com.kexi.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    private  MenuMapper menuMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public  List<String> getPermsByMenuId(List<Long>  menuId){
        List<Menu> menus = menuMapper.selectBatchIds(menuId);
        List<String> perms = menus.stream()
                .map(Menu::getPerms)
                .distinct()
                .collect(Collectors.toList());
        return  perms;
    }

    @Override
    public  List<String>  getPermsByUserId(long userId){
        UserRole userRole = userRoleMapper.getRoleIdByUserId(userId);
        List<RoleMenu> roleMenus = roleMenuMapper.getMenuByRoleId(userRole.getRoleId());
        List<Long> menuIds = roleMenus.stream().map(RoleMenu::getMenuId).collect(Collectors.toList());
        List<String> perms = this.getPermsByMenuId(menuIds);
        return perms;
    }
}
