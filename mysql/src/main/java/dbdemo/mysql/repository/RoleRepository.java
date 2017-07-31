package dbdemo.mysql.repository;

import dbdemo.mysql.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: chase
 * @Description:
 * @Date: Created in 上午11:34 17-7-31.
 * @Modified:
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
