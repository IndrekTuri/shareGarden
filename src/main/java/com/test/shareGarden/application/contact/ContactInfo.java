package com.test.shareGarden.application.contact;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.test.shareGarden.domain.user.contact.Contact} entity
 */
@Data
public class ContactInfo implements Serializable {
    private Integer contactId;
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}