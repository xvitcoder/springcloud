package com.xvitcoder.cloudfunction.serviceone.web.controller;

import com.xvitcoder.cloudfunction.serviceone.core.service.OrderService;
import com.xvitcoder.cloudfunction.serviceone.core.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @DeleteMapping("/{orderId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createOrder(@PathVariable Long orderId) {
        orderService.deleteOrder(orderId);
    }
}
