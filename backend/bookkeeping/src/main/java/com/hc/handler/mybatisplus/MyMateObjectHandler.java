package com.hc.handler.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: 何超
 * @date: 2023-07-10 20:47
 * @description: 自动填充字段
 */
@Component
public class MyMateObjectHandler implements MetaObjectHandler {

    /**
     * 插入填充
     *
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("create_time", new Date(), metaObject);
    }

    /**
     * 更新填充
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("update_time", new Date(), metaObject);
    }
}
