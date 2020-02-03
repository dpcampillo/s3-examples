package com.developer.aws.s3example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S3exampleApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(S3exampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(S3exampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	logger.info("--------------------------------------------------------------");
    }
}
