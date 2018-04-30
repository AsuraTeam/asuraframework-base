/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.exception;

import lombok.Data;

/**
 * <p>
 * 所有系统异常的基础类
 * </p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/4/28 下午10:23
 * @since 1.0
 */
@Data
public class BaseException extends RuntimeException {
    /**
     * 错误码
     */
    private int code;
    /**
     * 返回错误信息
     */
    private String message;

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
