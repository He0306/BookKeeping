package com.hc.service.impl;

import cn.hutool.core.date.DateTime;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.hc.common.exception.ServiceException;
import com.hc.common.lang.HttpCodeEnum;
import com.hc.config.BaiduCheckConfig;
import com.hc.config.properties.OssProperties;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author: 何超
 * @date: 2023-07-05 09:48
 * @description: 图片上传实现
 */
@Service
public class UploadServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(UploadServiceImpl.class);

    @Autowired
    OssProperties ossProperties;

    @Autowired
    BaiduCheckConfig baiducheck;

    /**
     * 图片上传
     *
     * @param img 图片
     * @return
     */
    public String upload(MultipartFile img) {
        try {
            JSONObject jsonObject = baiducheck.checkImg(img);
            if (jsonObject.get("conclusion").equals("不合规")) {
                throw new ServiceException(HttpCodeEnum.IMG_NON_COMPLIANCE);
            }
            OSS client = new OSSClientBuilder().build(ossProperties.getEndpoint(), ossProperties.getKeyid(), ossProperties.getKeysecret());

            InputStream inputStream = img.getInputStream();
            // 定义文件名   uuid + .jpg
            String fileName = img.getOriginalFilename();
            String uuid = UUID.randomUUID().toString().replace("-", "");
            fileName = uuid + fileName;

            // 路径
            String datePath = new DateTime().toString("yyyy/MM/dd");
            fileName = datePath + "/" + fileName;

            client.putObject(ossProperties.getBucketname(), fileName, inputStream);
            client.shutdown();
            String url = "https://" + ossProperties.getBucketname() + "." + ossProperties.getEndpoint() + "/" + fileName;
            logger.info("图片上传路径====>" + url);
            return url;
        } catch (IOException e) {
            e.printStackTrace();
            throw new ServiceException(HttpCodeEnum.FILE_TYPE_ERROR);
        }
    }
}
