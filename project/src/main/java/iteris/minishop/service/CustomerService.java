package iteris.minishop.service;

import java.util.List;

import iteris.minishop.domain.Customer;
import iteris.minishop.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> list() {
        return customerRepository.findAll();
    }
}