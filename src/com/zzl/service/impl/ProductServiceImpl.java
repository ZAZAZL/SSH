package com.zzl.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzl.dao.ProductDAO;
import com.zzl.pojo.Product;
import com.zzl.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    ProductDAO productDAO;

    public List<Product> list() {

        List<Product> products= productDAO.list();

        if(products.isEmpty()){

            for (int i = 0; i < 5; i++) {

                Product p = new Product();

                p.setName("product " + i);

                productDAO.add(p);

                products.add(p);

            }

        }

        return products;

    }

 

    public ProductDAO getProductDAO() {

        return productDAO;

    }

 

    public void setProductDAO(ProductDAO productDAO) {

        this.productDAO = productDAO;

    }
    public void add(String a)
    {
    	Product pp=new Product();
    	pp.setName(a);
    	productDAO.add(pp);
    }
    
    
    public void delete(Product product){
    	productDAO.delete(product);
    }
    
    public void update(Product product){
    	productDAO.update(product);
    }
    public Product get(int id) {
		return productDAO.get(id);
	}
}
