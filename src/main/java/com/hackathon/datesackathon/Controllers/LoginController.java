package com.hackathon.datesackathon.Controllers;



import com.hackathon.datesackathon.Models.LoginBody;
import com.hackathon.datesackathon.Models.Users;
import com.hackathon.datesackathon.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping
@RestController
public class LoginController {

    @Autowired
    private UsersService userService;


    @PostMapping("/UserData")
    public ResponseEntity hello(@RequestBody LoginBody loginBody) {

        Users user = userService.findByUserName(loginBody.getUsername());

            Map<String, Object> map = new HashMap<>();
            map.put("userID", user.getId());
            return ResponseEntity.ok(map);
    }
}