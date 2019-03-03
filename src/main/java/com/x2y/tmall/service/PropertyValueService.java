package com.x2y.tmall.service;

import com.x2y.tmall.pojo.Product;
import com.x2y.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue propertyValue);

    PropertyValue get(int ptid,int pid);
    List<PropertyValue> list(int pid);
}
