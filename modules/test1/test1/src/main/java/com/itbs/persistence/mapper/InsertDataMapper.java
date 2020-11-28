package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.Resourcemanage;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface InsertDataMapper {
    Map insertData(Resourcemanage entity);
}
