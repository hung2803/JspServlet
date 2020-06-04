/**
 * 
 */
package in.ezeon.cap.service;

import java.util.List;

import in.ezeon.cap.domain.Contact;

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

public interface IContactService {
	public void save(Contact c);

	public void update(Contact c);

	public void delete(Integer id);

	public void delete(Integer[] ids);

	public List<Contact> findUserContact(Integer userId);

	public List<Contact> findUserContact(Integer userId, String txt);
}
