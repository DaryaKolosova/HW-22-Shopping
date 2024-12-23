package com.example.demo.service;

import java.util.List;

public interface ShoppingCartService {
    List<Integer> get();
    void add (List<Integer> ids);

}

