package com.test.shareGarden.domain.product;

import com.test.shareGarden.application.product.ProductInfo;
import com.test.shareGarden.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

import static com.test.shareGarden.application.Status.AVAILABLE;

@Service
public class ProductService {
    @Resource
    private ProductRepository productRepository;
    @Resource
    private ProductMapper productMapper;


    public List<ProductInfo> findRecentProducts() {
        List<Product> products = productRepository.findAllProductStatus(AVAILABLE);
        List<ProductInfo> productInfos = productMapper.productsToProductInfos(products);
        return productInfos.stream().limit(5).collect(Collectors.toList());
    }

    public List<ProductInfo> findAllProducts() {
        List<Product> products = productRepository.findAllProductStatus(AVAILABLE);
        return productMapper.productsToProductInfos(products);
    }

    public List<ProductInfo> findProductsByCategory(Integer categoryId) {
        List<Product> products = productRepository.findByCategoryId(categoryId, AVAILABLE);
        getValidProductsByCategoryId(categoryId);
        return productMapper.productsToProductInfos(products);
    }

    public List<ProductInfo> findProductsByRegion(Integer regionId) {
        List<Product> products = productRepository.findByRegionId(regionId, AVAILABLE);
        getValidProductsByRegionId(regionId);
        return productMapper.productsToProductInfos(products);
    }

    public List<ProductInfo> findProductByUser(Integer userId) {
        List<Product> products = productRepository.findByUserId(userId);
        return productMapper.productsToProductInfos(products);
    }

    public List<ProductInfo> findProductByKeyword(String keyword) {
        List<Product> products = productRepository.findByKeyword(keyword, AVAILABLE);
        getValidProductsByKeyword(keyword);
        return productMapper.productsToProductInfos(products);
    }

    public void getValidProductsByCategoryId(Integer categoryId) {
        List<Product> products = productRepository.findByCategoryId(categoryId,AVAILABLE);
        ValidationService.validateProductsExist(products);
    }

    public void getValidProductsByRegionId(Integer regionId) {
        List<Product> products = productRepository.findByRegionId(regionId, AVAILABLE);
        ValidationService.validateProductsExist(products);
    }

    public void getValidProductsByKeyword(String keyword) {
        List<Product> products = productRepository.findByKeyword(keyword, AVAILABLE);
        ValidationService.validateProductsExist(products);
    }
}

