package com.kexi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kexi.entity.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
public interface IMenuService extends IService<Menu> {
    List<String> getPermsByMenuId(List<Long>  menuId);
    List<String>  getPermsByUserId(long userId);
}
