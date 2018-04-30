/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.exception;

/**
 * <p></p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/4/28 下午11:01
 * @since 1.0
 */
public class SystemException extends BaseException {

    /**
     * 业务异常默认code
     */
    public static final int DEFAULT_SYSTEM_EXCEPTION_CODE = 100011;

    public SystemException(String message) {
        super(DEFAULT_SYSTEM_EXCEPTION_CODE, message);
    }

    public SystemException(int code, String message) {
        super(code, message);
    }

    public SystemException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
