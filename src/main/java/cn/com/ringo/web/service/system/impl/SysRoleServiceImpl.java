package cn.com.ringo.web.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.ringo.web.entity.system.SysRole;
import cn.com.ringo.web.repostory.system.SysRoleRepository;
import cn.com.ringo.web.service.system.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService{

	@Autowired
	SysRoleRepository sysRoleRepositoryImpl;
	
	@Override
	public SysRole save(SysRole sysRole) {
		return sysRoleRepositoryImpl.save(sysRole);
	}

}
