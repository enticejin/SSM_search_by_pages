package com.shxt.back.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shxt.back.main.PageBean;
import com.shxt.back.user.mapper.UserMapper;
import com.shxt.back.user.model.User;
import com.shxt.back.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public int update(User user) {
		return userMapper.update(user);
	}
	@Override
	public Map<String, Object> userList(Map<String, Object> map) {
		List<User> userList = userMapper.userList(map);
		int count = userMapper.count(map);
		PageBean.serMap(map, count, userList, User.class);
		return map;
	}
	@Override
	public Map<String, Object> userAdd(Map<String, Object> map, User user) {
		int result = userMapper.add(user);
		if(result>0){
			map.put("message", "添加成功");
		}else {
			map.put("message", "添加失败");
		}
		return map;
	}

}
