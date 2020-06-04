/**
 * 
 */
package net.codejava.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public List<Customer> listAll() {
		return (List<Customer>) repository.findAll();
	}

	public void save(Customer customer) {
		repository.save(customer);
	}

	public Customer getById(long id) {
		Optional<Customer> result = repository.findById(id);
		return result.get();
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
	public List<Customer> search(String keyword){
		return repository.search(keyword);
	}
}
