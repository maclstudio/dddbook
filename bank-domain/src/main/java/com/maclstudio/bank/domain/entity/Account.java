package com.maclstudio.bank.domain.entity;

import com.maclstudio.bank.ddd.Entity;
import com.maclstudio.bank.exception.InvalidCurrencyException;
import com.maclstudio.bank.types.*;
import com.maclstudio.bank.exception.DailyLimitExceededException;
import com.maclstudio.bank.exception.InsufficientFundsException;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
@Getter
@AllArgsConstructor
public class Account implements Entity {
    private AccountId id;
    private AccountNumber accountNumber;
    private UserId userId;
    private Money available;
    private Money dailyLimit;

    public Currency getCurrency() {
        return this.available.getCurrency();
    }

    // 转入
    public void deposit(Money money) {
        if (!this.getCurrency().equals(money.getCurrency())) {
            throw new InvalidCurrencyException();
        }
        this.available = this.available.add(money);
    }

    // 转出
    public void withdraw(Money money) {
        if (this.available.compareTo(money) < 0) {
            throw new InsufficientFundsException();
        }
        if (this.dailyLimit.compareTo(money) < 0) {
            throw new DailyLimitExceededException();
        }
        this.available = this.available.subtract(money);
    }
}
