package cn.it.service.impl;

import cn.it.dao.AccountDao;
import cn.it.domain.Account;
import cn.it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void update(Account account) {
        accountDao.update(account);
    }
}
