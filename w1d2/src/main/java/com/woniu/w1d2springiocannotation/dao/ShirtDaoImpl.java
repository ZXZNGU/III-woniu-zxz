package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Shirt;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class ShirtDaoImpl implements IShirtDao{
    public void addShirt(Shirt shirt) {
        System.out.println(LocalDateTime.now() + "：生产了一件衬衫 " + shirt);
    }
}
