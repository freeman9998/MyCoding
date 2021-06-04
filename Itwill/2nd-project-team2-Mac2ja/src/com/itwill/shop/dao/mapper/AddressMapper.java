package com.itwill.shop.dao.mapper;

import java.util.List;

import com.itwill.shop.domain.Address;

public interface AddressMapper {
	
	public List<Address> findAddressByNo(int membersNo);
	/*
 	<select id=findAddressByno" parameterType="int" resultMap=addressResultMap">
		select * from address where address_no = #{addressNo}
	</select>
	 */
	
	public List<Address> findAddressAll();
	/*
   	<select id=findAddressAll" resultMap="addressResultMap">
		select * from address
	</select>
	 */
	
	public int insertAddress(Address address)throws Exception;
	/*
	 <insert id="insertAddress" parameterType="com.itwill.shop.domain.Address">
		insert into address(address_no,address_name,address_detail,address_type)
		values(#{addressNo},#{addressName},#{addressDetail},#{addressType})
	</insert>
	 */
	
	public int updateAddressByNo(Address address)throws Exception;
	/*
	 <update id="updateAddressByNo" parameterType="com.itwill.shop.domain.Address">
		update address set address_name=#{addressName},address_detail=#{addressDetail},address_type=#{addressType}
	</update>
	 */
	
	public int deleteAddressByNo(int addressNo);
	/*
	 <delete id="deleteAddressByNo" parameterType="int">
		delete from address where address_no=#{addressNo}
	</delete>
	 */
}
