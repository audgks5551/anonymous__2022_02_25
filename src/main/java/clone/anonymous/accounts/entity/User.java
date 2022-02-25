package clone.anonymous.accounts.entity;

import clone.anonymous.core.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "USER")
@NoArgsConstructor(access = PROTECTED)
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
}
