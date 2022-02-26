package clone.anonymous.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "USER")
@NoArgsConstructor(access = PROTECTED)
@ToString(of = {"id", "username"})
public class User extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;

    // 전화번호
    private String phoneNumber;

    // 사용자 이름
    private String username;

    // 성명
    private String name;

    // 비밀번호
    private String password;

    public User(String username, String name, String password) {
        this.username = username;
        this.name = name;
        this.password = password;
    }
}
