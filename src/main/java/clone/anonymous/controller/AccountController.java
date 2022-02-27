package clone.anonymous.controller;

import clone.anonymous.domain.Account;
import clone.anonymous.domain.form.AccountForm;
import clone.anonymous.service.user.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    private final PasswordEncoder passwordEncoder;
    private final AccountService accountService;

    @GetMapping("/list")
    public String ListUser() {
        return "user/user_list";
    }

    @GetMapping("/signup")
    public String createUser() {
        return "user/login/signup";
    }

    @PostMapping("/signup")
    public String createUser(AccountForm userForm) {

        ModelMapper modelMapper = new ModelMapper();
        Account user = modelMapper.map(userForm, Account.class); // form -> entity
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        accountService.createUser(user);

        return "redirect:/";
    }
}
