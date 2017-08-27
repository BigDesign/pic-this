package com.example.photo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andy.iyer on 8/6/2017.
 */
@RestController
public class PhotoController {
    @RequestMapping("/photo/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

}