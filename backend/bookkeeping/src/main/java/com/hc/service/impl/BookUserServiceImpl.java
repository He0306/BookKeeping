package com.hc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hc.entity.BookUser;
import com.hc.mapper.BookUserMapper;
import com.hc.service.IBookUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 账本用户表 服务实现类
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Service
public class BookUserServiceImpl extends ServiceImpl<BookUserMapper, BookUser> implements IBookUserService {

    private static final Logger logger = LoggerFactory.getLogger(BookUserServiceImpl.class);
}
