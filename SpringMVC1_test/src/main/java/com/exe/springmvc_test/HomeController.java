package com.exe.springmvc_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "home"; // home.jsp
	}
	
	@RequestMapping(value="/hello.action")
	public String hetHello() {
		return "hello"; // hello.jsp
	}
}
