package com.itbs.controller;

import com.alibaba.fastjson.JSONObject;
import com.itbs.entity.TestData;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.mapper.InsertDataMapper;
import com.itbs.service.InsertDataServiceImpl;
import com.itbs.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("itmatch/insertData")
public class InsertController {

    @Autowired
    private TestDataService testDataService;

    @Autowired
    private InsertDataServiceImpl insertDataServiceImpl;

    private Resourcemanage resourcemanage;

    @RequestMapping(value = "/ruku", method = RequestMethod.POST)
    public Object newruku(@RequestBody JSONObject requestbody){
        //resourceid
        //resourcename
        //resourcetype
        //resourcestatus
        resourcemanage = new Resourcemanage();
        SimpleDateFormat df = new SimpleDateFormat("ddHHmmss");//设置日期格式
        resourcemanage.setResourceid(df.format(new Date()).toString()+UUID.randomUUID().toString().substring(3,7));// new Date()为获取当前系统时间
        resourcemanage.setResourcename(requestbody.get("resourceName").toString());
        resourcemanage.setOrivalue(new BigDecimal(requestbody.get("orivalue").toString()));
        resourcemanage.setLimityear(Integer.valueOf(requestbody.get("limityear").toString()));
        resourcemanage.setResourcetype("20");
        resourcemanage.setResourcestatus("00");
        return insertDataServiceImpl.insertData(resourcemanage);
    }

}
