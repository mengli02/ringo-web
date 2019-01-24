package cn.com.ringo.web.security.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import cn.com.ringo.web.entity.system.SysUser;
import cn.com.ringo.web.service.system.SysUserService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
	@Autowired
	SysUserService sysUserService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("username:" + username);
		//return sysUserService.findByUsername(username);
		
		SysUser user = new SysUser();
		user.setUsername("adc");
		user.setPassword(new BCryptPasswordEncoder().encode("123456"));
		return user;
	}

}
