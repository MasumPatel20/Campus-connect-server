package com.greendev.campus_connect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Message sayHello() {
        return new Message("Hello from Spring");
    }

    // Message class to represent the response object
    public static class Message {
        private String message;

        // Constructor
        public Message(String message) {
            this.message = message;
        }

        // Getter and Setter
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
