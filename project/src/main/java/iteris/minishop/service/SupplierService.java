package iteris.minishop.service;

import java.util.List;

import iteris.minishop.domain.Supplier;
import iteris.minishop.repository.SupplierRepository;

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