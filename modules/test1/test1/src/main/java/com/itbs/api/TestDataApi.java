package com.itbs.api;

import com.itbs.client.TestDataServiceClient;
import com.itbs.dao.TestDataDAO;
import com.itbs.entity.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateTime: 2019-08-14 15:53
 * @Author: itbs
 */
@RestController
public class TestDataApi implements TestDataServiceClient{

    @Autowired
    private TestDataDAO testDataDAO;

    @Override
    public TestData getById(String id) {
        return testDataDAO.getById(id);
    }
}
