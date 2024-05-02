package com.mohit.SpringJdbc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.SpringJdbc.Repo.JobRepo;
import com.mohit.SpringJdbc.model.JobPost;



@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public void addJob(JobPost job) {
        jobRepo.save(job); // Use JpaRepository's save method to add or update the job
    }

    public List<JobPost> getAllJob() {
        return jobRepo.findAll(); // Use JpaRepository's findAll method to get all jobs
    }

    public JobPost findById(int postId) {
        return jobRepo.findById(postId).orElse(null); // Use JpaRepository's findById method to find a job by its ID
    }

    public void deleteJobPost(int postId) {
        jobRepo.deleteById(postId); // Use JpaRepository's deleteById method to delete a job by its ID
    }

    public String updateItem(JobPost item) {
        jobRepo.save(item); // Use JpaRepository's save method to update the job
        return "success";
    }
}
