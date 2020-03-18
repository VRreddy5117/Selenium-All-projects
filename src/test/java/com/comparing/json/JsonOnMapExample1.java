package com.comparing.json;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JsonOnMapExample1 {
        public static void main(String[] args) {

            ObjectMapper mapper = new ObjectMapper();
            String json = "{\"name\":\"mkyong\", \"age\":\"37\"}";

            try {
                Map<String, String> map = mapper.readValue(json, new TypeReference<Map<String, String>>() {});

                System.out.println(map);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

