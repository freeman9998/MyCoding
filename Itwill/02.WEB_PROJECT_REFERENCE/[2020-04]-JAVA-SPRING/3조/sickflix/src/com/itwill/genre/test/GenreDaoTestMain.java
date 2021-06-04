package com.itwill.genre.test;

import java.util.Date;
import javax.sql.DataSource;

import com.itwill.genre.Genre;
import com.itwill.genre.GenreDAO;

public class GenreDaoTestMain {

	public static void main(String[] args) throws Exception {
		GenreDAO gDao = new GenreDAO(JavaSeDataSource.getDataSource());
		
		System.out.println("<<<<<<<<<< Genre >>>>>>>>>>");
		System.out.println("------ create ------");
		System.out.println(gDao.create(new Genre(4, "로맨스")));
		
		System.out.println("------ update ------");
		System.out.println(gDao.update(new Genre(4, "새드무비")));
		
		System.out.println("------ remove ------");
		System.out.println(gDao.remove(4));
		
		System.out.println("------ findGenre ------");
		System.out.println(gDao.findGenre(1));
		
		System.out.println("------ findGenreList ------");
		System.out.println(gDao.findGenreList());
		
		Date obj = new Date();           
		java.sql.Date sqlDate = new java.sql.Date(obj.getTime());
	}

}
