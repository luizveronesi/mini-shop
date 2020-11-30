package iteris.minishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iteris.minishop.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {    
}