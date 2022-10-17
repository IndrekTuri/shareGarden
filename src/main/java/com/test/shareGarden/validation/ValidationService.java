package com.test.shareGarden.validation;

import com.test.shareGarden.domain.product.Product;
import com.test.shareGarden.domain.user.User;
import com.test.shareGarden.infrastructure.exception.BusinessException;
import com.test.shareGarden.infrastructure.exception.DataNotFoundException;

import java.util.List;
import java.util.Optional;

public class ValidationService {

    public static final String INCORRECT_REGISTER_DETAILS = "Kasutajanimi on hõivatud";
    public static final String INCORRECT_LOGIN_DETAILS = "Kasutajanimi või parool on vale";
    public static final String PRODUCTS_NOT_EXISTS = "Tooteid ei ole";


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

    public static void validateProductsExist(List<Product> products) {
        if (products.isEmpty()) {
            throw new DataNotFoundException(PRODUCTS_NOT_EXISTS, "Vabandame, kahjuks ei leitud ühtegi toodet");
        }
    }
}
