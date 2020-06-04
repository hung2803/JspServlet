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

public class ContactRowMaper implements RowMapper<Contact> {

	public Contact mapRow(ResultSet rs, int i) throws SQLException {

		Contact ct = new Contact();
		ct.setContactId(rs.getInt("contactId"));
		ct.setUserId(rs.getInt("userId"));
		ct.setName(rs.getString("name"));
		ct.setPhone(rs.getString("phone"));
		ct.setEmail(rs.getString("email"));
		ct.setAddress(rs.getString("address"));
		ct.setRemark(rs.getString("remark"));
		return ct;
	}
}
