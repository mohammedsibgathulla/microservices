package com.rest.webservices.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class User {
    private Integer id;
    @Size(min=2, message = "Name should have atleast 2 characters")
    private String name;
    @Past
    private Date birthDate;
}
