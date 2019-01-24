package cn.com.ringo.web.service.system;

import cn.com.ringo.web.entity.system.SysUser;

public interface SysUserService {
	
	SysUser findById(Long id);
	
	SysUser findByUsername(String username);
	
	SysUser save(SysUser sysUser);
	
}
