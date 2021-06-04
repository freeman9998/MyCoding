package com.itwill.shop.domain;

public class Card {
/*
 * 이름          널?       유형            
----------- -------- ------------- 
CARD_NO     NOT NULL NUMBER        
CARD_NUMBER          NUMBER(38)    
CARD_NAME            VARCHAR2(100) 
CARD_TYPE            NUMBER(10)    
MEMBERS_NO           NUMBER(10)
 */
	
		private int card_no;
		private String card_number;
		private String card_name;
		private int card_type;
		private int members_no;
		public Card() {
			// TODO Auto-generated constructor stub
		}
		public Card(int card_no,String	card_number,String card_name,int card_type,int members_no) {
			super();
			this.card_no=card_no;
			this.card_number=card_number;
			this.card_name=card_name;
			this.card_type=card_type;
			this.members_no=members_no;
			
		}
		
		public Card(String	card_number,String card_name,int card_type,int members_no) {
			super();
			this.card_number=card_number;
			this.card_name=card_name;
			this.card_type=card_type;
			this.members_no=members_no;
			
		}

		public int getCard_no() {
			return card_no;
		}

		
		

		public void setCard_no(int card_no) {
			this.card_no = card_no;
		}
		public String getCard_number() {
			return card_number;
		}
		public void setCard_number(String card_number) {
			this.card_number = card_number;
		}
		public String getCard_name() {
			return card_name;
		}

		public void setCard_name(String card_name) {
			this.card_name = card_name;
		}

		public int getCard_type() {
			return card_type;
		}

		public void setCard_type(int card_type) {
			this.card_type = card_type;
		}

		public int getMembers_no() {
			return members_no;
		}

		public void setMembers_no(int members_no) {
			this.members_no = members_no;
		}
		
		@Override
		public String toString() {
				return "Card [card_no=" + card_no + ", card_number=" + card_number + ", card_name="
				+ card_name + ", card_type=" + card_type + ", members_no=" + members_no + "]";
		}
	
	
	
}
