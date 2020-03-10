package com.ecom.json;

import com.json.departments.Departments;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class EcomJsonRead {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            Object ecom = parser.parse(new FileReader("src\\test\\java\\com\\ecom\\json\\Ecom.json"));

            JSONObject ecomObject = (JSONObject) ecom;
            System.out.println("Json response ::" + ecomObject);

            JSONArray ecomArr = (JSONArray) ecomObject.get("elements");
            Set<Departments> ecomResult = new LinkedHashSet<>();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
