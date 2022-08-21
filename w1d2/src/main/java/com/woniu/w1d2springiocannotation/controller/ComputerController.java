package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Computer;
import com.woniu.w1d2springiocannotation.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ComputerController {

    @Autowired
    private IComputerService computerService;

    public void addComputer(Computer computer) {
        computerService.addComputer(computer);
    }
}
