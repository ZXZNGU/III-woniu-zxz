package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Sneaker;
import com.woniu.w1d2springiocannotation.service.ISneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SneakerController {

    @Autowired
    private ISneakerService sneakerService;

    public void addSneaker(Sneaker sneaker) {
        sneakerService.addSneaker(sneaker);
    }
}
