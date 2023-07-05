package com.hc.controller;

import com.hc.common.lang.Result;
import com.hc.service.impl.UploadServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: 何超
 * @date: 2023-07-05 09:46
 * @description: 图片上传接口
 */
@RestController
@Api(tags = "图片上传接口")
public class UploadController {

    @Autowired
    UploadServiceImpl uploadService;

    @ApiOperation(value = "图片上传")
    @PostMapping("/upload")
    public Result upload(MultipartFile img) {
        String url = uploadService.upload(img);
        return Result.success(url);
    }
}
