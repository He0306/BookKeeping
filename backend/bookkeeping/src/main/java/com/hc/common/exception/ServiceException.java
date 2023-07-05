package com.hc.common.exception;

import com.hc.common.lang.HttpCodeEnum;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: 何超
 * @date: 2023-07-03 14:54
 * @description: 异常类配置
 */
@Data
public class ServiceException extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(ServiceException.class);

    private Integer code;

    private String message;

    public ServiceException(HttpCodeEnum httpCodeEnum) {
        this.code = httpCodeEnum.getCode();
        this.message = httpCodeEnum.getMessage();
    }
}
