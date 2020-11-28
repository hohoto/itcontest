package com.itbs.business;


import com.itbs.persistence.entity.TBasicCompany;

import java.util.List;

/**
 * Created by shaoxuhang on 20/11/28.
 */
public interface UserBusinessServiceI {

    List<TBasicCompany> queryCompany(String companyCode);


}
