package net.AirTransportationManagement.AirtransportManagement.controller;


import net.AirTransportationManagement.AirtransportManagement.entity.Passaenger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserManagement {

    @GetMapping("/all")
    List<Passaenger> getAllUsers();

    boolean createUserAccount(@RequestBody Passaenger myentry);

    @DeleteMapping("id/{myId}")
    boolean deleteUserAccount(@PathVariable Long myId);






}
