package com.test.shareGarden.domain.user.role;

import com.test.shareGarden.domain.user.role.Role;
import com.test.shareGarden.domain.user.role.RoleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;
    public Role getUserRole() {
        //Otsi roleId (2) järgi, mis on tavakasutaja ja võta repositorist.
        return roleRepository.findById(2).get();
    }
}
