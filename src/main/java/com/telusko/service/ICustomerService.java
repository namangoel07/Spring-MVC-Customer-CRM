package com.telusko.service;

import java.util.List;

import com.telusko.model.Customer;

public interface ICustomerService
{
 public List<Customer> getCustomerInfo();
 public void registerCustomer(Customer customer);
 public Customer fetchCxBYId(Integer id);
 public void deleteCxRecord(Integer id);
}
