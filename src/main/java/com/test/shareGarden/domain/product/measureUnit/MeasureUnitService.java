package com.test.shareGarden.domain.product.measureUnit;

import com.test.shareGarden.application.dropdown.MeasureUnitDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MeasureUnitService {

    @Resource
    private MeasureUnitRepository measureUnitRepository;
    @Resource
    private MeasureUnitMapper measureUnitMapper;

    public List<MeasureUnitDto> getAllMeasureUnits() {
        List<MeasureUnit> measureUnits = measureUnitRepository.findAll();
        return measureUnitMapper.measureUnitsToMeasureUnitsDtos(measureUnits);
    }
}
