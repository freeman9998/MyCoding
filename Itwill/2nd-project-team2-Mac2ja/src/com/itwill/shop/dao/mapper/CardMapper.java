package com.itwill.shop.dao.mapper;

import java.util.List;

import com.itwill.shop.domain.Card;
import com.itwill.shop.domain.Food;
import com.itwill.shop.domain.Members;

public interface CardMapper {
	/*
	 * 인터페이스의 풀네임은 StudentMapper.xml의 namespace와일치
	 * 메쏘드이름은 	StudentMapper.xml 파일의 id와일치
	 * 메쏘드인자타입은 StudentMapper.xml 파일의 parameterType 와일치
	 * 메쏘드리턴타입은 StudentMapper.xml 파일의 resultType 와일치(ResultSet이 한 개 이상일 경우 반환타입이 List이다)
	 */
	
	public List<Card> findCardByNo(int cardNo);
	/*
 	<select id=findCardByNo" parameterType="int" resultMap=cardResultMap">
		select * from card where card_no = #{cardNo}
	</select>
	
	 */
	public List<Card> findCardByMembersNo(int membersNo);
	/*<select id="findCardByMembersNo" parameterType="int" resultMap="cardResultMap">
		select * from card where members_no = #{membersNo}
	</select>
	 */
	
	public List<Card> findCardAll();
	/*
   	<select id=findCardAll" resultMap="cardResultMap">
		select * from card
	</select>
	 */
	
	public int insertCard(Card card);
	/*
	 <insert id="insertCard" parameterType="com.itwill.shop.domain.Card">
		insert into card(card_no,card_number,card_name,card_type,members_no)
		values(#{cardNo},#{card_number},#{card_name},#{cardType}.#{membersNo})
	</insert>
	 */
	
	public int updateCardByNo(Card card) throws Exception;
	
	/*
	 * public int updateCardByNo(Card card);
	public int updateCardByNo(Card card);
	 <update id="updateCardByNo" parameterType="com.itwill.shop.domain.Card">
		update card set card_name=#{cardName},card_detail=#{cardDetail},card_type=#{cardType}
	</update>
	 */
	
	public int deleteCardByNo(int cardNo);
	/*
	 <delete id="deleteCardByNo" parameterType="int">
		delete from card where card_no=#{cardNo}
	</delete>
	 */
	public int createCard(Card card) throws Exception;
	/*
	<insert id="createCard" parameterType="com.itwill.shop.domain.Card">
		insert into card(card_no,card_number,card_name,card_type,members_No)
		values(CARD_NO_SEQ.nextval,#{card_number},#{card_name},#{card_type},#{members_no})
	</insert>
*/
}
