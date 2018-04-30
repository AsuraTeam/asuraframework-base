/**
 * Copyright(c) 2018 asura
 */
package com.asuraframework.base.core;

import org.asuraframework.base.core.exception.BusinessException;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p></p>
 *
 *
 * @author liusq23
 * @since 1.0
 * @version 1.0
 * @Date 2018/5/1 上午1:07
 */
public class ExceptionTest {

    @Test
    public void testCode01(){
        BusinessException exception = new BusinessException("aaa");
        Assert.assertEquals(exception.getCode(),BusinessException.DEFAULT_BUSINESS_EXCEPTION_CODE);
    }
}
