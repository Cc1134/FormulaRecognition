package com.example.frserver.dao;

import com.example.frserver.beans.Statistic;
import jakarta.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class StatisticDao {

    @Resource
    private MongoTemplate mongoTemplate;

    public void updateIncrementOne(String statsName){
        Statistic statistic = search(statsName);
        System.out.println(statistic);
        statistic.setStatsValue(statistic.getStatsValue() + 1);
        mongoTemplate.save(statistic);
    }

    public Statistic search(String statsName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("statsName").is(statsName));
        return mongoTemplate.findOne(query,Statistic.class);
    }
}
