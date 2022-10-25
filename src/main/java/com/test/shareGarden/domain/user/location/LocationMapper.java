package com.test.shareGarden.domain.user.location;

import com.test.shareGarden.application.contact.LocationRequest;
import com.test.shareGarden.application.contact.LocationResponse;
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

    @Mapping(source = "id", target = "locationId")
    @Mapping(source = "contact.id", target = "contactId")
    @Mapping(source = "region.id", target = "regionId")
    @Mapping(source = "name", target = "locationName")
    LocationResponse locationsToLocationResponse(Location locations);
    List<LocationResponse> locationsToLocationResponse(List<Location> locations);


    @Mapping(source = "contactId", target = "contact.id")
    @Mapping(source = "regionId", target = "region.id")
    @Mapping(source = "locationName", target = "name")
    Location locationRequestToLocation(LocationRequest request);
}
