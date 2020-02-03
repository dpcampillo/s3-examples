package com.developer.aws.s3example.json;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CreditRequest {
    private Long id;
    private String identificatorFua;
    private String country;
    private Integer terms;
    private Double monthlyCapacity;
    private Double homePrice;
    private Double needed;
    private String productCode;
    private Double selectAmount;
    private Double feeAmount;
    private Integer selectTerms;
}
