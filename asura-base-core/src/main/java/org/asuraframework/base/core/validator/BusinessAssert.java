/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.validator;

import org.asuraframework.commons.util.Check;

import java.util.Collection;
import java.util.function.Function;

/**
 * <p></p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/5/1 上午8:42
 * @since 1.0
 */
public class BusinessAssert {
    private BusinessAssert() {

    }

    /**
     * 判断对象是否为null,如果为null，返回默认code ValidatorException
     * 注意：如果是字符串，不会判断是否是空字符串
     *
     * @param t
     * @param message
     * @param <T>
     * @return
     */
    public static <T> T requireNonNull(T t, String message) {
        return requireNonNull(t, ValidatorException.DEFAULT_VALIDATOR_EXCEPTION_CODE, message);
    }

    /**
     * 判断对象是否为null，如果为null，返回指定code ValidatorException
     * 注意：如果是字符串，不会判断是否是空字符串
     *
     * @param t
     * @param message
     * @param <T>
     * @return
     */
    public static <T> T requireNonNull(T t, int code, String message) {
        return requireNonNull(t, new ValidatorException(code, message));
    }

    /**
     * 判断对象是否为null，如果为null，返回指定code ValidatorException
     * 注意：如果是字符串，不会判断是否是空字符串
     *
     * @param t
     * @param vexception
     * @param <T>
     * @return
     */
    public static <T> T requireNonNull(T t, ValidatorException vexception) {
        return requireNonNull(t, e -> {
            throw vexception;
        });
    }

    /**
     * @param t
     * @param function
     * @param <T>
     * @return
     */
    public static <T> T requireNonNull(T t, Function<T, T> function) {
        if (Check.isNull(t)) {
            return function.apply(t);
        }
        return t;
    }

    /**
     * 判断字符串是否为空字符串
     *
     * @param t
     * @param message
     * @return
     */
    public static String requireNonEmpty(String t, String message) {
        return requireNonEmpty(t, ValidatorException.DEFAULT_VALIDATOR_EXCEPTION_CODE, message);
    }

    /**
     * 判断字符串是否为空字符串
     *
     * @param t
     * @param message
     * @return
     */
    public static String requireNonEmpty(String t, int code, String message) {
        return requireNonEmpty(t, new ValidatorException(code, message));
    }

    /**
     * @param t
     * @param vException
     * @return
     */
    public static String requireNonEmpty(String t, ValidatorException vException) {
        return requireNonEmpty(t, e -> {
            throw vException;
        });
    }

    /**
     * 判断字符串是否为空字符串
     *
     * @param t
     * @param function
     * @return
     */
    public static String requireNonEmpty(String t, Function<String, String> function) {
        if (Check.isNullOrEmpty(t.trim())) {
            return function.apply(t);
        }
        return t;
    }

    /**
     * 判断字符串是否为空字符串
     *
     * @param t
     * @param message
     * @return
     */
    public static Collection requireNonEmpty(Collection t, String message) {
        return requireNonEmpty(t, ValidatorException.DEFAULT_VALIDATOR_EXCEPTION_CODE, message);
    }

    /**
     * 判断集合是否为空集合
     *
     * @param t
     * @param message
     * @return
     */
    public static Collection requireNonEmpty(Collection t, int code, String message) {
        return requireNonEmpty(t, new ValidatorException(code, message));
    }

    /**
     * @param t
     * @param vException
     * @return
     */
    public static Collection requireNonEmpty(Collection t, ValidatorException vException) {
        return requireNonEmpty(t, e -> {
            throw vException;
        });
    }

    /**
     * 判断是否空集合，支持其他自定义函数，主要为了支持抛出其他自定义异常
     *
     * @param t
     * @param function
     * @return
     */
    public static Collection requireNonEmpty(Collection t, Function<Collection, Collection> function) {
        if (Check.isNullOrEmpty(t)) {
            return function.apply(t);
        }
        return t;
    }

    /**
     * 判断对象是否为null，如果为null，返回指定code ValidatorException
     * 注意：这里会判断是否是空字符串以及空集合
     *
     * @param t
     * @param message
     * @param <T>
     * @return
     */
    public static <T> T requireNonEmpty(T t, String message) {
        return requireNonEmpty(t, ValidatorException.DEFAULT_VALIDATOR_EXCEPTION_CODE, message);
    }

    /**
     * 判断对象是否为null，如果为null，返回指定code ValidatorException
     * 注意：这里会判断是否是空字符串以及空集合
     *
     * @param t
     * @param message
     * @param <T>
     * @return
     */
    public static <T> T requireNonEmpty(T t, int code, String message) {
        return requireNonEmpty(t, new ValidatorException(code, message));
    }

    /**
     * 判断对象是否为null，如果为null，返回指定ValidatorException
     * 注意：这里会判断是否是空字符串以及空集合
     *
     * @param t
     * @param vException
     * @param <T>
     * @return
     */
    public static <T> T requireNonEmpty(T t, ValidatorException vException) {
        if (t instanceof Collection) {
            Collection collection = (Collection) t;
            return (T) requireNonEmpty(collection, vException);
        }
        if (t instanceof String) {
            String str = (String) t;
            return (T) requireNonEmpty(str, vException);
        }
        return requireNonNull(t, vException);
    }

}
