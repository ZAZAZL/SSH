package com.zzl.service;


import java.util.List;

import com.zzl.pojo.Product;
public interface ProductService {

    public List<Product> list();
    public void add(String a);
    public Product get(int id);
    public void delete(Product product);
    public void update(Product product);
}
