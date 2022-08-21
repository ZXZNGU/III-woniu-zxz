package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Phone;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class PhoneDaoImpl implements IPhoneDao{
    public void addPhone(Phone phone){
        System.out.println(LocalDateTime.now() + "：生产了一部手机 " + phone);
}
}
