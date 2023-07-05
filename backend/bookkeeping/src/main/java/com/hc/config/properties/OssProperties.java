package com.hc.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: 何超
 * @date: 2023-07-03 17:32
 * @description: OSS 阿里云
 */
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss.file")
public class OssProperties {

    private String endpoint;

    private String keyid;

    private String keysecret;

    private String bucketname;
}
