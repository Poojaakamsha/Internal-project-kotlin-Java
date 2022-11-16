package com.example.tokenservicepro1.service;


import com.example.tokenservicepro1.VO.Banking;
import com.example.tokenservicepro1.VO.Customer;
import com.example.tokenservicepro1.VO.ResponseTemplate;
import com.example.tokenservicepro1.entity.Token;
import com.example.tokenservicepro1.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TokenService {



    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Token saveToken(Token token) {return tokenRepository.save(token);}

    public ResponseTemplate getTokenWithCustomerBanking(String cstId, String bankId) {
        ResponseTemplate rtVO = new ResponseTemplate();
        Token token = tokenRepository.findByTknId(cstId,bankId);
        Customer customer = restTemplate.getForObject("http://localhost:4001/customer/"+token.getCstId(),Customer.class);
        Banking banking = restTemplate.getForObject("http://localhost:9001/bank/"+token.getBankId(),Banking.class);
        rtVO.setToken(token);
        rtVO.setCustomer(customer);
        rtVO.setBanking(banking);
        return rtVO;
    }

    public List<Token> getAllTokens() {
        return tokenRepository.findAll();
    }



}

