package com.woniu.w1d2springiocannotation.service.impl;


import com.woniu.w1d2springiocannotation.dao.IAirplaneDao;
import com.woniu.w1d2springiocannotation.entity.Airplane;
import com.woniu.w1d2springiocannotation.service.IAirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class AirplaneServiceImpl implements IAirplaneService {
    @Autowired
    private IAirplaneDao airplaneDao;
    @Override
    public void addAirplane(Airplane airplane){
        airplaneDao.addAirplane(airplane);
    }

}
