package test4.mvc.service;

import java.util.Scanner;
import java.util.Vector;

import test4.mvc.dao.Dao;
import test4.mvc.dao.OracleDao;
import test4.mvc.dto.Product;

public class ServiceImpl implements Service {
	Scanner sc = new Scanner(System.in);
	
	Dao dao = new OracleDao();

	@Override
	public void addProduct() {//insert
		System.out.println("제품이름은?");
		String name = sc.next();
		System.out.println("제품가격은?");
		int price = sc.nextInt();
		
		dao.insert(new Product(0,name, price));
	}

	@Override
	public Product getProduct() {//select one
		System.out.println("검색할 번호는? ");
		int num = sc.nextInt();
		Product p = dao.select(num);
		return p;
	}

	@Override
	public Vector<Product> getProducts() {//select all
		
		return null;
	}

	@Override
	public void delProduct() {//delete
		

	}

	@Override
	public void editProduct() {//update
		

	}

}
