package com.hackathon.datesackathon.Controllers;

import com.hackathon.datesackathon.Models.Users;
import com.hackathon.datesackathon.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/Users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<Users> getAllUsers(){return  usersService.findUsers();}

    @PostMapping
    public ResponseEntity create(@RequestBody Users users){
        return ResponseEntity.ok(usersService.addUser(users));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Users>> findById(@PathVariable Long id){
        return ResponseEntity.ok(usersService.findById(id));
    }
}
