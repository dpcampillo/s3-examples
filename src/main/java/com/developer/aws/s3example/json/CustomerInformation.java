package com.developer.aws.s3example.json;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInformation {

    private Long id;
    private CreditRequest creditRequest;
    private String idType;
    private String idNumber;
    private LocalDate expeditionDate;
    private String expeditionCity;
    private String fullname;
    private String phone;
    private String cellphone;
    private String email;
    private LocalDate birthdate;
    private String birthCity;
    private String birthCountry;
    private Integer dependents;
    private String jobType;
    private LocalDate jobDate;
    private String contract;
    private BigDecimal monthlyIncome;
    private BigDecimal expenses;

}
