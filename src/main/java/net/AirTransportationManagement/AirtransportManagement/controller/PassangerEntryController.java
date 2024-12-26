package net.AirTransportationManagement.AirtransportManagement.controller;

import net.AirTransportationManagement.AirtransportManagement.entity.Passaenger;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/create")
public class PassangerEntryController implements UserManagement{


    private Map<Long, Passaenger> passangerEntries = new HashMap<>();

    @GetMapping("/all")
    @Override
    public List<Passaenger> getAllUsers() {
        return  new ArrayList<>(passangerEntries.values());
    }

    @PostMapping("passenger")
    @Override
    public boolean createUserAccount(@RequestBody Passaenger myentry) {
        passangerEntries.put(myentry.getUserId(),myentry);
        return true;
    }

    @Override
    public List<Passaenger> getAllUsers(Passaenger myentry) {
        return List.of();
    }

    @Override
    public boolean createUserAccount() {
        return false;
    }

    @Override
    public boolean deleteUserAccount() {
        return false;
    }

    @Override
    public boolean deactivateUserAccount() {
        return false;
    }
}
