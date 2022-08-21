package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.IShirtDao;
import com.woniu.w1d2springiocannotation.dao.ISneakerDao;
import com.woniu.w1d2springiocannotation.entity.Sneaker;
import com.woniu.w1d2springiocannotation.service.ISneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SneakerServiceImpl implements ISneakerService {
    @Autowired
    private ISneakerDao sneakerDao;
    @Override
    public void addSneaker(Sneaker sneaker){
        sneakerDao.addSneaker(sneaker);
    }
}
