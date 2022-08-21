package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.IGlassCupDao;
import com.woniu.w1d2springiocannotation.entity.GlassCup;
import com.woniu.w1d2springiocannotation.service.IGlassCupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlassCupServiceImpl implements IGlassCupService {
    @Autowired
    private IGlassCupDao glassCupDao;
    @Override
    public void addGlassCup(GlassCup glassCup){
        glassCupDao.addGlassCup(glassCup);
    }
}
