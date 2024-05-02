package com.mohit.SpringJdbc.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mohit.SpringJdbc.model.Job_Seeker;
import com.mohit.SpringJdbc.Repo.JobSeeker;

@Service
public class JobSeekerService {

    @Autowired
    private JobSeeker jobSeekerRepository;

    @Transactional
    public void save(Job_Seeker jobSeeker) {
        jobSeekerRepository.save(jobSeeker);
    }
    @Transactional(readOnly = true)
    public Job_Seeker findByPassword(String username) {
        return (Job_Seeker) jobSeekerRepository.findBypassword(username);
    }
}

