package com.comparing.json;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

public class CompareJson {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            Object comp1 = parser.parse(new FileReader("src/test/java/com/comparing/json/First.json"));
            Object comp2 = parser.parse(new FileReader("src/test/java/com/comparing/json/Second.json"));

            Gson g = new Gson();
            Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
            Map<String, Object> firstMap = g.fromJson((JsonElement) comp1, mapType);
            Map<String, Object> secondMap = g.fromJson((JsonElement) comp2, mapType);
            System.out.println(Maps.difference(firstMap, secondMap));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
