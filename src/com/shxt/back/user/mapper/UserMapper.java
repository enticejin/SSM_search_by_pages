/**
 * UserMapper.java
 * ©2006-2016 四海兴唐科技有限公司 
 * All rights reserved.
 * <link>胖先生作品</link>
 * 创建于: 2019-06-04 14:09:20
 **/
package com.shxt.back.user.mapper;

import java.util.List;
import java.util.Map;

import com.shxt.back.user.model.User;

public interface UserMapper {
    int delete(Integer user_id);
    int add(User user);
    User load(Integer user_id);
    int update(User user);
    List<User> userList(Map<String, Object> map);
    int count(Map<String, Object> map);
}