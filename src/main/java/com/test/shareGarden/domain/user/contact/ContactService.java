package com.test.shareGarden.domain.user.contact;

import com.test.shareGarden.application.login.RegisterRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContactService {
    @Resource
    private ContactMapper contactMapper;

    @Resource
    private ContactRepository contactRepository;

    public Contact registerRequestToContact(RegisterRequest request) {
        // Loon uue muutuja "contact" ja teen vajaliku mäpingu RegisterRequest Dto requesti ja cantact Entity vahel.
        Contact contact = contactMapper.registerRequestToContact(request);
        // Salvestan uued "contact" andmed Database-i
        contactRepository.save(contact);
        // Tagastan "contact" andmed LoginService-sse.
        return contact;
    }
}
