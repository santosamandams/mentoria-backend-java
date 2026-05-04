package com.example.springboot_pay_split;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Transaction {

    @NotBlank
    private String externalId;

    @NotNull
    private String merchantName;

    @NotBlank
    private String payerDocument;

    @NotNull
    @Positive
    private BigDecimal amountGross;

    @NotBlank
    private BigDecimal amountTax;

    private Long legalInvoiceId;

    @NotNull
    private String receiverDocument;

    @NotNull
    private String receiverBank;

    @NotNull
    private String receiverAgency;

    @NotNull
    private String receiverAccount;
}
