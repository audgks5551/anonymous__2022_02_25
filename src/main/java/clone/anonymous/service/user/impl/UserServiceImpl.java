package clone.anonymous.service.user.impl;

import clone.anonymous.domain.User;
import clone.anonymous.repository.UserRepository;
import clone.anonymous.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
