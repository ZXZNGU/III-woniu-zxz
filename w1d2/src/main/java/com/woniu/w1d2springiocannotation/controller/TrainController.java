package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Train;
import com.woniu.w1d2springiocannotation.service.ITrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TrainController {

    @Autowired
    private ITrainService trainService;

    public void addTrain(Train train) {
        trainService.addTrain(train);
    }
}
