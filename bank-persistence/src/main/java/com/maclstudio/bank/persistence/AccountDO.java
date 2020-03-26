package com.maclstudio.bank.persistence;



import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
@Entity
@Table(name="account")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDO {
    @Id
    @GeneratedValue
    private Long id;
    private String accountNumber;
    private Long userId;
    private BigDecimal available;
    private BigDecimal dailyLimit;
    private String currency;


}
