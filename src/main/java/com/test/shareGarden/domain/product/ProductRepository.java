package com.test.shareGarden.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where p.status = ?1 order by p.id DESC")
    List<Product> findAllProductStatus(String status);

    @Query("select p from Product p where p.category.id = ?1 and p.status = ?2 order by p.id DESC")
    List<Product> findByCategoryId(Integer categoryId, String status);

}