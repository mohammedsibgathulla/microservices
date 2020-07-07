package com.rest.webservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonFilter("DynamicBeanFilter")
public class DynamicBean {
    private String field1;
    private String field2;
    private String field3;
}
