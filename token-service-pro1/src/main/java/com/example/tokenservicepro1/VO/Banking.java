package com.example.tokenservicepro1.VO;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banking {

    private String bankId;

    private String services_provided;

    private String counter_no;


}