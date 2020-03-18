package com.json.products;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.json.JSONArray;
import org.json.JSONException;


public class JSONComp1 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {

            Object obj1 = parser.parse(new FileReader("src/test/java/com/json/products/ProductsInfo.json"));
            JSONObject jsonObj3 = (JSONObject) obj1;
            System.out.println("File-1 JSON Response :: " + jsonObj3);

            Object comp = parser.parse(new FileReader("src/test/java/com/json/products/ProductsInfo1.json"));
            JSONObject productObj = (JSONObject) comp;
            System.out.println("File-2 JSON Response :: " + productObj);

          /*  List<String> names = new ArrayList(Arrays.asList(org.json.JSONObject.getNames(obj1)));
            List<String> names2 = new ArrayList(Arrays.asList(org.json.JSONObject.getNames(comp)));
            System.out.println(names2);
            System.out.println(names);*/
            //convert json to string
            String json3 = jsonObj3.toJSONString();
            String productStr = productObj.toJSONString();

            JsonComparison1 MissingData = new JsonComparison1();
            MissingData.jsonComparison1(json3, productStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
