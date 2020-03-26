package com.maclstudio.bank.web;

import com.maclstudio.bank.application.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
@RestController
@RequestMapping(value = "/account")
public class TransferController {
    @Autowired
    private TransferService transferService;
    @PostMapping
    public boolean transfer(String targetAccountNumber, BigDecimal amount, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        userId = 1L;
        return transferService.transfer(userId, targetAccountNumber, amount, "CNY");
    }
}
