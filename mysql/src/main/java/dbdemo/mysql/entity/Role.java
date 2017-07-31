package dbdemo.mysql.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: chase
 * @Description:
 * @Date: Created in 上午11:33 17-7-31.
 * @Modified:
 */
@Entity
@Table(name = "role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
