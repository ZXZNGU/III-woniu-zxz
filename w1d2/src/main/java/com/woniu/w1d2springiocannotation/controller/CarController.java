package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Car;
import com.woniu.w1d2springiocannotation.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarController {

    @Autowired
    private ICarService carService;

    public void addCar(Car car) {
        carService.addCar(car);
    }
}
