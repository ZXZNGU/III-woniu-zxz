package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Liquor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class LiquorDaoImpl implements ILiquorDao{
    public void addLiquor(Liquor liquor) {
        System.out.println(LocalDateTime.now() + "：生产了一瓶茅台" + liquor);
    }
}
