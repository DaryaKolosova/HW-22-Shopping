package com.example.demo.controller;

import com.example.demo.service.ShoppingCartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService
    ) {
        this.shoppingCartService = shoppingCartService;
    }


//Учесть, что ID могут повторяться. Выбрать соответствующую коллекцию в корзине
    // я это понимаю как "человек хочет купить несколько штук одного товара", что вполне допустимо
    // для логики магазина. Поэтому - лист, а не сет

    @RequestMapping("/add")
    void addIds(@RequestParam(value = "id") List<Integer> ids) {
        shoppingCartService.add(ids);
        System.out.println("id:" + ids);
    }

    @RequestMapping("/get")
    List<Integer> getIds() {
        return shoppingCartService.get();
    }

}
