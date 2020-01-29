package com.example.project.service;

import java.util.List;

import com.example.project.domain.Supplier;
import com.example.project.repository.SupplierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> list() {
        return supplierRepository.findAll();
    }
}