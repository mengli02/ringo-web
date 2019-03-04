package cn.com.ringo.web.repostory.system;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cn.com.ringo.web.entity.system.SysRole;

@Repository
public interface SysRoleRepository extends JpaRepository<SysRole,Long>{

}
