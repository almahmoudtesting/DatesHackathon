package com.hackathon.datesackathon.Repo;

import com.hackathon.datesackathon.Models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends JpaRepository<Service, Long> {
}
