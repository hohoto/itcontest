package com.itbs.dao;

import com.itbs.entity.TestData;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDataDAO {

    TestData getById(String id);
}