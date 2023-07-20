package helloalpaca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name = "USER")
public class Member {
    // windows에서 alt+insert = getter/setter 자동완성

    @Id //pk를 알려주는 어노테이션
    private Long id;
    // @Column(name = "username") //db column명과 다를 때 매핑해주기 위해서 사용.
    private String name;

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
