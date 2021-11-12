package test4.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import test4.mvc.dto.Product;
import test4.mvc.util.DBConnect;

public class OracleDao implements Dao {

    //DBConnect dbconn2 = new DBConnection();
	private Connection  conn = null;
	private PreparedStatement pstmt = null;
	
	//기본생성자
	public OracleDao() {
		DBConnect dbconn =  DBConnect.getInstance(); //1.Singleton을 통한 객체생성
		conn = dbconn.getConnection(); //2.DB연결
	}
	
	public Connection getConn() {
		return conn;
	}
	
	@Override
	public void insert(Product p) {//insert
		String sql = "insert into product values(product_seq.nextval,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			int count = pstmt.executeUpdate();
			if(count > 0)
				System.out.println("데이터가 저장되었습니다.");
			else
				System.out.println("데이터가 저장되지 않았습니다.");
		} catch (SQLException e) {
			
		}
	}

	@Override
	public Product select(int num) {//select one
		 Product p = null;
		 ResultSet rs =null;
		    try {
				String query = "select * from product where num=?";
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, num);	
				rs = pstmt.executeQuery();
				if(rs.next()) {
						//int num2 = rs.getInt(1);
						String name = rs.getString("name");//2
						int price = rs.getInt("price");//3
						p = new Product(num, name, price);
						//System.out.println(num+" : "+name+" : "+price);
					}
			} catch (SQLException e) {
				
			}
		return p;
	}

	@Override
	public Vector<Product> selectAll() {//select all
		
		
		
		
		
		
		
		
		
		return null;
	}

	@Override
	public void delete(int num) {//delete
		
	}

	@Override
	public void update(int num, Product p) {//update
		

	}

}
