package cn.com.ringo.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/sign_in")
	public String sign_in() {
		return "login";
	}
	
	@RequestMapping("/sign_up")
	public String sign_up() {
		return "registry";
	}
	
	@RequestMapping("/personal_center")
	public void login() {
		System.out.println("personal_center");
		
	}
	
}
