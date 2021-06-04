package com.itwill.shop.jumunDetail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.jumun.Jumun;
import com.itwill.shop.jumun.JumunDao;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;

public class JumunDetailDao {
	
	public int insertDetail(int qty,int p_no,int j_no) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("insert into jumun_detail values (JUMUN_DETAIL_JD_NO_SEQ.nextval,?,?,?)");
		pstmt.setInt(1, qty);
		pstmt.setInt(2, p_no);
		pstmt.setInt(3, j_no);
		
		int insertRowCount=pstmt.executeUpdate();

		pstmt.close();
		con.close();
		
		
		return insertRowCount;
		
		
		
		
		
		
	}
	public List<JumunDetail> selectOneJumun(int j_no) throws Exception{
		ProductDao productDao=new ProductDao();
		JumunDao jumunDao=new JumunDao();
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("select jd.j_no,jd.jd_qty,p.p_name,p.p_price,jd.p_no from jumun_detail jd join product p on jd.p_no=p.p_no where jd.j_no=?");
		pstmt.setInt(1, j_no);
	
		List<JumunDetail> jumunDetailList=new ArrayList<JumunDetail>();
			
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Product product=productDao.productSelectOne(rs.getInt(5));
			Jumun jumun=jumunDao.selectByNo(rs.getInt(1));
			
			jumunDetailList.add(new JumunDetail(rs.getInt(1),rs.getInt(2),product, jumun));
		}
		
		

		pstmt.close();
		con.close();
		
		
		return jumunDetailList;
		
		
		
		
		
		
	}
	
	public boolean isDetailExist(int j_no) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("select count(*) from jumun_detail where j_no=?");
		pstmt.setInt(1, j_no);
		int count =0;
		boolean exist=true;
			
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			count=rs.getInt(1);
		}
		
		if(count==0) {
			exist=false;
		}
		

		pstmt.close();
		con.close();
		
		
		return exist;
		
		
		
		
		
		
	}
	

}
