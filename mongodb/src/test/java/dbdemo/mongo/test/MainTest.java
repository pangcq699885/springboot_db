package dbdemo.mongo.test;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.util.Set;

/**
 * @Author: chase
 * @Description:
 * @Date: Created in 下午2:23 17-8-2.
 * @Modified:
 */
public class MainTest {

    public static void main(String[] args) {
        try {
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // 连接到数据库
            DB mongoDatabase = mongoClient.getDB("springboot");
            Set<String> collections = mongoDatabase.getCollectionNames();
            for (String c : collections) {
                System.out.println("collection:" + c);
            }
            System.out.println("Connect to database successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
