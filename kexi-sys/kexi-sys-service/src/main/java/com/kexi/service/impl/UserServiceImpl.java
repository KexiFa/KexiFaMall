package com.kexi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kexi.entity.User;
import com.kexi.mapper.UserMapper;
import com.kexi.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
