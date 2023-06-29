package com.example.frserver.service;

import com.example.frserver.dao.StatisticDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {

    @Autowired
    StatisticDao statisticDao;
    public void incrementTotalUsage(){
        statisticDao.updateIncrementOne("totalUsage");
    }
}
