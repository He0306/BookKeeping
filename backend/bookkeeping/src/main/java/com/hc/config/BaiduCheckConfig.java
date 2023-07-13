package com.hc.config;

import com.baidu.aip.contentcensor.AipContentCensor;
import com.hc.config.properties.BaiduProperties;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author: 何超
 * @date: 2023-07-05 09:08
 * @description: 百度内容审核配置
 */
@Configuration
public class BaiduCheckConfig {

    @Autowired
    BaiduProperties baiduProperties;



    /**
     * 审核图片
     *
     * @param img 图片
     * @return
     * @throws IOException
     */
    public JSONObject checkImg(MultipartFile img) throws IOException {
        byte[] files = FileCopyUtils.copyToByteArray(img.getInputStream());
        AipContentCensor client = new AipContentCensor(baiduProperties.getAppid(), baiduProperties.getApikey(), baiduProperties.getSecret());
        return client.imageCensorUserDefined(files, null);
    }

    /**
     * 审核文字
     *
     * @param text 文字
     * @return
     */
    public JSONObject checkText(String text) {
        AipContentCensor client = new AipContentCensor(baiduProperties.getAppid(), baiduProperties.getApikey(), baiduProperties.getSecret());
        return client.textCensorUserDefined(text);
    }
}
