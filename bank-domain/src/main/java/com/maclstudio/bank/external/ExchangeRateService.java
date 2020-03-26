package com.maclstudio.bank.external;

import com.maclstudio.bank.types.Currency;
import com.maclstudio.bank.types.ExchangeRate;

/**
 * @author : maclstudio
 * @date : 2020/3/26
 */
public interface ExchangeRateService {
    ExchangeRate getExchangeRate(Currency source, Currency target);
}
