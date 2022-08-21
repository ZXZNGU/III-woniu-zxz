package com.woniu.w1d2springiocannotation.controller;

import com.woniu.w1d2springiocannotation.entity.GlassCup;
import com.woniu.w1d2springiocannotation.service.IGlassCupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GlassCupController {

    @Autowired
    private IGlassCupService glassCupService;

    public void addGlassCup(GlassCup glassCup) {
        glassCupService.addGlassCup(glassCup);
    }
}
