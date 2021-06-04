package com.itwill.board.db;

import java.sql.Connection;
/*
 * 모든 사용자정의 Dao클래스(RDB)들이 사용하게되는
 * 공통적인 기능을 정의해놓은 부모클래스
 */
public class RdbmsDao {
	/* --> ConnectionFactory.java
	public Connection getConnection()throws Exception{
		return ConnectionFactory.getConnection();
	}
	public void releaseConnection(Connection con)throws Exception{
		ConnectionFactory.releaseConnection(con);
	}
	*/
	public Connection getConnection()throws Exception{
		return ConnectionPool.getInstance().getConnection();
	}
	public void releaseConnection(Connection con)throws Exception{
		ConnectionPool.getInstance().releaseConnection(con);
	}
}
