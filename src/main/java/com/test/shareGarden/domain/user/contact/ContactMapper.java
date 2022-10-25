package com.test.shareGarden.domain.user.contact;

import com.test.shareGarden.application.contact.ContactInfo;
import com.test.shareGarden.application.login.RegisterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.Optional;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")

public interface ContactMapper {


    Contact registerRequestToContact(RegisterRequest request);

    @Mapping(source = "id", target = "contactId")
    @Mapping(source = "user.id", target = "userId")
    ContactInfo contactToContactInfo(Contact contact);
}
