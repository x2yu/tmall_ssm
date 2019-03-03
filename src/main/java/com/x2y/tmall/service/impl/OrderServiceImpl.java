package com.x2y.tmall.service.impl;

import com.x2y.tmall.mapper.OrderMapper;
import com.x2y.tmall.pojo.Order;
import com.x2y.tmall.pojo.OrderExample;
import com.x2y.tmall.pojo.User;
import com.x2y.tmall.service.OrderService;
import com.x2y.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UserService userService;

    @Override
    public void add(Order c) {
        orderMapper.insert(c);
    }

    @Override
    public void delete(int id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Order c) {
        orderMapper.updateByPrimaryKeySelective(c);
    }

    @Override
    public Order get(int id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list() {
        OrderExample example = new OrderExample();
        example.setOrderByClause("id desc");
        List<Order>result = orderMapper.selectByExample(example);
        setUser(result);
        return result;
    }

    public void setUser(List<Order>os){
        for(Order o:os){
            setUser(o);
        }
    }

    public void setUser(Order o){
        int uid = o.getUid();
        User u = userService.get(uid);
        o.setUser(u);
    }
}
