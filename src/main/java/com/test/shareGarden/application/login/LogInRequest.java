package com.test.shareGarden.application.login;

import com.test.shareGarden.domain.user.User;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class LogInRequest implements Serializable {
    @Size(max = 255)
    @NotNull
    private String userName;
    @Size(max = 255)
    @NotNull
    private String password;
}