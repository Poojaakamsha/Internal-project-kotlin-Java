package com.example.customerservicepro1.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="customers")
public class Customer {

    @Id
    @Indexed(unique = true)
    private String cstId;

    @Indexed(unique = true)
    private String email;

    @Indexed(unique = true)
    private String password;

    private String name;

    @Indexed(unique = true)
    private String Account_number;

    private String service_requested;

    private String country;

    private String phone;
}
