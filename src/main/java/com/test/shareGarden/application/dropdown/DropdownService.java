package com.test.shareGarden.application.dropdown;

import com.test.shareGarden.domain.product.category.CategoryService;
import com.test.shareGarden.domain.product.measureUnit.MeasureUnitService;
import com.test.shareGarden.domain.user.region.RegionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DropdownService {

    @Resource
    private CategoryService categoryService;

    @Resource
    private RegionService regionService;

    @Resource
    private MeasureUnitService measureUnitService;



    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }

    public List<RegionDto> getAllRegions() {
        return regionService.getAllRegions();
    }

    public List<MeasureUnitDto> getAllMeasureUnits() {
        return measureUnitService.getAllMeasureUnits();

    }
}
