package com.hc.controller;

import com.hc.service.ICategoryBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 分类默认库 前端控制器
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@RestController
@RequestMapping("/categoryBase")
public class CategoryBaseController {

    private static final Logger logger = LoggerFactory.getLogger(CategoryBaseController.class);

    @Autowired
    ICategoryBaseService categoryBaseService;


}

