package com.rest.webservices;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "helloworld")
    public String getHelloWorld() {
        return "From Get Hello World";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean getHelloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldWithPathVariable(@PathVariable  String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
