package com.itwill04.array;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember[] bm= {
		new BookMember(1,"KIM", "010-5161-5555"),
		new BookMember(2, "LEE", "010-5161-5552"),
		new BookMember(3, "LIE", "010-1261-4445"),
		new BookMember(4, "HEE", "010-6751-5885")
		};
				
		/*
		 * 책객체들생성
		 */
		Book[] book= {
		new Book(46372, "책제목1", "문학", "좋은책1"),
		new Book(46372, "책제목2", "문학", "좋은책2"),
		new Book(46373, "책제목3", "문학", "좋은책3"),
		new Book(46374, "책제목4", "문학", "좋은책4")
		};
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		
		//각각회원들이 빌린책들 배열로 표현 
		Book[] bm0Borrow= {book[1],book[2],book[3]};
		Book[] bm1Borrow= {book[1],book[3]};
		Book[] bm2Borrow= {book[2]};
		//안빌린회원을 위해 하나 빼봄
		//Book[] bm3Borrow= {book[3]};
		
		bm[0].setBooks(bm0Borrow);
		bm[1].setBooks(bm1Borrow);
		bm[2].setBooks(bm2Borrow);
		//bm[3].setBooks(bm3Borrow);
		
		
	
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		
		for (int i = 0; i < bm.length; i++) {
			bm[i].print();
		}
		
		
		
	}
}