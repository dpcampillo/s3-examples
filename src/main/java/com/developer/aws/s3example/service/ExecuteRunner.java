package com.developer.aws.s3example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExecuteRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ExecuteRunner.class);

    private final AwsS3UploadService awsS3UploadService;

    public ExecuteRunner(AwsS3UploadService awsS3UploadService){
        this.awsS3UploadService = awsS3UploadService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("El bucket existe ===> {}", awsS3UploadService.checkBucket());
    }
}
