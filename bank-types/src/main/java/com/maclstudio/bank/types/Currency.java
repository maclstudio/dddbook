package com.maclstudio.bank.types;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
@Getter
@EqualsAndHashCode
@ToString
public class Currency {
    private final String value;

    public Currency(String value) {
        this.value = value;
    }
}
