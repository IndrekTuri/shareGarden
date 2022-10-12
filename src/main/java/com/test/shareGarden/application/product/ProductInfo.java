package com.test.shareGarden.application.product;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.test.shareGarden.domain.product.Product} entity
 */
@Data
public class ProductInfo implements Serializable {
    private Integer productId;
    private Integer sellerUserId;
    private String regionName;
    private String address;
    private Integer categoryId;
    private String measureUnit;
    private String productName;
    private Integer quantity;
    private byte[] imageBase64;
    private Boolean isActive;
    private Integer productOrderId;
}