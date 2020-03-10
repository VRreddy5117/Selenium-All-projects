package com.json.products;

import com.json.departments.JsonComparison;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JSONComp1 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj1 = parser.parse(new FileReader("src/test/java/com/json/products/ProductsInfo.json"));
            JSONObject jsonObj3 = (JSONObject) obj1;
            System.out.println("File-1 JSON Response :: " + jsonObj3);

            Object comp = parser.parse(new FileReader("src/test/java/com/json/products/ProductsInfo1.json"));

            JSONObject jsonObj4 = (JSONObject) comp;
            System.out.println("File-2 JSON Response :: " + jsonObj4);

            //convert json to string
            String json3 = jsonObj3.toJSONString();
            String json4 = jsonObj4.toJSONString();

            JsonComparison1 comparison = new JsonComparison1();
            comparison.jsonComparison1(json3, json4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
