package com.zzl.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.zzl.pojo.Product;
import com.zzl.service.impl.ProductServiceImpl;

@Namespace("/")

@ParentPackage("struts-default")

@Results({@Result(name="listJsp", location="/list.jsp"),

        @Result(name="success", location="/listProduct"),
        @Result(name="listProduct", location="/listProduct"),
        @Result(name="updateProduct", location="/update.jsp"),
        })

public class ProductAction {

	public String name;
	@Autowired
	ProductServiceImpl productService;
	List<Product> products;
	public Product product;
	
	//增
	@Action("addProduct")
	public String add(){
		productService.add(name);
		return "success";
	}
	//删
	@Action("deleteProduct")
	public String delete(){
		productService.delete(product);
		return "listProduct";
	}
	//改
	@Action("updateProduct")
	public String update(){
		productService.update(product);
		return "listProduct";
	}
	//查
	@Action("listProduct")
	public String list() {
		products = productService.list();
		return "listJsp";
	}
	//按条件查
	@Action("getProduct")
	public String getproduct(){
		product = productService.get(product.getId());
		return "updateProduct";
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductServiceImpl getProductService() {
		return productService;
	}

	public void setProductService(ProductServiceImpl productService) {
		this.productService = productService;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}


 

}
