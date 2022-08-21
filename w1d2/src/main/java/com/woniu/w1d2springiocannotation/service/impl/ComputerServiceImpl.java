package com.woniu.w1d2springiocannotation.service.impl;

import com.woniu.w1d2springiocannotation.dao.IComputerDao;
import com.woniu.w1d2springiocannotation.entity.Computer;
import com.woniu.w1d2springiocannotation.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerServiceImpl implements IComputerService {
    @Autowired
    private IComputerDao computerDao;
    @Override
    public void addComputer(Computer computer){
        computerDao.addComputer(computer);
    }
}
