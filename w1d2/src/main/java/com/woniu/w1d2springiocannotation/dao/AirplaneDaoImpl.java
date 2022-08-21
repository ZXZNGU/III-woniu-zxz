package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Airplane;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class AirplaneDaoImpl implements IAirplaneDao{
    @Override
    public void addAirplane(Airplane airplane) {
        System.out.println(LocalDateTime.now() + "：生产了一架飞机 " + airplane);
    }
}
