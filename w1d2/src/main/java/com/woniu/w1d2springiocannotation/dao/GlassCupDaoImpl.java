package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.GlassCup;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class GlassCupDaoImpl implements IGlassCupDao{
    @Override
    public void addGlassCup(GlassCup glassCup) {
        System.out.println(LocalDateTime.now() + "：生产了一个玻璃杯 " + glassCup);
    }
}
