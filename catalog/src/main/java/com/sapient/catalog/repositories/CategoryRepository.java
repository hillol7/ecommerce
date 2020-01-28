package com.sapient.catalog.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sapient.catalog.models.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
