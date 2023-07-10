package com.hc.handler.filter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.hc.common.constants.Constants;
import com.hc.common.exception.ServiceException;
import com.hc.common.lang.HttpCodeEnum;
import com.hc.config.RedisUtils;
import com.hc.entity.User;
import com.hc.mapper.UserMapper;
import com.hc.util.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 何超
 * @date: 2023-07-10 20:23
 * @description: token过滤器
 */
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    UserMapper userMapper;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("Authentication");
        logger.info("token" + token);
        // 判断请求头是否有token
        if (!StringUtils.hasText(token)) {
            filterChain.doFilter(request, response);
            return;
        }

        String hasToken = redisUtils.getCacheObject(Constants.TOKEN_KEY + token);
        if (!StringUtils.hasText(hasToken)) {
            throw new ServiceException(HttpCodeEnum.TOKEN_NOT_NULL);
        }

        // 校验token
        Long id;
        User user;
        try {
            id = Long.valueOf(JwtUtils.getUserId());
            user = userMapper.selectById(id);
        } catch (Exception e) {
            throw new ServiceException(HttpCodeEnum.TOKEN_NOT_NULL);
        }

        if (null == user) {
            throw new ServiceException(HttpCodeEnum.TOKEN_NOT_NULL);
        }

        try {
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getOpenid())).build();
            jwtVerifier.verify(token);
        } catch (JWTVerificationException e) {
            throw new ServiceException(HttpCodeEnum.TOKEN_NOT_NULL);
        }

        // 将登录信息存入authenticationToken中
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, null, null);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        filterChain.doFilter(request, response);
    }
}
