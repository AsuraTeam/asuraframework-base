/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.log;

/**
 * <p>
 * 日志记录基础类,默认什么也不做
 * </p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/4/2 下午6:22
 * @since 1.0
 */
public interface ILogger {

    default void trace(String remark, String... info) {
    }

    default void debug(String remark, String... info) {
    }

    default void info(String remark, String... info) {
    }

    default void warn(String remark, String... info) {
    }

    default void error(String remark, String... info) {
    }
}
