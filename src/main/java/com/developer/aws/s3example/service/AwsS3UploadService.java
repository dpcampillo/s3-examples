package com.developer.aws.s3example.service;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AwsS3UploadService {

    @Value("${aws.param.bucket-name}")
    private String bucketName;

    private final AmazonS3 amazonS3;

    public AwsS3UploadService(AmazonS3 amazonS3){
        this.amazonS3 = amazonS3;
    }

    public boolean checkBucket(){
        return amazonS3.doesBucketExistV2(bucketName);
    }

}
