package com.flightkeys.cglibbug;

import com.flightkeys.cglibbug.base.Wrapper;
import com.flightkeys.cglibbug.derived.DerivedClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CglibBugApplication {

    @Bean
    public Wrapper wrapper(DerivedClass clz) {
        return new Wrapper(clz);
    }

    @Bean
    public String foo(Wrapper usageBean) {
        return usageBean.serialize("foo");
    }

    public static void main(String[] args) {
        SpringApplication.run(CglibBugApplication.class, args);
    }

}
