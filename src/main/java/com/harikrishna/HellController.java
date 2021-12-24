package com.harikrishna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {

    @GetMapping("greetMe")
    public String sayHell() {
        return "Good morning";
    }
}

