package com.example.demo.service;


import com.example.demo.model.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
//@Scope("session")

public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl (ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> get() {
        return shoppingCart.getIds();
    }

    @Override
    public void add(List<Integer> ids) {
        shoppingCart.setIds(ids);

    }
}

