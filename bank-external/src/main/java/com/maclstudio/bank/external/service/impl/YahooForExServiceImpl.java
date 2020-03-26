package com.maclstudio.bank.external.service.impl;

import com.maclstudio.bank.external.service.YahooForExService;
import com.maclstudio.bank.types.Currency;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author : maclstudio
 * @date : 2020/3/26
 */
@Component
public class YahooForExServiceImpl implements YahooForExService {

    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) {
        return BigDecimal.ONE;
    }
}
