package com.x2y.tmall.service;

import com.x2y.tmall.pojo.Category;
import com.x2y.tmall.util.Page;

import java.util.List;

public interface CategoryService  {
    List<Category>list();
    //List<Category>list(Page page);
    //int total();
    void add(Category category);
    void delete(int id);
    Category get(int id);
    void update(Category category);
}
