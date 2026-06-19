package com.hz.hzaigeneratewebsite.common;

import com.hz.hzaigeneratewebsite.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用响应类
 *
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data; //后端接口都要把数据封装在data中

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
