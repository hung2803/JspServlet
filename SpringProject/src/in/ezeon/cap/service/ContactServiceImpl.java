/**
 * 
 */
package in.ezeon.cap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ezeon.cap.dao.BaseDAO;
import in.ezeon.cap.dao.IContactDAO;
import in.ezeon.cap.domain.Contact;
import in.ezeon.cap.rm.ContactRowMaper;
import in.ezeon.cap.util.StringUtil;

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
public class ContactServiceImpl extends BaseDAO implements IContactService {
	@Autowired
	private IContactDAO contactDAO;

	public void save(Contact c) {
		contactDAO.save(c);

	}

	public void update(Contact c) {
		contactDAO.update(c);

	}

	public void delete(Integer id) {
		contactDAO.delete(id);
	}

	public void delete(Integer[] ids) {
		String id = StringUtil.toCommaSeparatedString(ids);
		String sql = "DELETE FROM contact WHERE contactId IN(" + id + ")";
		getJdbcTemplate().update(sql);
	}

	public List<Contact> findUserContact(Integer userId) {
		return contactDAO.findByProperty("userId", userId);

	}

	public List<Contact> findUserContact(Integer userId, String txt) {
		String sql = "SELECT  userId, name, phone, email, address, remark" + " FROM contact"
				+ " WHERE userId=? AND (name LIKE '%" + txt + "%' OR address LIKE '%" + txt + "%' "
				+ " OR phone LIKE '%" + txt + "%' OR email LIKE '%" + txt + "%' OR remark LIKE '%" + txt + "%') ";
		return getJdbcTemplate().query(sql, new ContactRowMaper(), userId);
	}

}
