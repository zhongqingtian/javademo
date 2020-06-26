package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String save() {
        return "保存成功";
    }
}
