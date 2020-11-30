package iteris.minishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iteris.minishop.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {    
}