package com.maclstudio.bank.external.service;

import com.maclstudio.bank.types.Currency;

import java.math.BigDecimal;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
public interface YahooForExService {
    BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency);
}
