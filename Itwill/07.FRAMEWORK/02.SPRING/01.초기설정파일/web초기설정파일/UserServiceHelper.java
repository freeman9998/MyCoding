package model1.kkh.user;
import javax.servlet.ServletContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/*
   <bean 	id="userService" 
			class="model1.kkh.user.UserServiceImpl"
			factory-method="instance">
 */

public class UserServiceHelper {
	private static final String USER_SERVICE_BEANID
	="userService";
	public static UserService getUserService(ServletContext ctx){
		WebApplicationContext wac = 
			WebApplicationContextUtils.getWebApplicationContext(ctx);
		return (UserService)wac.getBean(USER_SERVICE_BEANID);
	}
}
