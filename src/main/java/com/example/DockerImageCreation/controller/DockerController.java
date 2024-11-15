package com.example.DockerImageCreation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class DockerController {

    @GetMapping("/status")
    public String getStatus() {
        return "Docker is running!";
    }
}