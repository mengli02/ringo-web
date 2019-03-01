package cn.com.ringo.web.controller.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 授权
 * @author dream.li
 *
 */
@Controller
@RequestMapping
public class Authentication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Authentication.class);
	
	/*
	 * @PostMapping("/authentication/login") public void login() {
	 * System.out.println("登陆认证");
	 * 
	 * }
	 */
	
	/**
	 * 登陆页
	 * @return
	 */
	/*@RequestMapping("/login")
	public ModelAndView login() {
		LOGGER.info("{} /login");
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}*/
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login() {
		LOGGER.info("{} /login");
		return "login";
	}
	
	@RequestMapping(value = "/main", method=RequestMethod.GET)
	public String main() {
		LOGGER.info("{} /main");
		return "main";
	}
	
	@RequestMapping("/register")
	public ModelAndView  register() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
	
	/*@RequestMapping("/error")
	public ModelAndView error() {
		ModelAndView mv = new ModelAndView("error");
		return mv;
	}*/
	
	
}
