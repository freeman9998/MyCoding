package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.AddressDao;
import com.itwill.shop.dao.AddressDaoImpl;
import com.itwill.shop.domain.Address;

public class AddressService {

	private AddressDao addressDao;
	
	public AddressService() throws Exception{
		addressDao = new AddressDaoImpl();
	}
	
	public List<Address> findAddressByNo(int addressNo)  throws Exception{
		return addressDao.findAddressByNo(addressNo);
	}
	public List<Address> findAddressAll() throws Exception{
		return addressDao.findAddressAll();
	}
	public int insertAddress(Address address) throws Exception{
		return addressDao.insertAddress(address);
	}
	public int updateAddressByNo(Address address)  throws Exception{
		return addressDao.updateAddressByNo(address);
	}
	public int deleteAddresByNo(int addressNo)  throws Exception{
		return addressDao.deleteAddressByNo(addressNo);
	}
}