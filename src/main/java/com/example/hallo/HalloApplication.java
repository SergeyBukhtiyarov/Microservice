package com.example.hallo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping(value = "hello")
public class HalloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalloApplication.class, args);
    }

    @GetMapping(value = "/{firstName}")
    public String helloGET(@PathVariable("firstName") String firstName,
                           @RequestParam("lastName") String lastName) {
        return String.format("{\"message\":\"Hello %s %s\"}", lastName, firstName);

    }


}
