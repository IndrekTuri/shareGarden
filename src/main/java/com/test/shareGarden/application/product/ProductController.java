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

//    // TODO: 12.10.2022 findByCategoryId
//    // TODO: 12.10.2022 findByUserId
//    // TODO: 12.10.2022 findByBuyerId
//    // TODO: 12.10.2022 findByRegionId
//    // TODO: 12.10.2022 findByKeyword
}
