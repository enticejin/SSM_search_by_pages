package com.shxt.back.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/back/main")
	public String main(){
		return "jsp/back/main/main";
	}
}
