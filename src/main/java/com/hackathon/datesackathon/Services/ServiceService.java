package com.hackathon.datesackathon.Services;

import com.hackathon.datesackathon.Repo.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepo serviceRepo;

    public List<com.hackathon.datesackathon.Models.Service> findServices(){ return serviceRepo.findAll();}

    public com.hackathon.datesackathon.Models.Service addService(com.hackathon.datesackathon.Models.Service service){
        return serviceRepo.save(service);
    }

    public Optional<com.hackathon.datesackathon.Models.Service> findById(Long id){
        return serviceRepo.findById(id);
    }

    public void deleteById(Long id){ serviceRepo.deleteById(id);}
}
