/**
 * 
 */
package in.ezeon.cap.dao;

import java.util.List;

import in.ezeon.cap.domain.Contact;
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

public interface IContactDAO {
	public void save(Contact entity);

	public void update(Contact entity);

	public void delete(Contact entity);

	public void delete(Integer id);

	public Contact findbyId(Integer id);

	public List<Contact> findAll();

	public List<Contact> findByProperty(String name, Object value);
}
