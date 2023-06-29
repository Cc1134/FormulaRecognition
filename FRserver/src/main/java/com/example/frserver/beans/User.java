package com.example.frserver.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "User")
public class User {
    @Field("id")
    private String id;

    @Field("UserName")
    private String userName;

    @Field("sex")
    private String sex;
}
