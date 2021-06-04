package com.itwill.shop.product;

import java.util.ArrayList;

public interface ProductDao {

	Product productSelectOne(int p_no) throws Exception;

	ArrayList<Product> productSelectMany() throws Exception;

}