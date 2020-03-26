package com.maclstudio.bank.repository;


import com.maclstudio.bank.ddd.Repository;
import com.maclstudio.bank.domain.entity.Account;
import com.maclstudio.bank.types.AccountId;
import com.maclstudio.bank.types.AccountNumber;
import com.maclstudio.bank.types.UserId;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
public interface AccountRepository extends Repository {
    Account find(AccountId id);
    Account find(AccountNumber accountNumber);
    Account find(UserId userId);
    Account save(Account account);
}
