package com.maclstudio.bank.persistence;


import com.maclstudio.bank.domain.entity.Account;
import com.maclstudio.bank.types.*;
import org.springframework.stereotype.Component;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
@Component
public class AccountBuilder {
    public Account toAccount(AccountDO accountDO) {
        Currency currency = new Currency(accountDO.getCurrency());
        return new Account(new AccountId(accountDO.getId()), new AccountNumber(accountDO.getAccountNumber()),
                new UserId(accountDO.getId()), new Money(accountDO.getAvailable(), currency),
                new Money(accountDO.getDailyLimit(), currency));
    }

    public AccountDO fromAccount(Account account) {
        return new AccountDO(account.getId().getValue(), account.getAccountNumber().getValue(),
                account.getUserId().getId(), account.getAvailable().getValue(), account.getDailyLimit().getValue(), account.getCurrency().getValue());
    }
}
