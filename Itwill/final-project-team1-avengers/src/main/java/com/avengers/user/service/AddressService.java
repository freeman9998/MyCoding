package com.avengers.user.service;

import java.util.List;

import com.avengers.user.dto.Address;

public interface AddressService {

	// 주소 입력
	int insertAddress(Address address) throws Exception;

	// 주소 수정
	int updateAddress(Address address) throws Exception;

	// 주소 삭제
	int deleteAddress(int address_no) throws Exception;

	// 내 주소 상세정보
	Address selectAddressByNo(int address_no) throws Exception;

	// 내 주소 리스트
	List<Address> selectAddressAllByNo(int user_no) throws Exception;
	
}