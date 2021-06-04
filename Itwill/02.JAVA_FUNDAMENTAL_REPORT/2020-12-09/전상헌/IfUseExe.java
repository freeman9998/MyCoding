
public class IfUseExe {

	public static void main(String[] args) {
		/*
		 * À±³â¿©ºÎÃâ·Â Æò³â (1900, 2100, 2200, 2300, 2500)
		 */
		int year = 2020;
		if (((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.printf("%d ´Â À±³â\n", year);
		} else {
			System.out.printf("%d ´Â Æò³â\n", year);
		}
		/*
		 * ¹®ÀÚÆÇ´Ü 
		 *  1.ÇÑ±Û¿©ºÎ 
		 *  2.¾ËÆÄºª´ë¹®ÀÚ 
		 *  3.¼Ò¹®ÀÚ 
		 *  4.¼ýÀÚÇüÅÂÀÇ¹®ÀÚ
		 */
		
		
		
		
		
		char c = 'B';
		if (c>='°¡' && c<='ÆR') {
			System.out.printf("%c ´Â ÇÑ±ÛÀÔ´Ï´Ù. %n",c);
		}

		if (c>='A' && c<='Z') {
			System.out.printf("%c ´Â ¾ËÆÄºª ´ë¹®ÀÚÀÔ´Ï´Ù. %n",c);
		}
		if (c>='a' && c<='z') {
			System.out.printf("%c ´Â ¾ËÆÄºª ¼Ò¹®ÀÚÀÔ´Ï´Ù. %n",c);
		}
		if (c>='0' && c<='9') {
			System.out.printf("%c ´Â ¼ýÀÚÇü ¹®ÀÚÀÔ´Ï´Ù.",c);
		}

		/*
		 * ´ÙÀ½¹®ÀÚ´Â ¾ÆÀÌµðÀÇ Ã¹±ÛÀÚÀÔ´Ï´Ù. 
		 * ÀÌ¹®ÀÚ°¡ ¾ÆÀÌµðÀÇ Ã¹±ÛÀÚ·Î À¯È¿ÇÑÁöÆÇ´ÜÈÄÃâ·ÂÇÏ¼¼¿ä 
		 *  - ¾ÆÀÌµðÀÇÃ¹±ÛÀÚ´Â ¾ËÆÄºª´ë¹®ÀÚ ÀÌ°Å³ª ¼Ò¹®ÀÚÀÌ´Ù
		 */

		char idFirstLetter = '°¨';

		if ((idFirstLetter>='a' && idFirstLetter <='z') || (idFirstLetter>='A'&& idFirstLetter<='Z')) {
			System.out.println("¾ÆÀÌµð·Î ÀûÇÕ");
		} else {
			System.out.println("¾ÆÀÌµð·Î ºÎÀûÇÕ");

		}
	}

}