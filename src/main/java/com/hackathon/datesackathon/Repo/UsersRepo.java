package com.hackathon.datesackathon.Repo;

import com.hackathon.datesackathon.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {

    Users findByUsername(String a);

}
