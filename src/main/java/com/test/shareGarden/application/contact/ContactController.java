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

    @GetMapping("/contact/{userId}")
    @Operation(summary = "Display to user profile user personal data by userId")
    public ContactInfo findContactDetail(@PathVariable Integer userId) {
        return userService.findContactDetail(userId);
    }

    @GetMapping("/locations/{contactId}")
    @Operation(summary = "Display user locations by contactId")
    public List<LocationResponse> findContactLocations(@PathVariable Integer contactId) {
        return userService.findContactLocations(contactId);
    }

    @PostMapping("/address")
    @Operation(summary = "Add address.")
    public void addAddress(@RequestBody LocationRequest request) {
        userService.addAddress(request);
    }

    @PatchMapping("/contact")
    @Operation(summary = "Add/update user firstname, lastname or phone number by contactId")
    public void updateContactDetail(@RequestBody ContactRequest request) {
        userService.updateContactDetail(request);
    }

    @PatchMapping("/address")
    @Operation(summary = "Add/update user address and regionId by locationId")
    public void updateContactAddress(@RequestBody LocationResponse request) {
        userService.updateContactAddress(request);
    }
}
