package org.example.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstAppApplication {

    @GetMapping("/message")
    public String message(){
        return "sample java sB code";
    }

    @GetMapping("/con")
    public String concat()
    {
        String s1="master";
        String s2="sale";
        return s1+s2;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a,@RequestParam int b)
    { return a+b;
    }
    public static void main(String[] args) {
        SpringApplication.run(MyFirstAppApplication.class, args);
    }

}
