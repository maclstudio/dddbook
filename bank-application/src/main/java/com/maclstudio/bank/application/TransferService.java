package com.maclstudio.bank.application;



import com.maclstudio.bank.ddd.ApplicationService;

import java.math.BigDecimal;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
public interface TransferService extends ApplicationService {
    boolean transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) ;
}
