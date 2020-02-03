package com.developer.aws.s3example.controller;

import com.developer.aws.s3example.json.CustomerInformation;
import com.developer.aws.s3example.service.RandomObjectFiller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerInformation getCustomerInformation() throws Exception{
        return new RandomObjectFiller().createAndFill(CustomerInformation.class);
    }

}
