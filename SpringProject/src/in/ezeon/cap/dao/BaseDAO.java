/**
 * 
 */
package in.ezeon.cap.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

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

public class BaseDAO extends NamedParameterJdbcDaoSupport {
	@Autowired
	public void setDataSource2(DataSource ds) {
		super.setDataSource(ds);
	}

}
