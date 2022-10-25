package com.test.shareGarden.application.contact;

import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.test.shareGarden.domain.user.contact.Contact} entity
 */
@Data
public class ContactRequest implements Serializable {
    private Integer contactId;
    private String firstName;
    private String lastName;
    private String mobile;
}