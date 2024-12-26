package net.AirTransportationManagement.AirtransportManagement.controller;

import net.AirTransportationManagement.AirtransportManagement.entity.Passaenger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
    public ResponseEntity<Passaenger> getPassangerbyId(@PathVariable Long myId){

        Optional<Passaenger> passaengerEntry = Optional.ofNullable(passangerEntries.get(myId));

        if(passaengerEntry.isPresent()){
            return new ResponseEntity<>(passangerEntries.get(myId), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping("id/{myId}")
    @Override
    public boolean deleteUserAccount(@PathVariable Long myId) {

        passangerEntries.remove(myId);
        return true;

    }




}
