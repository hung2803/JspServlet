/**
 * 
 */
package com.demo.hba.test;

import java.util.List;

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

public class GetAll {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create a student object

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("get all the student...");
			List<Student> stduent = session.createQuery("FROM Student WHERE id > 5 " ).list();

			// commit transaction
			session.getTransaction().commit();
			for (Student student1 : stduent) {
				System.out.println("id" + " " + student1.getId());
				System.out.println("firstName" + " " + student1.getFirstName());
				System.out.println("lastName" + " " + student1.getLastName());
				System.out.println("email" + " " + student1.getEmail());
				System.out.println("\n");
			}
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}
}