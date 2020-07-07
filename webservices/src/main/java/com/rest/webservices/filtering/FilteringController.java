package com.rest.webservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public SomeBean retrieveSomeBean() {
        return new SomeBean("value1", "value2", "value3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retrieveListSomeBeans() {
        return Arrays.asList(new SomeBean("value1", "value2", "value3"),
                new SomeBean("value11", "value22", "value33"),
                new SomeBean("value111", "value222", "value333"));
    }
    @GetMapping("/filtering-dynamic")
    public MappingJacksonValue retrieveDynamicBean() {
        DynamicBean dynamicBean = new DynamicBean("value1", "value2", "value3");
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("DynamicBeanFilter", simpleBeanPropertyFilter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(dynamicBean);
        mappingJacksonValue.setFilters(filterProvider);
         return mappingJacksonValue;
    }

    @GetMapping("/filtering-list-dynamic")
    public MappingJacksonValue retrieveListDynamicBeans() {
        List<DynamicBean> list =  Arrays.asList(new DynamicBean("value1", "value2", "value3"),
                new DynamicBean("value11", "value22", "value33"),
                new DynamicBean("value111", "value222", "value333"));
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("DynamicBeanFilter", simpleBeanPropertyFilter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
