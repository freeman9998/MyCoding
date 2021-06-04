package com.itwill3.dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class SpringDataSourceConfig {
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
	
	
}
