package cn.com.ringo.web.security.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cn.com.ringo.web.entity.system.Role;
import cn.com.ringo.web.entity.system.SysUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("username:" + username);
		
		SysUser user = new SysUser();
		
		user.setUsername("123456");
		user.setPassword("123456");
		
		/*
		 * List<SimpleGrantedAuthority> authorities = new ArrayList<>(); for (Role role
		 * : user.getRoles()) { authorities.add(new
		 * SimpleGrantedAuthority(role.getName())); }
		 */
		
		//return User(user.getUsername(), user.getPassword(), authorities);
		
		return user;
	}

}
