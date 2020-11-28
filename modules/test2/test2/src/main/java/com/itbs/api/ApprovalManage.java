package com.itbs.api;

import com.itbs.commend.ResourceCommend;
import com.itbs.persistence.entity.Resourcemanage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface ApprovalManage {

    /*
    *审批显示
     */
    public List<Resourcemanage> AllApproval();

    /*
    *申领审批
     */
    public Map<String,String> ShenlingApproval(Resourcemanage resourcemanage);

    /*
    *变更审批
     */
    public Map<String,String> BiangengApproval(Resourcemanage resourcemanage);

    /*
    *报废审批
     */
    public Map<String,String> BaofeiApproval(Resourcemanage resourcemanage);

    /*
    *借用归还
     */
    public Map<String,String> JieyongApproval(Resourcemanage resourcemanage);
}
