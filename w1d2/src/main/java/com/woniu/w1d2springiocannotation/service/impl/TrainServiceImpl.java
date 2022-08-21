package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.ITrainDao;
import com.woniu.w1d2springiocannotation.entity.Train;
import com.woniu.w1d2springiocannotation.service.ITrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl implements ITrainService {
    @Autowired
    private ITrainDao trainDao;
    @Override
    public void addTrain(Train train){
        trainDao.addTrain(train);
    }
}
