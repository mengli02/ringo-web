package cn.com.ringo.web.controller.system;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author dream.li
 *
 */
@RestController
public class IndexController {

	/**
	 * 进入主页
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/**
	 * 登陆页
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView sign_in() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
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
