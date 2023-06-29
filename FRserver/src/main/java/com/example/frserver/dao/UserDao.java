package com.example.frserver.dao;

import com.example.frserver.beans.User;
import jakarta.annotation.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Resource
    private MongoTemplate mongoTemplate;

    /**
     * method to count
     * @return count numbers
     */
    public long getCount() {
        Query query = new Query();
        long count = mongoTemplate.count(query, User.class);
        return count;
    }
}
