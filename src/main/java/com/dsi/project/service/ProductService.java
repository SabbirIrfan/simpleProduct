package com.dsi.project.service;


import com.dsi.project.model.User;
import com.dsi.project.repository.ProductRepository;
import com.dsi.project.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
//    public ProductDao getProductDao();
    public Product getProductById(int id);
    public List<Product> getProductByUser(User user);
    public void setProductDao(ProductRepository productRepository);

    public void saveProduct(Product product);
    public List<Product> getAllProduct();
    public List<Product> getAllAvailableProduct();
}
