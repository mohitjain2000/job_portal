package com.mohit.SpringJdbc.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohit.SpringJdbc.model.Job_Seeker;
import com.mohit.SpringJdbc.model.Job_giver;
@Repository
public interface JobGiverRepo extends JpaRepository<Job_giver, Integer>{

	Job_giver findBypassword(String password);
}
