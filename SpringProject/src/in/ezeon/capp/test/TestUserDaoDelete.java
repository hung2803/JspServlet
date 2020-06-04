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

public class TestUserDaoDelete {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		IUserDAO userDAO = ctx.getBean(IUserDAO.class);
		userDAO.delete(1);
		System.out.println("---------Delete success---------");
	}
}
