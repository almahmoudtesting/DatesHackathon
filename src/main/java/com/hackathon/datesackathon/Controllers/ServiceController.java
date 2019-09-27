package com.hackathon.datesackathon.Controllers;

import com.hackathon.datesackathon.Models.Service;
import com.hackathon.datesackathon.Services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/Services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<Service> getAllServices(){return  serviceService.findServices();}

    @PostMapping
    public ResponseEntity create(@RequestBody Service service){
        return ResponseEntity.ok(serviceService.addService(service));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Service>> findById(@PathVariable Long id){
        return ResponseEntity.ok(serviceService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        serviceService.deleteById(id);
    }
}
