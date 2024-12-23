package com.example.demo.excHandlers;

import com.example.demo.exceptions.MyExcNeedTypeInt;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class TypeNeType {
    @ExceptionHandler(NumberFormatException.class)
    public void handlerNumberNeNumber(NumberFormatException e){
        System.out.println("Нужны циферки");
        throw new MyExcNeedTypeInt("Допустимы только циферки");
    }
}

