package com.kexi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kexi.entity.User;
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
public interface UserMapper extends BaseMapper<User> {

}
