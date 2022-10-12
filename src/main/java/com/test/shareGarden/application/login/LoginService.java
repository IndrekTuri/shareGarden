package com.test.shareGarden.application.login;

import com.test.shareGarden.domain.user.contact.Contact;
import com.test.shareGarden.domain.user.User;
import com.test.shareGarden.domain.user.UserMapper;
import com.test.shareGarden.domain.user.UserService;
import com.test.shareGarden.domain.user.contact.ContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class LoginService {

    @Resource
    private UserService userService;

    @Resource
    private ContactService contactService;

    @Resource
    private UserMapper userMapper;

    @Transactional
    public RegisterResponse registerNewUser(RegisterRequest request) {
        // Uus muutuja "user". UserServices request päringuga kontrollime, kas kasutaja on olemas. Kui ei ole lisame rolli ja salvestame kasutaja.
        User user = userService.createAndAddNewUser(request);
        // Uus muutuja "contact". ContactServices request päringuga lisame kasutajale eesnime, perekonnanime, kasutajanime, mobiili, parooli, e-maili.
        Contact contact = contactService.registerRequestToContact(request);
        // Lisame userile kontaktandmed
        contact.setUser(user);
        // Tagastame RegisterResponsile registreeritud kasutaja roleId ja UserId
        return userMapper.userToRegisterResponse(user);
    }

    public LogInResponse logIn(LogInRequest request) {
        // Uus muutuja "user". UserServices controllin päringuga "userName" ja "passsword" kas kasutaja on olemas.
        User user = userService.getValidUser(request.getUserName(), request.getPassword());
        // Tagastame LogInResponsile registreeritud kasutaja roleId ja UserId
        return userMapper.userToLogInResponse(user);
    }
}
