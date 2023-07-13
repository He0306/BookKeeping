package com.hc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hc.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 账本表 Mapper
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {


}
