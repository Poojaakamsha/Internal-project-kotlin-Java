package com.example.tokenservicepro1.VO;

import com.example.tokenservicepro1.entity.Token;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

    private Token token;
    private Customer customer;
    private Banking banking;

}
