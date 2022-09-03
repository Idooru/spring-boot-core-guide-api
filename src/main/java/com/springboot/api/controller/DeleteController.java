package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    // http://localhost:8080/api/v1/delete-api/{String 값}
    @DeleteMapping("/{variable}")
    public String deleteVariable(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/api/v1/delete-api/request?email=value
    @DeleteMapping("/request")
    public String deleteRequestParam1(@RequestParam String email) {
        return "e-mail : " + email;
    }
}
