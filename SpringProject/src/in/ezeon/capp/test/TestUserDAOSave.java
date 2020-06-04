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

public class TestUserDAOSave {

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
		u.setName("Hưng");
		u.setPhone("4324567634");
		u.setEmail("asd@gmail.com");
		u.setAddress("Hà Nội");
		u.setLoginName("login");
		u.setPassword("123456");
		u.setRole(1);
		u.setLoginStatus(1);
		userDAO.save(u);
		System.out.println("-----Save Success--------");
	}

}
