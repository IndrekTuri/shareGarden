package com.test.shareGarden.application.dropdown;

import com.test.shareGarden.domain.product.category.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DropdownService {

    @Resource
    private CategoryService categoryService;
    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
