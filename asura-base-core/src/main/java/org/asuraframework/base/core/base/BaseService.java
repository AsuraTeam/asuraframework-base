/**
 * Copyright(c) 2018 asura
 */
package org.asuraframework.base.core.base;

import org.asuraframework.base.core.base.BaseEntity;

/**
 * <p>
 *     基础Dao接口，定义了增删改查基础接口
 *     注意此处并不实现，只是定义API接口
 * </p>
 *
 *
 * @author liusq23
 * @since 1.0
 * @version 1.0
 * @Date 2018/4/2 下午6:06
 */
public interface BaseService<T extends BaseEntity> {

    /**
     * 保存对应的对象
     * @param t
     * @return
     */
    int save(T t);

    /**
     * 更新对应的对象
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 查找对应的对象
     * @param id
     * @return
     */
    T findById(Object id);

    /**
     * 删除对象
     * @param t
     * @return
     */
    int delete(T t);
}
