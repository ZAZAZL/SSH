<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<%@page isELIgnored="false"%>


<table>
	<tr>
		<td>id</td>
		<td>name</td>
		<td>操作</td>
	</tr>
	    	    
<s:iterator value="products" var="p">
	<tr>
		<td>${p.id}</td>
		<td>${p.name}</td>
		<td>
		<a type="button"  href="getProduct?product.id=${p.id}">修改</a>
		<a type="button"  href="deleteProduct?product.id=${p.id}">删除</a>
		</td>
	</tr>
</s:iterator>

</table>

