package com.hc.common.lang;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author: 何超
 * @date: 2023-07-03 11:52
 * @description: 返回结果类
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {

    private Integer code;
    private boolean success;
    private String message;
    private T data;

    private Result(Integer code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Result(Integer code, boolean success, String message) {
        this.code = code;
        this.success = success;
        this.message = message;
    }

    public Result(HttpCodeEnum httpCodeEnum) {
        this.code = httpCodeEnum.getCode();
        this.message = httpCodeEnum.getMessage();
        this.success = httpCodeEnum.isSuccess();
    }

    /**
     * 操作成功不返回数据
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> success() {
        return new Result(HttpCodeEnum.SUCCESS.getCode(), HttpCodeEnum.SUCCESS.isSuccess(), HttpCodeEnum.SUCCESS.getMessage());
    }

    /**
     * 操作成功返回数据
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(HttpCodeEnum.SUCCESS.getCode(), HttpCodeEnum.SUCCESS.isSuccess(), HttpCodeEnum.SUCCESS.getMessage(), data);
    }

    /**
     * 操作失败不返回数据
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure() {
        return new Result(HttpCodeEnum.FAILURE.getCode(), HttpCodeEnum.FAILURE.isSuccess(), HttpCodeEnum.FAILURE.getMessage());
    }

    /**
     * 操作失败返回数据
     *
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(Integer code, String message) {
        return new Result(code, false, message);
    }

    /**
     * 操作失败返回数据
     *
     * @param httpCodeEnum
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(HttpCodeEnum httpCodeEnum) {
        return new Result(httpCodeEnum);
    }
}
