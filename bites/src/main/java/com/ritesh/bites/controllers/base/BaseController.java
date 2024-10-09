package com.ritesh.bites.controllers.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritesh.bites.services.base.BaseService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "http://localhost:3000")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("/")
    public List<String> testBaseService(){
        return baseService.testBaseServiceMethod();
    }
}
