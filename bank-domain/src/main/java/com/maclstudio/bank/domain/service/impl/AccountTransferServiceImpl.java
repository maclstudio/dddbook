package com.maclstudio.bank.domain.service.impl;

import com.maclstudio.bank.domain.entity.Account;
import com.maclstudio.bank.domain.service.AccountTransferService;
import com.maclstudio.bank.external.ExchangeRateService;
import com.maclstudio.bank.types.ExchangeRate;
import com.maclstudio.bank.types.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : maclstudio
 * @date : 2020/3/26
 */
@Component
public class AccountTransferServiceImpl implements AccountTransferService {
    @Autowired
    private ExchangeRateService exchangeRateService;

    @Override
    public void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate) {
        Money sourceMoney = exchangeRate.exchangeTo(targetMoney);
        sourceAccount.deposit(sourceMoney);
        targetAccount.withdraw(targetMoney);

    }
}
