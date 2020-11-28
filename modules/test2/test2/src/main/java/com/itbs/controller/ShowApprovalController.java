package com.itbs.controller;

import com.itbs.api.ApprovalManage;
import com.itbs.commend.ResourceCommend;
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
    public Map<String,List<ResourceCommend>> ShowApprovalController(String showStatus){
        Map<String,List<ResourceCommend>> map = new HashMap<>();
        List<ResourceCommend> resourceCommendList = approvalManage.AllApproval();
        List<ResourceCommend> resourceCommends = new ArrayList<>();
        if(showStatus == "30"){
            map.put("resourceList",resourceCommendList);
        }else{
            for(ResourceCommend resourceCommend : resourceCommendList){
                String resourceStatus = resourceCommend.getResourceStatus();
                if(resourceStatus == showStatus){
                    resourceCommends.add(resourceCommend);
                }
            }
            map.put("resourceList",resourceCommends);
        }

        return map;
    }

    @RequestMapping("Approval")
    public Map<String,String> ApprovalController(String resourceId){
        Map<String,String> result = new HashMap<>();
        List<ResourceCommend> resourceCommendList = approvalManage.AllApproval();
        List<ResourceCommend> resourceCommends = resourceCommendList.stream().filter(resourceCommend ->
                resourceCommend.getResourceStatus() == resourceId).collect(Collectors.toList());
        for(ResourceCommend resourceCommend : resourceCommends){
            String status = resourceCommend.getResourceStatus();
            if("31".equals(status)){
                result = approvalManage.ShenlingApproval(resourceCommend);
            }else if("32".equals(status) || "33".equals(status)){
                result = approvalManage.JieyongApproval(resourceCommend);
            }else if("34".equals(status)){
                result = approvalManage.BiangengApproval(resourceCommend);
            }else if(status.startsWith("5")){
                result = approvalManage.BaofeiApproval(resourceCommend);
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
