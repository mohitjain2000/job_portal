package com.mohit.SpringJdbc.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohit.SpringJdbc.model.JobPost;

@Repository
public interface JobRepo  extends JpaRepository<JobPost, Integer>{

}