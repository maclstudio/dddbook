package com.maclstudio.bank.messaging;


import com.maclstudio.bank.domain.types.AuditMessage;

/**
 * @author : maclstudio
 * @date : 2020/3/25
 */
public interface AuditMessageProducer {
    boolean send(AuditMessage message);
}
