/**
 * 
 */
package in.ezeon.cap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ezeon.cap.dao.BaseDAO;
import in.ezeon.cap.dao.IUserDAO;
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
@Service
public class UserServiceImpl extends BaseDAO implements UserService {
	@Autowired
	private IUserDAO userDAO;

	public void register(User u) {
		userDAO.save(u);

	}

	public User login(String login, String passWord) throws UserBlockException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void changeLoginStatus(Integer userId, Integer loginStatus) {
		// TODO Auto-generated method stub

	}

}
