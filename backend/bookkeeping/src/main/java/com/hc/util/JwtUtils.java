package com.hc.util;

import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

/**
 * @author: 何超
 * @date: 2023-07-03 09:50
 * @description: token类
 */
public class JwtUtils {

    /**
     * 生成token
     *
     * @param userId 用户ID
     * @param openid 用户openid
     * @return
     */
    public static String createToken(Long userId, String openid) {
        return JWT.create().withAudience(String.valueOf(userId))  // 将userId保存到token里面，作为载荷
                .withExpiresAt(DateUtil.offsetDay(new Date(), 7))  // 7天后token过期
                .sign(Algorithm.HMAC256(openid));   // 以openid作为token的密钥
    }
}
