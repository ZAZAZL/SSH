package com.zzl.dao;

import java.util.List;


import com.zzl.pojo.Product;
public interface ProductDAO {
    public List<Product> list();
    public void add(Product p);
    public  void delete(Product product);
    public void update(Product product);
    public Product get(int id);
}

