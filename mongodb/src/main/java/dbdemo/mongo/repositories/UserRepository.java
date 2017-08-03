package dbdemo.mongo.repositories;

import dbdemo.mongo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: chase
 * @Description:
 * @Date: Created in 下午3:40 17-8-1.
 * @Modified:
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
