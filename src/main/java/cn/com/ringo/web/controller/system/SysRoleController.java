package cn.com.ringo.web.controller.system;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.com.ringo.web.entity.system.SysRole;
import cn.com.ringo.web.service.system.SysRoleService;

@RestController
@RequestMapping("/system/sysrole")
public class SysRoleController {
	
	private SysRoleService sysRoleServiceImpl;
	
	@PostMapping("/")
	public SysRole save(@ModelAttribute SysRole sysRole) {
		return sysRoleServiceImpl.save(sysRole);
	}
	
}
