package com.example.tokenservicepro1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="token")
public class Token {

    @Id
    @Indexed(unique = true)
    private String tknId;

    private String token_number;

    private String token_status;

    private String token_Time;

    private String token_Date;

    private String cstId;

    private String bankId;
}
