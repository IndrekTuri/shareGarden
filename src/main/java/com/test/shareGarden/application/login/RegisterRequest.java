package com.test.shareGarden.application.login;

import com.test.shareGarden.domain.user.contact.Contact;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link Contact} entity
 */
@Data
public class RegisterRequest implements Serializable {
    @Size(max = 255)
    @NotNull
    private String userName;
    @Size(max = 255)
    @NotNull
    private String userPassword;
    @Size(max = 255)
    private String firstName;
    @Size(max = 255)
    private String lastName;
    @Size(max = 255)
    @NotNull
    private String email;
    @Size(max = 255)
    private String mobile;
}