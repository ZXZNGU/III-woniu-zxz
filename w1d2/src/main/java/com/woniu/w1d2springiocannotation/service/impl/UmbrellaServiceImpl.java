package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.IUmbrellaDao;
import com.woniu.w1d2springiocannotation.entity.Umbrella;
import com.woniu.w1d2springiocannotation.service.IUmbrellaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmbrellaServiceImpl implements IUmbrellaService {
    @Autowired
    private IUmbrellaDao umbrellaDao;
    @Override
    public void addUmbrella(Umbrella umbrella){
        umbrellaDao.addUmbrella(umbrella);
    }
}
