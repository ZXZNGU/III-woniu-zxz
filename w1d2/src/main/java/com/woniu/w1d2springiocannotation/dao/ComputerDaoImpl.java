package com.woniu.w1d2springiocannotation.dao;

import com.woniu.w1d2springiocannotation.entity.Computer;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class ComputerDaoImpl implements IComputerDao{
    @Override
    public void addComputer(Computer computer){
        System.out.println(LocalDateTime.now() + "：生产了一台电脑 " + computer);
    }
}
