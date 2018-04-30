/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.dto;

import lombok.Data;
import org.asuraframework.base.core.exception.BusinessException;
import org.asuraframework.base.core.exception.SystemException;
import org.asuraframework.commons.json.Json;

/**
 * <p>
 * 基础响应对象
 * </p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/4/28 下午10:25
 * @since 1.0
 */
@Data
public class ResponseDto<T> {

    public static final int SUCCESS = 100000;
    /**
     * 响应码
     */
    private int code = SUCCESS;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 响应时间戳
     */
    private long timestamp;

    /**
     * 确认返回的是否成功，如果返回不成功，根据code 确认是否抛出异常
     * 注意：下游系统返回的所以系统异常需要统一处理成系统异常包装到SystemException
     */
    public void assertReturnSuccess() {
        int code = this.getCode();
        switch (code) {
            case ResponseDto.SUCCESS:
                return;
            case BusinessException.DEFAULT_BUSINESS_EXCEPTION_CODE:
                throw new BusinessException(this.getCode(), this.getMessage());
            case SystemException.DEFAULT_SYSTEM_EXCEPTION_CODE:
                throw new SystemException(this.getMessage());
            default:
                throw new BusinessException(this.getCode(), this.getMessage());
        }
    }

    /**
     * Json序列化
     *
     * @return
     */
    public String toJson() {
        return Json.toJsonString(this);
    }
}
