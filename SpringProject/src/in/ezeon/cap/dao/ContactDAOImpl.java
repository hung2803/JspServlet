/**
 * 
 */
package in.ezeon.cap.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import in.ezeon.cap.domain.Contact;
import in.ezeon.cap.domain.User;
import in.ezeon.cap.rm.ContactRowMaper;
import in.ezeon.cap.rm.UserRowMaper;

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

public class ContactDAOImpl extends BaseDAO implements IContactDAO {

	public void save(Contact entity) {
		String sql = "INSERT INTO  contact(userId, name , phone ,email, address, remark)"
				+ "VALUE (:userId, :name , :phone , :email, :address, :remark) ";
		Map m = new HashMap();
		m.put("userId", entity.getUserId());
		m.put("name", entity.getName());
		m.put("phone", entity.getPhone());
		m.put("email", entity.getEmail());
		m.put("address", entity.getAddress());
		m.put("remark", entity.getRemark());

		KeyHolder kh = new GeneratedKeyHolder();
		SqlParameterSource ps = new MapSqlParameterSource(m);
		getNamedParameterJdbcTemplate().update(sql, ps, kh);
		Integer id = kh.getKey().intValue();
		entity.setUserId(id);

	}

	public void update(Contact entity) {
		String sql = "UPDATE user SET " + "userId:userId," + "name=:name, " + "phone=:phone," + "email=:email,"
				+ "address=:address," + "remark=:remark " + "WHERE contactId=:contactId";
		Map m = new HashMap();
		m.put("userId", entity.getUserId());
		m.put("name", entity.getName());
		m.put("phone", entity.getPhone());
		m.put("email", entity.getEmail());
		m.put("address", entity.getAddress());
		m.put("remark", entity.getRemark());
		getNamedParameterJdbcTemplate().update(sql, m);

	}

	public void delete(Contact entity) {
		this.delete(entity.getUserId());
	}

	public void delete(Integer id) {
		String sql = "DELETE  FROM contact WHERE contactId=? ";
		getJdbcTemplate().update(sql, id);
	}

	public Contact findbyId(Integer id) {
		String sql = "SELECT userId, name, phone, email, address, remark" + " FROM contact WHERE contactId=?";
		Contact ct = getJdbcTemplate().queryForObject(sql, new ContactRowMaper(), id);

		return ct;
	}

	public List<Contact> findAll() {
		String sql = "SELECT  userId, name, phone, email, address, remark" + " FROM contact ";
		List<Contact> ct = getJdbcTemplate().query(sql, new ContactRowMaper());

		return ct;
	}

	public List<Contact> findByProperty(String name, Object value) {
		String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus" + " FROM user "
				+ " WHERE " + name + " = ? ";
		List<Contact> ct = getJdbcTemplate().query(sql, new ContactRowMaper(), value);
		return ct;
	}

}
