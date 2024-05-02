package com.mohit.SpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mohit.SpringJdbc.Service.JobGiverService;
import com.mohit.SpringJdbc.Service.JobSeekerService;
import com.mohit.SpringJdbc.Service.JobService;
import com.mohit.SpringJdbc.model.JobPost;
import com.mohit.SpringJdbc.model.Job_Seeker;
import com.mohit.SpringJdbc.model.Job_giver;

@Controller
public class JobController {
	@Autowired	
	JobService jobServ;
	@Autowired
	JobSeekerService jobseeek;
	@Autowired
	JobGiverService jobgiver;
	@GetMapping({"/" ,"home"})
		public String home() {
		
			return "home";
		}
	@GetMapping("addjob")
	public String addJob() {
		return "addjob";
	}
	@PostMapping("handleForm")
	public String handleform(JobPost jobPost) {
	jobServ.addJob(jobPost);	
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String view(Model m) {
	List<JobPost>	job=jobServ.getAllJob();
		m.addAttribute	("jobPosts",job);
	return "viewalljobs";
	}
	@PostMapping("/viewalljobs")
    public String handleFormSubmission(@RequestParam("name") String name,
                                       @RequestParam("email") String email,
                                       @RequestParam("message") String message) {
        // Process the form data as needed
        // For example, you can save it to a database
        
        // Redirect back to the viewalljobs page after form submission
        return "redirect:/viewalljobs";
    }
	
	
	 @RequestMapping(value="/edit/{postId}",method= {RequestMethod.GET,RequestMethod.POST})
	    public String showEditForm(@PathVariable int postId, Model model) {
		 
	        JobPost item = jobServ.findById(postId);
	       
	        model.addAttribute("item", item);
	        return "edit"; // Return the name of the JSP page for editing
	    }

	 @PostMapping("/updateJob")
	    public String updateJob(@RequestParam("postId") int postId,
	                            @RequestParam("postProfile") String postProfile,
	                            @RequestParam("postDesc") String postDesc,
	                            @RequestParam("reqExperience") int reqExperience,
	                            @RequestParam("postTechStack") List<String> postTechStack) {
	     
	        // Create a JobPost object with the form data
	        JobPost jobPost = new JobPost();
	        jobPost.setPostId(postId); // Set the post ID
	        jobPost.setPostProfile(postProfile);
	        jobPost.setPostDesc(postDesc);
	        jobPost.setReqExperience(reqExperience);
	        jobPost.setPostTechStack(postTechStack);
	     
	        // Pass the jobPost object to the service class for updating
	        jobServ.updateItem(jobPost);

	        // Redirect back to the viewalljobs page after updating
	        return "redirect:/viewalljobs";  
	    }

	 @RequestMapping(value="/delete/{postId}" ,method= {RequestMethod.GET,RequestMethod.POST})
	    public String deleteJobPost(@PathVariable int postId) {
	     //System.out.print(postId);  
		 jobServ.deleteJobPost(postId);
	        
	        return "redirect:/viewalljobs";
	    }
	 @GetMapping("/contact")
	    public String showContactPage() {
	        return "contact"; // Returns the name of the JSP page (contact.jsp)
	    }
	 @GetMapping("apply")
	    public String apply(Model m) {
		 List<JobPost>	job=jobServ.getAllJob();
			m.addAttribute	("jobPosts",job);
	        return "apply"; // Returns the name of the JSP page (contact.jsp)
	    }

		
	 @GetMapping("applyjob")
	    public String applyjob() {
		 System.out.println("mohit");
	        return "applyjob"; // Returns the name of the JSP page (contact.jsp)
	    }
	 
	 // Mapping for displaying the sign up page for job seekers
	    @GetMapping("/signup/jobseeker")
	    public String showJobSeekerSignUpPage() {
	        return "signup_jobseeker"; // Assuming signup_jobseeker.jsp is your sign up page for job seekers
	    }

	    // Mapping for processing the sign up form for job seekers
	    @PostMapping("/signup/jobseeker")
	    public String processJobSeekerSignUp(Job_Seeker job) {
	    	jobseeek.save(job);
	        return "redirect:/login/jobseeker"; // Redirect to the job seeker login page after sign up
	    }

	    // Mapping for displaying the sign up page for job givers
	    @GetMapping("/signup/jobgiver")
	    public String showJobGiverSignUpPage() {
	        return "signup_jobgiver"; // Assuming signup_jobgiver.jsp is your sign up page for job givers
	    }

	 //    Mapping for processing the sign up form for job givers
	    @PostMapping("/signup/jobgiver")
	    public String processJobGiverSignUp(Job_giver job) {
	        jobgiver.save(job);
	        return "redirect:/login/jobgiver"; // Redirect to the job giver login page after sign up
	    }

	   //  Mapping for displaying the login page for job seekers
	    @GetMapping("/login/jobseeker")
	    public String showJobSeekerLoginPage() {
	        return "login_jobseeker"; // Assuming login_jobseeker.jsp is your login page for job seekers
	    }

	    // Mapping for processing the login form for job seekers
//	    @PostMapping("/login/jobseeker")
//	    public String processJobSeekerLogin() {
//	        // Add logic to process the login form for job seekers
//	        return "redirect:/apply"; // Redirect to the home page after login
//	    }
	    @PostMapping("/login/jobseeker")
	    public String loginseeker(@RequestParam("username") String username,
	                        @RequestParam("password") String password,
	                        RedirectAttributes redirectAttributes) {
	        // Retrieve user data based on the provided username
	        Job_Seeker j = jobseeek.findByPassword(password);

	        // Check if the user exists and if the provided password matches the stored password
	        if (j != null && j.getPassword().equals(password)) {
	            // Redirect to the dashboard or home page
	            return "redirect:/apply";
	        } else {
	            // If credentials are invalid, redirect back to the login page with an error message
	            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
	            return "redirect:/home";
	        }
	    }

	    // Mapping for displaying the login page for job givers
	    @GetMapping("/login/jobgiver")
	    public String showJobGiverLoginPage() {
	        return "login_jobgiver"; // Assuming login_jobgiver.jsp is your login page for job givers
	    }
	    @PostMapping("/login/jobgiver")
	    public String logingiver(@RequestParam("username") String username,
	                        @RequestParam("password") String password,
	                        RedirectAttributes redirectAttributes) {
	        // Retrieve user data based on the provided username
	        Job_Seeker j = jobseeek.findByPassword(password);

	        // Check if the user exists and if the provided password matches the stored password
	        if (j != null && j.getPassword().equals(password)) {
	            // Redirect to the dashboard or home page
	            return "redirect:/addjob";
	        } else {
	            // If credentials are invalid, redirect back to the login page with an error message
	            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
	            return "redirect:/home";
	        }
	    }
	    // Mapping for processing the login form for job givers
//	    @PostMapping("/login/jobgiver")
//	    public String processJobGiverLogin() {
//	        // Add logic to process the login form for job givers
//	        return "redirect:/addjob"; // Redirect to the home page after login
//	    }
	
	
}
