package cn.com.ringo.web.repostory.system;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.com.ringo.web.entity.system.SysUser;

@Repository
public interface SysUserRepository extends JpaRepository<SysUser,Long> {

	@Query("from SysUser u where u.username=:username")
	SysUser findByUsername(@Param("username") String username);
	
	/*
	 * @Query("from SysUser u where u.username=:username") //SPEL表达式 SysUser
	 * findSysUser(@Param("username") String username);// 参数username
	 * 映射到数据库字段username
	 * 
	 * @Modifying
	 * 
	 * @Query(value = "INSERT INTO SysUser " +
	 * "VALUES (func_nextid('user_role'),?1, ?2)", nativeQuery=true) SysUser
	 * insertUser(@Param("username") String username);// 参数username 映射到数据库字段username
	 * 
	 * //自定义repository。手写sql
	 * 
	 * @Query(value = "update SysUser set name=? where id=?",nativeQuery = true)
	 * //占位符传值形式
	 * 
	 * @Modifying int updateById(String name,Long id);
	 */
}
