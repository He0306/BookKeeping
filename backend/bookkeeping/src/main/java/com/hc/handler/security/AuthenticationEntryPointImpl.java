package com.hc.handler.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 何超
 * @date: 2023-07-10 20:53
 * @description: 认证失败处理器
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {

    private static final Logger logger = LoggerFactory.getLogger(AuthenticationEntryPointImpl.class);

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        logger.info("进入认证失败处理器" + e);
    }
}
