package com.hackathon.datesackathon.Controllers;

import com.hackathon.datesackathon.Models.Request;
import com.hackathon.datesackathon.Services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/Request")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping
    public List<Request> getAllRequests(){return  requestService.findRequests();}

    @PostMapping
    public ResponseEntity create(@RequestBody Request request){
        return ResponseEntity.ok(requestService.addRequest(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Request>> findById(@PathVariable Long id){
        return ResponseEntity.ok(requestService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        requestService.deleteById(id);
    }
}
