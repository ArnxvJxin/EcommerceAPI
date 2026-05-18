package com.example.ecommerce.controller;

import com.example.ecommerce.model.Orders;
import com.example.ecommerce.repository.OrdersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersRepository repository;

    public OrdersController(OrdersRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Orders> getOrders() {
        return repository.findAll();
    }

    @PostMapping
    public Orders placeOrder(@RequestBody Orders orders) {
        return repository.save(orders);
    }
}