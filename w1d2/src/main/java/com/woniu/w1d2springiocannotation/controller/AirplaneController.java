package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Airplane;
import com.woniu.w1d2springiocannotation.service.IAirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AirplaneController {

    @Autowired
    private IAirplaneService airplaneService;

    public void addAirplane(Airplane airplane) {
        airplaneService.addAirplane(airplane);
    }
}
