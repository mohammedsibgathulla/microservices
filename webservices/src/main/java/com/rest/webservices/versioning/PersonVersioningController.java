package com.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
    @GetMapping("v1/person")
    public Person1 personV1() {
        return  new Person1("Bob Charlie");
    }
    @GetMapping("v2/person")
    public Person2 personV2() {
        return  new Person2(new Name("Bob", "Charlie"));
    }
}
