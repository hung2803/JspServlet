/**
 * 
 */
package in.ezeon.cap.test.userservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.cap.config.SpringRootConfig;
import in.ezeon.cap.domain.User;
import in.ezeon.cap.service.UserService;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: May 28, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: May 28, 2020
 */

public class TestUserServiceRegister {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserService userService = ctx.getBean(UserService.class);

		User u = new User();
		u.setName("Hưdasdng");
		u.setPhone("43adasds7634");
		u.setEmail("asdasdfdsd@gmail.com");
		u.setAddress("adasNội");
		u.setLoginName("lodasdn");
		u.setPassword("123fdsf456");
		u.setRole(UserService.ROLE_ADMIN);
		u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);
		userService.register(u); 
		System.out.println("-----Register Success--------");
	}
}
