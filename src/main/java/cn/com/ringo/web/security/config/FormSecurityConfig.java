package cn.com.ringo.web.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import cn.com.ringo.web.security.impl.UserDetailsServiceImpl;

/**
 * @author dream.li
 * @EnableWebSecurity:禁用Boot的默认Security配置配合@Configuration启用自定义配置（需要扩展WebSecurityConfigurerAdapter）
 * @EnableGlobalMethodSecurity(prePostEnabled = true): 启用Security注解，启用方法级别的权限认证，例如最常用的@PreAuthorize
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)  
public class FormSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	/**
	 * 
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/**
		 * 设置加密类型new BCryptPasswordEncoder()
		 * bcrypt - BCryptPasswordEncoder (Also used for encoding)
		 * ldap - LdapShaPasswordEncoder
		 * MD4 - Md4PasswordEncoder
		 * MD5 - new MessageDigestPasswordEncoder("MD5")
		 * noop - NoOpPasswordEncoder
		 * pbkdf2 - Pbkdf2PasswordEncoder
		 * scrypt - SCryptPasswordEncoder
		 * SHA-1 - new MessageDigestPasswordEncoder("SHA-1")
		 * SHA-256 - new MessageDigestPasswordEncoder("SHA-256")
		 * sha256 - StandardPasswordEncoder
		 * 
		 */
		auth.userDetailsService(userDetailsService)
			.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	/**
	 * 资源
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/static/**","/common/**");
	}
	
	/**
	 * 
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/","/login","/register","/static/**","/common/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/authentication/login")
				.defaultSuccessUrl("/main", true)
				.failureUrl("/login?error").permitAll()
				.and()
			.logout().permitAll()
				.and()
			.csrf().disable();
	}

}
