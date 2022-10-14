package com.test.shareGarden.application.dropdown;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.test.shareGarden.domain.user.location.Location} entity
 */
@Data
public class LocationDto implements Serializable {
    private Integer id;
    private Integer contactId;
    private String locationName;
}