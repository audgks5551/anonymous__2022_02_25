package clone.anonymous.controller;

import clone.anonymous.domain.User;
import clone.anonymous.domain.form.UserForm;
import clone.anonymous.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    @GetMapping("/list")
    public String ListUser() {
        return "user/user_list";
    }

    @GetMapping("/signup")
    public String createUser() {
        return "user/login/signup";
    }

    @PostMapping("/signup")
    public String createUser(UserForm userForm) {

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userForm, User.class); // form -> entity
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.createUser(user);

        return "redirect:/";
    }
}
