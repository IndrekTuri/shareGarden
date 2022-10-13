package com.test.shareGarden.domain.product;

import com.test.shareGarden.application.product.ProductInfo;
import com.test.shareGarden.domain.product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.time.Instant;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", imports = Instant.class)
public interface ProductMapper {


    @Mapping(source = "id", target = "productId")
    @Mapping(source = "name", target = "productName")
//    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "measureUnit.unit", target = "measureUnit")
    @Mapping(source = "location.region.county", target = "regionName")
//    @Mapping(source = "imageBase64", target = "imageBase64", qualifiedByName = "byteArrayToString")
    @Mapping(ignore = true, target = "imageBase64")
    ProductInfo productsToProductInfos(Product product);

    List<ProductInfo> productsToProductInfos(List<Product> products);
}
