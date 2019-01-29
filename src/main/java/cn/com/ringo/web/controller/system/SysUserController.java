package cn.com.ringo.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.com.ringo.web.entity.system.SysUser;
import cn.com.ringo.web.service.system.SysUserService;

/**
 * 
 * @author dream.li
 *
 */
@RestController("/system/sysuser")
public class SysUserController {

	@Autowired
	SysUserService sysUserService;

	/*
	 * @RequestMapping(value = "/inster", method = RequestMethod.GET) public void
	 * test33() { System.out.println("123456");
	 * 
	 * }
	 */
	
	@GetMapping("/findById")
	public SysUser findById(Long id) {
		return sysUserService.findById(id);
	}
	
	@PostMapping("/inster")
	public ModelAndView insterSysUser(SysUser sysUser) {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}
