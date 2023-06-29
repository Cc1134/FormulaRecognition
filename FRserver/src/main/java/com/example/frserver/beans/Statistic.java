package com.example.frserver.beans;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "statistics")
public class Statistic {
    @Id
    private String id;

    @Field("statsName")
    private String statsName;

    @Field("value")
    private Long statsValue;

}
