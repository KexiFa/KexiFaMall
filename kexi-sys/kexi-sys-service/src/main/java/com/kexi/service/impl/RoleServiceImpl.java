package com.kexi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kexi.entity.Role;
import com.kexi.mapper.RoleMapper;
import com.kexi.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
