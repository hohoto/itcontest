package com.itbs.controller;

import com.itbs.business.RukuBusinessServiceI;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("itmatch/insertData")
public class InsertController {

    @Autowired
    private RukuBusinessServiceI rukuBusinessServiceI;

    @RequestMapping(value = "/ruku", method = RequestMethod.POST)
    public int newruku(@RequestBody Resourcemanage resourcemanage){
        return rukuBusinessServiceI.insertData(resourcemanage);
    }

}
