package com.example.gitops.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final Environment env;

    @Autowired
    public StatusController(Environment env) {
        this.env = env;
    }

    @GetMapping("env")
    public String status() {
        return "Pod: " + env.getProperty("HOSTNAME");
    }

}
