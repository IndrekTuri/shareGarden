package com.test.shareGarden.application.dropdown;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.test.shareGarden.domain.user.region.Region} entity
 */
@Data
public class RegionDto implements Serializable {
    private Integer regionId;
    private String name;
}