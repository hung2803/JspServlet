package in.ezeon.cap.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This class is SpringRootConfig.
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: May 27, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: May 27, 2020
 */
@Configuration
// @ComponentScan(basePackages = { "in.ezeon" })
public class SpringRootConfig {
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/capp_db");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setMaxTotal(2);
		ds.setInitialSize(1);
		ds.setTestOnBorrow(true);
		ds.setValidationQuery("SELECT 1 ");
		ds.setDefaultAutoCommit(true);
		return ds;
	}
}
