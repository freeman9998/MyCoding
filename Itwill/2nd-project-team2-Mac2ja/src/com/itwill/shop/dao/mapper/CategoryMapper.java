package com.itwill.shop.dao.mapper;

import java.util.List;

import com.itwill.shop.domain.Category;

public interface CategoryMapper {
	
	public Category findCategoryByno(Integer categoryNo);
	/*
	 * <select id="findCategoryByno" parameterType="int" resultMap="categoryResultMap">
		select * from category where categoty_no = #{categoryNo}
	</select>
	 */
	
	public List<Category> findCategoryAll();
	/*
	 * <select id="findCategoryAll" resultMap="categoryResultMap">
		select * from category
	</select>
	 */
	
	public int insertCategory(Category category);
	/*
	 * <insert id="insertCategory" parameterType="com.itwill.shop.domain.Category">
		insert into category(category_no, category_name) 
		values(#{categoryNo},#{categoryName});
	</insert>
	 */
	
	public int updateCategoryByNo(Category category);
	/*
	 * <update id="updateCategoryByNo" parameterType="com.itwill.shop.domain.Category">
		update category set category_name=#{categoryName} where category_no = #{categoryNo};
	</update>
	 */
	
	public int deleteCategoryByNo(Integer categoryNo);
	/*
	 * <delete id="deleteCategoryByNo" parameterType="int">
	  	delete from category where category_no=#{categoryNo};
	</delete>
	 */

}
