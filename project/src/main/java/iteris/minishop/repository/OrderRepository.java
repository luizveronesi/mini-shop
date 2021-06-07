package iteris.minishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iteris.minishop.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}