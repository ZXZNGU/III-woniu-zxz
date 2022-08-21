package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Shirt;
import com.woniu.w1d2springiocannotation.service.IShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShirtController {

    @Autowired
    private IShirtService shirtService;

    public void addShirt(Shirt shirt) {
        shirtService.addShirt(shirt);
    }
}
