package com.hc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hc.entity.Book;
import com.hc.mapper.BookMapper;
import com.hc.service.IBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 账本表 服务实现类
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
}
