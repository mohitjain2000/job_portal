package com.mohit.SpringJdbc.model;

import java.util.List;



import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import lombok.Data;


@Entity
@Table(name = "job_post")
public class JobPost {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "post_id")
	private int postId;
	 @Column(name = "post_profile")
	    private String postProfile;

	    @Column(name = "post_desc")
	    private String postDesc;

	    @Column(name = "req_experience")
	    private int reqExperience;

	    @ElementCollection
	    @CollectionTable(name = "post_tech_stack", joinColumns = @JoinColumn(name = "post_id"))
	    @Column(name = "tech_stack")
	    private List<String> postTechStack;

	public JobPost() {
		
	}
	public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
		super();
		this.postId = postId;
		this.postProfile = postProfile;
		this.postDesc = postDesc;
		this.reqExperience = reqExperience;
		this.postTechStack = postTechStack;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostProfile() {
		return postProfile;
	}
	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}
	public String getPostDesc() {
		return postDesc;
	}
	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}
	public int getReqExperience() {
		return reqExperience;
	}
	public void setReqExperience(int reqExperience) {
		this.reqExperience = reqExperience;
	}
	public List<String> getPostTechStack() {
		return postTechStack;
	}
	public void setPostTechStack(List<String> postTechStack) {
		this.postTechStack = postTechStack;
	}
	@Override
	public String toString() {
		return "JobPost [postId=" + postId + ", postProfile=" + postProfile + ", postDesc=" + postDesc
				+ ", reqExperience=" + reqExperience + ", postTechStack=" + postTechStack + "]";
	}
	public JobPost orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
