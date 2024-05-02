package com.mohit.SpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mohit.SpringJdbc.model.Job_giver;
import com.mohit.SpringJdbc.Service.JobGiverService;

@Controller
public class JobGiverController {

    @Autowired
    private JobGiverService jobGiverService;

    @GetMapping("/signup_jobgiver")
    public String showJobGiverSignupForm() {
        return "signup_jobgiver"; // Assuming you have a jobgiver_signup.jsp or similar
    }

    @PostMapping("/signup_jobgiver")
    public String signupJobGiver(@RequestParam("username") String username,
                                 @RequestParam("password") String password,
                                 Model model) {
        // Create a new JobGiver object
        Job_giver jobGiver = new Job_giver();
        jobGiver.setUsername(username);
        jobGiver.setPassword(password);

        // Save the job giver to the database
        jobGiverService.save(jobGiver);

        // Add a success message to the model
        model.addAttribute("message", "Job giver signed up successfully!");

        // Redirect to a success page or any other appropriate page
        return "redirect:/home"; // Redirect to a success page
    }
}

