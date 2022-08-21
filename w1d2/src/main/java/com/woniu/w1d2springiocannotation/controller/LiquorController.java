package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Liquor;
import com.woniu.w1d2springiocannotation.service.ILiquorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LiquorController {

    @Autowired
    private ILiquorService liquorService;

    public void addLiquor(Liquor liquor) {
        liquorService.addLiquor(liquor);
    }
}
