package com.maclstudio.bank.domain.service;

import com.maclstudio.bank.domain.entity.Account;
import com.maclstudio.bank.types.ExchangeRate;
import com.maclstudio.bank.types.Money;

/**
 * @author : maclstudio
 * @date : 2020/3/26
 */
public interface AccountTransferService {
    void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate);
}
