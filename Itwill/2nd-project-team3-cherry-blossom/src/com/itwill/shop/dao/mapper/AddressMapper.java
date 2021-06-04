package com.itwill.shop.dao.mapper;

import com.itwill.shop.domain.Address;

public interface AddressMapper {
	
	public int insertNewAddress(Address address);
	
	public Address selectNewAddressByNo(Integer a_no);
}
