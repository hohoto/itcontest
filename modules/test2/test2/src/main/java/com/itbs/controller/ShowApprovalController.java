package com.itbs.controller;

import com.itbs.api.ApprovalManage;
import com.itbs.persistence.entity.Resourcemanage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/DoApproval")
public class ShowApprovalController {

    @Autowired
    private ApprovalManage approvalManage;

    @RequestMapping("showApproval")
    public Map<String,List<Resourcemanage>> ShowApprovalController(String showStatus){
        Map<String,List<Resourcemanage>> map = new HashMap<>();
        List<Resourcemanage> ResourcemanageList = approvalManage.AllApproval();
        List<Resourcemanage> Resourcemanages = new ArrayList<>();
        if(showStatus == "30"){
            map.put("resourceList",ResourcemanageList);
        }else{
            for(Resourcemanage Resourcemanage : ResourcemanageList){
                String resourceStatus = Resourcemanage.getResourcestatus();
                if(resourceStatus == showStatus){
                    Resourcemanages.add(Resourcemanage);
                }
            }
            map.put("resourceList",Resourcemanages);
        }
        return map;
    }

    @RequestMapping("Approval")
    public Map<String,String> ApprovalController(String resourceId){
        Map<String,String> result = new HashMap<>();
        List<Resourcemanage> ResourcemanageList = approvalManage.AllApproval();
        List<Resourcemanage> Resourcemanages = ResourcemanageList.stream().filter(Resourcemanage ->
                Resourcemanage.getResourcestatus() == resourceId).collect(Collectors.toList());
        for(Resourcemanage Resourcemanage : Resourcemanages){
            String status = Resourcemanage.getResourcestatus();
            if("31".equals(status)){
                result = approvalManage.ShenlingApproval(Resourcemanage);
            }else if("32".equals(status) || "33".equals(status)){
                result = approvalManage.JieyongApproval(Resourcemanage);
            }else if("34".equals(status)){
                result = approvalManage.BiangengApproval(Resourcemanage);
            }else if(status.startsWith("5")){
                result = approvalManage.BaofeiApproval(Resourcemanage);
            }
        }
        if("1".equals(result.get("status"))){
            result.put("msg","修改成功");
        }else {
            result.put("msg","修改失败");
        }
        return result;
    }
}
