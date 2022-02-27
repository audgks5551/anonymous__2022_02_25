package clone.anonymous.service.user.impl;

import clone.anonymous.domain.Account;
import clone.anonymous.repository.AccountRepository;
import clone.anonymous.service.user.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    @Override
    public void createUser(Account user) {
        accountRepository.save(user);
    }
}
