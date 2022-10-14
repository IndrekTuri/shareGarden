package com.test.shareGarden.application.product;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private BusinessService businessService;


    @GetMapping("/all")
    @Operation(summary = "Find all products")
    public List<ProductInfo> findAllProducts() {
        return businessService.findAllProducts();
    }

    @GetMapping("/recent")
    @Operation(summary = "Find 5 recently added products")
    public List<ProductInfo> findRecentProducts() {
        return businessService.findRecentProducts();
    }

    @GetMapping("/category")
    @Operation(summary = "Find products by categoryId")
    public List<ProductInfo> findProductsByCategory(Integer categoryId) {
        return businessService.findProductsByCategory(categoryId);
    }

    @GetMapping("/region")
    @Operation(summary = "Find products by regionId ")
    public List<ProductInfo> findProductsByRegion(Integer regionId) {
        return businessService.findProductsByRegion(regionId);
    }

    @GetMapping("/user")
    @Operation(summary = "Find products by userId")
    public List<ProductInfo> findProductByUser(Integer userId) {
        return businessService.findProductByUser(userId);
    }

//    @GetMapping("/buyer")
//    @Operation(summary = "Find products by buyerId")
//    public List<ProductInfo> findProductByBuyer(Integer buyerId) {
//        return businessService.findProductByBuyer(buyerId);
//    }


//     TODO: 12.10.2022 findByKeyword
//     TODO: 12.10.2022 findByBuyerId

    @GetMapping("/keyword")
    @Operation(summary = "Find product by keyword")
    public List<ProductInfo> findProductByKeyword(String keyword) {
        return businessService.findProductByKeyword(keyword);

    }
}
