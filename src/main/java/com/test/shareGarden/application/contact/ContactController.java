package com.test.shareGarden.application.contact;

import com.test.shareGarden.domain.user.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {
    @Resource
    private UserService userService;
    // TODO: 25.10.2022  display to userprofile contact personal data by userID

    @PostMapping("/contact/{userId}")
    @Operation(summary = "Display to user profile user personal data by userId")
    public ContactInfo findContactDetail(@PathVariable Integer userId) {
        return userService.findContactDetail(userId);
    }

    // TODO: 25.10.2022  display location data by contactId
    @PostMapping("/locations/{contactId}")
    @Operation(summary = "Display user locations by contactId")
    public List<LocationResponse> findContactLocations(@PathVariable Integer contactId) {
        return userService.findContactLocations(contactId);
    }




    // TODO: 25.10.2022  add to userprofile contact address data by userID
    // TODO: 25.10.2022  display to userprofile firstName, lastname and phone number
    // TODO: 25.10.2022  add/change user address and regionId by locationId


}
