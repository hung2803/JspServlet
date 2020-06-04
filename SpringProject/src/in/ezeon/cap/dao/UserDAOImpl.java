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
import org.springframework.stereotype.Repository;

import in.ezeon.cap.domain.User;
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
@Repository
public class UserDAOImpl extends BaseDAO implements IUserDAO {

	public void save(User entity) {
		String sql = "INSERT INTO  user(name , phone ,email,address,loginName,password,role,loginStatus)"
				+ "VALUE (:name , :phone , :email, :address, :loginName, :password, :role, :loginStatus) ";
		Map m = new HashMap();
		m.put("name", entity.getName());
		m.put("phone", entity.getPhone());
		m.put("email", entity.getEmail());
		m.put("address", entity.getAddress());
		m.put("loginName", entity.getLoginName());
		m.put("password", entity.getPassword());
		m.put("role", entity.getRole());
		m.put("loginStatus", entity.getLoginStatus());

		KeyHolder kh = new GeneratedKeyHolder();
		SqlParameterSource ps = new MapSqlParameterSource(m);
		getNamedParameterJdbcTemplate().update(sql, ps, kh);
		Integer id = kh.getKey().intValue();
		entity.setUserId(id);
	}

	public void update(User entity) {
		String sql = "UPDATE user SET " + "name=:name, " + "phone=:phone," + "email=:email," + "address=:address,"
				+ "password=:password, " + "role=:role, " + "loginStatus=:loginStatus " + "WHERE userId=:userId";

		Map m = new HashMap();
		m.put("name", entity.getName());
		m.put("phone", entity.getPhone());
		m.put("email", entity.getEmail());
		m.put("address", entity.getAddress());
		m.put("password", entity.getPassword());
		m.put("role", entity.getRole());
		m.put("loginStatus", entity.getLoginStatus());
		m.put("userId", entity.getUserId());
		getNamedParameterJdbcTemplate().update(sql, m);
	}

	public void delete(User entity) {
		this.delete(entity.getUserId());

	}

	public void delete(Integer id) {
		String sql = "DELETE  FROM user WHERE userId=? ";
		getJdbcTemplate().update(sql, id);

	}

	public User findById(Integer id) {
		String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus"
				+ " FROM user WHERE userId=?";
		User u = getJdbcTemplate().queryForObject(sql, new UserRowMaper(), id);

		return u;
	}

	public List<User> findAll() {
		String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus" + " FROM user ";
		List<User> u = getJdbcTemplate().query(sql, new UserRowMaper());

		return u;
	}

	public List<User> findByProperty(String name, Object value) {
		String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus" + " FROM user "
				+ " WHERE " + name + " = ? ";
		List<User> u = getJdbcTemplate().query(sql, new UserRowMaper(), value);
		return u;
	}

}
