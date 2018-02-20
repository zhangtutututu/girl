package com.defangit.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.management.Agent;

import java.util.List;

@RestController
public class BoyController {
    @Autowired
    private BoyRepository boyRepository;

    @GetMapping(value = "/boys/{age}")
    public List<Boy> findBoy(@PathVariable("age") Integer age){
        return boyRepository.findBoyByAge(age);


//     return boyRepository.findAll();
    }
}
