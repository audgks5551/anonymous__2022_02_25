package clone.anonymous.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "ACCOUNT")
@NoArgsConstructor(access = PROTECTED)
@ToString(of = {"id", "username"})
public class Account extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT_ID")
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
