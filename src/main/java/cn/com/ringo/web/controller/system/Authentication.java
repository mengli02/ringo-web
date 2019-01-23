package cn.com.ringo.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/authentication")
public class Authentication {
	
	@RequestMapping("/login")
	public void login() {
		System.out.println("登陆认证");
		
	}
	
	
}
