package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Car;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class CarDaoImpl implements ICarDao {

    @Override
    public void addCar(Car car) {
        System.out.println(LocalDateTime.now() + "：生产了一辆汽车 " + car);
    }
}
