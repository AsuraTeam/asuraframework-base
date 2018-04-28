/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.dto;

import lombok.Data;

/**
 * <p>
 *     基础响应对象
 * </p>
 *
 *
 * @author liusq23
 * @since 1.0
 * @version 1.0
 * @Date 2018/4/28 下午10:25
 */
@Data
public abstract class BaseResponse {
    /**
     * 响应时间
     */
    private long timestamp;

}
