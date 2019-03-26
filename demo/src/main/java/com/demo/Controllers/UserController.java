package com.demo.Controllers;

import com.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = "/displayPersonPage" , method = RequestMethod.GET)
    public String displayPerson(Model model)
    {
        Person person = new Person();
        model.addAttribute("person",person) ;
        return "PersonForm" ;
    }

    @RequestMapping(value = "/personDetails" , method = RequestMethod.POST)
    public String displayPersonDetails(@ModelAttribute Person person, Model model)
    {
        model.addAttribute("person",person) ;
        return "personDetails" ;
    }
}
