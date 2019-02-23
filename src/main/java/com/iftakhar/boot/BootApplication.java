package com.iftakhar.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {
    private static Logger logger= LoggerFactory.getLogger(BootApplication.class);

    public static void main(String[] args) {
        logger.debug("Appication started");

        SpringApplication.run(BootApplication.class, args);
    }

}
