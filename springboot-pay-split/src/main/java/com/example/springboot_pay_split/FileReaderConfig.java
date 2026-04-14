package com.example.springboot_pay_split;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class FileReaderConfig {

    @Bean
    public FlatFileItemReader <Transations> reader(){
        return new FlatFileItemReaderBuilder<Transations>()

                .name("fileReader")
                .resource(new ClassPathResource("input_pagamentos.csv"))
                .delimited(";");
    }
}
