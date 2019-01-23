package cn.com.ringo.web.security.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 密码解析类
 * @author dream.li
 *
 */
@Service
public class PasswordEncoderImpl implements PasswordEncoder {
	
	private static Logger logger = LoggerFactory.getLogger(PasswordEncoder.class);
	
	@Override
	public String encode(CharSequence rawPassword) {
		System.out.println("####: " + rawPassword);
		
		return "1234";
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		System.out.println("rawPassword:"+rawPassword + ",encodedPassword:" + encodedPassword);
		
		return true;
	}

}
