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
    @GetMapping("/contact/{userId}")
    @Operation(summary = "Display to user profile user personal data by userId")
    public ContactInfo findContactDetail(@PathVariable Integer userId) {
        return userService.findContactDetail(userId);
    }

    // TODO: 25.10.2022  display location data by contactId
    @GetMapping("/locations/{contactId}")
    @Operation(summary = "Display user locations by contactId")
    public List<LocationResponse> findContactLocations(@PathVariable Integer contactId) {
        return userService.findContactLocations(contactId);
    }

    // TODO: 25.10.2022  add address information to contactId and regionId
    @PostMapping("/address")
    @Operation(summary = "Add address.")
    public void addAddress(@RequestBody LocationRequest request) {
        userService.addAddress(request);
    }

    // TODO: 25.10.2022  update userprofile firstName, lastname and phone number
    @PatchMapping("/contact")
    @Operation(summary = "Add/update user firstname, lastname or phone number by contactId")
    public void updateContactDetail(@RequestBody ContactRequest request) {
        userService.updateContactDetail(request);
    }


    // TODO: 25.10.2022  update user address and regionId by locationId
    @PatchMapping("/address")
    @Operation(summary = "Add/update user address and regionId by locationId")
    public void updateContactAddress(@RequestBody LocationResponse request) {
        userService.updateContactAddress(request);
    }
}
