package clone.anonymous.repository;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
//@Transactional
//@Rollback(false)
//public class UserRepositoryTest {
//
//    @Autowired
//    UserService1 userService;
//    @Autowired UserRepository userRepository;
//
//    @Test
//    public void 유저_저장_테스트() {
//        User user = new User("audgks5551", "이명한", "1234");
//        User savedMember = userRepository.save(user);
//
//
//        User findMember = userRepository.findById(savedMember.getId()).get(); // optional은 get()을 통해 끄집어 낼 수 있다.
//
//        assertThat(findMember.getId()).isEqualTo(user.getId());
//        assertThat(findMember.getUsername()).isEqualTo(user.getUsername());
//        assertThat(findMember).isEqualTo(user);
//    }
//}
