package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.ICarDao;
import com.woniu.w1d2springiocannotation.entity.Car;
import com.woniu.w1d2springiocannotation.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements ICarService  {

    @Autowired
    private ICarDao carDao;

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }
}
