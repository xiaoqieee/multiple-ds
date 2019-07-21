package com.hawcore.framework.multiplyds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class MultiplyDsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiplyDsApplication.class, args);
    }


}
