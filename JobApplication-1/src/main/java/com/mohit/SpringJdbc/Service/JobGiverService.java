package com.mohit.SpringJdbc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mohit.SpringJdbc.Repo.JobGiverRepo;
import com.mohit.SpringJdbc.model.Job_Seeker;
import com.mohit.SpringJdbc.model.Job_giver;

@Service
public class JobGiverService {
	 @Autowired
	    private JobGiverRepo jobSeekerRepository;

	    @Transactional
	    public void save(Job_giver jobSeeker) {
	        jobSeekerRepository.save(jobSeeker);
	    }
	    
	    public Job_giver findByPassword(String username) {
	        return (Job_giver) jobSeekerRepository.findBypassword(username);
	    }
}
