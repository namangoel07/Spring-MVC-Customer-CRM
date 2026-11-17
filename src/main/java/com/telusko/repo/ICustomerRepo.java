package com.telusko.repo;

import org.springframework.data.repository.CrudRepository;

import com.telusko.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
