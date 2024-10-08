package com.dsi.project.repository;

import com.dsi.project.model.Product;
import com.dsi.project.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

     List<Product> findByUser(User user);
    @Query("SELECT p FROM Product p WHERE p.status <> 0 AND p.status <> 2 ORDER BY p.id DESC")
    Page<Product> findAllAvailableProducts(Pageable pageable);


    @Query("SELECT p FROM Product p WHERE (p.brandName LIKE %:query% OR p.productModel LIKE %:query%) AND p.status <> 0 AND p.status <> 2 ORDER BY p.id DESC")
    Page<Product> findSearchedProducts(Pageable pageable, @Param("query") String query);

    @Query("SELECT p FROM Product p WHERE p.seller.id = :sellerId ORDER BY p.id DESC")
    Page<Product> getProductsBySeller(Pageable pageable, @Param("sellerId") Integer sellerId);

}
