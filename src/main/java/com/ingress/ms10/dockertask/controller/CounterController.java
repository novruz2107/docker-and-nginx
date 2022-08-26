package com.ingress.ms10.dockertask.controller;

import com.ingress.ms10.dockertask.Service.CounterService;
import com.ingress.ms10.dockertask.domain.Counter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class CounterController {

    private final CounterService counterService;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String printHello(){
        Counter counter = counterService.saveAndGetCounter();
        return "Hello, the counter is " + counter.getCounter();
    }
}
