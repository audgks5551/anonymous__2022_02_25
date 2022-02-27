package clone.anonymous.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter @Setter
@Table(name = "USER")
@NoArgsConstructor(access = PROTECTED)
@ToString(of = {"id", "username"})
public class User extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;

    // 이메일
    private String email;

    // 사용자 이름
    private String username;

    // 성명
    private String name;

    // 비밀번호
    private String password;

    // 권한
    private String role;

    public User(String username, String name, String password) {
        this.username = username;
        this.name = name;
        this.password = password;
    }
}
