/**
 * 
 */
package net.codejava.customer;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: Jun 3, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: Jun 3, 2020
 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	@Query(value="SELECT c FROM Customer c WHERE c.name LIKE '%' || :keyword || '%' "
			+ "OR  c.email LIKE '%' || :keyword || '%' "
			+ "OR c.address LIKE '%' || :keyword || '%' ")
	public List<Customer> search(@Param("keyword") String keyword);
}
