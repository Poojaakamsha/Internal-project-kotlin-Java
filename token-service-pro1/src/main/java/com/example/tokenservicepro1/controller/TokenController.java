package com.example.tokenservicepro1.controller;

import com.example.tokenservicepro1.VO.ResponseTemplate;
import com.example.tokenservicepro1.entity.Token;
import com.example.tokenservicepro1.repository.TokenRepository;
import com.example.tokenservicepro1.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private TokenRepository tokenRepository;

    @PostMapping("/")
    public Token saveToken(@RequestBody Token token) {
        return tokenService.saveToken(token);
    }

    @GetMapping
    public List<Token> getAllTokens(){
        return tokenService.getAllTokens();
    }


    @GetMapping("/{id}")
    public ResponseTemplate getTokenWithCustomerBanking(@PathVariable("id") String cstId, String bankId) {
        return tokenService.getTokenWithCustomerBanking(cstId,bankId);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteToken(@PathVariable("id") String id){
        try {
            tokenRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(Exception ex) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

