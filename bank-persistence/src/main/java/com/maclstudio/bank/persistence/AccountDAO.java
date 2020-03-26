package com.maclstudio.bank.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
@Component
public interface AccountDAO extends JpaRepository<AccountDO, Long> {
    Optional<AccountDO> findById(Long value);

    AccountDO findByAccountNumber(String value);

    AccountDO findByUserId(Long id);

    AccountDO saveAndFlush(AccountDO accountDO);

}
