package com.chishakaychisha.spendwise.transaction;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.math.BigDecimal;
@Entity public class Transaction { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; @NotBlank public String name; @NotBlank public String category; @NotNull @Positive public BigDecimal amount; public Transaction(){} public Transaction(String n,String c,BigDecimal a){name=n;category=c;amount=a;} }
