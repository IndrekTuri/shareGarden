package com.test.shareGarden.application.dropdown;

import com.test.shareGarden.domain.product.measureUnit.MeasureUnit;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link MeasureUnit} entity
 */
@Data
public class MeasureUnitDto implements Serializable {
    private Integer id;
    private String unitName;
}