/**
 * 
 */
package com.vti.db;

import java.nio.channels.SeekableByteChannel;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.vti.dao.Student;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: Jun 2, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: Jun 2, 2020
 */

public class HibernateConection {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
			Map settings = new HashMap<>();
			settings.put("hibernate.connection.driver.class", "com.mysql.cj.jdbc.Driver");
			settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/BaiTap2");
			settings.put("hibernate.connection.username", "root");
			settings.put("hibernate.connection.password", "root");
			settings.put("hibernate.show_sql", "true");
			settings.put("hibernate.hbm2ddl.auto", "update");

			registryBuilder.applySettings(settings);
			registry = registryBuilder.build();

			MetadataSources sources = new MetadataSources(registry).addAnnotatedClass(Student.class).addAnnotatedClass(Employee.class);

			Metadata metadata = sources.getMetadataBuilder().build();

			sessionFactory = metadata.getSessionFactoryBuilder().build();

			if (registry == null) {
				StandardServiceRegistryBuilder.destroy(registry);
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
