package com.springrest.springrest.services;

import com.springrest.springrest.model.CatFactResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatService {

    private final RestTemplate restTemplate;

    public CatService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CatFactResponse getCatFact(){
        try {
            ResponseEntity<CatFactResponse> response = restTemplate.getForEntity("https://catfact.ninja/fact", CatFactResponse.class);
            return response.getBody();
        }catch (Exception e){
            throw e;
        }
    }

}
