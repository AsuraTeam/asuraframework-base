/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.validator;

import org.asuraframework.base.core.exception.BusinessException;

/**
 * <p>
 *     继承自BusinessException
 * </p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/5/1 上午8:52
 * @since 1.0
 */
public class ValidatorException extends BusinessException {

    public static final int DEFAULT_VALIDATOR_EXCEPTION_CODE = 100002;

    public ValidatorException(String message) {
        super(DEFAULT_VALIDATOR_EXCEPTION_CODE, message);
    }

    public ValidatorException(int code, String message) {
        super(code, message);
    }

    public ValidatorException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
