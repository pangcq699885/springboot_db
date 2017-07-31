package dbdemo.mysql.repository;

import dbdemo.mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @Author: chase
 * @Description:
 * @Date: Created in 上午11:32 17-7-31.
 * @Modified:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    List<User> findByCreatedateLessThan(Date start);
}
