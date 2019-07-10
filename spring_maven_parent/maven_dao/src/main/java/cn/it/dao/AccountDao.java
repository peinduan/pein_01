package cn.it.dao;

import cn.it.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Update("update account set money=#{money} where name=#{name}")
    void update(Account account);
}
