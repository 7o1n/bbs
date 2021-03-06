package test4.mvc.controller;

import java.util.Scanner;
import java.util.Vector;
import test4.mvc.dto.Product;
import test4.mvc.service.Service;
import test4.mvc.service.ServiceImpl;

public class ProductMain {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int menu;
		Product p = null;
		Vector<Product> v = null;
		while (flag) {
			System.out.println("1.제품등록 2.제품검색 3.전체검색 4.수정 5.삭제 6.종료");
			menu = sc.nextInt();
			switch (menu) {
//			1. insert
			case 1:
				service.addProduct();
				break;
//			2. select one
			case 2:
				p = service.getProduct();
				System.out.println(p);
				break;
//			3. select all
			case 3:
				v = service.getProducts();
				for (int i = 0; i < v.size(); i++)
					System.out.println(v.get(i));
				break;
//			4. update
			case 4:
				service.editProduct();
				break;
//			5. delete
			case 5:
				service.delProduct();
				break;
//			6.close
			case 6:
				System.out.println("종료");
				flag = false;
				break;
			default :
				System.out.println("올바른 값을 입력해주세요.");
			}
			
		}
		sc.close();
	}

}
