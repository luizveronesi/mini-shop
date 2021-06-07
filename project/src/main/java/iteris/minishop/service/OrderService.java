package iteris.minishop.service;

import java.util.Date;
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

    public Order create() {
        Order order = new Order();
        order.setOrderDate(new Date());
        return orderRepository.save(order);
    }

    public Page<Order> page(Integer page, Integer size) {
        return orderRepository.findAll(PageRequest.of(page, size));
    }

    public void remove(Integer id) {
        PageRequest request = PageRequest.of(0, 5);
        Page<OrderItem> page = orderItemRepository.findAll(request);

        orderItemRepository.removeByOrder(id);
        orderRepository.deleteById(id);
    }
}