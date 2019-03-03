package com.x2y.tmall.service;

import com.x2y.tmall.pojo.User;

import java.util.List;

public interface UserService {
    void add(User u);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
}
