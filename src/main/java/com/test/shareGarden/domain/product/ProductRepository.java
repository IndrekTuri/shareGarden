package com.test.shareGarden.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where p.status = ?1 order by p.id DESC")
    List<Product> findAllProductStatus(String status);

    @Query("select p from Product p where p.category.id = ?1 and p.status = ?2 order by p.id DESC")
    List<Product> findByCategoryId(Integer categoryId, String status);

    @Query("select p from Product p where p.location.region.id = ?1 and p.status = ?2 order by p.id DESC")
    List<Product> findByRegionId(Integer regionId, String status);
    @Query("select p from Product p where p.sellerUser.id = ?1 order by p.id DESC")
    List<Product> findByUserId(Integer userId);
    @Query("select p from Product p where p.sellerUser.id = ?1 order by p.id DESC")
    List<Product> findByBuyerId(Integer buyerId);

}