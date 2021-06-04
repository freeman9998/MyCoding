package com.itwill3.dao.user.test;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.itwill3.dao.user.UserDao;
import com.itwill3.dao.user.UserDaoImplJDBC;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class UserDaoImplJDBCConfig {
	@Value("${jdbc.driverClassName}") 
	String driverClassName;
	@Value("${jdbc.url}") 
	String url;
	@Value("${jdbc.password}") 
	String password;
	@Value("${jdbc.username}") 
	String username;
	
	@Bean("apacheDataSource")
	public DataSource apacheDataSource() {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	@Bean
	public UserDao userDao() {
		return new UserDaoImplJDBC(this.apacheDataSource());
	}
}
