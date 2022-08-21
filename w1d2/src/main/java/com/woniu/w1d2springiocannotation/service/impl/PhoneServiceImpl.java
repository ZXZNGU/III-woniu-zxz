package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.IPhoneDao;
import com.woniu.w1d2springiocannotation.entity.Phone;
import com.woniu.w1d2springiocannotation.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements IPhoneService {
    @Autowired
    private IPhoneDao phoneDao;
    @Override
    public void addPhone(Phone phone){
        phoneDao.addPhone(phone);
    }
}
