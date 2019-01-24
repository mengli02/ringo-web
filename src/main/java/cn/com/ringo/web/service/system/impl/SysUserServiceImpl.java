package cn.com.ringo.web.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import cn.com.ringo.web.entity.system.SysUser;
import cn.com.ringo.web.repostory.system.SysUserRepository;
import cn.com.ringo.web.service.system.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	SysUserRepository sysUserRepository;
	
	@Override
	public SysUser save(SysUser sysUser) {
		sysUser.setPassword(new BCryptPasswordEncoder().encode(sysUser.getPassword()));
		return sysUserRepository.save(sysUser);
	}

	@Override
	public SysUser findById(Long id) {
		return sysUserRepository.findById(id).get();
	}

	@Override
	public SysUser findByUsername(String username) {
		return sysUserRepository.findByUsername(username);
	}
	
}
