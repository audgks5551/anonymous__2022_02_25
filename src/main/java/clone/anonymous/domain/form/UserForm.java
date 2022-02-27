package clone.anonymous.domain.form;

import lombok.Data;

@Data
public class UserForm {

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
}
