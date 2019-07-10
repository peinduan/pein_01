package cn.it.service;


import cn.it.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();


    void update(Account account);
}
