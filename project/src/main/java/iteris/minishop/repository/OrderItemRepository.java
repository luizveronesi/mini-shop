package iteris.minishop.repository;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iteris.minishop.domain.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {    

    @Transactional
    void removeByOrder(Integer orderId);

    Page<OrderItem> findByQuantity(Integer quantity, Pageable pageable);
}