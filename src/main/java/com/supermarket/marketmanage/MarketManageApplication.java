package com.supermarket.marketmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MarketManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketManageApplication.class, args);
    }

    @RequestMapping("/helloWorld") //路由path
    public String helloWorld() {
        return "hello world!";
    }

}
