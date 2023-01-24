package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class WebserverController {

    @Autowired
    private WebClient webClient;


    @PostMapping("/listup")
    public Mono<Employee> tts(@RequestBody Employee employee){
        System.out.println(webClient);
        return webClient.post()
                .uri("/test")
                .body(Mono.just(employee),Employee.class)
                .retrieve()
                .bodyToMono(Employee.class);
    }
}

