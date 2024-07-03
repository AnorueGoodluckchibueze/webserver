package com.example.webserver.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HiController {
    @GetMapping("/api/hello")
    public Map<String, String> hello(@RequestParam String visitor_name, HttpServletRequest request){
        String clientIp = request.getRemoteAddr();
        String location = "New york";
        String temperature ="11 degrees Celsius";

        Map<String, String>response =new HashMap<>();
        response.put("client_ip", clientIp);
    response.put("location", location);
    response.put("greeting", "Hello, " + visitor_name + "! The temperature is" + temperature + "in" + location);

    return response;
    }
}
