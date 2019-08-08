package com.zzl.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zzl.dao.ProductDAO;
import com.zzl.pojo.Product;

@Repository("productDAO")
public class ProductDAOImpl extends HibernateTemplate implements ProductDAO{

	
	@Resource(name="sf")

    public void setSessionFactory(SessionFactory sessionFactory) {

        super.setSessionFactory(sessionFactory);

    };
    public Product get(int id) {
		return (Product)get(Product.class,id);
	}
	
     
	public List<Product> list() {
		List<Product> dao = find("from Product");
        return dao;
    }
    public void add(Product p) {

        save(p);

    }

    public  void delete(Product product){
    	super.delete(product);
    }
    public void update(Product product){
    	super.update(product);
    }
    
}