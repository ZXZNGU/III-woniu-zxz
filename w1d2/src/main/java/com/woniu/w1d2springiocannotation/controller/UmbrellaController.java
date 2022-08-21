package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Umbrella;
import com.woniu.w1d2springiocannotation.service.IUmbrellaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UmbrellaController {

    @Autowired
    private IUmbrellaService umbrellaService;

    public void addUmbrella(Umbrella umbrella) {
        umbrellaService.addUmbrella(umbrella);
    }
}
