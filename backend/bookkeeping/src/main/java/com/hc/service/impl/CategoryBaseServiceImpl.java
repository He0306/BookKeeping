package com.hc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hc.entity.CategoryBase;
import com.hc.mapper.CategoryBaseMapper;
import com.hc.service.ICategoryBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 分类默认库 服务实现类
 * </p>
 *
 * @author: 何超
 * @date: 2023-07-04
 */
@Service
public class CategoryBaseServiceImpl extends ServiceImpl<CategoryBaseMapper, CategoryBase> implements ICategoryBaseService {

    private static final Logger logger = LoggerFactory.getLogger(CategoryBaseServiceImpl.class);
}
