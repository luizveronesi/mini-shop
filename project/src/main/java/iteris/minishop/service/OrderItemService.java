package iteris.minishop.service;

import java.util.List;

import iteris.minishop.domain.OrderItem;
import iteris.minishop.repository.OrderItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> list() {
        return orderItemRepository.findAll();
    }
}