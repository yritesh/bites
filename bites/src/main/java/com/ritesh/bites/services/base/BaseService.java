package com.ritesh.bites.services.base;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BaseService {
    
    public List<String> testBaseServiceMethod(){
        return List.of("First Post", "Second Post", "Third Post");
    }
}
