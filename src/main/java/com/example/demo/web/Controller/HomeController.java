package com.example.demo.web.Controller;

import com.example.demo.web.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("formData", new User());
        return "pages/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processFormData(User user) {
        return "pages/result";
    }

}
