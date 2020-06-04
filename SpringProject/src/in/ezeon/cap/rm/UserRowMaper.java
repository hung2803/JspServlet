/**
 * 
 */
package in.ezeon.cap.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

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

public class UserRowMaper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int i) throws SQLException {
		User u = new User();
		u.setUserId(rs.getInt("userId"));
		u.setName(rs.getString("name"));
		u.setPhone(rs.getString("phone"));
		u.setEmail(rs.getString("email"));
		u.setAddress(rs.getString("address"));
		u.setLoginName(rs.getString("loginName"));
		u.setRole(rs.getInt("role"));
		u.setLoginStatus(rs.getInt("loginStatus"));
		return u;
	}

}
