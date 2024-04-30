package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.repository.AddressRepository;

@Controller
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
    private AddressRepository addressRepo;

    @RequestMapping("/insert")
    public String insert() {
        return "/address/insert";
    }

    
}
