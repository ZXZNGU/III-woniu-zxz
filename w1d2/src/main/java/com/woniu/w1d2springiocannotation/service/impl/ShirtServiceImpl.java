package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.IShirtDao;
import com.woniu.w1d2springiocannotation.entity.Shirt;
import com.woniu.w1d2springiocannotation.service.IShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShirtServiceImpl implements IShirtService {
    @Autowired
    private IShirtDao shirtDao;
    @Override
    public void addShirt(Shirt shirt){
        shirtDao.addShirt(shirt);
    }
}
