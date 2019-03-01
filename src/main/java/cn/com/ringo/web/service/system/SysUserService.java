package cn.com.ringo.web.service.system;

import java.util.List;

import cn.com.ringo.web.entity.system.SysUser;

public interface SysUserService {
	
	List<SysUser> findAll();
	
	SysUser findById(Long id);
	
	SysUser findByUsername(String username);
	
	SysUser save(SysUser sysUser);
	
	void deleteById(Long id);
	
	void delete(SysUser sysUser);
	
}
