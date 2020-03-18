package com.json.productdetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class People {

    String json = "[{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":29,"
            + "\"address\":{\"street\":\"100 Elm Way\",\"city\":\"Foo City\","
            + "\"state\":\"NJ\",\"zipCode\":\"01234\"},\"isMale\":true},"
            + "{\"firstName\":\"Jane\",\"lastName\":\"Doe\",\"age\":27,"
            + "\"address\":{\"street\":\"200 Boxer Road\",\"city\":\"Bar City\","
            + "\"state\":\"NJ\",\"zipCode\":\"09876\"},\"isMale\":false}]";
    ObjectMapper mapper = new ObjectMapper();
    @SuppressWarnings("unchecked")
  //  List<> people = (List<>) mapper.readValue(json, List.class);

    public People() throws JsonProcessingException {
    }
   //System.out.println(people);
}
