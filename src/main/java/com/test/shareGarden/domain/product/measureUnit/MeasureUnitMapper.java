package com.test.shareGarden.domain.product.measureUnit;

import com.test.shareGarden.application.dropdown.MeasureUnitDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface MeasureUnitMapper {

@Mapping(source = "unit", target = "unitName")
    MeasureUnitDto measureUnitToMeasureUnitsDto(MeasureUnit measureUnit);
    List<MeasureUnitDto> measureUnitsToMeasureUnitsDtos(List<MeasureUnit> measureUnits);
}
