package com.hc.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: 何超
 * @date: 2023-07-03 17:41
 * @description: wx配置文件
 */
@Data
@Component
@ConfigurationProperties(prefix = "wx")
public class WxProperties {

    private String appid;

    private String secret;
}
