package com.gm.springmvcdemo.dao;

import com.gm.springmvcdemo.domain.T_bh_dcasemsg;

import java.util.List;

/**
 * 电子工单持久层接口
 */
public interface TbhCaseDao{

    //查询所有用户
    List<T_bh_dcasemsg> findAll();
}
