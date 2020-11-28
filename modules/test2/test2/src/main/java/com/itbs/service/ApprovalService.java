package com.itbs.service;

import com.itbs.api.ApprovalManage;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.mapper.ResourcemanageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApprovalService implements ApprovalManage {

    @Autowired
    ResourcemanageMapper resourcemanageMapper;


    @Override
    public List<Resourcemanage> AllApproval(){
        List<Resourcemanage> resourceCommendList = resourcemanageMapper.selectResStaEquThr();
        return resourceCommendList;
    }

    @Override
    public Map<String,String> ShenlingApproval(Resourcemanage resourcemanage){
        Map mp = new HashMap();

        mp.put("resource","31");
        mp.put("status","1");
        return mp;
    }

    @Override
    public Map<String,String> JieyongApproval(Resourcemanage resourcemanage){
        Map mp = new HashMap();

        mp.put("resource","32");
        mp.put("status","1");
        return mp;
    }

    @Override
    public Map<String,String> BiangengApproval(Resourcemanage resourcemanage){
        Map mp = new HashMap();

        mp.put("resource","34");
        mp.put("status","1");
        return mp;
    }

    @Override
    public Map<String,String> BaofeiApproval(Resourcemanage resourcemanage){
        Map mp = new HashMap();

        mp.put("resource","51");
        mp.put("status","1");
        return mp;
    }
}