package dbdemo.mysql.repository;

import dbdemo.mysql.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: chase
 * @Description:
 * @Date: Created in 上午11:34 17-7-31.
 * @Modified:
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
