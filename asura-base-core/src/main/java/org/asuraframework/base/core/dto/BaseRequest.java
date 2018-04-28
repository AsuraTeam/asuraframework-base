/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.dto;

import lombok.Data;

/**
 * <p>
 * 基础请求对象
 * </p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/4/28 下午10:25
 * @since 1.0
 */
@Data
public abstract class BaseRequest {
    /**
     * 全链路日志跟踪id
     */
    private String traceId;
    /**
     * 调用过程id
     */
    private String spanId;
    /**
     * 子调用过程id
     */
    private String cspanId;
    /**
     * 流量识别标志
     */
    private int hintCode;
    /**
     * 流量识别Content json
     */
    private String hintContent;

}
