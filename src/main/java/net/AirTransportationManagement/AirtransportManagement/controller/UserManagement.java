package net.AirTransportationManagement.AirtransportManagement.controller;


import net.AirTransportationManagement.AirtransportManagement.entity.Passaenger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserManagement {

    @GetMapping("/all")
    List<Passaenger> getAllUsers();

    boolean createUserAccount(@RequestBody Passaenger myentry);

    public List<Passaenger> getAllUsers(Passaenger myentry);

  public boolean  createUserAccount();

  public boolean deleteUserAccount();

  public boolean  deactivateUserAccount();


}
