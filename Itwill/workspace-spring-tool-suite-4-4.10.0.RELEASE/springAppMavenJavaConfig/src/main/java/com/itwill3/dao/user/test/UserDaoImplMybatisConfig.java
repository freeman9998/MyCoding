package com.itwill3.dao.user.test;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.itwill3.dao.user.UserDao;
import com.itwill3.dao.user.UserDaoImplMyBatis;

@Configuration
public class UserDaoImplMybatisConfig {
	
	@Bean("apacheDataSource")
	public DataSource apacheDataSource() {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@182.237.126.19:1521:XE");
		dataSource.setUsername("javabackend99");
		dataSource.setPassword("javabackend99");
		return dataSource;
	}
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
		factoryBean.setDataSource(this.apacheDataSource());
		Resource[] mapperResources = 
				new PathMatchingResourcePatternResolver()
					.getResources("classpath:com/itwill3/dao/user/mapper/UserMapper.xml");
		factoryBean.setMapperLocations(mapperResources);
		
		return factoryBean.getObject();
	}
	@Bean
	public SqlSession sqlSession() throws Exception{
		return new SqlSessionTemplate(this.sqlSessionFactory());
	}
	@Bean
	public UserDao userDao() throws Exception{
		UserDaoImplMyBatis userDao=new UserDaoImplMyBatis();
		userDao.setSqlSession(this.sqlSession());
		return userDao;
	}
	
	
	
	
	
	
	
}
