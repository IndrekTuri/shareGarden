package com.test.shareGarden.domain.user;

import com.test.shareGarden.application.contact.ContactInfo;
import com.test.shareGarden.application.contact.LocationRequest;
import com.test.shareGarden.application.contact.LocationResponse;
import com.test.shareGarden.domain.user.contact.Contact;
import com.test.shareGarden.domain.user.contact.ContactMapper;
import com.test.shareGarden.domain.user.contact.ContactRepository;
import com.test.shareGarden.domain.user.location.Location;
import com.test.shareGarden.domain.user.location.LocationMapper;
import com.test.shareGarden.domain.user.location.LocationRepository;
import com.test.shareGarden.domain.user.region.Region;
import com.test.shareGarden.domain.user.region.RegionRepository;
import com.test.shareGarden.domain.user.role.RoleService;
import com.test.shareGarden.application.login.RegisterRequest;
import com.test.shareGarden.domain.user.role.Role;
import com.test.shareGarden.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleService roleService;

    @Resource
    private ContactRepository contactRepository;

    @Resource
    private ContactMapper contactMapper;

    @Resource
    private LocationRepository locationRepository;

    @Resource
    private LocationMapper locationMapper;

    @Resource
    private RegionRepository regionRepository;

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

    public ContactInfo findContactDetail(Integer userId) {
        Contact contact = contactRepository.findByUserId(userId).get();
        return contactMapper.contactToContactInfo(contact);
    }

    public List<LocationResponse> findContactLocations(Integer contactId) {
        List<Location> locations = locationRepository.findContactLocationsById(contactId);
        return locationMapper.locationsToLocationResponse(locations);
    }


    public void addAddress(LocationRequest request) {
        Location location = locationMapper.locationRequestToLocation(request);
        Contact contact = contactRepository.findById(request.getContactId()).get();
        Region region = regionRepository.findById(request.getRegionId()).get();
        location.setContact(contact);
        location.setRegion(region);
        locationRepository.save(location);
    }
}
