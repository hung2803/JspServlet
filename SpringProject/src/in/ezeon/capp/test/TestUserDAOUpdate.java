/**
 * 
 */
package in.ezeon.capp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ezeon.cap.config.SpringRootConfig;
import in.ezeon.cap.dao.IUserDAO;
import in.ezeon.cap.domain.User;

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

public class TestUserDAOUpdate {

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NTHung
	 * @create_date: May 28, 2020
	 * @version: 1.0
	 * @modifer: NTHung
	 * @modifer_date: May 28, 2020
	 * @param args
	 */

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		IUserDAO userDAO = ctx.getBean(IUserDAO.class);
		User u = new User();

		u.setName("Nguyễn");
		u.setPhone("0122237634");
		u.setEmail("a432sd@gmail.com");
		u.setAddress("Hà Nội");
		u.setPassword("123456");
		u.setRole(1);
		u.setLoginStatus(1);
		u.setUserId(1);
		userDAO.update(u);
		System.out.println("-----Update Success--------");
	}

}
