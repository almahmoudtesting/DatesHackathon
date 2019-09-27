package com.hackathon.datesackathon.Services;

import com.hackathon.datesackathon.Models.Request;
import com.hackathon.datesackathon.Repo.RequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepo requestRepo;

    public List<Request> findRequests(){return requestRepo.findAll();}

    public Request addRequest(Request request){return requestRepo.save(request);}

    public Optional<Request> findById(Long id){ return requestRepo.findById(id);}

    public void deleteById(Long id){requestRepo.deleteById(id);}
}
