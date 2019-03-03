package com.x2y.tmall.service;

import com.x2y.tmall.pojo.Product;

import java.util.List;

public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);
    void setFirstProductImage(List<Product> p);
}
