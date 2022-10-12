package com.test.shareGarden.domain.user;

import com.test.shareGarden.domain.user.role.RoleService;
import com.test.shareGarden.application.login.RegisterRequest;
import com.test.shareGarden.domain.user.role.Role;
import com.test.shareGarden.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleService roleService;

    public User createAndAddNewUser(RegisterRequest request) {
        //Kontroll kas kasutaja on juba olemas (kasutaja nime järgi)
        boolean userExists = userRepository.existsByUserName(request.getUserName());
        ValidationService.validateUserNameExists(userExists, request.getUserName());

        User user = userMapper.registerRequestToUser(request);
        // Otsi roll database-st
        Role role = roleService.getUserRole();
        // Pane userile roll külge.
        user.setRole(role);
        // Salvesta uus kasutaja
        userRepository.save(user);
        // Tagasta kasutaja LoginService "user"
        return user;
    }

    public User getValidUser(String userName, String password) {
        //Kontrolin kõiki kasutajaid "userName" ja "passwordi" järgi andmebaasis. Kas on sellist olemas.
        Optional<User> user = userRepository.findByUserNameAndPassword(userName, password);
        //Kui ei ole või vale "userName" või "passwordi" tuleb error teade.
        ValidationService.validateUserExists(user);
        //Kui olemas tagastame LoginServicesse
        return user.get();
    }
}
