package com.test.shareGarden.application.contact;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.test.shareGarden.domain.user.location.Location} entity
 */
@Data
public class LocationRequest implements Serializable {
    private Integer contactId;
    private Integer regionId;
    private String locationName;
    private String address;
}