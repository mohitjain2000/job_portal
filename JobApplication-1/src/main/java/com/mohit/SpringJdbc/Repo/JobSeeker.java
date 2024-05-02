package com.mohit.SpringJdbc.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.mohit.SpringJdbc.model.Job_Seeker;
@Repository
public interface JobSeeker extends JpaRepository<Job_Seeker, Integer>{
	Job_Seeker findBypassword(String password);




}
