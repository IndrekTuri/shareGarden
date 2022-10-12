package com.test.shareGarden.domain.user.contact;

import com.test.shareGarden.application.login.RegisterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper (unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")

public interface ContactMapper {


    Contact registerRequestToContact(RegisterRequest request);
}
