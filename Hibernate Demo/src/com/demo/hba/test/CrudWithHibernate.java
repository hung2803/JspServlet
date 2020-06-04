/**
 * 
 */
package com.demo.hba.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hba.entity.Student;

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

public class CrudWithHibernate {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create a student object
			System.out.println("Creating new student object...");
			Student testStudent = new Student("hung", "nguyễn", "hungnt@gmail.com.vn");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the student...");
			session.save(testStudent);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}
}
