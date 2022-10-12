package com.test.shareGarden.application.product;

import com.test.shareGarden.domain.product.Product;
import com.test.shareGarden.domain.product.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
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
        return productMapper.productsToProductInfos(products);
    }
}
