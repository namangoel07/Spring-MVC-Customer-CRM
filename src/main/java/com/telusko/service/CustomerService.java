package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Customer;
import com.telusko.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;
	@Override
	public List<Customer> getCustomerInfo() {
	
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) {
	    
		repo.save(customer);

	}

	@Override
	public Customer fetchCxBYId(Integer id) {
		Optional<Customer> optional=repo.findById(id);
		
		return optional.get();
	}

	@Override
	public void deleteCxRecord(Integer id) {
		// TODO Auto-generated method stub
	repo.deleteById(id);
		
	}

}
