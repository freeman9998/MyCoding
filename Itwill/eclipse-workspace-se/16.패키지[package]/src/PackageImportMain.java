import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;

/*
<< The import com.itwill.shop.admin.Member collides with another import statement>>
import com.itwill.shop.admin.Member;
*/

public class PackageImportMain {

	public static void main(String[] args) {
		Member m1=new Member();
		System.out.println(m1);
		
		/*
		 * 자동 import 단축키
		 * ctrl + shift + o
		 */
		MemberService ms=new MemberService();
		System.out.println(ms);
		
		
		com.itwill.shop.admin.Member am1=new com.itwill.shop.admin.Member();
		System.out.println(am1);
		
		/*
		 * ctrl + space -->클래스리스트--> 클래스선택--> import구문추가
		 */
		ShopService shopService=new ShopService();
		System.out.println(shopService);
		
		Order order=new Order();
		System.out.println(order);
		OrderService orderService=new OrderService();
		System.out.println(orderService);
		
		Product product=new Product();
		System.out.println(product);
		ProductService productService=new ProductService();
		System.out.println(productService);
		
		com.itwill.shop.admin.Product adminProduct=new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		

	}

}















