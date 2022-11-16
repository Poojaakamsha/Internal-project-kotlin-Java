package com.example.tokenservicepro1.VO;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String cstId;

    private String email;

    private String password;

    private String name;

    private String account_number;

    private String service_requested;

    private String country;

    private String phone;
}