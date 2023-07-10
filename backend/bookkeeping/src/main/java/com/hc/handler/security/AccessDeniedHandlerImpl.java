package com.hc.handler.security;

import com.hc.common.exception.ServiceException;
import com.hc.common.lang.HttpCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 何超
 * @date: 2023-07-10 20:52
 * @description: 授权失败处理器
 */
@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    private static final Logger logger = LoggerFactory.getLogger(AccessDeniedHandlerImpl.class);

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        logger.info("进入授权失败处理器" + e);
        throw new ServiceException(HttpCodeEnum.NO_OPERATOR_AUTH);
    }
}
