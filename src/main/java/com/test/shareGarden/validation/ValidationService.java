package com.test.shareGarden.validation;

import com.test.shareGarden.domain.user.User;
import com.test.shareGarden.infrastructure.exception.BusinessException;

import java.util.Optional;

public class ValidationService {

    public static final String INCORRECT_REGISTER_DETAILS = "Kasutajanimi on hõivatud";
    public static final String INCORRECT_LOGIN_DETAILS = "Kasutajanimi või parool on vale";

    public static void validateUserNameExists(boolean userExists, String userName) {
        if (userExists) {
            throw new BusinessException(INCORRECT_REGISTER_DETAILS, "Kasutajanimi " + userName + " on juba kasutusel. Vali teine kasutajanimi");
        }
    }

    public static void validateUserExists(Optional<User> user) {
        if (user.isEmpty()) {
            throw new BusinessException(INCORRECT_LOGIN_DETAILS, "Proovi uuesti!");

        }
    }
}
