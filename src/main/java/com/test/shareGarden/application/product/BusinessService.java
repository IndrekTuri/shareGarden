package com.test.shareGarden.application.product;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessService {

    @Resource
    private ProductService productService;

    public List<ProductInfo> findRecentProducts() {
        return productService.findRecentProducts();
    }

    public List<ProductInfo> findAllProducts() {
        return productService.findAllProducts();
    }

    public List<ProductInfo> findProductsByCategory(Integer categoryId) {
        return productService.findProductsByCategory(categoryId);
    }
}
