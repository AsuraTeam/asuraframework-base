/**
 * Copyright(c) 2018 asura
 */
package com.asuraframework.base.core;

import org.asuraframework.base.core.ResponseDtoParser;
import org.asuraframework.base.core.dto.ResponseDto;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * <p></p>
 *
 * @author liusq23
 * @version 1.0
 * @Date 2018/4/29 上午12:27
 * @since 1.0
 */
public class ResponseDtoTest {

    @Test
    public void assertReturnSuccessTest01() throws IOException {
        Address address = new Address();
        address.setId("id");
        address.setName("address");
        User user = new User();
        user.setUid("uid");
        user.setAddress(address);
        ResponseDto<User> responseDto = new ResponseDto();
        responseDto.setData(user);
        String json = responseDto.toJson();
        assertThat(json, containsString("address"));
        User user1 = ResponseDtoParser.fromJson(json, User.class).getData();
        assertEquals("uid", user1.getUid());
    }


    @Test
    public void assertReturnSuccessTest02() throws IOException {
        Address address = new Address();
        address.setId("id");
        address.setName("address");
        User user = new User();
        user.setUid("uid");
        user.setAddress(address);
        List<User> list = new ArrayList<>();
        list.add(user);
        ResponseDto<List<User>> responseDto = new ResponseDto();
        responseDto.setData(list);
        String json = responseDto.toJson();
        assertThat(json, containsString("address"));
        Collection<User> user1 = ResponseDtoParser.fromJson(json, Set.class, User.class).getData();
        assertEquals(1, user1.size());
        assertEquals("uid",user1.iterator().next().getUid());
    }


    @Test
    public void assertReturnSuccessTest03() throws IOException {
        Address address = new Address();
        address.setId("id");
        address.setName("address");
        User user = new User();
        user.setUid("uid");
        user.setAddress(address);
        Map<String, User> map = new HashMap<>();
        map.put("1", user);
        ResponseDto<Map<String, User>> responseDto = new ResponseDto();
        responseDto.setData(map);
        String json = responseDto.toJson();
        assertThat(json, containsString("address"));
        Map<String,User> userMap = ResponseDtoParser.fromJson(json, Map.class,String.class, User.class).getData();
        assertEquals(1, userMap.size());
        assertEquals(userMap.get("1").getUid(),"uid");
    }

}
