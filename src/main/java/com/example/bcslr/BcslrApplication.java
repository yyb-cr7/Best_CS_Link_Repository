package com.example.bcslr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.example.bcslr.mapper")
@SpringBootApplication
public class BcslrApplication {

    public static void main(String[] args) {
        SpringApplication.run(BcslrApplication.class, args);
    }

}
