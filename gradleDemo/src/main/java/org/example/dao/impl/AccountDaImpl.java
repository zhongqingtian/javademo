package org.example.dao.impl;

import org.example.dao.AccountDao;

import java.util.List;

public class AccountDaImpl implements AccountDao {
    public List findAll(){
        System.out.println("列表查询成功");
        return null;
    }
}
