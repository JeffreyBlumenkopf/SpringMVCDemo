package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String helloWorld() {
        return
                "welcome";

    }




    @RequestMapping("processform")
    public String processform(@RequestParam("FName") String fName,
                              @RequestParam("LName") String lName,
                              @RequestParam("Age") String age,
                              Model model) {


        model.addAttribute("addFName", "Hi " + fName);
        model.addAttribute("addLName", lName);
        model.addAttribute("addAge", age);


        return "confirmpage";

    }


}
