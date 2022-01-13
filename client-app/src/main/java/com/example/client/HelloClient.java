package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hello-client", url = "https://localhost:8443", configuration = HelloClientConfiguration.class)
public interface HelloClient {

    @GetMapping("hello")
    String getHello();
}
