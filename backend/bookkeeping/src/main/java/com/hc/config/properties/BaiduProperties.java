package com.hc.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: 何超
 * @date: 2023-07-05 09:06
 * @description: 百度内容审核配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "baidu")
public class BaiduProperties {

    private String appid;

    private String apikey;

    private String secret;
}
