package cn.com.ringo.web.controller.system;

import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.ringo.web.entity.system.SysUser;
import cn.com.ringo.web.service.system.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author dream.li
 *
 */
@Api(tags = "SysUserApi", description="用户信息查询", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/system/sysuser")
public class SysUserController {

	@Autowired
	SysUserService sysUserService;

	/**
	 * 获取所有用户信息
	 * @return
	 */
	@ApiOperation(value="findAll", notes="获取所有用户列表")
	@GetMapping("/") 
    public List<SysUser> findAll() { 
        return sysUserService.findAll(); 
    } 
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 */
	@ApiOperation(value="findById", notes="根据ID查找用户")
	@GetMapping("/{id}")
	public SysUser findById(@ApiParam(name="id",value="用户id",required=true) @NotBlank(message="ID不能为空") @PathVariable Long id) {
		return sysUserService.findById(id);
	}
	
	/**
	 * 保存
	 * @param sysUser
	 * @return
	 */
	@ApiOperation(value="save", notes="保存用户信息")
	@PostMapping("/")
	public SysUser save(@ModelAttribute SysUser sysUser) {
		return sysUserService.save(sysUser);
	}
	
	/**
	 * 
	 * @param sysUser
	 * @return
	 */
	@ApiOperation(value="save", notes="修改用户信息")
	@PutMapping("/{id}")
    public SysUser putUser(@ModelAttribute SysUser sysUser) { 
		return sysUserService.save(sysUser); 
    } 
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@ApiOperation(value="save", notes="删除信息")
	@DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) { 
		sysUserService.deleteById(id);
        return "success"; 
    } 
	
}
