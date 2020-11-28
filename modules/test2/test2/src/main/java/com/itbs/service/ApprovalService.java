package com.itbs.service;

import com.itbs.api.ApprovalManage;
import com.itbs.commend.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApprovalService implements ApprovalManage {

    @Override
    public List<ResourceCommend> AllApproval(){
        List<ResourceCommend> resourceCommendList = new ArrayList<>();
        return resourceCommendList;
    }

    @Override
    public Map<String,String> ShenlingApproval(ResourceCommend resourceCommend){
        Map mp = new HashMap();

        mp.put("status","1");
        return mp;
    }

    @Override
    public Map<String,String> JieyongApproval(ResourceCommend resourceCommend){
        Map mp = new HashMap();

        mp.put("status","1");
        return mp;
    }

    @Override
    public Map<String,String> BiangengApproval(ResourceCommend resourceCommend){
        Map mp = new HashMap();

        mp.put("status","1");
        return mp;
    }

    @Override
    public Map<String,String> BaofeiApproval(ResourceCommend resourceCommend){
        Map mp = new HashMap();

        mp.put("status","1");
        return mp;
    }
}