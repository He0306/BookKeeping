package com.hc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: 何超
 * @date: 2023-07-03 11:48
 * @description: UserMapper接口
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
