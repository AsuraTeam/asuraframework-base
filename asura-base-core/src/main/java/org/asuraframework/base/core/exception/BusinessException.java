/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.exception;

/**
 * <p>
 *     业务异常,所有业务异常的基类，子业务为了区分异常可是实现自己的异常便于统计
 * </p>
 *
 *
 * @author liusq23
 * @since 1.0
 * @version 1.0
 * @Date 2018/4/28 下午10:49
 */
public class BusinessException extends BaseException{
    /**
     * 业务异常默认code
     */
    public static final int DEFAULT_BUSINESS_EXCEPTION_CODE = 100001;

    public BusinessException(String message) {
        super(DEFAULT_BUSINESS_EXCEPTION_CODE,message);
    }

    public BusinessException(int code, String message) {
        super(code, message);
    }

    public BusinessException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
