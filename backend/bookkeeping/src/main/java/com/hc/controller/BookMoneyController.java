package com.hc.controller;

import com.hc.service.IBookMoneyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 账本记账金额表 前端控制器
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@RestController
@RequestMapping("/bookMoney")
public class BookMoneyController {

    private static final Logger logger = LoggerFactory.getLogger(BookMoneyController.class);

    @Autowired
    IBookMoneyService bookMoneyService;


}

