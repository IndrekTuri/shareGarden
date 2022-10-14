package com.test.shareGarden.domain.user.region;

import com.test.shareGarden.application.dropdown.RegionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RegionMapper {

    @Mapping(source = "county", target = "regionName")
    RegionDto regionToRegionDto(Region region);
    List<RegionDto> regionsToRegionDtos(List<Region> regions);
}
