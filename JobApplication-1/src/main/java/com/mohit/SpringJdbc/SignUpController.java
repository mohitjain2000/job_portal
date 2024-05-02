package com.mohit.SpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mohit.SpringJdbc.Service.JobSeekerService;
import com.mohit.SpringJdbc.model.Job_Seeker;



@Controller
public class SignUpController {

    @Autowired
    private JobSeekerService userService;

    @GetMapping("/signup_jobseeker")
    public String showJobGiverSignupForm() {
        return "signup_jobseeker"; // Assuming you have a jobgiver_signup.jsp or similar
    }
    @PostMapping("/signup_jobseeker")
    public String signUpJobSeeker(@RequestParam("username") String username,
                                  @RequestParam("email") String email,
                                  @RequestParam("Name") String Name,
                                  @RequestParam("password") String password,
                                  RedirectAttributes redirectAttributes) {
        Job_Seeker jobSeeker = new Job_Seeker();
        jobSeeker.setUsername(username);
        jobSeeker.setEmail(email);
        jobSeeker.setName(Name);
        jobSeeker.setPassword(password);

        userService.save(jobSeeker);

        // Add a flash attribute to pass a message to the redirected page
        redirectAttributes.addFlashAttribute("message", "Sign up successful! Please log in.");

        // Redirect to the login page
        return "redirect:/home";
    }
}

