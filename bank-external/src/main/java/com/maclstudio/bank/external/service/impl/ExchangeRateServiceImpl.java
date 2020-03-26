package com.maclstudio.bank.external.service.impl;

import com.maclstudio.bank.types.Currency;
import com.maclstudio.bank.types.ExchangeRate;
import com.maclstudio.bank.external.ExchangeRateService;
import com.maclstudio.bank.external.service.YahooForExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author : maclstudio
 * @date : 2020/3/26
 */
@Component
public class ExchangeRateServiceImpl implements ExchangeRateService {
    @Autowired
    private YahooForExService yahooForexService;

    @Override
    public ExchangeRate getExchangeRate(Currency source, Currency target) {
        if (source.equals(target)) {
            return new ExchangeRate(BigDecimal.ONE, source, target);
        }
        BigDecimal foreignExchange = yahooForexService.getExchangeRate(source, target);
        return new ExchangeRate(foreignExchange, source, target);
    }
}
