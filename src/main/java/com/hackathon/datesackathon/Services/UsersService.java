package com.hackathon.datesackathon.Services;

import com.hackathon.datesackathon.Models.Users;
import com.hackathon.datesackathon.Repo.UsersRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepo usersRepo;

   public List<Users> findUsers(){
       return usersRepo.findAll();
   }
    public Users findByUserName(String a) {
        Users users = usersRepo.findByUsername(a);

        return users;
    }

    public Users addUser(Users user){
      return usersRepo.save(user);
    }

    public Optional<Users> findById(Long id){ return usersRepo.findById(id);}

    public void deleteById(Long id){  usersRepo.deleteById(id);}
}
