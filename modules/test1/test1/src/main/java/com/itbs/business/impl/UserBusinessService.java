package com.itbs.business.impl;

import com.itbs.business.UserBusinessServiceI;
import com.itbs.persistence.entity.TBasicCompany;
import com.itbs.persistence.entity.TBasicCompanyExample;
import com.itbs.service.ItMatchDaoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by shaoxuhang on 20/11/28.
 */
@Component
public class UserBusinessService implements UserBusinessServiceI{

    @Autowired
    ItMatchDaoServiceI itMatchDaoServiceI;

    @Override
    public List<TBasicCompany> queryCompany(String companyCode){
        TBasicCompanyExample example = new TBasicCompanyExample();
        TBasicCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyCodeEqualTo(companyCode);
        List<TBasicCompany> tBasicCompanies = itMatchDaoServiceI.selectTBasicCompany(example);
        return tBasicCompanies;
    }


}
