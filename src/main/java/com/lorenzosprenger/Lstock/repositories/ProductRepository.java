package com.lorenzosprenger.Lstock.repositories;

import com.lorenzosprenger.Lstock.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
