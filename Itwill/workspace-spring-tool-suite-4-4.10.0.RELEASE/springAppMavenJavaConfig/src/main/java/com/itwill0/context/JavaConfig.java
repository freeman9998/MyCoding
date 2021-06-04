package com.itwill0.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	/*
	 <bean id="productDao" class="com.itwill0.context.ProductDao"/>
	 */
	@Bean(value = "productDao")
	public ProductDao productDao() {
		return new ProductDao();
	}
	/*
	<bean id="productService" class="com.itwill0.context.ProductService">
		<property name="productDao" ref="productDao"/>
	</bean>
	 */
	@Bean("productService")
	public ProductService productService() {
		ProductService productService=new ProductService();
		productService.setProductDao(this.productDao());
		return productService;
	}
	
}
