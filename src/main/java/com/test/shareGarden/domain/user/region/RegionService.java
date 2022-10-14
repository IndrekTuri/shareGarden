package com.test.shareGarden.domain.user.region;

import com.test.shareGarden.application.dropdown.RegionDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RegionService {

    @Resource
    private RegionRepository regionRepository;

    @Resource
    private RegionMapper regionMapper;

    public List<RegionDto> getAllRegions() {
        List<Region> regions = regionRepository.findAll();
        return regionMapper.regionsToRegionDtos(regions);
    }
}

