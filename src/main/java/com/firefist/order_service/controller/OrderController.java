package com.firefist.order_service.controller;

import com.firefist.order_service.kafka.OrderProducer;
import com.firefist.order_service.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrderController {

    @Autowired
    private OrderProducer orderProducer;

    @PostMapping
    public String placeOrder(@RequestBody Order order){
        orderProducer.sendOrder(order);
        return "Order producer " + order;
    }

}
