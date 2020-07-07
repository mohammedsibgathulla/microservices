package com.rest.webservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(value={"field1", "field2"})
public class SomeBean {
    private String field1;
    private String field2;
    @JsonIgnore
    private String field3;
}
