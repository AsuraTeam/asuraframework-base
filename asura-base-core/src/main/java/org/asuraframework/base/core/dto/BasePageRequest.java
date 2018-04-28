/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.dto;

import lombok.Data;

/**
 * <p>
 *     基础类目请求基类
 * </p>
 *
 *
 * @author liusq23
 * @since 1.0
 * @version 1.0
 * @Date 2018/4/28 下午10:26
 */
@Data
public abstract class BasePageRequest extends BaseRequest{

    private static final int DEFAULT_PAGE = 1;
    private static final int DEFAULT_PAGE_SIZE = 10;
    /**
     * 默认页码
     */
    private int page = DEFAULT_PAGE;
    /**
     * 默认页数量
     */
    private int pageSize = DEFAULT_PAGE_SIZE;

}
