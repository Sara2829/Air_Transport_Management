package net.AirTransportationManagement.AirtransportManagement.controller;

import net.AirTransportationManagement.AirtransportManagement.entity.Passaenger;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class PassangerEntryController implements UserManagement{


    private Map<Long, Passaenger> passangerEntries = new HashMap<>();

    @GetMapping("/all")
    @Override
    public List<Passaenger> getAllUsers() {
        return  new ArrayList<>(passangerEntries.values());
    }

    @PostMapping("/createpassenger")
    @Override
    public boolean createUserAccount(@RequestBody Passaenger myentry) {
        passangerEntries.put(myentry.getUserId(),myentry);
        return true;
    }



    @GetMapping("id/{myId}")
    public Passaenger getPassangerbyId(@PathVariable Long myId){

     return passangerEntries.get(myId);
    }


    @DeleteMapping("id/{myId}")
    @Override
    public boolean deleteUserAccount(@PathVariable Long myId) {

        passangerEntries.remove(myId);
        return true;

    }




}
