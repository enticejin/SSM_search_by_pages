package com.shxt.back.user.service;

import java.util.Map;

import com.shxt.back.user.model.User;

public interface UserService {
	int update(User user);
	Map<String, Object> userList(Map<String, Object> map);
	Map<String, Object> userAdd(Map<String, Object> map,User user);
}
