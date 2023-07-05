package com.hc.controller;

import com.hc.service.IBookUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 账本用户表 前端控制器
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@RestController
@RequestMapping("/bookUser")
public class BookUserController {

    private static final Logger logger = LoggerFactory.getLogger(BookUserController.class);

    @Autowired
    IBookUserService bookUserService;


}

