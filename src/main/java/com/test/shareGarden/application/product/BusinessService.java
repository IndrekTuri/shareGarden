package com.test.shareGarden.application.product;

import com.test.shareGarden.domain.product.ProductService;
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

    public List<ProductInfo> findProductsByRegion(Integer regionId) {
        return productService.findProductsByRegion(regionId);
    }

    public List<ProductInfo> findProductByUser(Integer userId) {
        return productService.findProductByUser(userId);
    }

//    public List<ProductInfo> findProductByBuyer(Integer buyerId) {
//        return productService.findProductByBuyer(buyerId);
//    }

    public List<ProductInfo> findProductByKeyword(String keyword) {
        return productService.findProductByKeyword(keyword);
    }
}
