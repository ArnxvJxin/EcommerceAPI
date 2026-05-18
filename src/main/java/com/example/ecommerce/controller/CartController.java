package com.example.ecommerce.controller;

import com.example.ecommerce.model.Cart;
import com.example.ecommerce.repository.CartRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartRepository repository;

    public CartController(CartRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cart> getCartItems() {
        return repository.findAll();
    }

    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {
        return repository.save(cart);
    }
}