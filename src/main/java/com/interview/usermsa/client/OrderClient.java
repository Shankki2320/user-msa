package com.interview.usermsa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "order-msa", url = "http://localhost:8082/orders")
public interface OrderClient {


    @GetMapping("/order-details/{id}")
    public String getMessageFromOrderService(@PathVariable int id);


}
