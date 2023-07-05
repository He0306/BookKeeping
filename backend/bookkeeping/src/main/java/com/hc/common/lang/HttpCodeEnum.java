package com.hc.common.lang;

/**
 * @author: 何超
 * @date: 2023-07-03 11:54
 * @description: 状态码
 */
public enum HttpCodeEnum {

    SUCCESS(200, "请求成功！", true),
    FAILURE(400, "请求失败！", false),
    IMG_NON_COMPLIANCE(401, "图片违规，请重新上传图片！", false),
    FILE_TYPE_ERROR(402, "文件上传失败！", false),
    SYSTEM_ERROR(500, "系统发生错误，请联系管理员！", false);

    private final Integer code;

    private final String message;

    private final boolean success;

    HttpCodeEnum(Integer code, String message, boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
