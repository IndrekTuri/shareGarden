package com.test.shareGarden.domain.user.location;

import com.test.shareGarden.application.dropdown.LocationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LocationMapper {


    @Mapping(source = "contact.id", target = "contactId")
    @Mapping(source = "name", target = "locationName")
    LocationDto locationToLocationDto(Location location);
    List<LocationDto> locationsToLocationDtos(List<Location> locations);
}
