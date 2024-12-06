package org.example.configservertransactionms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer

public class ConfigServerTransactionMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerTransactionMsApplication.class, args);
    }

}
