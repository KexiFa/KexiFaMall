package com.kexi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kexi.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hedeqing
 * @since 2023-04-17
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> queryPermsByUserId(Long userId);
}
