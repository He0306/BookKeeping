package com.hc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hc.entity.BookMoney;
import com.hc.mapper.BookMoneyMapper;
import com.hc.service.IBookMoneyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 账本记账金额表 服务实现类
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Service
public class BookMoneyServiceImpl extends ServiceImpl<BookMoneyMapper, BookMoney> implements IBookMoneyService {

    private static final Logger logger = LoggerFactory.getLogger(BookMoneyServiceImpl.class);
}
