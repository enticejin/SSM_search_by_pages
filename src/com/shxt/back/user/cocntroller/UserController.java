package com.shxt.back.user.cocntroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shxt.back.main.PageBean;
import com.shxt.back.user.model.User;
import com.shxt.back.user.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/back/userList")
	public String userList(User user,Map<String,Object> map,@RequestParam(required=false,defaultValue="1") int pages,@RequestParam(required=false,defaultValue="5")int num,HttpServletRequest request){
		PageBean.conMap(pages, map, num, request, user);
		userService.userList(map);
		return "jsp/back/user/userList";
	}
	@RequestMapping("/back/userAdd")
	public String userList(){
		return "jsp/back/user/userAdd";
	}
	@RequestMapping("/back/userAddDo")
	public String userAddDo(User user,Map<String,Object> map){
		map.put("user", user);
		userService.userAdd(map, user);
		return "jsp/back/main/message";
	}
}
