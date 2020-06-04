/**
 * 
 */
package in.ezeon.cap.dao;

import java.util.List;

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

public interface IUserDAO {
	public void save(User entity);

	public void update(User entity);

	public void delete(User entity);

	public void delete(Integer id);

	public User findById(Integer id);

	public List<User> findAll();

	public List<User> findByProperty(String name, Object value);
}
