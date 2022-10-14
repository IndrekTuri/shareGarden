package com.test.shareGarden.domain.user.location;

import com.test.shareGarden.application.dropdown.LocationDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LocationService {

    @Resource
    private LocationRepository locationRepository;

    @Resource
    private LocationMapper locationMapper;

    public List<LocationDto> getAllLocationsByUserId(Integer userId) {
        List<Location> locations = locationRepository.findAllBy(userId);
        return locationMapper.locationsToLocationDtos(locations);
    }
}
