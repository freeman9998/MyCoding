package com.itwill.shop.dao.test;

import com.itwill.shop.dao.AddressDao;
import com.itwill.shop.dao.AddressDaoImpl;
import com.itwill.shop.domain.Address;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		AddressDaoImpl addressDaoImpl = new AddressDaoImpl();
//		System.out.println(addressDaoImpl.findAddressByNo(1));
//		System.out.println(addressDaoImpl.findAddressAll());
		Address address = new Address(0,"f", "ff", 2, 3);
		System.out.println(addressDaoImpl.insertAddress(address));
//		Address uaddress = new Address(5,"x", "xx", 0, 3);
//		System.out.println(addressDaoImpl.updateAddressByNo(uaddress));
//		System.out.println(addressDaoImpl.deleteAddressByNo(5));
		

	}

}