package com.sapient.catalog.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sapient.catalog.models.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
