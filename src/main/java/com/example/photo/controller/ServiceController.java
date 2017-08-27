package com.example.photo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by andy.iyer on 8/25/2017.
 */
@RestController
public class ServiceController {
    @RequestMapping(value = "/rest/cmrs/control/ltvversions", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Collection<String> getLTVVersionsMapping() {
        List<String> str = new ArrayList<>();
        str.add("Fort Lee");
        str.add("Fort Worth");

        return str;

    }


}
