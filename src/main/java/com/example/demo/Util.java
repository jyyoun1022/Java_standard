package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Util {

    @Bean
    public WebClient webClient(){
        return WebClient.create("http://locdalhost:5001");
    }
}
