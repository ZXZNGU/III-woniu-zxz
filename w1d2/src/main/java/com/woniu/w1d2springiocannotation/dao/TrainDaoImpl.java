package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Train;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class TrainDaoImpl implements ITrainDao{
    @Override
    public void addTrain(Train train) {
        System.out.println(LocalDateTime.now() + "：生产了一辆火车 " + train);
    }
}
