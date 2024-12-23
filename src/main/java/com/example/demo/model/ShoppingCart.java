package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class ShoppingCart {
    private final List<Integer> ids=new ArrayList<>();

    public void setIds(List<Integer> ids) {
        this.ids.addAll(ids);
    }
    public List<Integer> getIds() {
        return ids;
    }


}
