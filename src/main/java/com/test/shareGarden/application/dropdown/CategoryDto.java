package com.test.shareGarden.application.dropdown;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.test.shareGarden.domain.product.category.Category} entity
 */
@Data
public class CategoryDto implements Serializable {
    private Integer categoryId;
    private String name;
}