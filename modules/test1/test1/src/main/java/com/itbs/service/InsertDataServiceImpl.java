package com.itbs.service;

import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.mapper.InsertDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InsertDataServiceImpl {

    @Autowired
    public InsertDataMapper insertDataMapper;

    public Map insertData(Resourcemanage resourcemanage){
        Map<String,String> map = new HashMap<>();
        map = insertDataMapper.insertData(resourcemanage);
        map.put("status","1");
        return map;
    };
}
