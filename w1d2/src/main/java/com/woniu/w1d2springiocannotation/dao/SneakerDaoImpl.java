package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Sneaker;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class SneakerDaoImpl implements ISneakerDao{
    @Override
    public void addSneaker(Sneaker sneaker) {
        System.out.println(LocalDateTime.now() + "：生产了一双运动鞋 " + sneaker);
    }
}
