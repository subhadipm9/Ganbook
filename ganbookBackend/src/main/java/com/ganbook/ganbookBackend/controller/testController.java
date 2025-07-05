package com.ganbook.ganbookBackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/test")
public class testController {
    @GetMapping(value = "/numbers")
    public ResponseEntity<String> testRender(){
        System.out.println("1");
        return new ResponseEntity<> ("Checked", HttpStatus.OK);
    }
}
