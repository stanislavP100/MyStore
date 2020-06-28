package com.Stores.MyStore.Repositories;

import com.Stores.MyStore.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
