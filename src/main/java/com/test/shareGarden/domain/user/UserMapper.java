package com.test.shareGarden.domain.user;

import com.test.shareGarden.application.login.LogInResponse;
import com.test.shareGarden.application.login.RegisterRequest;
import com.test.shareGarden.application.login.RegisterResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper (unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

@Mapping(source = "userName", target = "userName")
@Mapping(source = "userPassword", target = "password")
    User registerRequestToUser(RegisterRequest request);

@Mapping(source = "id", target = "userId")
@Mapping(source = "role.id", target = "roleId")
RegisterResponse userToRegisterResponse(User user);

@Mapping(source = "id", target = "userId")
@Mapping(source = "role.id", target = "roleId")
    LogInResponse userToLogInResponse(User user);
}
