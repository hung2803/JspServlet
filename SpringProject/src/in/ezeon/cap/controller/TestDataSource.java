/**
 * 
 */
package in.ezeon.cap.controller;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ezeon.cap.config.SpringRootConfig;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: May 27, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: May 27, 2020
 */

public class TestDataSource {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		DataSource ds = ctx.getBean(DataSource.class);
		JdbcTemplate jt = new JdbcTemplate(ds);
		String sql = "INSERT INTO user(name,phone,email,address,loginName,password) VALUES(?,?,?,?,?,?)";
		Object[] param = new Object[] { "Nguyễn Thành Hưng", "0338663219", "hungnt@gmail.com", "nam định", "adsadasc",
				"123456" };
		jt.update(sql, param);
		System.out.println("Mysql");
	}
}
