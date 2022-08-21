package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.Phone;
import com.woniu.w1d2springiocannotation.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PhoneController {

    @Autowired
    private IPhoneService phoneService;

    public void addPhone(Phone phone) {
        phoneService.addPhone(phone);
    }
}
