package com.hc.common.exception;

import com.hc.common.lang.HttpCodeEnum;
import com.hc.common.lang.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: 何超
 * @date: 2023-07-03 15:01
 * @description: 全局异常拦截
 */
@RestControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public Result error(Exception e) {
        logger.error("异常=====>", e);
        e.printStackTrace();
        return Result.failure(HttpCodeEnum.SYSTEM_ERROR);
    }

    @ExceptionHandler(ServiceException.class)
    public Result error(ServiceException e) {
        logger.error("自定义异常=====>", e);
        e.printStackTrace();
        return Result.failure(e.getCode(), e.getMessage());
    }
}
