package com.ecom.json;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class EcomJsonMain {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            Object ecom = parser.parse(new FileReader("src/test/java/com/ecom/json/Ecom.json"));

            JSONArray ecomarray = (JSONArray) ecom;
            System.out.println("Json response ::" + ecomarray);



         /*   JSONArray earr = (JSONArray) ecomarry.get("elements");
            Set<Departments> ecomResult = new LinkedHashSet<>();*/


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
