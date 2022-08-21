package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Umbrella;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class UmbrellaDaoImpl implements IUmbrellaDao{
    @Override
    public void addUmbrella(Umbrella umbrella){
        System.out.println(LocalDateTime.now() + "：生产了一把雨伞 " + umbrella);
    }
}
