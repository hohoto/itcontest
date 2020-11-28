package com.itbs.service;

import com.itbs.persistence.entity.*;

import java.util.List;

/**
 * Created by shaoxuhang on 20/11/28.
 */
public interface ItMatchDaoServiceI {

    int insertTBasicCompany(TBasicCompany param);
    int inertTBasicDepartment(TBasicDepartment param);
    int insertTBasicRole(TBasicRole param);
    int insertTBasicSku(TBasicSku param);
    int insertTBasicSpu(TBasicSpu param);
    int insertTBasicUser(TBasicUser param);
    int insertTCenterRole(TCenterRole param);
    int updateTBasicCompanySelective(TBasicCompany param, TBasicCompanyExample example);
    int updateTBasicCompanyByPrimaryKeySelective(TBasicCompany record);
    int updateTBasicDepartmentSelective(TBasicDepartment param, TBasicDepartmentExample example);
    int updateTBasicDepartmentByPrimaryKeySelective(TBasicDepartment record);
    int updateTBasicRoleSelective(TBasicRole param, TBasicRoleExample example);
    int updateTBasicRoleByPrimaryKeySelective(TBasicRole record);
    int updateTBasicSkuSelective(TBasicSku param, TBasicSkuExample example);
    int updateTBasicSkuByPrimaryKeySelective(TBasicSku record);
    int updateTBasicSpuSelective(TBasicSpu param, TBasicSpuExample example);
    int updateTBasicSpuByPrimaryKeySelective(TBasicSpu record);
    int updateTBasicUserSelective(TBasicUser param, TBasicUserExample example);
    int updateTBasicUserByPrimaryKeySelective(TBasicUser record);
    int updateTCenterRoleSelective(TCenterRole param, TCenterRoleExample example);
    int updateTCenterRoleByPrimaryKeySelective(TCenterRole record);
    List<TBasicCompany> selectTBasicCompany(TBasicCompanyExample example);
    TBasicCompany selectTBasicCompanyByPrimaryKey(Integer id);
    List<TBasicDepartment> selectTBasicDepartment(TBasicDepartmentExample example);
    TBasicDepartment selectTBasicDepartmentByPrimaryKey(Integer id);
    List<TBasicRole> selectTBasicRole(TBasicRoleExample example);
    TBasicRole selectTBasicRoleByPrimaryKey(Integer id);
    List<TBasicSku> selectTBasicSku(TBasicSkuExample example);
    TBasicSku selectTBasicSkuByPrimaryKey(Integer id);
    List<TBasicSpu> selectTBasicSpu(TBasicSpuExample example);
    TBasicSpu selectTBasicSpuByPrimaryKey(Integer id);
    List<TBasicUser> selectTBasicUser(TBasicUserExample example);
    TBasicUser selectTBasicUserByPrimaryKey(Integer id);
    List<TCenterRole> selectTCenterRole(TCenterRoleExample example);
    TCenterRole selectTCenterRoleByPrimaryKey(Integer id);




}
