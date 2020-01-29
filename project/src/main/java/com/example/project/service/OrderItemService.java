package com.example.project.service;

import java.util.List;

import com.example.project.domain.OrderItem;
import com.example.project.repository.OrderItemRepository;

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