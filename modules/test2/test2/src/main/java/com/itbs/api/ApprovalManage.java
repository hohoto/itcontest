package com.itbs.api;

import com.itbs.commend.ResourceCommend;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface ApprovalManage {

    /*
    *审批显示
     */
    public List<ResourceCommend> AllApproval();

    /*
    *申领审批
     */
    public Map<String,String> ShenlingApproval(ResourceCommend resourceCommend);

    /*
    *变更审批
     */
    public Map<String,String> BiangengApproval(ResourceCommend resourceCommend);

    /*
    *报废审批
     */
    public Map<String,String> BaofeiApproval(ResourceCommend resourceCommend);

    /*
    *借用归还
     */
    public Map<String,String> JieyongApproval(ResourceCommend resourceCommend);
}
