package com.maclstudio.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

import static java.time.ZoneId.of;
import static java.util.TimeZone.getTimeZone;

@SpringBootApplication(scanBasePackages = {"com.maclstudio"})
@EntityScan("com.maclstudio.bank.persistence")
@EnableJpaRepositories(basePackages = {"com.maclstudio.bank.persistence"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @PostConstruct
    void started() {
        TimeZone.setDefault(getTimeZone(of("Asia/Shanghai")));
    }
}
