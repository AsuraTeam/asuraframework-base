/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.asuraframework.base.core.dto.ResponseDto;
import org.asuraframework.commons.json.Json;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/**
 * <p>
 * ResponseDto解析类
 * 注意，这里绑定了Jackson实现
 * </p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/5/1 上午12:25
 * @since 1.0
 */
public class ResponseDtoParser {

    /**
     * 从json获取对象,获取不到泛型对象
     *
     * @param json
     * @return
     */
    public static ResponseDto fromJson(String json) {
        return Json.parseObject(json, ResponseDto.class);
    }

    /**
     * 从json获取ResponseDto,class为ResponseDto所携带的泛型对象
     *
     * @param json
     * @return
     */
    public static <T> ResponseDto<T> fromJson(String json, Class<T> clazz) throws IOException {
        JavaType javaType = TypeFactory.defaultInstance().constructParametricType(ResponseDto.class, clazz);
        return Json.getPathObject(json, javaType);
    }

    /**
     * 从json获取ResponseDto,ResponseDto所携带的泛型对象为集合类型
     *
     * @param json
     * @return
     */
    public static <E> ResponseDto<Collection<E>> fromJson(String json, Class<? extends Collection> collectionClass, Class<E> clazz) throws IOException {
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        JavaType collectionType = typeFactory.constructCollectionType(collectionClass, clazz);
        JavaType javaType = typeFactory.constructParametricType(ResponseDto.class, collectionType);
        return Json.getPathObject(json, javaType);
    }

    /**
     * 从json获取ResponseDto,ResponseDto所携带的泛型对象为map类型
     *
     * @param json
     * @return
     */
    public static <K, V> ResponseDto<Map<K, V>> fromJson(String json, Class<? extends Map> mapClass, Class<K> clsk, Class<V> clsv) throws IOException {
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        JavaType mapType = typeFactory.constructMapType(mapClass, clsk, clsv);
        JavaType javaType = typeFactory.constructParametricType(ResponseDto.class, mapType);
        return Json.getPathObject(json, javaType);
    }
}
