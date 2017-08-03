package dbdemo.mongo.test;

import dbdemo.mongo.models.User;
import dbdemo.mongo.repositories.UserRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: chase
 * @Description:
 * @Date: Created in 下午4:27 17-8-1.
 * @Modified:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestDataSourceConfig.class})
@FixMethodOrder
public class RepositoryTests {
    private static Logger logger = LoggerFactory.getLogger(RepositoryTests.class);

    @Autowired
    UserRepository userRepository;

    @Before
    public void setup(){
        Set<String> roles = new HashSet<>();
        roles.add("manage");
        User user = new User("1","user","12345678","name","email@com.cn",new Date(), roles);
        userRepository.save(user);
    }

    @Test
    public void findAll(){
        List<User> users = userRepository.findAll();
        Assert.notNull(users);
        for(User user : users){
            logger.info("===user=== userid:{}, username:{}, pass:{}, registrationDate:{}",
                    user.getUserId(), user.getName(), user.getPassword(), user.getRegistrationDate());
        }
    }



}
