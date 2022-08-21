package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.ILiquorDao;
import com.woniu.w1d2springiocannotation.entity.Liquor;
import com.woniu.w1d2springiocannotation.service.ILiquorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiquorServiceImpl implements ILiquorService {
    @Autowired
    private ILiquorDao liquorDao;
    @Override
    public void addLiquor(Liquor liquor){
        liquorDao.addLiquor(liquor);
    }
}
