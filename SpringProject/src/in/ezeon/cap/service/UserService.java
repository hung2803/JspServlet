/**
 * 
 */
package in.ezeon.cap.service;

import java.util.List;

import in.ezeon.cap.domain.User;
import in.ezeon.cap.exception.UserBlockException;

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

public interface UserService {
	public static final Integer LOGIN_STATUS_ACTIVE = 1;
	public static final Integer LOGIN_STATUS_BLOCK = 2;

	public static final Integer ROLE_ADMIN = 1;
	public static final Integer ROLE_USER = 2;

	public void register(User u);

	public User login(String login, String passWord) throws UserBlockException;

	public List<User> getUserList();

	public void changeLoginStatus(Integer userId, Integer loginStatus);
}
