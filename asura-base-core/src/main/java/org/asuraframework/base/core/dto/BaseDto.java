/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.dto;

import lombok.Data;

/**
 * <p>
 *     基础Dto绑定数据绑定对象
 * </p>
 *
 *
 * @author liusq23
 * @since 1.0
 * @version 1.0
 * @Date 2018/4/2 下午6:15
 */
@Data
public class BaseDto {

    private int code;

    private String msg;

    private Object data;

}
