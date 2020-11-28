package com.itbs.business.impl;

import com.itbs.business.RukuBusinessServiceI;
import com.itbs.constant.BaseDb;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.mapper.ResourcemanageMapper;
import com.itbs.service.ItMatchDaoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RukuBusinessServiceImpl implements RukuBusinessServiceI {

    @Autowired
    private BaseDb baseDb;

    public int insertData(Resourcemanage resourcemanage){
        return baseDb.resourcemanageMapper.insertResourcemanageModel(resourcemanage);
    }
}
