package iteris.minishop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import iteris.minishop.domain.Order;
import iteris.minishop.domain.OrderItem;
import iteris.minishop.repository.OrderItemRepository;
import iteris.minishop.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<Order> list() {
        return orderRepository.findAll();
    }

    public Page<Order> page(Integer start, Integer limit) {
        PageRequest request = PageRequest.of(start, limit);
        return orderRepository.findAll(request);
    }

    public void remove(Integer id) {
        PageRequest request = PageRequest.of(0, 5);
        Page<OrderItem> page = orderItemRepository.findAll(request);

        orderItemRepository.removeByOrder(id);
        orderRepository.deleteById(id);
    }
}