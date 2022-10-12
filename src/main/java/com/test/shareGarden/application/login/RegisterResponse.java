package com.test.shareGarden.application.login;

import com.test.shareGarden.domain.user.User;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class RegisterResponse implements Serializable {
    private Integer userId;
    private Integer roleId;
}