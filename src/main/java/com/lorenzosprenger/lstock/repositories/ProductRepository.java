package com.lorenzosprenger.lstock.repositories;

import com.lorenzosprenger.lstock.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
