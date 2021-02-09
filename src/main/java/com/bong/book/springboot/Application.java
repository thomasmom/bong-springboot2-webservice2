package com.bong.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args){

        var ctx = SpringApplication.run(Application.class, args);

        System.out.println("#Beans :"+ctx.getBeanDefinitionCount());

        var names = ctx.getBeanDefinitionNames();
        Arrays.sort(names);
        Arrays.asList(names).forEach(System.out::println);
    }
}
